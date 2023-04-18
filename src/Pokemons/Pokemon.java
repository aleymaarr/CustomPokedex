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

}
