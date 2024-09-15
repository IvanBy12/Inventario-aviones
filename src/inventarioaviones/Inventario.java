package inventarioaviones;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Avion> aviones = new ArrayList<>();

    public void inventario() {

    }

    public void addAvion(Avion av) {

        aviones.add(av);

    }

    public void listarAviones() {
        for (int i = 0; i < aviones.size(); i++) {
            
            aviones.get(i).visualizar();
            
        }

        /*for (Avion recorrido : aviones) {
            System.out.println("Avión 1: " + aviones);
        }*/

    }

}
