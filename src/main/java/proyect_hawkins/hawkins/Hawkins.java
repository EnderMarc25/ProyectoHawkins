/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyect_hawkins.hawkins;

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
        int opcionMenu;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce Tu nombre de usuario: ");
        operadorActual = sc.nextLine();
        mostrarEncabezado(operadorActual);
        do{
            System.out.print("---System Hawkins---");
            System.out.println("1. Inspeccionar Sensor Individual");
            System.out.println("2. Iniciar Muestreo Continuo");
            System.out.println("0. Salir de la Consola");
            opcionMenu = sc.nextInt();
        }while()
    }
    public static void mostrarEncabezado(String operadorActual){
        System.out.println(operadorActual);
    }
}
