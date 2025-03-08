/*	Alumno: Franco Calderas Sergio Alberto
	Grupo: 3BV1
	Carrera: Ingenieria en Inteligencia Artificial
	Ultima fecha de modificación: 10 de octubre del 2023
	Este programa en Prolog tiene el objetivo de definir quien es la madre de
    una persona conociendo ya la base de conocimientos de hombre y mujer
    junto con las relaciones de quien es el progenitor de quien, para
    posteriormente realizar los diferentes tipos de consultas que se pueden
    realizar en Prolog
*/
% Base de Conocimientos para el programa
% Definicion de quienes son mujeres
mujer(pilar).
mujer(belen).
mujer(lucia).
mujer(ana).
mujer(maria).
% Definicion de quienes son hombres
hombre(tomas).
hombre(pedro).
hombre(jose).
% Definicion de quien es el progenitor de quien
progenitor(belen, pedro).
progenitor(ana, belen).

% Reglas para la definicion de madre, X es madre de Y si ambos estan
% relacionados por medio de progenitor y que X sea mujer
madre(A,B) :- progenitor(A,B) , mujer(B).
