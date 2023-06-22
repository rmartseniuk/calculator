lexer grammar CalculatorLexer;

fragment MANTISSA: [eE][+-]?;
fragment MANTISSA_HEX: [mM][+-]?;
fragment OCTAL: ([0]|[1-7][0-7]*)('.'[0-7]+)?(MANTISSA[0-7]+)?'<''8''>';
fragment HEX: ([0]|[1-9A-Fa-f][0-9A-Fa-f]*)('.'[0-9A-Fa-f]+)?(MANTISSA_HEX[0-9A-Fa-f]+)?'<''16''>';
fragment DECIMAL: ([0]|[1-9][0-9]*)('.'[0-9]+)?(MANTISSA[0-9]+)?;
fragment BINARY: ([0]|[1][0-1]*)('.'[0-1]+)?(MANTISSA[0-1]+)?'<''2''>';
NUMBER : (DECIMAL | BINARY | OCTAL | HEX);

POW    : '^';
NL     : ('\rn' | '\r' | '\n');
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