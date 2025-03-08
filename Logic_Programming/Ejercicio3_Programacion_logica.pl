/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 13 de octubre del 2023
   Este programa en Prolog tiene como funcionalidad crear las reglas de abuelo,
   abuela, hermano, hermana, tio, tia, descendiente y antecesor, haciendo uso de
   la base de conocimientos que define quienes son hombres, mujeres, al igual que
   las relaciones padre, madre, conyugue, hijo e hija.
*/

% Base de Conocimientos para el programa
% Definicion de quien es hombre
hombre(rafael_rey).
hombre(sergio).
hombre(luis_gallego).
hombre(alejandro).
hombre(sergio).
hombre(luis_miguel).
hombre(alexander).
hombre(miguel).
hombre(daniel).
% Definicion de quien es mujer
mujer(matilde).
mujer(vanda).
mujer(marcella).
mujer(alexandra).
mujer(isabella).
mujer(bibi).
mujer(aracely).
mujer(stephani).
mujer(michelle).
% Definicion de quien es padre de quien
padre(rafael_rey, luis_gallego).
padre(sergio, marcella).
padre(luis_gallego, alejandro).
padre(luis_gallego, sergio).
padre(luis_gallego, luis_miguel).
padre(alejandro, alexander).
padre(alejandro, isabella).
padre(luis_miguel, miguel).
padre(luis_miguel, daniel).
padre(luis_miguel, michelle).
% Definicion de quien es madre de quien
madre(matilde, luis_gallego).
madre(vanda, marcella).
madre(marcella, alejandro).
madre(marcella, sergio).
madre(marcella, luis_miguel).
madre(alexandra, isabella).
madre(bibi, alexander).
madre(aracely, miguel).
madre(aracely, daniel).
madre(stephani, michelle).
% Definicion de quien es el conyugue de quien
conyugue(rafael_rey, matilde).
conyugue(sergio, vanda).
conyugue(luis_gallego, marcella).
conyugue(alejandro, bibi).
conyugue(alejandro,alexandra).
conyugue(luis_miguel, aracely).
conyugue(luis_miguel, stephani).
% Definicion de quien es hijo de quien
hijo(luis_gallego, rafael_rey).
hijo(luis_gallego, matilde).
hijo(alejandro, luis_gallego).
hijo(alejandro, marcella).
hijo(sergio, luis_gallego).
hijo(sergio, marcella).
hijo(luis_miguel, luis_gallego).
hijo(luis_miguel, marcella).
hijo(alexander, alejandro).
hijo(alexander, bibi).
hijo(miguel, luis_miguel).
hijo(miguel, aracely).
hijo(daniel, luis_miguel).
hijo(daniel, aracely).
% Definicion de quien es hija de quien
hija(marcella, sergio).
hija(marcella, vanda).
hija(isabella, alexandra).
hija(isabella, alejandro).
hija(michelle, luis_miguel).
hija(michelle, stephani).

% Creacion de las reglas
hermano(A,B) :- padre(C,A) , padre(C, B), hombre(A).
% A es hermano de B si ambos comparten el mismo padre C, no se incluye a la madre ya que esta regla esta definida
% para aquellos casos que no tengan ambos progenitores, es decir madre y padre, sino solo el padre
hermana(A,B) :- padre(C,A) , padre(C, B), mujer(A).
% A es hermana de B si ambos comparten el mismo padre C, no se incluye a la madre ya que esta regla esta definida
% para aquellos casos que no tengan ambos progenitores, es decir madre y padre, sino solo el padre

abuelo(A,B) :- hijo(B,C) ; hija(B,C) , hijo(C,A) ; hija(C,A) , hombre(A).
% A es el abuelo de B si B es hijo o hija de C, y que C sea el hijo o hija de de B, por ultimo ver su A es hombre
abuela(A,B) :- hijo(B,C) ; hija(B,C) , hijo(C,A) ; hija(C,A) , mujer(A).
% A es la abuela de B si B es hijo o hija de C, y que C sea el hijo o hija de de B, por ultimo ver si A es mujer

tio(A,B) :- hijo(B,C) ; hija(B,C) , padre(D,C) , padre(D, A), madre(E,A) , madre(E, C), conyugue(D,E), hombre(A).
% A es el tio de B si B es hijo o hija de C, si el padre y la madre de C y A son la mimsa persona, de igual manera
% si el madre y la padre estan casados, por ultimo pregunta si A es hombre para definir bien a Tio
tia(A,B) :- hijo(B,C) ; hija(B,C) , padre(D,C) , padre(D, A), madre(E,A) , madre(E, C), conyugue(D,E), mujer(A).
% A es la tia de B si B es hijo o hija de C, si el padre y la madre de C y A son la mimsa persona, de igual manera
% si el madre y la padre estan casados, por ultimo pregunta si A es mujer para definir bien a Tia

descendiente(A,B) :- hijo(A,B);hija(A,B) ;
                     hijo(A,C);hija(A,C),hijo(C,B);hija(C,B) ;
                     hijo(A,C);hija(A,C),hijo(C,D);hija(C,D),hijo(D,B);hija(D,B).
% Para empezar tenemos que entender que descendiente es toda aquella persona que este por debajo de A en el arbol
% genealogio incluyendo desde hijo, nieto y bisnieto. Para empezar se pregunta si B es hijo o hija de B. Si no es
% hijo de B, para definir al nieto se pregunta si A es hijo o hija de C, y despues de C es hijo o hija de B. Si tampoco
% es nieto se pregunta se es bisnieto, mediante la definicion que A es hijo o hija de C, si A es hijo o hija pregunta si
% C (el padre de A) es hijo o hija de D, si D es el padre del padre de A (el abuelo A) pregunta por ultimo si D es hijo de
% B para ver si es su bisabuelo. Y asi se define a las tres lineas de descendencia de una persona del arbol.
antecesor(A,B):- padre(A,B);madre(A,B) ;
		 padre(A,C);madre(A,C),padre(C,B);madre(C,B) ;
                 padre(A,C);madre(A,C),padre(C,D);madre(C,D),padre(D,B);madre(D,B).
% Para empezar tenemos que entender que antecesor es toda aquella persona que este por arriba de A en el arbol
% genealogico incluyendo a los padre, abuelos y bisabuelos. Para empezar pregunta su B es el padre o la madre de B. Si no lo
% es, para definir al abuelo se pregunta se A es padre o madre de C, y despues de C es padre o madre de B. Si tampoco es
% abuelo se pregunta para ver si es bisabuelo mediante si A es padre o madre de C, si C es padre o madre de D, y por ultimo
% si D es el padre o la madre de B. Y asi es como se definen a las tres lineas de antecesores de una persona del arbol.

ancestro(X,X). % Caso Base de Ancestro (es lo mismo que antecesor, quien este por arriba del arbol genealogico)
ancestro(X,Y):- ancestro(Z,Y), padre(X,Z);madre(X,Z).

% Correccion del caso base y la regla de ancestro
ancestroV2(X,Y):- padre(X,Y);madre(X,Y). % Caso base, cuando X sea el padre o la madre de Y
ancestroV2(X,Y):- padre(X,Z);madre(X,Z), ancestroV2(Z,Y).% Hace la llamada recursiva con Z para buscar si es ancestro


