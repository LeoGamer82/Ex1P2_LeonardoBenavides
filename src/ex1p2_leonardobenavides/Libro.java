/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;
import java.util.*;
/**
 *
 * @author leobe
 */
public class Libro {
    private String autor;
    Map<String,Pagina> mapaLibro = new HashMap<>();
    private int gruposPagina;

    public Libro(String autor, int gruposPagina) {
        this.autor = autor;
        this.gruposPagina = gruposPagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Map<String, Pagina> getMapaLibro() {
        return mapaLibro;
    }

    public void setMapaLibro(Map<String, Pagina> mapaLibro) {
        this.mapaLibro = mapaLibro;
    }

    public int getGruposPagina() {
        return gruposPagina;
    }

    public void setGruposPagina(int gruposPagina) {
        this.gruposPagina = gruposPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", mapaLibro=" + mapaLibro + ", gruposPagina=" + gruposPagina + '}';
    }
    
    
}
