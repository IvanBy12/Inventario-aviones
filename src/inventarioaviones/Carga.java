package inventarioaviones;

import java.util.ArrayList;

public class Carga extends Avion {

    double pesoMaximo;
    double pesoActual = 0.0;
    ArrayList<Paquete> paquetes = new ArrayList<>();

    public Carga(double pesoMaximo, int velocidad, String matricula) {
        super(velocidad, matricula);
        this.pesoMaximo = pesoMaximo;

    }

    public void addPaquete(Paquete paquete) {
        if (pesoActual+paquete.getPeso() > pesoMaximo) {
            System.out.println("El paquete " + paquete.getNombre() + " no puede ser agregado. Carga máxima superada");
        } else {
            paquetes.add(paquete);

            pesoActual += paquete.getPeso();
        }

    }

    @Override
    public void visualizar() {

        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        String salida="Avión de Carga matrícula: " + matricula + ", capacidad: " + pesoMaximo + "kg velocidad:" + velocidad + " km/h, contiene: ";
        String salidaC="";
        for (int i = 0; i < paquetes.size(); i++) {
            salidaC+="\nNombre: "+paquetes.get(i).nombre+", peso: "+paquetes.get(i).peso+" kg";
        }
        return salida+salidaC;
    }

}
