/* Alumno: Franco Calderas Sergio Alberto
   Grupo: 3BV1
   Carrera: Ingenieria en Inteligencia Artificial
   Ultima fecha de modificación: 25 de septiembre del 2023

    La funcionalidad del programa es calcular la suma acumulada, resta acumulada, la suma acumulada de la multiplicacion, division y potencia
    de los siguientes 5 numeros primos de un numero ingresado por el usuario. El programa uso los principio del paradigma funcional, es decir
    que no exite el concepto de ciclo y todas las funciones para este programa estan realizadas de manera recursiva. De igual manera se 
    apega a la transparencia referencial y evita modificar el valor de variables ya iniciadas. Para el el programa funcione de manera 
    correcta se debe de ingresar un numero de 5 digitos con todos sus digitos diferentes de 0, si alguno es diferente de 0 se repetira la 
    instruccion hasta que se ingrese un numero que cumpla con las especificaciones. 
    
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
    - imprimirNumeros: Imprime los primeros 5 numeros del arreglo numerosPrimos, con los cuales se van a hacer las operaciones
*/
#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

/* Funciones recursivas ocupadas para la practica*/
bool esPrimo(int numero, int i = 2){    /* Verifica si un numero es primo */
    if(numero <= 1){                    /* Se inicializa en 2 que es el primer primo*/
        return false;                   /* Si el numero es 1 o menor no es primo*/
    }
    if(pow(i, 2) > numero){             /* Si el numero al cuadrado es mayor al numero dado */
        return true;
    }
    if(numero % i == 0){                /* Si es multiplo */
        return false;
    }
    return esPrimo(numero, i + 1);
}
vector<int> obtenerPrimos(int numero, vector<int> numerosPrimos, int i){ /* Obtener los numeros primos*/
    if(i == 6){                     /* CASO BASE: Hasta 6 para los 6 primeros primos del numero */
        return numerosPrimos;       /* Si ya encontro los 6 regresa los numeros */
    }
    numero++;                       /* Se incrementa el numero para que sea a partir del siguiente*/
    if(esPrimo(numero)){
        numerosPrimos.push_back(numero);    /* Si es primo lo introduce a numerosPrimos*/
        i++;                                /* Incrementa para que siga buscando*/
    }
    return obtenerPrimos(numero,numerosPrimos, i); /* Llamada recursiva */
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
int ingresarNumero(){  /* Pide un numero al usuario */
    int numero;
    cout << "Ingrese un numero: ";      /* Pide el numero */
    cin >> numero;                      /* Guarda el numero */
    if(numero < 11111 || numero > 99999 || numero % 10 == 0){   /* Condiciones para los ceros en las diferetes posiciones */
        return ingresarNumero();                                /* Si tiene algun cero vuelve a pedir otro numero */
    }
    else{
        return numero;                                          /* Si no tiene ceros devuelve el valor del numero */
    }
}
int numeroPrimoAnterior(int numero){    /* Regresa el primo anterior al numero dado */
    if(numero < 1){                             /* Si se reduce hasta menos que 1 para la recursion */
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
int sumaAcumulada(vector<int> numerosPrimos, int i){  /* Regresa al suma acumulada de 5 numeros */
    int suma = 0;
    if(i == 5){         /* CASO BASE: Si ya sumo los 5 terminos */
        return suma;    /* Regresa el valor de la suma */
    }
    suma = numerosPrimos[i] + sumaAcumulada(numerosPrimos, i + 1); /* Suma el primer numero y el siguiente */
    return suma;        /* Regresa el valor de la suma */
}
int restaAcumulada(vector<int> numerosPrimos, int i) { /* Regresa al resta acumulada de 5 numeros */
    int resta = 0;
    if(i == 5){         /* CASO BASE: Si ya resto los 5 terminos */
        return resta;   /* Regresa el valor de la resta */
    }
    else{
        resta = -(numerosPrimos[i] - restaAcumulada(numerosPrimos, i + 1)); /* Resta el primer numero y el siguiente */
        return resta;   /* Regresa el valor de la resta */
    }
}
vector<int> multiplicar(vector<int> numerosPrimos, int coeficiente, int i){ /* Multiplica un vector de 5 numeros por un numero llamado coeficiente */
    if(i == 5){      /* CASO BASE: Si ya hizo la multiplicacion de los 5 terminos */
        return numerosPrimos;   /* Regresa el arreglo resultado*/
    }
    numerosPrimos[i] *= coeficiente;    /* Realiza la multiplicacion de numerosPrimos por coeficiente*/
    return multiplicar(numerosPrimos, coeficiente, i + 1); /* Llamada recursiva */
}
vector<int> dividir(vector<int> numerosPrimos, int coeficiente, int i){ /* Divide un vector de 5 numeros por un numero llamado coeficiente */
    if(i == 5){     /* CASO BASE: Si ya hizo la division de los 5 terminos */
        return numerosPrimos;   /* Regresa el arreglo resultado*/
    }
    numerosPrimos[i] /= coeficiente;    /* Realiza la division de numerosPrimos entre coeficiente*/
    return dividir(numerosPrimos, coeficiente, i + 1);   /* Llamada recursiva */
}
vector<int> potencia(vector<int> numerosPrimos, int coeficiente, int i){ /* Hace la potencia de 5 numeros de una arreglo elevado a un numero coeficiente*/
    vector<int> numerosPotenc;
    if(i >= 5){     /* CASO BASE: Si ya hizo la potencia de los 5 terminos */
        return numerosPotenc;   /* Regresa el arreglo ya con el resultado */
    }
    else{
        numerosPotenc.push_back(pow(numerosPrimos[i], coeficiente));    /* Realiza la division de numerosPrimos elevados al coeficiente*/
        potencia(numerosPrimos, coeficiente, i + 1);                    /* Llamada recursiva*/
    }
    return numerosPotenc;       /* Regresa el arreglo ya con el resultado */
}
void imprimirNumeros(vector<int> numerosPrimos, int i){ /* Imprime los primeros 5 numeros de numerosPrimos*/
    if (i < 5) {                /* CASO BASE: Si no ha imprimido los 5 numeros*/
        cout << numerosPrimos[i] << " ";        /* Imprime el numero en la posicion i */
        imprimirNumeros(numerosPrimos, i + 1);  /* Llamada recursiva*/
    }
}

int main(){
    int numero, sumaTotal, restaTotal, dividTotal, multipTotal, potenTotal, primoAnterior, coeficiente; /* Variables */
    int i = 0; /* Variable que ira aumentando para cada iteracion de las funciones recursivas */
    vector<int> numerosPrimos;
    vector<int> numerosMultip;
    vector<int> numerosDivid;
    vector<int> numerosPotenc;
    
    numero = ingresarNumero(); /* Pedir el numero al usuario */
    numerosPrimos = obtenerPrimos(numero, numerosPrimos, i); /* Calculo los siguientes 6 numeros primos*/
    
    cout << "♦Los siguientes 5 numeros primos son: ";   /* Aqui solo imprime los primeros 5 numeros de numerosPrimos */
    imprimirNumeros(numerosPrimos, i);

    sumaTotal = sumaAcumulada(numerosPrimos, i);                                  /* Realiza la suma acumulada de numerosPrimos*/
    cout << "\n♦La Suma acumulada de los 5 numeros primos es: " << sumaTotal;   /* e imprime el valor*/

    restaTotal = restaAcumulada(numerosPrimos, i);                                 /* Realiza la resta acumulada de numerosPrimos*/
    cout << "\n♦La Resta acumulada de los 5 numeros primos es: " << restaTotal;
    
    primoAnterior = numeroPrimoAnterior(numero);                    /* Calcula en numero primo anterior al numero dado */
    coeficiente = numerosPrimos[5] - primoAnterior;                 /* Calcula el coeficiente para las demas operaciones con la resta del los numeros */

    numerosMultip = multiplicar(numerosPrimos, coeficiente, i);     /*Realiza la multiplicacion de los valores de numerosPrimos por el valor del coeficiente */
    numerosDivid  = dividir(numerosPrimos, coeficiente, i);         /* Realiza la division de los valores de numerosPrimos entre el valor del coeficiente*/
    numerosPotenc = potencia(numerosPrimos, coeficiente, i);        /* Realiza la potencia de los valores de numerosPrimos elevados al coeficiente */
    
    multipTotal = sumaAcumulada(numerosMultip, i);                                 /* Calcula la suma acumulada de la multiplicacion */
    cout << "\n♦La suma acumulada de la Multiplicacion es: " << multipTotal;    /* Imprime la suma acumulada de la multiplicacion */

    dividTotal = sumaAcumulada(numerosDivid, i);                                   /* Calcula la suma acumulada de la division*/
    cout << "\n♦La suma acumulada de la Division es: " << dividTotal;           /* Imprime la suma acumulada de la division */
    
    potenTotal = sumaAcumulada(numerosPotenc, i);                                  /* Calcula la suma acumulada de la potencia */
    cout << "\n♦La suma acumulada de la Potencia es: " << potenTotal;           /* Imprime la suma acumulada de la Potencia */
    return 0;
}