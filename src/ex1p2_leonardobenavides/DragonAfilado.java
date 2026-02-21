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
public class DragonAfilado extends Dragon {

    private int numeroEspinas;
    private double precision;
    private boolean venenoso;

    public DragonAfilado(int numeroEspinas, double precision, boolean venenoso, String nombre, String nombreEspecie, String jinete) {
        super(nombre, nombreEspecie, jinete);
        setNumeroEspinas(numeroEspinas);
        setPrecision(precision);
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

        if (this.precision >= 0 && this.precision <= 1.0) {
            this.precision = precision;
        } else {
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
    public double prueba(){
        Random random = new Random();
        double puntosTotal = 0;
        for (int blancos = 1; blancos <= 10; blancos++) {
            double chancePrecision = random.nextDouble(0, precision);
            if(chancePrecision == precision){
                puntosTotal += 100;
                System.out.println("La espina dio en el blanco " + blancos);    
            }else{
                System.out.println("La espina no dio en el blanco" +  blancos);
            }
        }
        if(venenoso){
            return puntosTotal * 1.5;
        }else{
            return puntosTotal;
        }  
    }

    @Override
    public String toString() {
        return super.toString() + "Dragon de clase afilada \n "
                + "Cantidad de Espinas: " + numeroEspinas + ""
                + "\nPrecision " + precision;
               
    }

}
