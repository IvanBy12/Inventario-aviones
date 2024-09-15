package inventarioaviones;

public abstract class Avion {

    int velocidad;
    String matricula;

    public Avion(int velocidad, String matricula) {
        this.velocidad = velocidad;
        this.matricula = matricula;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public abstract void visualizar();
    
}