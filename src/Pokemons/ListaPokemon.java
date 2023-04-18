package Pokemons;

public class ListaPokemon {
    private Pokemon[] pokemons;
    private int size;

    public ListaPokemon() {
        pokemons = new Pokemon[];
        size = 0;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (size == pokemons.length) {
            Pokemon[] newPokemons = new Pokemon[pokemons.length * 2];
            for (int i = 0; i < pokemons.length; i++) {
                newPokemons[i] = pokemons[i];
            }
            pokemons = newPokemons;
        }
        pokemons[size] = pokemon;
        size++;
        System.out.println(pokemon.getNombre() + " ha sido agregado a la lista.");
    }


    public void eliminarPokemon(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < size; i++) {
            if (pokemons[i].getNombre().equals(nombre)) {
                encontrado = true;
                for (int j = i; j < size - 1; j++) {
                    pokemons[j] = pokemons[j + 1];
                }
                pokemons[size - 1] = null;
                size--;
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
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + ". " + pokemons[i].toString());
        }
    }

    public Pokemon obtenerPokemon(int posicion) {
        if (posicion >= 0 && posicion < size) {
            return pokemons[posicion];
        } else {
            return null;
        }
    }
}
}
