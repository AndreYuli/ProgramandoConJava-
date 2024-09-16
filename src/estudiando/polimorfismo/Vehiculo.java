package estudiando.polimorfismo;

public class Vehiculo {
    void mover(){
        System.out.println("El vehículo se está moviendo");
    }
}
class Coche extends Vehiculo{
    void mover(){
        System.out.println("El coche está conduciendo.");
    }
}

class Bicicleta extends Vehiculo{
    void mover(){
        System.out.println("La Bicicleta esta pedaleando");

    }

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miCoche = new Coche();
        Vehiculo miBicicleta = new Bicicleta();

        miVehiculo.mover();
        miCoche.mover();
        miBicicleta.mover();

    }

}

