package Creation.Pokemons;

import Creation.Pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Greninja extends Pokemon {



    @Override
    public void test() {
        System.out.println("Greninja Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<>();
        baseMoves.add("Bubble");
        baseMoves.add("Growl");
        baseMoves.add("Mat Block");
        baseMoves.add("Night Slash");
        baseMoves.add("Pound");
        baseMoves.add("Quick Attack");
        baseMoves.add("Role Play");
        baseMoves.add("Water Shuriken");
        baseMoves.add("Bubble");
        baseMoves.add("Lick");
        baseMoves.add("Water Pulse");
        baseMoves.add("Smokescreen");
        baseMoves.add("Shadow Sneak");
        baseMoves.add("Spikes");
        baseMoves.add("Feint Attack");
        baseMoves.add("Substitute");
        baseMoves.add("Extrasensory");
        baseMoves.add("Double Team");
        baseMoves.add("Hydro Pump");
        baseMoves.add("Haze");
        baseMoves.add("Night Slash");

        Pokemon.movesetCreation(random, baseMoves);

        Pokemon.natureCreation();

        Pokemon.ivSpreadCreation();

        Pokemon.evSpreadCreation();
    }
}
