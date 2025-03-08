/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 13 de octubre del 2023
   Este programa en Prolog tiene como funcionalidad determinar cual es el maximo
   común denominador entre dos números, para el calculo del maxComDiv se deben de
   multiplicar todos los numeros por los cuales se pudo dividir exacamente A & B.
   El programa tiene la regla divisible cuyo proposito es ver que la division entre
   A & B con el divisor sea exacta sin residuo. La regla divisor comun encuentra a
   los numeros capaces de dividir A & B exactamente partiendo desde 2, y en cada
   llamada recursiva se suma 1 al divisor para comprobrar entre los demas numeros
   mientras qie el divisor sea menor que A & B. Y el resultado de la consulta se va
   guardando en Acumulado siendo el resultado de la multiplicacion de todos los
   divisores posibles.
*/
% Base de Conocimientos para el programa
% maxComDiv es la sentencia que se pasa para buscar el maximo comun
% denominador de los 2 numeros y guardarlo en R, divisor comun es la
% regla recursova que hace las divisiones de X & Y para buscar sus
% divisores, pasa de parametro los dos numeros a evaluar, 2 que sera el
% primer numero por el que se dividiran, 1 que sera el numero por el que
% se ira multiplicando los divisores de manera recursiva, y R el
% resultado final
maxComDiv(X, Y, R) :- divisorComun(X, Y, 2, 1, R).

% Verifica si el numero A o B es perfectamente divisible entre el
% divisor ,es decir que tenga de residuo cero
divisible(N, Divisor) :- N mod Divisor =:= 0.

divisorComun(X, Y, Divisor, Total, R) :-
    % Verifica si el divisor es menor que ambis numeros, y ademas si los numeros son exactamente divisibles entre el divisor
    Divisor < X, Divisor < Y, divisible(X, Divisor), divisible(Y, Divisor),
    % El NuevoTotal es el producto de los divisores, y el NuevoDivisor es el divisor + 1 para seguir probando si el sig numero
    % es tambien un divisor de ambos numeros
    NuevoTotal is Total * Divisor, NuevoDivisor is Divisor + 1,
    % El NuevoX y NuevoY es el cociente entero de la division de ambos nuemeros entre el Divisor
    NuevoX is X//Divisor , NuevoY is Y//Divisor,
    % Llamada recursiva con los nuevos valores, y R donde al final se guardara el valor final de Total
    divisorComun(NuevoX, NuevoY, NuevoDivisor, NuevoTotal, R).

% Se asigna a R el valor de Total una vez que haya terminado la recursion, para ese instante Total ya tiene el producto de
% todos los primos que dividieron A y B, se pasa _ como parametros de X, Y, Divisor ya que el valor que tengan al final no importa
% para la asignacion  del valor de Total a R
divisorComun(_, _, _, Total, Total).
