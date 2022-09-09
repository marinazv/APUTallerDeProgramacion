{
   ej3p4.pas
   
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


program ej3p4;

const
	sucursales= 4;
	
type
	venta= record
		fecha: string;
		cod: integer;
		sucursal: 0..sucursales;
		cant: integer;
	end;
	vtot= record
		cod: integer;
		cant: integer;
	end;
	
	lista = ^nodo;
	nodo = record
		dato: venta;
		sig: lista;
	end;
	
	lista2=^nodo2;
	nodo2=record
		dato: vtot;
		sig: lista2;
	end;
	
	vecVtas= array[1..sucursales] of lista;

procedure cargarVentas(var vv:vecVtas);
	procedure leerVta(var vt:venta);
	begin
		writeln('Ingrese codigo de sucursal: ');
		readln(vt.sucursal);
		if(vt.sucursal <> 0) then begin
			writeln('Ingrese codigo de producto: ');
			readln(vt.cod);
			writeln('Ingrese fecha de compra: ');
			readln(vt.fecha);
			writeln('Ingrese cantidfad vendida: ');
			readln(vt.cant);
		end
	end;
	Procedure InsertarOrdenadoEnLista ( var pri: lista; elem: venta);
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
procedure minimo(var vv:vecVtas; var  );

begin
	
end;
procedure MergeAcumulador(vv: vecVtas; var l:lista2);
	
var
	codMin:integer;
	actual: vtot;
Begin
	l:=nil;
	minimo(vv, codMin, cantTot);
	while(codMin <> 9999 )do begin
		actual.dato.cod:= codMin;
		actual.dato.cant:= cantTot;
		while(codMin <>9999 and codMin= )do begin
			
		end;
	end;
end;
var 
	vv: vecVtas;
	l:lista2;
BEGIN
	cargarVentas(vv);
	MergeAcumulador(vv,l);
END.

