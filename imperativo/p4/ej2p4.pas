{
   ej2p4.pas
   
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


program ej2p4;

const
	dimF= 8;
	vmax=9999;
	
type
	pelicula= record
		cod: integer;
		gen: 1..dimf;
		puntaje: double;
	end;
	
	lista= ^nodo;
	nodo= record
		dato: pelicula;
		sig: lista;
	end;
	
	vectorPelis= array[1..dimF] of lista;
	
procedure inicVec(var vp: vectorPelis);
var 
	i: integer;
begin
	 for i:=0 to dimf do begin
		vp[i]:=nil;
	 end;
end;	

procedure AlmacenarPelis(var vp:vectorPelis);
	procedure leerPeli(var p: pelicula);
	begin
		writeln('Ingrese codigo de pelicula: ');
		readln(p.cod);
		if(p.cod <> -1) then begin
			writeln('Ingrese codigo de genero (de 1 al 8): ');
			readln(p.gen);
			writeln('Ingrese codigo de pelicula: ');
			readln(p.puntaje);
		end
	end;
	Procedure InsertarOrdenadoEnLista ( var pri: lista; elem: pelicula);
	var
		ant, nue, act: lista;
	begin
		new (nue);
		nue^.dato := elem;
		act := pri;
		while (act<>NIL) and (act^.dato.cod < elem.cod) do begin
			ant := act;
			act := act^.sig ;
		end;
		if (act = pri)  then
			pri := nue
		else
			ant^.sig := nue;
			nue^.sig := act ;
	end;
var
	p:pelicula;
begin
	leerPeli(p);
	while(p.cod <> -1) do begin
		InsertarOrdenadoEnLista(vp[p.cod],p);
		leerPeli(p);
	end;
end;
procedure minimo(var vp:vectorPelis; var minPeli: pelicula);
var 
	iMin,i:integer;
begin
	minPeli.cod:= vmax;
	for i:=1 to dimF do begin
		if(vp[i] <>nil )then begin
			if(vp[i]^.dato.cod <= minPeli.cod) then begin
				iMin:= i;
				minPeli:= vp[i]^.dato;
			end
		end;
		if(minPeli.cod <> vmax) then begin
			vp[iMin]:= vp[iMin]^.sig; 
		end
	end;
end;
procedure Merge(vp:vectorPelis; var l:lista);

	procedure AgregarAtras (var l, ult: lista; p: pelicula); 
	var  
		nuevo: lista;
	begin 
     new (nuevo); nuevo^.dato:= p; nuevo^.sig := nil;
     if (l = nil) then l:= nuevo
       else ult^.sig := nuevo;
			ult := nuevo;
   end;
 var
	ult:lista;
	minPeli: pelicula;
begin
	l:= nil;
	minimo(vp,minPeli);
	while(minPeli.cod <> vmax) do begin
		AgregarAtras(l,ult,minPeli);
		minimo(vp,minPeli);
	end;
end;
var 
	vp: vectorPelis;
	l:lista;
BEGIN
	
	inicVec(vp);
	AlmacenarPelis(vp);
	Merge(vp, l);
END.

