/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p2_leonardobenavides;

import java.util.*;

/**
 *
 * @author leobe
 */
public class Ex1P2_LeonardoBenavides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Dragon> dragones = new LinkedList<>();
        Map<String, Pagina> mapaLibro = new HashMap<>();
        ArrayList<Dragon> dragonesJinete = new ArrayList<>();

        boolean continuar = true;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String autor = leer.nextLine();

        do {
            switch (Menu()) {
                case 1:
                    agregarDragon(dragones, autor, mapaLibro);
                    break;
                case 2:
                    asignarJinete(dragones,dragonesJinete);
                    break;
                case 3:
                    
                    break;
                case 4:
                    buscarEspecie(dragonesJinete,mapaLibro);
                    break;
                case 5:
                    listarDragones(dragonesJinete,mapaLibro);
                    break;
                case 6:
                    liberarDragones(dragonesJinete,mapaLibro);
                    break;
                case 7:
                    competenciaDeDragones(dragonesJinete);
                    break;
                case 8:
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo ");
            }
        } while (continuar);
    }

    public static int Menu() {
        System.out.println("--Bienvenido a la isla de Berk! Preparate para entrenar dragones y recopilar informacion de ellos ---");
        System.out.println("1. Agregar Dragon ");
        System.out.println("2. Asignar jinete a Dragon ");
        System.out.println("3. Leer libro de Dragones  ");
        System.out.println("4. Buscar especie de Dragon ");
        System.out.println("5. Listar dragones  ");
        System.out.println("6. Liberar dragones ");
        System.out.println("7. Competencia de dragones ");
        System.out.println("8. Pelea de dragones ");
        System.out.println("9. Salir ");
        System.out.println("Ingrese su opcion: ");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        return opcion;

    }

    public static void agregarDragon(Queue<Dragon> dragones, String autor, Map<String, Pagina> mapaLibro) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del dragon: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la especie del dragon: ");
        String especie = leer.nextLine();

        System.out.println("De que clase es el dragon? ");
        System.out.println("1. Clase Ataque ");
        System.out.println("2. Clase Afilada ");
        System.out.println("3. Clase Piedra ");
        System.out.println("Ingrese su opcion ");
        int opcionClase = leer.nextInt();

        switch (opcionClase) {
            case 1:
                System.out.println("Ha elegido un dragon de clase ataque ");
                System.out.println("Ingrese ataque del dragon: (50.0 - 100.0) ");
                double poderAtaque = leer.nextDouble();
                System.out.println("Ingrese agilidad del dragon: (200.0 - 300.0) ");
                double agilidad = leer.nextDouble();
                System.out.println("Ingrese velocidad del dragon: (100-250) ");
                double velocidad = leer.nextDouble();
                DragonAtaque dragonAtaque = new DragonAtaque(poderAtaque, agilidad, velocidad, nombre, especie, " Sin Jinete ");
                System.out.println("Ingrese una descripcion:  ");
                String descripcionAtaque = leer.nextLine();
                Pagina pagina = new Pagina(especie, dragonAtaque, "Ataque", descripcionAtaque, 1);
                mapaLibro.put(especie, pagina);
                dragones.add(dragonAtaque);
                
                break;
            case 2:
                System.out.println("Ha elegido un dragon de clase afilada ");
                System.out.println("Ingrese la cantidad de espinas (5-20) ");
                int numeroEspinas = leer.nextInt();
                System.out.println("Ingrese precision del dragon (0-1) ");
                double precision = leer.nextDouble();
                System.out.println("Sus espinas son venenosas? ");
                System.out.println("1. Si ");
                System.out.println("2. No");
                int esVenenoso = leer.nextInt();
                boolean venenoso = false;
                if (esVenenoso == 1) {
                    venenoso = true;
                }
                System.out.println("Ingrese una descripcion: ");
                leer.nextLine();
                String descripcionAfilado = leer.nextLine();

                DragonAfilado dragonAfilado = new DragonAfilado(numeroEspinas, precision, venenoso, nombre, especie, " Sin Jinete ");
                pagina = new Pagina(especie, dragonAfilado, "Afilado", descripcionAfilado, 1);

                mapaLibro.put(especie, pagina);

                dragones.add(dragonAfilado);

                break;
            case 3:
                System.out.println("Ha elegido un dragon de clase piedra ");
                System.out.println("Ingrese resistencia del dragon (100.0 - 200.0): ");
                double resistencia = leer.nextDouble();
                System.out.println("Ingrese armadura del dragon (300.0 - 500.0): ");
                double armadura = leer.nextDouble();
                DragonPiedra dragonPiedra = new DragonPiedra(resistencia, armadura, nombre, especie, "Sin Jinete");
                System.out.println("Ingrese una descripcion: ");
                leer.nextLine();
                String descripcionPiedra = leer.nextLine();
                pagina = new Pagina(especie, dragonPiedra, "Piedra", descripcionPiedra, 1);

                mapaLibro.put(especie, pagina);
                dragones.add(dragonPiedra);

                break;
        }

    }

    public static void asignarJinete(Queue<Dragon> dragones, ArrayList<Dragon> dragonesJinete) {
        Scanner leer = new Scanner(System.in);
        Dragon dragon = dragones.peek();
        System.out.println("Ingrese nombre de jinete al" + " "+ dragon.getNombreEspecie() +" " + dragon.getNombre());
        String jinete = leer.nextLine();
        dragon.setJinete(jinete);
        System.out.println("Ahora el jinete de " + dragon.getNombreEspecie() + " es " + dragon.getJinete());
        dragones.remove();
        dragonesJinete.add(dragon);

    }

    public static void leerLibro() {
        Scanner leer = new Scanner(System.in);

    }

    public static void buscarEspecie(ArrayList<Dragon> dragonesJinete, Map<String, Pagina> mapaLibro) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese especie para buscar: ");
        leer.nextLine();
        String especie = leer.nextLine();
        System.out.println("Entrada en la libro de dragones: ");
        for (int indice = 0; indice < mapaLibro.size(); indice++) {
            if (mapaLibro.containsKey(especie)) {
                Pagina pagina = mapaLibro.get(especie);
                System.out.println(pagina.toString());
            }
        }
        System.out.println("--Dragones entrenados de esta especie -- ");
        for (Dragon dragones : dragonesJinete) {
            if (dragones.getNombreEspecie().equals(especie)) {
                System.out.println(dragones);
            }
        }
    }

    public static void listarDragones(ArrayList<Dragon> dragonesJinete, Map<String, Pagina> mapaLibro) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Como desea listar los dragones ");
        System.out.println("0. Todos los dragones ");
        System.out.println("1. Dragones de clase ataque ");
        System.out.println("2. Dragones de clase afilada ");
        System.out.println("3. Dragones de clase piedra ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 0:
                for (Dragon dragones : dragonesJinete) {
                    System.out.println(dragones);
                }
                break;
            case 1:
                for (Dragon dragonAtaque : dragonesJinete) {
                    if (dragonAtaque instanceof DragonAtaque) {
                        System.out.println(dragonAtaque);
                    }
                }
                break;
            case 2:
                for (Dragon dragonAfilado : dragonesJinete) {
                    if (dragonAfilado instanceof DragonAfilado) {
                        System.out.println(dragonAfilado);
                    }
                }
                break;
            case 3:
                for(Dragon dragonPiedra: dragonesJinete){
                    if(dragonPiedra instanceof DragonPiedra){
                        System.out.println(dragonPiedra);
                    }
                }
                break;
            default:
                System.out.println("Opcion invalida intente de nuevo ");
        }

    }

    public static void liberarDragones(ArrayList<Dragon> dragonesJinete, Map<String, Pagina> mapaLibro) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Uno de los dragones de berk desea irse! ");
        for(Dragon dragones: dragonesJinete){
            System.out.println(dragones);
        }
        System.out.println("Cual dragon desea irse ");
        int seleccionar = leer.nextInt();
        
        if(seleccionar>=0&&seleccionar<=dragonesJinete.size()){
            System.out.println("El siguiente dragon se fue de berk ");
            dragonesJinete.get(seleccionar);
            dragonesJinete.remove(seleccionar);
            
        }
        
    }

    public static void competenciaDeDragones(ArrayList<Dragon> dragonesJinete) {
        for (int i = 0; i < dragonesJinete.size(); i++) {
             System.out.println(dragonesJinete.get(i).prueba());
        }
        
    }

    public static void peleaDeDragones() {
        Scanner leer = new Scanner(System.in);

    }

}
