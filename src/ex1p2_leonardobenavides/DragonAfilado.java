/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1p2_leonardobenavides;

/**
 *
 * @author leobe
 */
public class DragonAfilado extends Dragon {

    private int numeroEspinas;
    private double precision;
    private boolean venenoso;

    public DragonAfilado(int numeroEspinas, double precision, boolean venenoso, String nombre, String nombreEspecie, String jinete) {
        super(nombre, nombreEspecie, jinete);
        this.numeroEspinas = numeroEspinas;
        this.precision = precision;
        this.venenoso = venenoso;
    }

    public int getNumeroEspinas() {
        return numeroEspinas;
    }

    public void setNumeroEspinas(int numeroEspinas) {
        if (this.numeroEspinas >= 5 && this.numeroEspinas <= 20) {
            this.numeroEspinas = numeroEspinas;
        } else {
            System.out.println("Cantidad fuera de rango, el numero de espeina debe estar entre 5 y 20 ");
        }

    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        
        if(this.precision>=0&&this.precision<=1.0){
            this.precision = precision;
        }else{
            System.out.println("Precision fuera de rango, el valor debe estar entre 0 y 1");
        }
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "DragonAfilado{" + "numeroEspinas=" + numeroEspinas + ", precision=" + precision + ", venenoso=" + venenoso + '}';
    }

}
