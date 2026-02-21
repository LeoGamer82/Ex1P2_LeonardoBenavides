/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;
import java.util.Random;
/**
 *
 * @author leobe
 */
public class DragonAtaque extends Dragon {

    private double poderAtaque;
    private double agilidad;
    private double velocidad;

    public DragonAtaque(double poderAtaque, double agilidad, double velocidad, String nombre, String nombreEspecie, String jinete) {
        super(nombre, nombreEspecie, jinete);
        setPoderAtaque(poderAtaque);
        setAgilidad(agilidad);
        setVelocidad(velocidad);
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        if (this.poderAtaque >= 50 && this.poderAtaque <= 150) {
            this.poderAtaque = poderAtaque;
        } else {
            System.out.println("Ataque fuera de rango, ingrese un numero entre 50 y 150 ");
        }

    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        if (this.agilidad >= 200 && this.agilidad <= 300) {
            this.agilidad = agilidad;
        } else {
            System.out.println("Agilidad fuera de rango, ingrese un numero entre 200 y 300 ");
        }

    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (this.velocidad >= 100 && this.velocidad <= 250) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Velocidad fuera de rango, ingrese un numero entre 100 y 250");
        }

    }
    
    @Override
    public double prueba(){
        double puntosTotal = 0;
        Random random = new Random();
        double blanco1 = random.nextDouble(30,120);
        double blanco2 = random.nextDouble(30,120);
        double blanco3 = random.nextDouble(30,120);
        
        double puntosDestruirBlancos = 3 * 50;
        double puntosBlanco1 = Math.abs(blanco1 - poderAtaque);
        double puntosBlanco2 = Math.abs(blanco2 - poderAtaque);
        double puntosBlanco3 = Math.abs(blanco3 - poderAtaque);
        
        puntosTotal += puntosBlanco1;
        puntosTotal += puntosBlanco2;
        puntosTotal += puntosBlanco3;
        puntosTotal += puntosDestruirBlancos;
        
       double puntosObstaculos = agilidad*velocidad / 100;
       double tiempoTardado = 1000 - puntosObstaculos;
       
       
       puntosTotal += puntosObstaculos;
       
           
    return puntosTotal;}

    @Override
    public String toString() {
        return super.toString() + "Dragon de clase ataque\n " 
                + "Velocidad: " + velocidad + " km/h "
                + "\nPoder de ataque: " + poderAtaque + 
                  "\n Agilidad" + agilidad;
    }

}
