import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Greninja extends Pokemon {



    @Override
    public void test() {
        System.out.println("Greninja Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        baseMoves.add("Bubble");
        baseMoves.add("Growl");
        baseMoves.add("Haze");
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

        String[] moveset = new String[4];

        for (int i = 0; i < moveset.length; i++) {
            int randomIndex = random.nextInt(baseMoves.size());
            moveset[i] = baseMoves.get(randomIndex);
            baseMoves.remove(randomIndex);
        }

        System.out.println(Arrays.toString(moveset));
    }
}
