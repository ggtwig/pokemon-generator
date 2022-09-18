package Creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Pokemon {


    public void test() {
        System.out.println("Pokemon Created!");
    }

    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        ArrayList<Integer> ivs = new ArrayList<Integer>();


        movesetCreation(random, baseMoves);

        ivSpreadCreation();
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

    protected static void ivSpreadCreation() {
        Random random = new Random();
        HashMap<String, Integer> ivs = new HashMap<>();

        for (int i = 0; i <= 5; i++) {
            int randomIV= random.nextInt(32);
            switch (i) {
                case 0:
                    ivs.put("HP", randomIV);
                    break;
                case 1:
                    ivs.put("Attack", randomIV);
                    break;
                case 2:
                    ivs.put("Defense", randomIV);
                    break;
                case 3:
                    ivs.put("Special Attack", randomIV);
                    break;
                case 4:
                    ivs.put("Special Defense", randomIV);
                    break;
                case 5:
                    ivs.put("Speed", randomIV);
                    break;
            }
        }

        System.out.println("HP: " + ivs.get("HP"));
        System.out.println("Speed: " + ivs.get("Speed"));
    }

}
