{
   ej2p2.pas
   
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


program ej2p2;



procedure leerNumero();
procedure imprimirDigitos(n: integer);
var
aux1: integer;
begin
	
	if(n <>0) then begin
		aux1:= n mod 10;
		n := n div 10;
		imprimirDigitos(n);			
		writeln(aux1);		
	end;
end;
var
	n:integer;
begin 
	writeln('Ingresar un numero: ');
	readln(n);
	if(n <> 0) then begin
		imprimirDigitos(n);
		writeln;
		leerNumero();
	end;
end; 
BEGIN
	leerNumero();
	
END.

