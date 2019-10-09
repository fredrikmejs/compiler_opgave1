grammar simpleCalc;

start   : (as+=assign)* (con += conditional)* (lo += loop)* e=expr EOF ;

assign : x=ID '=' e=expr ';' ;

assignments : a1=assign  #Assignment
	| e1=expr #Expression
	;

exprList : (a1+=assignments )+ ;


/* A grammar for arithmetic expressions */

conditional: 'if' '(' (c1=condition) ')' '{' e1=exprList '}'	   			   #IfStatement
		 | 'if' '(' (c1=condition) ')' '{' e1=exprList '}' 'else' '{' e2=exprList '}'  #IfElse
;


loop: 'while' '(' c1=condition ')' '{' e1=exprList '}' #while
 ;

condition:  e1=expr '==' e2=expr     		   #Equals 
		 |  e1=expr '!=' e2=expr     		   #NotEqual
		 |	e1=expr '>' e2=expr      		   #Less
		 |	e1=expr '<' e2=expr      		   #Bigger
		 |  e1=expr '>=' e2=expr       		   #LessOrEqual
		 | 	e1=expr '<=' e2=expr       		   #BiggerOrEqual 
		 |  '!' '(' c1=condition ')' 		   #Not
		 |  e1=condition '&&' e2=condition     #And
		 |	e1=condition '||' e2=condition     #Or  
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