package Creation.Pokemons;

import Creation.Pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Arcanine extends Pokemon {



    @Override
    public void test() {
        System.out.println("Arcanine Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        baseMoves.add("Agility");
        baseMoves.add("Bite");
        baseMoves.add("Burn Up");
        baseMoves.add("Crunch");
        baseMoves.add("Ember");
        baseMoves.add("Extreme Speed");
        baseMoves.add("Fire Fang");
        baseMoves.add("Flame Wheel");
        baseMoves.add("Flamethrower");
        baseMoves.add("Flare Blitz");
        baseMoves.add("Helping Hand");
        baseMoves.add("Howl");
        baseMoves.add("Leer");
        baseMoves.add("Play Rough");
        baseMoves.add("Retaliate");
        baseMoves.add("Reversal");
        baseMoves.add("Roar");
        baseMoves.add("Take Down");

        Pokemon.movesetCreation(random, baseMoves);

        Pokemon.ivSpreadCreation();
    }
}
