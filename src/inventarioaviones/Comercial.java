package inventarioaviones;

import java.util.ArrayList;

public class Comercial extends Avion {
    int contador=1;
    static int numMaxPasajeros;
    int numPasajeros;
    ArrayList<Pasajero> pasajeros = new ArrayList<>();

    /*public Comercial(int velocidad, String matricula) {
        super(velocidad, matricula);
    }*/
    public Comercial(int numPasajeros, int velocidad, String matricula) {
        super(velocidad, matricula);
        numMaxPasajeros = this.numPasajeros = numPasajeros;
    }

    public void addPasajero(Pasajero pas) {
        
        if (contador > numMaxPasajeros) {
            System.out.println("Avión comercial lleno."
                    + " No es posible agregar a " + pas.getNombre());
        } else {
            pasajeros.add(pas);
        }
        contador++;
    }

    @Override
    public void visualizar() {
        
        System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        String salida="Avión Comercial matrícula: " + matricula +", capacidad: " + numMaxPasajeros + ", velocidad: " + velocidad + " km/h";
        String salidaP="";
        for (int i = 0; i < pasajeros.size(); i++) {
            
            salidaP+="\n"+pasajeros.get(i).nombre+ "|"+pasajeros.get(i).identificacion;
            
        }
        return salida+salidaP;
    }
    
    
    

}
