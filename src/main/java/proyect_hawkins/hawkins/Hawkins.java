/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyect_hawkins.hawkins;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author endermarc
 */
public class Hawkins {
    public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
    final double MAX_ENERGIA = 200;
    final double LIMITE_RIESGO = 150;
    String operadorActual;
    int codigoRiesgo;
    int porcentajeEstado;
    boolean portalAbierto;
    int opcionMenu;
    System.out.println("Introduce Tu nombre de usuario: ");
    operadorActual = sc.nextLine();
    mostrarEncabezado(operadorActual);
    do{
        System.out.print("---System Hawkins---");
        System.out.print("1. Inspeccionar Sensor Individual ");
        System.out.print("2. Iniciar Muestreo Continuo ");
        System.out.print("0. Salir de la Consola");
        opcionMenu = sc.nextInt();
        switch(opcionMenu){
        case 1:
            double sensorMedido = leerLecturaSegura(sc,"Introduce lectura μT");
            codigoRiesgo = evaluarNivelRiesgo(sensorMedido, LIMITE_RIESGO);
            System.out.println(codigoRiesgo);
                break;
        default:
            break;
    }
    }while(opcionMenu != 0);
}
public static void mostrarEncabezado(String operadorActual){
    System.out.println(operadorActual);
}
public static double leerLecturaSegura(Scanner sc,String teclado){
    double sensorMedido=0;
    boolean exito = false;
    while(!exito){
        try{
            System.out.println(teclado);
            sensorMedido= sc.nextDouble();
            exito = true;
        }catch(InputMismatchException e){
            System.out.println("Dato invalido");
        }
    }
    return sensorMedido;
}
public static int evaluarNivelRiesgo(double microTeslas,double LIMITE_RIESGO){
    int codigo = 0;
    if(microTeslas< 50){
        codigo = 1;
    }else{
        if(microTeslas>LIMITE_RIESGO){
            codigo = 3;
        }else{
            codigo = 2;
        }
        }
    String mensaje = (codigo==1) ? "Seguro":  (mensaje = (codigo==2)? "Alerta":"Crítico");
    System.out.println(mensaje);
    return codigo;
    }
}