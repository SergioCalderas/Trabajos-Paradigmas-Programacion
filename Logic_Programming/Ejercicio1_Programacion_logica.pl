/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 10 de octubre del 2023
   Este programa en Prolog tiene como funcionalidad definir la relacion
   de hermanos conociendo ya la base de datos de la relacion padreDe
   que define quien es el padre de una persona
*/

% Base de Conocimientos para el programa
persona(pablo, juan, maria, marcela, carlos, debora).
padreDe(juan, maria).
padreDe(pablo, juan).
padreDe(pablo, marcela).
padreDe(carlos, debora).

% Reglas para la definicion de hijo y hermanos
% A es hijo de B, si B es el padre de A
hijode(A,B) :- padreDe(B,A).
% A es hermano de B si ambos comparten al mismo padre C y si ambos
% son diferentes personas
hermanos(A, B) :- padreDe(C,A) , padreDe(C, B), A \= B.
