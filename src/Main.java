import Pokemons.ListaPokemon;
import Pokemons.Pokemon;
import Pokemons.PokemonLegendario;

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

        switch(opcion) {

            case "a":
                System.out.println("Introduzca el nombre del pokemon:");
                String nombre1 = scanner.nextLine();
                System.out.println("Introduzca el tipo del pokemon:");
                String tipo1 = scanner.nextLine();
                Pokemon avistado = new Pokemon(nombre1, tipo1);
                avistado.agregarPokemon(avistado);
                System.out.println("Pokemon avistado añadido correctamente.");
                break;

            case "b":
                System.out.println("Introduzca el nombre del pokemon:");
                String nombre2 = scanner.nextLine();
                System.out.println("Introduzca el tipo del pokemon:");
                String tipo2 = scanner.nextLine();
                System.out.println("Introduzca la localización del pokemon:");
                String ubicacion2 = scanner.nextLine();
                PokemonLegendario avistadoL = new PokemonLegendario(nombre2, tipo2, ubicacion2);
                avistados.agregarPokemon(avistadoL);
                System.out.println("Avistamiento legendario añadido correctamente.");
                break;

            case "c":
                System.out.println("Introduzca el nombre del pokemon que desea capturar:");
                String nombre3 = scanner.nextLine();
                Pokemon capturado3 = avistados.obtenerPokemon(Integer.parseInt(nombre3));

                if(capturado3 != null) {
                    System.out.println("Introduzca el peso del pokemon:");
                    double pesoC = Double.parseDouble(scanner.nextLine());
                    System.out.println("Introduzca la altura del pokemon:");
                    double alturaC = Double.parseDouble(scanner.nextLine());
                    System.out.println("Introduzca una descripción del pokemon:");
                    String descripcion3 = scanner.nextLine();
                    capturado3.setPeso(pesoC);
                    capturado3.setAltura(alturaC);
                    capturado3.setDescripcion(descripcion3);
                    avistados.eliminarPokemon(String.valueOf(capturado3));
                    capturados.agregarPokemon(capturado3);
                    System.out.println("Pokemon capturado añadido correctamente.");
                } else {
                    System.out.println("El pokemon ingresado no ha sido avistado aún.");
                }
                break;

            case "d":
                avistados.mostrarPokemons();
                break;

            case "e":
                capturados.mostrarPokemons();
                break;

            case "f":
                System.out.println("¡Hasta la vista, entrenador pokemon!");
                break;

            default:
                System.out.println("Opción no válida, por favor seleccione una opción válida.");
                break;
        }
    }
}
