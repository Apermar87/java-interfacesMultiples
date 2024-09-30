public class Terrestres extends Vehiculo implements Motor {
    private int llantas;
    enum tipoUso{MILITAR, CIVIL};
    private tipoUso uso;

    public Terrestres(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public tipoUso getUso() {
        return uso;
    }

    public void setUso(tipoUso uso) {
        this.uso = uso;
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

    public int calcularRevolucionesMotor(int fuerza, int radio){
        return (fuerza * radio);
    }

    public void imprimir(){
        System.out.println("Velocidad actual: " + getVelocidadActual());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima());
    }

}
