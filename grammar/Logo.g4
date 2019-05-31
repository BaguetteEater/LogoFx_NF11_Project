grammar Logo ; 

@header {		
  package logoparsing;
}

FLOAT : [0-9][0-9]*('.'[0-9]+)? ;

ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;

programme :
 liste_fonctions
 liste_instructions  
;

liste_fonctions :
(function)*
;

liste_instructions :   
 (instruction)+
;

liste_param :
(':' ID)+
;

retour_fonc :
'retour' expr
;

function:
'pour ' ID liste_param? liste_instructions retour_fonc? 'fin'
;

instruction :

   'repete' expr '[' liste_instructions ']' #repete
 | 'tantque' expr '[' liste_instructions ']' #while
 | 'si' expr '[' liste_instructions ']' ('[' liste_instructions ']')? #if
 | 'av' expr # av
 | 'td' expr # td
 | 'tg' expr # tg
 | 'lc' # lc
 | 'bc' # bc
 | 've' # ve
 | 're' expr # re
 | 'fpos' expr expr # fpos
 | 'fcc' expr # fcc
 | 'donne "' ID expr #writing
 | ID expr* #proc
 | 'store' #store
 | 'move' #move

; 

expr :
   FLOAT         # float
 | 'loop' #loop
 | ID '(' (expr)* ')' #fonc
 | expr ('*' | '/') expr #mult
 | expr ('+' | '-') expr #sum
 | 'hasard' expr #hasard
 | ( 'cos(' | 'sin(' ) expr ')' #cos
 | ':' ID #reading
 | expr '<' expr #inf
 | expr '>' expr #sup
 | expr '<=' expr #infOrEqual
 | expr '>=' expr #supOrEqual
 | expr '==' expr #equal
 | expr '!=' expr #diff
 | '(' expr ')'  # parenthese


;



