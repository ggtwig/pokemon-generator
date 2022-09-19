package Creation.Pokemons;

import Creation.Pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Nidoking extends Pokemon {



    @Override
    public void test() {
        System.out.println("Nidoking Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves = new ArrayList<>();
        baseMoves.add("Double Kick");
        baseMoves.add("Earth Power");
        baseMoves.add("Flatter");
        baseMoves.add("Focus Energy");
        baseMoves.add("Fury Attack");
        baseMoves.add("Helping Hand");
        baseMoves.add("Horn Attack");
        baseMoves.add("Leer");
        baseMoves.add("Megahorn");
        baseMoves.add("Peck");
        baseMoves.add("Poison Jab");
        baseMoves.add("Poison Sting");
        baseMoves.add("Sludge Wave");
        baseMoves.add("Toxic");
        baseMoves.add("Toxic Spikes");

        Pokemon.movesetCreation(random, baseMoves);

        Pokemon.natureCreation();

        Pokemon.ivSpreadCreation();

        Pokemon.evSpreadCreation();
    }
}
