package Creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Pokemon {

    private static Random random = new Random();
    private static ArrayList<String> baseMoves =  new ArrayList<>();
    private static ArrayList<String> baseNatures = new ArrayList<>();
    private static String randomNature;
    private static HashMap<String, Integer> ivs = new HashMap<>();
    private static HashMap<String, Integer> evs = new HashMap<>();

    public void test() {
        System.out.println("Pokemon Created!");
    }

    public void generate() {
        movesetCreation(random, baseMoves);

        natureCreation();

        ivSpreadCreation();

        evSpreadCreation();
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

    protected static void natureCreation() {
        baseNatures.add("Bashful");
        baseNatures.add("Docile");
        baseNatures.add("Hardy");
        baseNatures.add("Quirky");
        baseNatures.add("Serious");
        baseNatures.add("Adamant");
        baseNatures.add("Brave");
        baseNatures.add("Lonely");
        baseNatures.add("Naughty");
        baseNatures.add("Bold");
        baseNatures.add("Impish");
        baseNatures.add("Lax");
        baseNatures.add("Relaxed");
        baseNatures.add("Modest");
        baseNatures.add("Mild");
        baseNatures.add("Quiet");
        baseNatures.add("Rash");
        baseNatures.add("Calm");
        baseNatures.add("Careful");
        baseNatures.add("Gentle");
        baseNatures.add("Sassy");
        baseNatures.add("Hasty");
        baseNatures.add("Jolly");
        baseNatures.add("Naive");
        baseNatures.add("Timid");
        int randomNatureLoc = random.nextInt(25 + 1 - 1) + 1;
        randomNature = baseNatures.get(randomNatureLoc);
    }

    protected static void ivSpreadCreation() {
        for (int i = 0; i <= 5; i++) {
            int randomIV = random.nextInt(32);
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
    }

    protected static void evSpreadCreation() {
        int hp = 0;
        int attack = 0;
        int defense = 0;
        int specialAttack = 0;
        int specialDefense = 0;
        int speed = 0;
        for (int i = 510; i >= 0; i--) {
            int randomEVSelect = random.nextInt(6);
            switch (randomEVSelect) {
                case 0:
                    if (hp < 252) {
                        hp++;
                    }
                    break;
                case 1:
                    if (attack < 252) {
                        attack++;
                    }
                    break;
                case 2:
                    if (defense < 252) {
                        defense++;
                    }
                    break;
                case 3:
                    if (specialAttack < 252) {
                        specialAttack++;
                    }
                    break;
                case 4:
                    if (specialDefense < 252) {
                        specialDefense++;
                    }
                    break;
                case 5:
                    if (speed < 252) {
                        speed++;
                    }
                    break;
            }
        }
        evs.put("HP", hp);
        evs.put("Attack", attack);
        evs.put("Defense", defense);
        evs.put("Special Attack", specialAttack);
        evs.put("Special Defense" , specialDefense);
        evs.put("Speed", speed);
    }

    public String getNature() {
        return randomNature;
    }

    public int getIV(String iv) {
        return ivs.get(iv);
    }

    public int getEV(String ev) {
        return evs.get(ev);
    }
}
