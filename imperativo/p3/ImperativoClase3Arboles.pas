{Escribir un programa que:
a. Implemente un modulo que lea informacion de socios de un club y las almacene en un arbol binario de busqueda. De cada socio se lee numero de socio, 
nombre y edad. La lectura finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio.
b. Una vez generado el arbol, realice modulos independientes que reciban el arbol como parametro y: 
    i. Informe el numero de socio mas grande. Debe invocar a un modulo recursivo que retorne dicho valor. 
    ii. Informe los datos del socio con el numero de socio mas chico. Debe invocar a un modulo recursivo que retorne dicho socio. 
    iii. Informe el numero de socio con mayor edad. Debe invocar a un modulo recursivo que retorne dicho valor. 
    iv. Aumente en 1 la edad de todos los socios.
    v. Lea un valor entero e informe si existe o no existe un socio con ese valor. Debe invocar a un modulo recursivo que reciba el valor lei­do y
       retorne verdadero o falso.
    vi. Lea un nombre e informe si existe o no existe un socio con ese valor. Debe invocar a un modulo recursivo que reciba el nombre lei­do y 
        retorne verdadero o falso.
    vii. Informe la cantidad de socios. Debe invocar a un modulo recursivo que retorne dicha cantidad.
    viii. Informe el promedio de edad de los socios. Debe invocar al módulo recursivo del inciso vii e invocar a un módulo recursivo que retorne la suma
          de las edades de los socios.
    ix. Informe, a partir de dos valores que se leen, la cantidad de socios en el arbol cuyo numero de socio se encuentra entre 
        los dos valores ingresados. Debe invocar a un modulo recursivo que reciba los dos valores leÃ­dos y retorne dicha cantidad. 
    x. Informe los numeros de socio en orden creciente. 
    xi. Informe los numeros de socio pares en orden decreciente.
}

Program ImperativoClase3;

type 
	 rangoEdad = 12..100;
     cadena15 = string [15];
     socio = record
               numero: integer;
               nombre: cadena15;
               edad: rangoEdad;
             end;
     arbol = ^nodoArbol;
     nodoArbol = record
                    dato: socio;
                    HI: arbol;
                    HD: arbol;
                 end;
     
procedure GenerarArbol (var a: arbol);
{ Implemente un modulo que lea informacion de socios de un club y las almacene en un arbol binario de busqueda. De cada socio se lee numero de socio, 
nombre y edad. La lectura finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. }

  Procedure LeerSocio (var s: socio);
  begin
    write ('Ingrese numero del socio: ');
    readln (s.numero);
    If (s.numero <> 0)
    then begin
           write ('Ingrese nombre del socio: ');
           readln (s.nombre);
           write ('Ingrese edad del socio: ');
           readln (s.edad);
         end;
  end;  
  
  Procedure InsertarElemento (var a: arbol; elem: socio);
  Begin
    if (a = nil) 
    then begin
           new(a);
           a^.dato:= elem; 
           a^.HI:= nil; 
           a^.HD:= nil;
         end
    else if (elem.numero < a^.dato.numero) 
         then InsertarElemento(a^.HI, elem)
         else InsertarElemento(a^.HD, elem); 
  End;

var 
	unSocio: socio;  
Begin
 a:= nil;
 LeerSocio (unSocio);
 while (unSocio.numero <> 0)do
  begin
   InsertarElemento (a, unSocio);
   writeln;
   LeerSocio (unSocio);
  end;
end;

procedure InformarNumeroSocioMasGrande (a: arbol);
{Informe el numero de socio mas grande. Debe invocar a un modulo recursivo que retorne dicho valor.}

  function NumeroMasGrande (a: arbol): integer;
  begin
    if (a = nil) then NumeroMasGrande:= -1
    else if (a^.HD = nil) then NumeroMasGrande:= a^.dato.numero
                          else NumeroMasGrande:= NumeroMasGrande (a^.HD);
  end;
   
var 
	max: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Mas Grande ----->');
  writeln;
  max:= NumeroMasGrande (a);
  if (max = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio mas grande: ', max);
         writeln;
       end;
end;

procedure InformarDatosSocioNumeroMasChico (a: arbol);
{ Informe los datos del socio con el numero de socio mas chico. Debe invocar a un modulo recursivo que retorne dicho socio. }
  
  function SocioMasChico (a: arbol): arbol;
  begin
    if ((a = nil) or (a^.HI = nil))
    then SocioMasChico:= a
    else SocioMasChico:= SocioMasChico (a^.HI);
  end;
   
var 
	minSocio: arbol;
begin
  writeln;
  writeln ('----- Informar Datos Socio Numero Mas Chico ----->');
  writeln;
  minSocio:= SocioMasChico (a);
  if (minSocio = nil) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Socio con numero mas chico: ', minSocio^.dato.numero, ' Nombre: ', minSocio^.dato.nombre, ' Edad: ', minSocio^.dato.edad); 
         writeln;
       end;
end;

procedure InformarNumeroSocioConMasEdad (a: arbol);
{ Informe el numero de socio con mayor edad. Debe invocar a un modulo recursivo que retorne dicho valor.  }

     procedure actualizarMaximo(var maxValor,maxElem : integer; nuevoValor, nuevoElem : integer);
	begin
	  if (nuevoValor >= maxValor) then
	  begin
		maxValor := nuevoValor;
		maxElem := nuevoElem;
	  end;
	end;
	procedure NumeroMasEdad (a: arbol; var maxEdad: integer; var maxNum: integer);
	begin
	   if (a <> nil) then
	   begin
		  actualizarMaximo(maxEdad,maxNum,a^.dato.edad,a^.dato.numero);
		  numeroMasEdad(a^.hi, maxEdad,maxNum);
		  numeroMasEdad(a^.hd, maxEdad,maxNum);
	   end; 
	end;
var maxEdad, maxNum: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Con Mas Edad ----->');
  writeln;
  NumeroMasEdad (a, maxEdad, maxNum);
  if (maxEdad = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio con mas edad: ', maxNum);
         writeln;
       end;
end;

procedure AumentarEdad (a: arbol);
begin
 if (a <> nil)
 then begin
        a^.dato.edad:= a^.dato.edad + 1;
        AumentarEdad (a^.HI);
        AumentarEdad (a^.HD);
      end;
end;

procedure InformarExistenciaNumeroSocio (a: arbol);
{ Lea un valor entero e informe si existe o no existe un socio con ese valor. Debe invocar a un modulo recursivo que reciba el valor lei­do y
       retorne verdadero o falso. }
       
  function Buscar (a: arbol; num: integer): boolean;
  begin
    if (a = nil) 
    then Buscar:= false
    else If (a^.dato.numero = num) 
         then Buscar:= true
         else if (num < a^.dato.numero)
              then Buscar:= Buscar (a^.HI, num)
              else Buscar:= Buscar (a^.HD, num)
  end;
  
var numABuscar: integer;
begin
  writeln;
  writeln ('----- Informar Existencia Numero Socio ----->');
  writeln;
  write ('Ingrese numero de socio a buscar: ');
  Readln (numABuscar);
  writeln;
  if (Buscar (a, numABuscar)) 
  then writeln ('El numero ', numABuscar, ' existe')
  else writeln ('El numero ', numABuscar, ' no existe');
  writeln;
end;
 procedure InformarExistenciaNombreSocio (a:arbol);
	function BuscarXNombre(a:arbol; nom: cadena15):boolean;
	begin
		if(a =nil) then BuscarXNombre:= false
		else if(nom = a^.dato.nombre) then BuscarXNombre:=  true
		else begin
			BuscarXNombre(a^.HI, nom);
			BuscarXNombre(a^.HD, nom);
			end;
	end;
var
	nomABuscar: cadena15;
 begin
	writeln;
  writeln ('----- Informar Existencia de Socio por nombre ----->');
  writeln;
  write ('Ingrese nombre del socio a buscar: ');
  Readln (nomABuscar);
  writeln;
  if (BuscarXNombre (a, nomABuscar)) 
  then writeln ('El socio de nombre ', nomABuscar, ' existe')
  else writeln ('El socio de nombre ', nomABuscar, ' no existe');
  writeln;
 end; 
 function CantidadSocios (a:arbol; cant: integer):integer;
	begin
		if(a<>nil) then 
		begin
			cant := cant +1;
			CantidadSocios(a^.HI, cant);
			CantidadSocios(a^.HD, cant);			
		end;
		CantidadSocios := cant;
	end;
 procedure InformarCantidadSocios(a: arbol);
 
var
	cant: integer;
begin
	cant :=0;
	writeln;
	writeln ('La cantidad total de socios es: ', CantidadSocios(a, cant));
end;
procedure InformarPromedioDeEdad (a:arbol);
	procedure EdadTotal(a: arbol; var tot: integer);
	begin
		if(a<>nil) then 
		begin		
		tot := tot +a^.dato.edad;
		EdadTotal(a^.HD,tot);	
		EdadTotal(a^.HI,tot);						
		end;	
		
	end;
var
	 cant,tot: integer;
	prom : double;
begin	
	cant:=0;
	tot :=0;
	cant := CantidadSocios(a,cant);
	EdadTotal(a,tot);
	prom:= tot div cant;	
	writeln('la edad total es:', tot);
	if(cant <> 0) then begin
		writeln('La edad promedio de los socios es: ', prom:2:2);
	end;
end;
{procedure InformarCantidadSociosEnRango (a:arbol);
	function CantidadSociosXRango(a:arbol; var cant: integer; inf, sup: integer):integer;
	begin
		if((a<>nil) and (a^.dato.numero ) )then 
		begin
			cant := cant +1;
			CantidadSociosXRango(a^.HI, cant);
			CantidadSociosXRango(a^.HD, cant);			
		end;
		CantidadSociosXRango:= cant;
	end;
var
	inf, sup, cant: integer;
begin
	cant:=0;
	writeln;
	writeln('ingrese el valor inferior del rango: ');
	readln(inf);
	writeln('ingrese el valor superior del rango: ');
	readln(sup);
	
end;}
Procedure InformarNumerosSociosOrdenCreciente ( a : arbol );
begin
   if ( a<> nil ) then begin
    InformarNumerosSociosOrdenCreciente (a^.HI);
    writeln(a^.dato.numero);
    writeln('----------------------');
    InformarNumerosSociosOrdenCreciente (a^.HD);
   end;
end;


   Procedure InformarNumerosSociosOrdenDeCreciente( a : arbol );
begin
   if ( a<> nil ) then begin
  InformarNumerosSociosOrdenDeCreciente (a^.HD);
    writeln(a^.dato.numero);
    writeln('----------------------');
    InformarNumerosSociosOrdenDeCreciente (a^.HI);
   end;
end;




 
var a: arbol; 
Begin
  GenerarArbol (a);
  InformarNumeroSocioMasGrande (a);
  InformarDatosSocioNumeroMasChico (a);
  InformarNumeroSocioConMasEdad (a); //no anda]??
  AumentarEdad (a);
  InformarExistenciaNumeroSocio (a);
  InformarExistenciaNombreSocio (a);
  InformarCantidadSocios (a);
  InformarPromedioDeEdad (a);
  {InformarCantidadSociosEnRango (a);}
	writeln('---------creciente-------------');
    InformarNumerosSociosOrdenCreciente (a);
    writeln('-----------decreciente-----------');
    InformarNumerosSociosOrdenDeCreciente (a);
    
End.
