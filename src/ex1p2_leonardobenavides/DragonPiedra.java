/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public class DragonPiedra extends Dragon {
    private double resistencia;
    private double armadura;

    public DragonPiedra(double resistencia, double armadura, String nombre, String nombreEspecie, String jinete) {
        super(nombre, nombreEspecie, jinete);
        this.resistencia = resistencia;
        this.armadura = armadura;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        if(this.resistencia>=100&&this.resistencia<=200){
            this.resistencia = resistencia;
        }else{
            System.out.println("Resistencia fuera de rango, debe estar entre 100 y 200");
        }
    }

    public double getArmadura() {
        return armadura;
    }

    public void setArmadura(double armadura) {
       if(this.armadura>=300&&this.resistencia<=500){
            this.armadura = armadura;;
       }else{
           System.out.println("Armadura fuera de rango, debe estar entre 300 y 500");
       }
    }

    @Override
    public String toString() {
        return "DragonPiedra{" + "resistencia=" + resistencia + ", armadura=" + armadura + '}';
    }
    
    
}
