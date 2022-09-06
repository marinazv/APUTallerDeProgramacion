{
   pruebaarboles.pas
   
   Copyright 2022 Usuario <Usuario@DESKTOP-MUU0TPL>
   
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


program untitled;

type
	arbol=^nodo;
		nodo=record
		dato: integer;
		HI: arbol;
		HD: arbol;
	end;
	
Procedure crear (var A:arbol; num:integer);
Begin
  if (A = nil) then
   begin
      new(A);
      A^.dato:= num; A^.HI:= nil; A^.HD:= nil;
   end
   else
    if (num < A^.dato) then crear(A^.HI,num)
    else crear(A^.HD,num)   
End;
Procedure preOrden ( a : arbol );
begin
   if ( a<> nil ) then begin
    write (a^.dato);   
    preOrden (a^.HI);
    preOrden (a^.HD);
   end;
end;
Procedure posOrden ( a : arbol );
begin
   if ( a<> nil ) then begin
    posOrden (a^.HI);
    posOrden (a^.HD);
    write (a^.dato);

   end;
end;


var 
	a:arbol;
	num:integer;
BEGIN
	writeln('ingrese un numero:');
	readln(num);
	while(num<>0) do begin
		crear(a,num);
		writeln('ingrese un numero:');
		readln(num);
	end;
	writeln('--------PREORDEN------');
	preOrden(a);
	writeln;
	writeln('--------POSORDEN------');
	posOrden(a);
	writeln;
	
END.

