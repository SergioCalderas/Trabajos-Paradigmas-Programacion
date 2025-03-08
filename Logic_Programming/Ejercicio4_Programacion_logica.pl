/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 12 de octubre del 2023
   Este programa en Prolog tiene como funcionalidad verificar si un numero es primo
   o no lo es haciendo uso de la recursividad. esPrimo recibe el numero
   que se quiere compribar y lo pasa a comprueba con un segundo
   argumento para verificar es divisible entre dos (numero par)
*/
% Base de conocimiento para el programa
% % Se le pasa como primer numero 2 para comprobar si es par, y de ahi se ira aumenando el valor de X
esPrimo(Numero) :- comprueba(Numero, 2).

% Caso Base si el numero es mayor o igual a 1 y si su cuadrado es mayor
% que el numero dado. Esto para saber que es primp y no seguir revisando
% para mas numeros mayores que X
comprueba(Numero, X) :- Numero >= 1, X*X > Numero.

% Si el numero es divisible entre 2 es par y ya no se considera primo y
% detiene la recursion, el !, false para en seco la recursion y regresa
% false para que ya no siga iterando
comprueba(Numero, X) :- Numero mod X =:= 0, !, false.

% Se aumenta en 1 el valor de 1 para seguir buscando con el nuevo valor en la recursividad
comprueba(Numero, X) :- NuevaX is X + 1, comprueba(Numero, NuevaX).

