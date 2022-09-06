{
   ej3p3.pas
   
   Copyright 2022 marin <marin@DESKTOP-HCJ779T>
   
   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
   MA 02110-1301, USA.
   
   
}


program ej3p2;

uses crt;
type
	lista= ^nodo;
	nodo= record
		dato: integer;
		sig: lista;
	end;
procedure crearLista(var l:lista);
var 
	n: integer;
	nuevo: lista;
begin
	
	n:= random(100);
	if(n <>0) then begin
		 
         new (nuevo);
         nuevo^.dato:= n;
         nuevo^.sig:= l;
         l:= nuevo;
         crearLista(l);
	end;
	
end;
procedure ImprimirListaMismoOrden (l: lista);
begin
  if (l<> nil) then begin
    write (' ', l^.dato);
    ImprimirListaMismoOrden (l^.sig);
    end;
end;
function minimo(l:lista; min:integer): integer;
begin
	if((l<> nil) and (l^.dato< min)) then begin
		minimo(l^.sig, l^.dato);
		minimo := l^.dato;
		
	end;
	
end;	 
var
	min, max: integer;
  l: lista;
	
BEGIN
	randomize;
	l:= nil;
	min:= 999;
	crearLista(l);
	ImprimirListaMismoOrden(l);
	writeln('el elemento mas chico de la lista es: ', minimo(l,min));
	
END.

