import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon1;

        System.out.print("Pokemon Currently Available: ");
        System.out.println("Arcanine");
        System.out.print("What Pokemon do you want? ");
        String poke1Choice = scanner.nextLine();

        if (poke1Choice.equalsIgnoreCase("arcanine")) {
            pokemon1 = new Arcanine();
            pokemon1.test();
            pokemon1.generate();
        } else {
            System.out.println("That choice was invalid.");
        }
    }
}
