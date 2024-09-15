package inventarioaviones;

public class Pasajero {

    String nombre;
    String identificacion;

    public Pasajero(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", identificacion=" + identificacion + '}';
    }    
}
