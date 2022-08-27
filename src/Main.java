import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon1;

        System.out.print("Pokemon Currently Available: ");
        System.out.println("Arcanine / Nidoking / Greninja");
        System.out.print("What Pokemon do you want? ");
        String poke1Choice = scanner.nextLine();

        switch (poke1Choice.toLowerCase()) {
            case "arcanine":
                pokemon1 = new Arcanine();
                pokemon1.test();
                pokemon1.generate();
                break;
            case "nidoking":
                pokemon1 = new Nidoking();
                pokemon1.test();
                pokemon1.generate();
                break;
            case "greninja":
                pokemon1 = new Greninja();
                pokemon1.test();
                pokemon1.generate();
                break;
            case "dragonite":
                pokemon1 = new Dragonite();
                pokemon1.test();
                pokemon1.generate();
                break;
            case "rillaboom":
                pokemon1 = new Rillaboom();
                pokemon1.test();
                pokemon1.generate();
                break;
            default:
                System.out.println("That is not a valid choice!");
        }

    }
}
