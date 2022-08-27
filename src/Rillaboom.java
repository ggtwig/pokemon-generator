import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Rillaboom extends Pokemon {



    @Override
    public void test() {
        System.out.println("Rillaboom Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        baseMoves.add("Branch Poke");
        baseMoves.add("Double Hit");
        baseMoves.add("Drum Beating");
        baseMoves.add("Grassy Terrain");
        baseMoves.add("Growl");
        baseMoves.add("Noble Roar");
        baseMoves.add("Scratch");
        baseMoves.add("Taunt");
        baseMoves.add("Razor Leaf");
        baseMoves.add("Screech");
        baseMoves.add("Knock Off");
        baseMoves.add("Slam");
        baseMoves.add("Uproar");
        baseMoves.add("Wood Hammer");
        baseMoves.add("Endeavor");
        baseMoves.add("Boomburst");

        String[] moveset = new String[4];

        for (int i = 0; i < moveset.length; i++) {
            int randomIndex = random.nextInt(baseMoves.size());
            moveset[i] = baseMoves.get(randomIndex);
            baseMoves.remove(randomIndex);
        }

        System.out.println(Arrays.toString(moveset));
    }


}
