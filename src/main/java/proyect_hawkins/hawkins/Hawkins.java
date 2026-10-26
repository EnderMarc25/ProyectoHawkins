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

    public static void main(String[] args) {
        final double MAX_ENERGIA = 200;
        final double LIMITE_RIESGO = 150;
        String operadorActual;
        double sensorMedido;
        int codigoRiesgo;
        int porcentajeEstado;
        boolean portalAbierto;
        String teclado = "Introduce lectura μT";
        int opcionMenu;
        Scanner sc= new Scanner(System.in);
        
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
                leerLecturaSegura(sc,teclado);
                    break;
            case 2:
                
                break;
            default:
                break;
            
        }
        }while(opcionMenu == 0);

    }
    public static void mostrarEncabezado(String operadorActual){
        System.out.println(operadorActual);
    }
    public static void leerLecturaSegura(Scanner sc,String teclado){
        double sensorMedio;
        try{
                    
        System.out.println(teclado);
        sensorMedio= sc.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Dato invalido");
        }
    }
}
