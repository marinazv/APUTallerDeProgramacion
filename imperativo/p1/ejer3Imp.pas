{
   ejer3Imp.pas
   
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


program ejer3Imp;

uses crt;
const
	gen= 8;
type
	pelicula = record
		codPelicula: integer;
		codGenero: 1..gen;
		puntaje : real;
	end;
	lista=^nodo;
		nodo= record
		datos: pelicula;
		sig: lista;
		end;
	vectorPelis = array [1..gen] of lista;
	vectorCodigos = array[1..gen] of integer;

procedure inicVec(var vc: vectorPelis);
var
	i: integer;
begin
	for i:= 1 to gen do begin
		vc[i]:= nil;
	end
end;
	
procedure leerPelicula(p:pelicula);
begin
	writeln('Ingrese el codigo de la pelicula: ');
	readln(p.codPelicula);
	if(p.codPelicula <> -1) then begin
		writeln('Ingrese el codigo de genero (del 1 al 8): ');
		readln(p.codGenero);
		writeln('Ingrese el puntaje promedio: ');
		readln(p.puntaje);
	end;
end;
procedure agregarAlFinal(var pri: lista; p:pelicula);
var
	act, nue : lista;
begin
	new (nue);
	nue^.datos := p;
	nue^.sig := nil;
	if(pri <> nil) then begin
		act := pri;
		while(act^.sig <> nil) do begin
			act := act^.sig;
			act^.sig := nue;
		end;
	end
	else begin
		pri := nue;
	end;
end;
procedure almacenarPelis(var vp: vectorPelis);
var
	p: pelicula;
begin
	leerPelicula(p);
	while(p.codPelicula <> -1) do begin
		agregarAlFinal(vp[p.codGenero], p);
		leerPelicula(p);
	end;
end;
var 
	vp: vectorPelis;
	

BEGIN
	inicVec(vp);
	almacenarPelis(vp);
	
	
END.

