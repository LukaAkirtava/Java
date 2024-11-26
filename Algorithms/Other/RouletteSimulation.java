import java.util.Random;

public class RouletteSimulation {

    public static void main(String[] args) {
        int[] gameCounts = {1, 10, 100, 1000, 10000}; // Number of games to simulate
        Random random = new Random();
        int totalPockets = 38;

        for (int games : gameCounts) {
            double totalWin = 0;

            for (int i = 0; i < games; i++) {
                int bet = random.nextInt(totalPockets); // Bet on a random pocket
                int outcome = random.nextInt(totalPockets); // Outcome is a random pocket

                if (bet == outcome) {
                    totalWin += 35; // Win 35 times the bet
                } else {
                    totalWin -= 1; // Lose the bet
                }
            }

            double averageWin = totalWin / games;
            System.out.println("After " + games + " games:");
            System.out.println("Total Win: " + totalWin + " GEL");
            System.out.println("Average Win per Game: " + averageWin + " GEL");
            System.out.println();
        }
    }
}
