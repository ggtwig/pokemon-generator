import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dragonite extends Pokemon {



    @Override
    public void test() {
        System.out.println("Dragonite Created!");
    }

    @Override
    public void generate() {
        Random random = new Random();

        ArrayList<String> baseMoves =  new ArrayList<String>();
        baseMoves.add("Extreme Speed");
        baseMoves.add("Fire Punch");
        baseMoves.add("Hurricane");
        baseMoves.add("Leer");
        baseMoves.add("Roost");
        baseMoves.add("Thunder Punch");
        baseMoves.add("Thunder Wave");
        baseMoves.add("Twister");
        baseMoves.add("Wing Attack");
        baseMoves.add("Wrap");
        baseMoves.add("Dragon Tail");
        baseMoves.add("Agility");
        baseMoves.add("Slam");
        baseMoves.add("Aqua Tail");
        baseMoves.add("Dragon Rush");
        baseMoves.add("Outrage");
        baseMoves.add("Safeguard");
        baseMoves.add("Rain Dance");
        baseMoves.add("Dragon Dance");
        baseMoves.add("Hyper Beam");

        Pokemon.movesetCreation(random, baseMoves);
    }


}
