grammar Calculator;

fragment MANTISSA: [eE][+-]?;
fragment MANTISSA_HEX: [mM][+-]?;
fragment OCTAL: ([0]|[1-7][0-7]*)('.'[0-7]+)?(MANTISSA[0-7]+)?;
fragment HEX: ([0]|[1-9A-Fa-f][0-9A-Fa-f]*)('.'[0-9A-Fa-f]+)?(MANTISSA_HEX[0-9A-Fa-f]+)?;
fragment DECIMAL: ([0]|[1-9][0-9]*)('.'[0-9]+)?(MANTISSA[0-9]+)?;
fragment BINARY: ([0]|[1][0-1]*)('.'[0-1]+)?(MANTISSA[0-1]+)?;
RADIX  : '<'('2' | '8' | '16')'>';
NUMBER : (DECIMAL | BINARY | OCTAL | HEX);

POW    : '^';
NL     : '\n';
WS     : [ \t\r]+ -> skip;
ID     : [a-zA-Z_][a-zA-Z_0-9]*;

PLUS  : '+';
EQUAL : '=';
MINUS : '-';
MULT  : '*';
DIV   : '/';
LPAR  : '(';
RPAR  : ')';
SC    : ';';
COMMA : ',';
LESSPAR  : '<';
MOREPAR  : '>';

input
    : setVar NL input     # ToSetVar
    | plusOrMinus NL? EQUAL? EOF # Calculate
    ;

setVar
    : ID EQUAL plusOrMinus # SetVariable
    ;


plusOrMinus
    : plusOrMinus PLUS multOrDiv  # Plus
    | plusOrMinus MINUS multOrDiv # Minus
    | multOrDiv                   # ToMultOrDiv
    ;

multOrDiv
    : multOrDiv MULT pow # Multiplication
    | multOrDiv DIV pow  # Division
    | pow                # ToPow
    ;

pow
    : unaryMinus (POW pow)? # Power
    ;

unaryMinus
    : MINUS unaryMinus # ChangeSign
    | atom             # ToAtom
    ;

atom
    : NUMBER RADIX?         # Number
    | ID                    # Variable
    | func                  # ToFunction
    | LPAR plusOrMinus RPAR # Braces
    ;

func
    : ID LPAR plusOrMinus ((COMMA plusOrMinus)+)? RPAR # Function
    ;