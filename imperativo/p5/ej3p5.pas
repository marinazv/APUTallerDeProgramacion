{
   ej3p5.pas
   
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


program ej3p5;

type
	rub= 1..10;
	producto= record
		cod: integer;
		rubro: rub;
		stock: integer;
		precio: double;
	end;
	prod= record
		cod: integer;
		stock: integer;
		precio: double;
	end;
	arbol=^nodo;
	nodo=record
		dato: prod;
		HI:arbol;
		HD:arbol;
	end;
	
	vector= array[rub] of arbol;
procedure cargarProductos();
var
	

BEGIN
	
	
END.

