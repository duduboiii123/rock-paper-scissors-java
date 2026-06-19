import java.util.Random;
import java.util.Scanner;

public class Main {

    static int wins = 0, losses = 0, ties = 0;
    static final String[] CHOICES = {"rock", "paper", "scissors"};
    static final Random random = new Random();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcome();

        System.out.println("\n  Press ENTER to start...");
        scanner.nextLine();

        boolean playing = true;
        while (playing) {
            playRound();
            System.out.print("\n  Play again? (yes / no): ");
            String again = scanner.nextLine().trim().toLowerCase();
            playing = again.equals("yes") || again.equals("y");
        }

        showFinalScore();
        scanner.close();
    }

    static void showWelcome() {
        System.out.println("""

██████╗  ██████╗  ██████╗██╗  ██╗
██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝
██████╔╝██║   ██║██║     █████╔╝\s
██╔══██╗██║   ██║██║     ██╔═██╗\s
██║  ██║╚██████╔╝╚██████╗██║  ██╗
╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝

        ██████╗  █████╗ ██████╗ ███████╗██████╗
        ██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗
        ██████╔╝███████║██████╔╝█████╗  ██████╔╝
        ██╔═══╝ ██╔══██║██╔═══╝ ██╔══╝  ██╔══██╗
        ██║     ██║  ██║██║     ███████╗██║  ██║
        ╚═╝     ╚═╝  ╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝

███████╗ ██████╗██╗███████╗███████╗ ██████╗ ██████╗ ███████╗
██╔════╝██╔════╝██║██╔════╝██╔════╝██╔═══██╗██╔══██╗██╔════╝
███████╗██║     ██║███████╗███████╗██║   ██║██████╔╝███████╗
╚════██║██║     ██║╚════██║╚════██║██║   ██║██╔══██╗╚════██║
███████║╚██████╗██║███████║███████║╚██████╔╝██║  ██║███████║
╚══════╝ ╚═════╝╚═╝╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝

""");
        System.out.println("  Type  rock,  paper,  or  scissors  to play.");
        System.out.println("  Type  quit  at any time to exit.");
    }

    static void playRound() {
        System.out.println("\n" + "─".repeat(52));
        System.out.print("  Your choice  ▶  ");
        String playerInput = scanner.nextLine().trim().toLowerCase();

        if (playerInput.equals("quit") || playerInput.equals("q")) {
            showFinalScore();
            System.exit(0);
        }

        if (!isValidChoice(playerInput)) {
            System.out.println("   Invalid! Please type: rock, paper, or scissors.");
            return;
        }

        String computerChoice = CHOICES[random.nextInt(3)];

        System.out.println();
        System.out.println("  You       ➜  " + capitalize(playerInput));
        System.out.println("  Computer  ➜  " + capitalize(computerChoice));
        System.out.println();

        String result = getResult(playerInput, computerChoice);

        switch (result) {
            case "win"  -> { System.out.println("   You WIN!"); wins++; }
            case "lose" -> { System.out.println("   You LOSE."); losses++; }
            case "tie"  -> { System.out.println("   It's a TIE!"); ties++; }
        }

        System.out.println();
        System.out.printf("  Score  :  Wins: %d   Losses: %d   Ties: %d%n", wins, losses, ties);
        System.out.println("─".repeat(52));
    }

    static boolean isValidChoice(String input) {
        for (String choice : CHOICES) {
            if (choice.equals(input)) return true;
        }
        return false;
    }

    static String getResult(String player, String computer) {
        if (player.equals(computer)) return "tie";
        if ((player.equals("rock")     && computer.equals("scissors")) ||
            (player.equals("scissors") && computer.equals("paper"))    ||
            (player.equals("paper")    && computer.equals("rock")))
            return "win";
        return "lose";
    }

    static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    static void showFinalScore() {
        System.out.println("\n" + "═".repeat(52));
        System.out.println("  FINAL SCORE");
        System.out.println("═".repeat(52));
        System.out.printf("  Wins: %-6d  Losses: %-6d  Ties: %d%n", wins, losses, ties);
        System.out.println("═".repeat(52));
        System.out.println("  Thanks for playing!  Goodbye.");
        System.out.println("═".repeat(52));
    }
}
