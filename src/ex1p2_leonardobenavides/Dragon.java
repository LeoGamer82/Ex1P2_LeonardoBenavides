/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public abstract class Dragon {
    private String nombre;
    private String nombreEspecie;
    private String jinete;

    public Dragon(String nombre, String nombreEspecie,String jinete) {
        this.nombre = nombre;
        this.nombreEspecie = nombreEspecie;
        this.jinete = jinete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getJinete() {
        return jinete;
    }

    public void setJinete(String jinete) {
        this.jinete = jinete;
    }

    @Override
    public String toString() {
        return nombre + "(" + nombreEspecie +")\n" + "Jinete" + jinete + "\n";
    }
    
    
    
}
