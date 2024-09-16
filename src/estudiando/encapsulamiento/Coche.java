package estudiando.encapsulamiento;

public class Coche {
    private String marca;
    private String modelo;
    private int año;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.setMarca("BMW");
        miCoche.setModelo("BMW");
        miCoche.setAño(2000);

        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Año: " + miCoche.getAño());
    }
}
