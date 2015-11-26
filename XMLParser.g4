/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** XML parser derived from ANTLR v4 ref guide book example */
parser grammar XMLParser;

options { tokenVocab=XMLLexer; }

document    :   prolog? misc* element misc*;

prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;

content     :   chardata?
                ((element | reference | CDATA | PI | COMMENT) chardata?)* ;
                
element		:	jsclass | ownedattr | ownedoper | ownedparam | genericelem ;         

jsclass     :   '<' PACKELEMEN attribute* '>' content '<' '/' PACKELEMEN '>'
            |   '<' PACKELEMEN attribute* '/>'
            ;

ownedattr   :   '<' OWNEDATTR attribute* '>' content '<' '/' OWNEDATTR '>'
            |   '<' OWNEDATTR attribute* '/>'
            ;
             
ownedoper   :   '<' OWNEDOPER attribute* '>' content '<' '/' OWNEDOPER '>'
            |   '<' OWNEDOPER attribute* '/>'                     
            ;           

ownedparam  :   '<' OWNEDPARAM attribute* '>' content '<' '/' OWNEDPARAM '>'
            |   '<' OWNEDPARAM attribute* '/>'
            ;
            
genericelem :   '<' Name attribute* '>' content '<' '/' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef ;

attribute   :   a_xmiid | a_name | a_visibility | a_type | a_datatype | a_return | a_static | a_generic ;

a_xmiid		:	E_XMIID '=' STRING ;
a_name		:	E_NAME '=' STRING ;
a_visibility:	E_VISIBILITY '=' STRING ;
a_type		:	E_TYPE '=' STRING ;
a_datatype	:	E_DATATYPE '=' STRING ;
a_return	:	E_RETURN '=' STRING ;
a_static	:	E_STATIC '=' STRING ;
a_generic	: 	Name '=' STRING ; // Our STRING is AttValue in spec


/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | PI | SEA_WS ;

