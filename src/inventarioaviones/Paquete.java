package inventarioaviones;

public class Paquete {

    String nombre;
    double peso;

    public Paquete(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Paquete{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }

}
