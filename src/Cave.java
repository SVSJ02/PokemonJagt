import java.util.ArrayList;

public class Cave {
    private ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public void showAllPokemon() {
        System.out.println("\nPokémon i grotten:");
        for (Pokemon p : pokemonList) {
            System.out.println(p);
        }
    }

    public Pokemon searchPokemonByName(String name) {
        for (Pokemon p : pokemonList) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Pokemon searchPokemonByType(String type) {
        for (Pokemon p : pokemonList) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        return null;
    }
}