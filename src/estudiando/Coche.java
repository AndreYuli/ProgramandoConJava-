package estudiando;

public class Coche {

    String marca;
    String modelo;
    int año;

    void acelerar() {
        System.out.println("Acelerando");
    }

    void frenar() {
        System.out.println("Frenando");

    }

    public static void main(String[] args){

        Coche miCoche = new Coche();

        miCoche.marca = "Ford";
        miCoche.modelo = "Audi";
        miCoche.año = 2000;

        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
        System.out.println("Año: " + miCoche.año);

        miCoche.acelerar();
        miCoche.frenar();
        System.out.println("Hola");


    }
}
