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
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");
        baseMoves.add("");

        Pokemon.movesetCreation(random, baseMoves);

        Pokemon.natureCreation();

        Pokemon.ivSpreadCreation();

        Pokemon.evSpreadCreation();
    }

}
