{
     
   
}


program ej2p3;

uses crt;

type
	venta= record
		codProd: integer;
		fecha: string;
		cant: integer;
	end;
	
	ventaT= record
		codProd: integer;
		cantTot: integer;
	end;
	
	arbol=^nodo;
	nodo= record
		dato: venta;
		HI: arbol;
		HD: arbol;
	end;
	
	arbol2=^nodo2;
	nodo2=record
		dato: ventaT;
		HI:arbol2;
		HD:arbol2;
	end;
procedure CrearArboles(var a:arbol; var a2:arbol2);
	procedure leerVenta(var v:venta);
	begin with v do begin
		writeln('Ingrese codigo de producto');
		readln(codProd);
		if(codProd <> 0) then begin
			writeln('Ingrese fecha de compra:');
			readln(fecha);
			writeln('Ingrese cantidad de productos: ');
			readln(cant);
		end;
	end;
	end;
	procedure cargarArbol(var a:arbol; v:venta);
	begin
		if(a=nil) then begin
			new(a);
			a^.dato:=v;
			a^.HI:= nil;
			a^.HD:= nil;
		end
		else if( v.codProd< a^.dato.codProd ) then begin
			cargarArbol(a^.HI,v);
		end
		else cargarArbol(a^.HD,v);
	end;
	procedure cargarArbolAcum(var a2:arbol2; v:venta);
		function buscarElemento(a2:arbol2; v:venta): arbol2;
		begin
			if(a2 = nil) then begin
				new(a2);
				a2^.dato.codProd := v.codProd;
				a2^.dato.cantTot:= v.cant;
				a2^.HI:= nil;
				a2^.HD:= nil;
				buscarElemento:= a2;
				
			end
			else if(v.codProd = a2^.dato.codProd) then begin
				a2^.dato.cantTot := a2^.dato.cantTot + v.cant;
			end
				else if (v.codProd < a2^.dato.codProd) then begin
					buscarElemento:=buscarElemento(a2^.HI, v);
					end
					else begin buscarElemento:=buscarElemento(a2^.HD, v);
					end;
		end;
	begin
		buscarElemento(a2,v);
	end;
var 
	v:venta; 
begin
	leerVenta(v);
	while(v.codProd <> 0) do begin
		cargarArbol(a,v);
		cargarArbolAcum(a2,v);
		leerVenta(v);
	end;
	
end;


function suma(a: arbol; cod:integer): integer;

	procedure buscarCod(a:arbol; cod: integer; var tot: integer);
	begin
		if(a= nil) then begin
			tot:= tot;
		end
		else if(cod = a^.dato.codProd) then begin
			tot := tot + a^.dato.cant;
		end
			else if(cod < a^.dato.codProd) then begin
				buscarCod(a^.HI, cod,tot);
			end
			else buscarCod(a^.HD, cod,tot);
			end;
	
var
	
	tot: integer;
	
begin
	tot :=0;	
	buscarCod(a,cod, tot);
	suma:= tot;	
end;



var
	a:arbol;
	a2:arbol2;
	cod: integer;
BEGIN
		
		a:=nil;
		a2:=nil;
		CrearArboles(a,a2);
		writeln('ingrese codigo del producto para suma de ventas: ');
		readln(cod);
		writeln('El total de unidades vendidas del productode codigo ', cod, ' es: ', suma(a,cod));
	
END.

