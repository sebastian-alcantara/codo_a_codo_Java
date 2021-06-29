/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.ao;

/**
 *
 * @author ubi_s
 */

import java.util.*;

public class Unidad2AO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido! A continuación ingrese la información requerida.");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        
        System.out.print("Edad: ");
        int edad = sc2.nextInt();
        
        System.out.print("Hobbie: ");
        String hobbie = sc.nextLine();
        
        System.out.print("Editor de código favorito: ");
        String editorFavorito = sc.nextLine();
        
        System.out.print("Sistema Operativo utilizado: ");
        String sistOp = sc.nextLine();
        
        Alumno alumno1 = new Alumno(
                nombre,
                apellido,
                edad,
                hobbie,
                editorFavorito,
                sistOp
        );
        
        System.out.println("Información del alumno:");
        alumno1.MostrarInfo();
    }
    
}
