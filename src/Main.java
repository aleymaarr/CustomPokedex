import Pokemons.ListaPokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaPokemon avistados = new ListaPokemon();
        ListaPokemon capturados = new ListaPokemon();

        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while(!opcion.equals("f")) {
            System.out.println("Seleccione una opción:");
            System.out.println("a - Añadir un pokemon avistado");
            System.out.println("b - Añadir avistamiento legendario");
            System.out.println("c - Pasar a capturados");
            System.out.println("d - Mostrar lista de avistados");
            System.out.println("e - Mostrar lista de capturados");
            System.out.println("f - Cerrar la pokedex");
            opcion = scanner.nextLine();
        }


}
