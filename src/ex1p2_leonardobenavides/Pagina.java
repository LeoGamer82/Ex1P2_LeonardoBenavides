/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public class Pagina {
    private String especie;
    private Dragon especimenDestacado;
    private String clase;
    private String descripcion;
    private int encontrados;

    public Pagina(String especie, Dragon especimenDestacado, String clase, String descripcion, int encontrados) {
        this.especie = especie;
        this.especimenDestacado = especimenDestacado;
        this.clase = clase;
        this.descripcion = descripcion;
        this.encontrados = encontrados;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Dragon getEspecimenDestacado() {
        return especimenDestacado;
    }

    public void setEspecimenDestacado(Dragon especimenDestacado) {
        this.especimenDestacado = especimenDestacado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEncontrados() {
        return encontrados;
    }

    public void setEncontrados(int encontrados) {
        this.encontrados = encontrados;
    }

    @Override
    public String toString() {
        return  
                "<------------------------->\n" +
                "Especie: " + this.especie + "(" + this.clase + ")\n" +
                "Especimen Destacado:\n" + this.especimenDestacado.getNombre() + " - " + this.especie +
                "\nEncontrados: " + this.encontrados +
                "\n<----------------------->";
                     
    }
    
    
}
