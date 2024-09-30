public class Acuaticos extends Vehiculo implements Motor, Vela {
    enum tipo{SUPERFICIE, SUBMARINO}
    private tipo tipo1;
    
    private int pasajeros;

    public Acuaticos(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    
    public tipo getTipo1() {
        return tipo1;
    }

    public void setTipo1(tipo tipo1) {
        this.tipo1 = tipo1;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void acelerar(int velocidad){
        int vel = getVelocidadActual() + velocidad;
        if (vel > getVelocidadMaxima()){
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            setVelocidadActual(vel);
        }
    }

    public void frenar(int velocidad){
        int vel = getVelocidadActual() - velocidad;
        if (vel < 0){
            System.out.println("La velocidad no puede ser negativa");
        } else {
            setVelocidadActual(vel);
        }
    }

    public void recomendarVelocidad(int velocidadViento){
        if (velocidadViento > 80){
            System.out.println("Es muy alta, se recomienda no salir a navegar");
            setVelocidadActual(0);
        } else if (velocidadViento < 10){
            System.out.println("Es muy baja, tampoco se recomienda");
            setVelocidadActual(0);
        }
    }

    public int calcularRevolucionesMotor(int fuerza, int radio){
        return (fuerza * radio);
    }

    public void imprimir(){
        System.out.println("Velocidad actual: " + getVelocidadActual());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
    }
    
}
