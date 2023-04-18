package Pokemons;

public class Pokemon {
    private String nombre;
    private String tipo;
    private double altura;
    private double peso;
    private String descripcion;

    public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {

    }

    public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {

    }
    public Pokemon(String nombre, String tipo) {
        this(nombre, tipo, 0, 0, "");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override

    public String toString() {
        String info = "Nombre: " + nombre + "\n" +
                "Tipo: " + tipo + "\n" +
                "Altura: ";
        if (altura > 0) {
            info += altura + " m\n";
        } else {
            info += "?? m\n";
        }
        info += "Peso: ";
        if (peso > 0) {
            info += peso + " kg\n";
        } else {
            info += "?? kg\n";
        }
        info += "Descripción: ";
        if (!descripcion.isEmpty()) {
            info += descripcion;
        } else {
            info += "???";
        }
        return info;
    }

}
