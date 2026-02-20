/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;

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
        this.poderAtaque = poderAtaque;
        this.agilidad = agilidad;
        this.velocidad = velocidad;
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
    public String toString() {
        return super.toString() + "Dragon de clase ataque\n " 
                + "Velocidad: " + velocidad + ""
                + "\nPoder de ataque: " + poderAtaque + 
                    "\n Agilidad" + agilidad;
    }

}
