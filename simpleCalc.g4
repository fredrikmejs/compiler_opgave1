grammar simpleCalc;

start   : (as+=assign)* (con += conditional)* (lo += loop)* e=expr EOF ;

assign : x=ID '=' e=expr ';' ;

/* A grammar for arithmetic expressions */

conditional: 'if' '(' (c1+=condition)+ ')' 'then' e1=assign+ 	   			   #IfStatement
		 | 'if' '(' (c1+=condition)+ ')' 'then' e1=assign+ 'else' e2=assign+   #IfElse
;

loop: 'while' '(' c1=condition ')' 'do' e1=assign+ #while
 ;

condition:  e1=expr '==' e2=expr     #Equals 
		 |  e1=expr '!=' e2=expr     #NotEqual
		 |	e1=expr '>' e2=expr      #Less
		 |	e1=expr '<' e2=expr      #Bigger
		 |  e1=expr '>=' e2=expr     #LessOrEqual
		 | 	e1=expr '<=' e2=expr     #BiggerOrEqual 
		 |  '!' '(' c1=condition ')' #Not
		 |  e1=expr '&&' e2=expr     #And
		 |	e1=expr '||' e2=expr     #Or  
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
