{
   ejer2Imp.pas
   
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


program ejer2Imp;

uses crt;

const 
	dimF = 300;
type
	
	oficina = record
		codId: integer;
		dni: string;
		expensas: real;
	end;
	
	vector = array [1..dimF] of oficina;


procedure leerOficina(var o: oficina);
begin
	writeln('Ingrese codigo de identificacion: ');
	readln(o.codId);
	if(o.codId <> -1) then begin
		writeln('Ingrese dni del propietario: ');
		readln(o.dni);
		writeln('Ingrese el valor de las expensas: ');
		readln(o.expensas);
	end
end;
procedure cargarArreglo(var v: vector; var dimL: integer);
var
	o: oficina;
begin
	
	leerOficina(o);
	while((dimL <= dimF) and (o.codId <> -1 )) do begin
		dimL := dimL +1;
		v[dimL]:= o;
		leerOficina(o);
	end;
	writeln('*************Carga de vector finalizada*************');
end;

procedure imprimirVector(v: vector; dimL: integer);
var 
i: integer;
begin
	for i:= 1 to dimL do begin
		writeln('------------------');
		write('CodId: ', v[i].codId);
		write('---DNI: ', v[i].dni);
		write('---Expensas $ ', v[i].expensas);
		writeln('------------------');
		end;
		
end;
Procedure ordenarSeleccion( var v: vector; dimL: integer );
var 
	i, j, p: integer; 
	item : oficina;	
		
begin
	for i:=1 to dimL-1 do begin {busca el mínimo y guarda en p la posición}
          p := i;
          for j := i+1 to dimL do
             if v[ j ].codId < v[ p ].codId then p:=j;

         {intercambia v[i] y v[p]}
         item := v[ p ];   
         v[ p ] := v[ i ];   
         v[ i ] := item;
      end;
end;
Procedure ordenarInsercion( var v: vector; dimL: integer );
var 
	i, j: integer;
	actual: oficina;	
		
begin
 for i:=2 to dimL do begin 
     actual:= v[i];
     j:= i-1; 
     while (j > 0) and (v[j].codId > actual.codId) do      
       begin
         v[j+1]:= v[j];
         j:= j -1;                  
       end;  
     v[j+1]:= actual; 
 end;
end;

var 
	v : vector;
	dimL: integer;
	
BEGIN
	dimL :=0;
	//---inciso A----
	cargarArreglo(v, dimL);
	imprimirVector(v, dimL);
	//--iniciso B----
	ordenarSeleccion(v, dimL);
	//--- inciiso C----
	ordenarInsercion(v,dimL);
	writeln('-----Vector ordenado--------');
	imprimirVector(v, dimL);
	
END.

