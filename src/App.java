public class App {
    public static void main(String[] args) throws Exception {
        
        Terrestres camioneta = new Terrestres(100, 250);
        Acuaticos moto = new Acuaticos(50, 110);

        System.out.println("CAMIONETA");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("Nueva velocidad actual tras acelerar: " + camioneta.getVelocidadActual());
        camioneta.frenar(30);
        System.out.println("Nueva velocidad actual tras frenar: " + camioneta.getVelocidadActual());
        System.out.println("Revoluciones del motor: " + camioneta.calcularRevolucionesMotor(1500, 2));

        

        System.out.println("MOTO ACUÁTICA");
        moto.imprimir();
        moto.acelerar(50);
        System.out.println("Nueva velocidad actual tras acelerar: " + moto.getVelocidadActual());
        moto.frenar(30);
        System.out.println("Nueva velocidad actual tras frenar: " + moto.getVelocidadActual());

        System.out.println("Revoluciones del motor: " + moto.calcularRevolucionesMotor(1200, 2));
        moto.recomendarVelocidad(20);
        

    }
}
