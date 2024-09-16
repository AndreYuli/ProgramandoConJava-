package estudiando.ejemplo1;

public class Vehiculo {
    int velocidad;
    int capacidad;

}
class Coche extends Vehiculo {
    String tipoDeCombustible;

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.velocidad = 100;
        miCoche.capacidad = 200;
        miCoche.tipoDeCombustible = "Gasolina";


        System.out.println("Velocidad: " + miCoche.velocidad);
        System.out.println("Capacidad: " + miCoche.capacidad);
        System.out.println("Tipo de Combustible: " + miCoche.tipoDeCombustible);

    }
}