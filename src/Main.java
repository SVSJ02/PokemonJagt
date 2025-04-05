public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));

        Cave cave = new Cave();
        cave.addPokemon(new Pokemon("Geodude", "Rock", 12));
        cave.addPokemon(new Pokemon("Zubat", "Poison", 11));
        cave.addPokemon(new Pokemon("Clefairy", "Fairy", 13));
        cave.addPokemon(new Pokemon("Paras", "Bug", 9));

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(forest, "name", "Charmander");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemon(forest, "type", "Water");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Mewtwo");

        cave.showAllPokemon();

        ash.searchForPokemon(cave, "name", "Zubat");

        ash.searchForPokemon(cave, "type", "Rock");

        ash.searchForPokemon(cave, "name", "Abra");

    }
}