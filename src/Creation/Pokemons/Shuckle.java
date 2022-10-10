package Creation.Pokemons;

import Creation.Pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Shuckle extends Pokemon{
    @Override
    public void test() {
        System.out.println("##### Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        baseMoves.add("Withdraw");
        baseMoves.add("Wrap");
        baseMoves.add("Rollout");
        baseMoves.add("Struggle Bug");
        baseMoves.add("Rock Throw");
        baseMoves.add("Safeguard");
        baseMoves.add("Rest");
        baseMoves.add("Bug Bite");
        baseMoves.add("Guard Split");
        baseMoves.add("Power Split");
        baseMoves.add("Rock Slide");
        baseMoves.add("Gastro Acid");
        baseMoves.add("Sticky Web");
        baseMoves.add("Power Trick");
        baseMoves.add("Stone Edge");
        baseMoves.add("Shell Smash");

        Pokemon.movesetCreation(random, baseMoves);

        Pokemon.natureCreation();

        Pokemon.ivSpreadCreation();

        Pokemon.evSpreadCreation();
    }

}
