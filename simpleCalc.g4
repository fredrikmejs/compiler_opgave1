grammar simpleCalc;

start   : (as+=assign)* e=expr EOF ;

assign : x=ID '=' e=expr ';' ;

/* A grammar for arithmetic expressions */

condional: 'if' '(' (c1=condition '&&' c2=condition) ')' 'then' e1=expr  'else' e2=expr #ConditionAndElse
		 | 'if' '(' (c1=condition '&&' c2=condition) ')' 'then' e1=expr 				#ConditionAnd
		 | 'if' '(' (c1=condition '||' c2=condition) ')' 'then' e1=expr 'else' e2=expr  #ConditionOrElse
		 | 'if' '(' (c1=condition '||' c2=condition) ')' 'then' e1=expr 				#ConditionOr
		 | 'if' '(' (c1=condition) ')' 'then' e1=expr 'else' e2=expr 					#ConditionElse
		 | 'if' '(' (c1=condition) ')' 'then' e1=expr 									#ConditionSimple

;
loop: 'while' '(' c1=condition ')' 'do' a1 = asign #while
 ;

condition:  e1=expr '==' e2=expr   #Equals 
		 |  e1=expr '!=' e2=expr   #Notequal
		 |	e1=expr '>' e2=expr    #Less
		 |	e1=expr '<' e2=expr    #Bigger
		 |  e1=expr '>=' e2=expr   #LessOrEqual
		 | 	e1=expr '<=' e2=expr   #LessOrEqual 
;


expr : c=FLOAT x=ID		      # NumMultiAlpha
     | x=ID    	              # Variable
     | c=FLOAT	              # Constant
     | e1=expr '*' e2=expr    # Multiplication 
     | e1=expr '/' e2=expr 	  # Division
     | e1=expr '+' e2=expr    # Addition
     | e1=expr '-' e2=expr    # Substraction
     | '(' e=expr ')'	      # Parenthesis
     | op=OP f=FLOAT          # SignedConstant
     
;

// Lexer:

OP : ('-'|'+') ;

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;


ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
