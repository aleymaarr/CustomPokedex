package Pokemons;

public class ListaPokemon {
    private Pokemon[] pokemons;
    private int tamano;

    public ListaPokemon() {
        pokemons = new Pokemon[1];
        tamano = 0;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (tamano == pokemons.length) {
            Pokemon[] newPokemons = new Pokemon[pokemons.length * 2];
            for (int i = 0; i < pokemons.length; i++) {
                newPokemons[i] = pokemons[i];
            }
            pokemons = newPokemons;
        }
        pokemons[tamano] = pokemon;
        tamano++;
        System.out.println(pokemon.getNombre() + " ha sido agregado a la lista.");
    }


    public void eliminarPokemon(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < tamano; i++) {
            if (pokemons[i].getNombre().equals(nombre)) {
                encontrado = true;
                for (int j = i; j < tamano - 1; j++) {
                    pokemons[j] = pokemons[j + 1];
                }
                pokemons[tamano - 1] = null;
                tamano--;
                System.out.println(nombre + " ha sido eliminado de la lista.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println(nombre + " no se encuentra en la lista.");
        }
    }

    public void mostrarPokemons() {
        System.out.println("Lista de Pokemons:");
        for (int i = 0; i < tamano; i++) {
            System.out.println((i+1) + ". " + pokemons[i].toString());
        }
    }

    public Pokemon obtenerPokemon(int posicion) {
        if (posicion >= 0 && posicion < tamano) {
            return pokemons[posicion];
        } else {
            return null;
        }
    }
}

