parser grammar CalculatorParser;

options { tokenVocab=CalculatorLexer; }

eol:
    NL
    ;

input
    : setVar NL input     # ToSetVar
    | plusOrMinus NL? EQUAL? eol # Calculate
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
    : NUMBER                # Number
    | ID                    # Variable
    | func                  # ToFunction
    | LPAR plusOrMinus RPAR # Braces
    ;

func
    : ID LPAR plusOrMinus ((COMMA plusOrMinus)+)? RPAR # Function
    ;