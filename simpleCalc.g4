grammar simpleCalc;

start   : (as+=assign)* e=expr EOF ;

assign : x=ID '=' e=expr ';' ;

/* A grammar for arithmetic expressions */

condional: 'if' '(' c1=condition ')' 'then' e1=expr #ifStatement
		 | 'if' '(' c1=condition ')' 'then' e1=expr 'else' e2=expr #ifElse
;

loop: 'while' '(' c1=condition ')' 'do' e1=expr asign #while
 ;

condition:  e1=expr '==' e2=expr   #Equals 
		 |  e1=expr '!=' e2=expr   #Notequal
		 |	e1=expr '>' e2=expr    #Less
		 |	e1=expr '<' e2=expr    #Bigger
		 |  e1=expr '>=' e2=expr   #LessOrEqual
		 | 	e1=expr '<=' e2=expr   #LessOrEqual 
		 |  e1=expr && e2=expr     #And
		 |	e1=expr || e2=expr     #Or  
;


expr : c=FLOAT x=ID		      	  	   # NumMultiAlpha
     | x=ID    	        		       # Variable
     | c=FLOAT	            		   # Constant
     | e1=expr op= MULTIDIV e2=expr    # Multidiv 
     | e1=expr op = OP e2=expr     	   # PlusMinus
     | '(' e=expr ')'	      		   # Parenthesis
     | op=OP f=FLOAT          		   # SignedConstant
     
;

// Lexer:

MULTIDIV : ('*' | '/') ;

OP : ('-'|'+') ;


ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;


ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
