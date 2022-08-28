package Creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pokemon {


    public void test() {
        System.out.println("Pokemon Created!");
    }

    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();


        movesetCreation(random, baseMoves);
    }

    protected static void movesetCreation(Random random, ArrayList<String> baseMoves) {
        String[] moveset = new String[4];

        for (int i = 0; i < moveset.length; i++) {
            int randomIndex = random.nextInt(baseMoves.size());
            moveset[i] = baseMoves.get(randomIndex);
            baseMoves.remove(randomIndex);
        }

        System.out.println(Arrays.toString(moveset));
    }


}
