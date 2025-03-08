/*  Alumno: Franco Calderas Sergio Alberto
    Grupo: 3BV1
    Carrera: Ingenieria en Inteligencia Artificial
    Ultima fecha de modificacion: 12 de noviembre del 2023
    
    La funcionalidad de la clase Cuenta es definir crear una cuenta para da cliente que se cree
    cada cuenta tendra un ID unico con el cual se identificara del resto de las demas, y un estado
    de cuenta el cual poseera todas las operaciones que el cliente ha realizado con su cuenta. 
    Los Metodos de la clase Cuenta son:
    - Consultar_Saldo: El cliente podra consultar cual es el saldo que tiene en su cuenta
    - Retirar_Saldo: El cliente podra hacer retiros de saldo total que tiene en su cuenta
    - Deposito: El cliente podra ingresar saldo a su cuenta 
    - consultarEstadoCuenta: El cliente podra consultar las operaciones totales que haya realizado 
      durante el tiempo total en el que ha tenido su cuenta 
*/

import java.util.Scanner;       /* Para recoger los datos del usuario */
import java.util.ArrayList;     /* Para los ArrayList */

public class Cuenta{
    /* Atributos de la clase Cuenta */
    public int id;                  /* Identificador unico para cada cuenta */
    public float saldo;             /* El saldo que va a tener cada cuenta */
    public String tipo;             /* El tipo de cuenta segun la cantidad del saldo que tenga la cuenta */
    public ArrayList<String[]> estado_cuenta;
    
    Scanner scanner = new Scanner(System.in);   /* Declaracion de scanner para leer los datos del usuario */
    
    // CONSTRUCTOR DE Cuenta
    public Cuenta(int id, float saldo, String tipo, ArrayList<String[]> estado_cuenta){
        this.id = id;
        this.saldo = saldo;
        this.tipo = tipo;
        this.estado_cuenta = estado_cuenta;
    }
      
    // Getters y Setters de los Cuenta
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public ArrayList<String[]> getEstadoCuenta(){
        return estado_cuenta;
    }
    public void setEstadoCuenta(ArrayList<String[]> estado_cuenta){
        this.estado_cuenta = estado_cuenta;
    }

    /* METODOS DE CUENTA */
    public void Consultar_Saldo(){
        String tipoCuenta = (saldo <= 100000.00) ? "Estandar" : "Premier";
        System.out.println(" El saldo de la cuenta es: " + saldo + ", Tipo de cuenta: " + tipoCuenta);  /* El usuario podra consultar cual es el saldo total de su cuenta */
    }
    public void Retirar_Saldo(){
        System.out.println(" Ingrese la cantidad que quiere retirar: ");    /* El usuario ingresa la cantidad que quiere retirar de su cuenta */
        float retiro = scanner.nextFloat();
        saldo -= retiro;                                                    /* Al saldo total de la cuenta se le resta la cantidad que se retiro */
        String tipoCuenta = (saldo <= 100000.00) ? "Estandar" : "Premier";
        System.out.println(" Usted ha retirado: " + retiro);
        System.out.println(" Su nuevo saldo es: " + +getSaldo() + ", Tipo de cuenta: " + tipoCuenta);
        /* Añadir detalles a estado_cuenta */
        String[] detalles = {" Retiro: " + retiro};         /* Los detalles tendran el Retiro junto con la cantidad que se retiro */
        estado_cuenta.add(detalles);                        /* Al estado de cuenta se añadira los detalles del retiro para su proxima consulta */
    }
    public void Deposito(){
        float saldo = getSaldo();
        System.out.println(" Ingrese la cantidad que quiere depositar: ");  /* El usuario ingresa la cantidad que quiere ingresar a su cuenta */
        float deposito = scanner.nextInt();
        saldo += deposito;                                                  /* Al saldo total de la cuenta se le suma la cantidad que ingreso */    
        String tipoCuenta = (saldo <= 100000.00) ? "Estandar" : "Premier";
        System.out.println(" Usted a ingresado: "+deposito);        
        System.out.println(" Su nuevo saldo es: "+getSaldo() + ", Tipo de cuenta: " + tipoCuenta);
        /* Añadir detalles a estado_cuenta */
        String[] detalles = {" Deposito: "+deposito};                       /* Los detalles tendran el Deposito junto con la cantidad que se ingreso */
        estado_cuenta.add(detalles);                                        /* Al estado de cuenta se añadira los detalles del deposito para su proxima consulta */
    }
    public void consultarEstadoCuenta(){
        String tipoCuenta = (saldo <= 100000.00) ? "Estandar" : "Premier";
        System.out.println(" -- Estado de cuenta -- ");                     /* El estado de cuenta mostrara todos de detalles de todas las operaciones */
        for (String[] detalles : estado_cuenta){                            /* que se realizaron sobre la cuenta */
            System.out.println(detalles[0]);
        }
        System.out.println(" El saldo de la cuenta es: " + saldo + ", Tipo de cuenta: " + tipoCuenta);
    }
    
}

