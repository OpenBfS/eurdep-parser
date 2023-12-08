grammar Eurdep;

eurdepfile : BEGINEURDEP eurdep_header locality? section* ENDEURDEP;

eurdep_header : BEGINHEADER (comment | header_field)+ ENDHEADER;
section: (unknown_section|radiological);
locality: BEGINLOCALITY comment* field_list (comment | record)+ ENDLOCALITY;
radiological: BEGINRADIOLOGICAL radiological_content ENDRADIOLOGICAL;
comment: BEGINCOMMENT (STRING| COMMA | DQOUTE | NEWLINE)* ENDCOMMENT;
unknown_section: BEGINUNKOWN (field_list | record | default_section | comment)* ENDUNKOWN;

radiological_content: comment* field_list (comment | default_section | record | field_list)* (field_list | record)?;

default_section: BEGINDEFAULT comment* default_record (comment | default_record)* ENDDEFAULT;
default_record: LINE_BEGIN STRING STRING LINE_END;

field_list: '\\FIELD_LIST' STRING?(COMMA STRING)* LINE_END;

header_field: LINE_BEGIN STRING STRING (STRING)* LINE_END;

record: LINE_BEGIN (STRING+ | REMARK)? (COMMA | STRING | REMARK)* LINE_END;

//Lexer rules
BEGINEURDEP: '\\BEGIN_EURDEP' LINE_END;
ENDEURDEP: '\\END_EURDEP' LINE_END;
BEGINHEADER: '\\BEGIN_HEADER' LINE_END;
ENDHEADER: '\\END_HEADER' LINE_END;
BEGINLOCALITY: '\\BEGIN_LOCALITY;';
ENDLOCALITY: '\\END_LOCALITY;';
BEGINRADIOLOGICAL: '\\BEGIN_RADIOLOGICAL;';
ENDRADIOLOGICAL: '\\END_RADIOLOGICAL;';
BEGINDEFAULT: '\\BEGIN_DEFAULT;';
ENDDEFAULT: '\\END_DEFAULT;';
BEGINUNKOWN: '\\BEGIN_' CHAR+ ';';
ENDUNKOWN: '\\END_' CHAR+ ';';
BEGINCOMMENT: '\\BEGIN_COMMENT' LINE_END;
ENDCOMMENT: '\\END_COMMENT' LINE_END;

LINE_BEGIN: '\\' WHITESPACE?;
LINE_END: WHITESPACE? ';' (STRING | WHITESPACE)* NEWLINE?;

REMARK: DQOUTE (STRING | COMMA)* DQOUTE;

fragment CHAR : ~[ \\;,"\t\r\n] ;
NEWLINE : ('\r\n' | '\r' | '\n') -> skip;
STRING : CHAR+ ;
WHITESPACE : (' ' | '\t')+ -> skip;
COMMA: ',';
DQOUTE: '"';
