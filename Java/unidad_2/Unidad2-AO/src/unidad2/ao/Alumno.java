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
public class Alumno {
    public String Nombre = "";
    public String Apellido = "";
    public int Edad = 0;
    public String Hobbie = "";
    public String EditorFavorito = "";
    public String SistOp = "";
    
    public Alumno (
            String nombre,
            String apellido,
            int edad,
            String hobbie,
            String editorFavorito,
            String sistOp
            ) {
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Hobbie = hobbie;
        EditorFavorito = editorFavorito;
        SistOp = sistOp;
    }
    
    void MostrarInfo() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("Edad: " + this.Edad);
        System.out.println("Hobbie: " + this.Hobbie);
        System.out.println("Editor de código favorito: " + this.EditorFavorito);
        System.out.println("Sistema Operativo utilizado: " + this.SistOp);
    }
}
