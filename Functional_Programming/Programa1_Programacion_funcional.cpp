/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 25 de septiembre del 2023

    La funcionalidad del programa es calcular la suma acumulada, resta acumulada, la suma acumulada de la multiplicacion, division y potencia
    de los siguientes 5 numeros primos de un numero ingresado por el usuario. Para el el programa funcione de manera correcta se debe de 
    ingresar un numero de 5 digitos con todos sus digitos diferentes de 0, si alguno es diferente de 0 se repetira la instruccion hasta que
    se ingrese un numero que cumpla con las especificaciones. 
    
    Funciones y Descripcion:
    - esPrimo: Verifica si el numero que recibe como parametro es primo o no
    - obtenerPrimos: Regresa los siguientes 6 numeros primos de un numero ingresado por el usuario
    - verificarCeros: Verifica si el numero dado por el usuario (recibido como parametro) tiene algun cero en alguna de sus posiciones
    - ingresarNumero: Pide un numero al usuario para las operaciones de programa, si tiene algun 0 repite la orden hasta que no tenga ningun 0
    - numeroPrimoAnterior: Regresa el numero primo anterior al numero ingresado por el usuario
    - sumaAcumulada: Regresa la suma acumulada de los numeros 5 de un arreglo que recibe como parametro
    - restaAcumulada: Regresa la resta acumulada de los numeros 5 de un arreglo que recibe como parametro
    - multiplicar: Multiplica un arreglo de 5 numeros por un numero llamado coeficiente y regresa un nuevo arreglo con los 5 numeros multiplicados
    - dividir: Divide un arreglo de 5 numeros entre un numero llamado coeficiente y regresa un nuevo arreglo con los 5 numeros divididos
    - potencia: Eleva a la potencia un arreglo de 5 numeros a un numero llamado coeficiente y regresa un nuevo arreglo con los nuevos 5 numeros
*/
#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

/* Funciones ocupadas para la practica*/
bool esPrimo(int numero){   /* Verifica si un numero es primo */
    if(numero <= 1){        /* Si el numero es 1 o menor no es primo*/
        return false;
    }
    for(int i = 2; pow(i, 2) <= numero; i++){       
        if(numero % i == 0){                    /* Si el numero es multiplo */
            return false;
        }
    }
    return true; 
}
vector<int> obtenerPrimos(int numero, vector<int> numerosPrimos){ /* Obtener los numeros primos*/
    int contador = 0;
    int i = numero + 1;                             /* Guarda los primero 6 primos en el vector ya que despues se ocupara el valor de sexto */
    for(i; contador < 6; i++){                      /* numero primo para restarlo con el primo anterior del numero dado para conseguir el */
        if(esPrimo(i)){                             /* valor del coeficiente para las demas operaciones */                            
            numerosPrimos.push_back(i);
            contador++;
        }
    }
    return numerosPrimos;
}
bool verificarCeros(int numero, int cociente = 0){ /* Verifica si el numero tiene algun cero */
    int residuo;
    cociente = numero;  /* El numero que se va a dividir*/
    if(cociente == 0){ /* Fin de la recursion*/
        return true;
    }
    else{
        cociente = cociente / 10;   /* Se divide entre 10 y se vuelve a reasignar*/
        residuo = cociente % 10;    /* El modulo se a asigna a residuo para la comparacion*/
        if(cociente != 0 && residuo == 0){      /* Si ambos son diferetes de 0 se llama de nuevo*/
            verificarCeros(numero, cociente);
        }
        else if(residuo == 0){  /* Si el residuo es 0, por tener un 0 en alguna posicion devuelve que No*/
            return false;
        }
    }
}
int ingresarNumero(){ /* Pide un numero al usuario */
    int numero;
    cout << "Ingrese un numero: ";
    cin >> numero;  
    if(numero < 11111 || numero > 99999 || numero % 10 == 0 || verificarCeros(numero) == 0){ /* Condiciones para los 0 en las diferetes posiciones */
        return ingresarNumero();
    }
    else{
        return numero;
    }
}
int numeroPrimoAnterior(int numero){    /* Regresa el primo anterior al numero dado */
    if(numero <= 1){                             /* Si se reduce hasta que 1 se detiene la recursion */
        return 0;
    }
    else{
        if(esPrimo(numero)){                    /* Si ya encontro el primo anterior regresa el valor */
            return numero;
        }
        else{
            numeroPrimoAnterior(numero - 1);    /* Aqui va reduciendo el numero hasta encontrar un primo*/
        }
    }
}
int sumaAcumulada(vector<int> numerosPrimos){ /* Regresa al suma acumulada de 5 numeros */
    int suma = 0;
    for(int i = 0; i < 5; i++){
        suma += numerosPrimos[i];   /* Aqui realiza la suma de los primeros 5 numeros del vector numerosPrimos */
    }
    return suma;
}
int restaAcumulada(vector<int> numerosPrimos){ /* Regresa al resta acumulada de 5 numeros */
    int resta = 0;
    for(int i = 0; i < 5; i++){
        resta -= numerosPrimos[i];   /* Aqui realiza la resta de los primeros 5 numeros del vector numerosPrimos */
    }
    return resta;
}
vector<int> multiplicar(vector<int> numerosPrimos, int coeficiente){ /* Multiplica un vector de 5 numeros por un numero llamado coeficiente */
    vector<int> numerosMultip;
    for(int i = 0; i < 5; i++){                                     /* Multiplica el valor de la posicion i del vector numerosPrimos por el valor de*/
        numerosMultip.push_back(numerosPrimos[i] * coeficiente);    /* coeficiente, y con el push_back los agrega a numerosMultip para su posterior suma */
    }
    return numerosMultip;
}
vector<int> dividir(vector<int> numerosPrimos, int coeficiente){    /* Divide un vector de 5 numeros por un numero llamado coeficiente */
    vector<int> numerosDivid;
    for(int i = 0; i < 5; i++){                                     /* Divide el valor de la posicion i del vector numerosPrimos entre el valor de*/
        numerosDivid.push_back(numerosPrimos[i] / coeficiente);     /* coeficiente, y con el push_back los agrega a numerosDivid para su posterior suma */
    }
    return numerosDivid;
}
vector<int> potencia(vector<int> numerosPrimos, int coeficiente, int i){ /* Hace la potencia de 5 numeros de una arreglo elevado a un numero coeficiente*/
    vector<int> numerosPotenc;
    if(i >= 5){ /* CASO BASE: Hasta que se haya evaluado los 5 numeros */
        return numerosPotenc;   /* Regresa el nuevo vector resultado */
    }
    else{
        numerosPotenc.push_back(pow(numerosPrimos[i], coeficiente)); /* Hace la potencia y con el push_back los agrega a numerosPotencpara su posterior suma */
        potencia(numerosPrimos, coeficiente, i + 1);    /* Llamada recursiva*/
    }
    return numerosPotenc; /* Regresa el nuevo vector resultado */
}

int main(){
    int numero, sumaTotal, restaTotal, dividTotal, multipTotal, potenTotal, primoAnterior, coeficiente; /* Variables */
    int i = 0;
    vector<int> numerosPrimos;          /* Los vectores que se van a ocupar */
    vector<int> numerosMultip;
    vector<int> numerosDivid;
    vector<int> numerosPotenc;
    
    numero = ingresarNumero(); /* Pedir el numero al usuario */
    numerosPrimos = obtenerPrimos(numero, numerosPrimos);   /*Obtener los siguientes 6 numeros primos del numero dado */

    cout << "♦Los siguientes 5 numeros primos son: ";   /* Aqui solo imprime los primeros 5 numeros de numerosPrimos con los que se realizaran */
    for(int i = 0; i < 5; i++){                         /* las demas operaciones */
        cout << numerosPrimos[i] << " ";
    }

    sumaTotal = sumaAcumulada(numerosPrimos);                                   /* Realiza la suma acumulada de numerosPrimos*/
    cout << "\n♦La Suma acumulada de los 5 numeros primos es: " << sumaTotal;   /* e imprime el valor*/
    
    restaTotal = restaAcumulada(numerosPrimos);                                 /* Realiza la resta acumulada de numerosPrimos*/
    cout << "\n♦La Resta acumulada de los 5 numeros primos es: " << restaTotal; /* e imprime el valor */

    primoAnterior = numeroPrimoAnterior(numero);                    /* Calcula en numero primo anterior al numero dado */
    coeficiente = numerosPrimos[5] - primoAnterior;                 /* Calcula el coeficiente para las demas operaciones con la resta del los numeros */
    
    numerosMultip = multiplicar(numerosPrimos, coeficiente);        /*Realiza la multiplicacion de los valores de numerosPrimos por el valor del coeficiente */
    numerosDivid  = dividir(numerosPrimos, coeficiente);            /* Realiza la division de los valores de numerosPrimos entre el valor del coeficiente*/
    numerosPotenc = potencia(numerosPrimos, coeficiente, i);        /* Realiza la potencia de los valores de numerosPrimos elevados al coeficiente */
    
    multipTotal = sumaAcumulada(numerosMultip);                                 /* Calcula la suma acumulada de la multiplicacion */
    cout << "\n♦La suma acumulada de la Multiplicacion es: " << multipTotal;    /* Imprime la suma acumulada de la multiplicacion */

    dividTotal = sumaAcumulada(numerosDivid);                                   /* Calcula la suma acumulada de la division*/
    cout << "\n♦La suma acumulada de la Division es: " << dividTotal;           /* Imprime la suma acumulada de la division */
    
    potenTotal = sumaAcumulada(numerosPotenc);                                  /* Calcula la suma acumulada de la potencia */
    cout << "\n♦La suma acumulada de la Potencia es: " << potenTotal;           /* Imprime la suma acumulada de la Potencia */

    return 0;
}