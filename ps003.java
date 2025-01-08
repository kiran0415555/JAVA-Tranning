class Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute bowling average
    public void computeBowlingAverage() {
        if (hasInvalidInput()) {
            System.out.println("Error");
            return;
        }
        if (wickets > 0) {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=" + bowlingAverage);
        } else {
            System.out.println("Error");
        }
    }

    // Method to show statistics
    public void showStatistics() {
        if (hasInvalidInput()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }

    // Method to compute strike rate
    public void computeStrikeRate() {
        if (hasInvalidInput()) {
            System.out.println("Error");
            return;
        }
        if (ballsBowled > 0) {
            double strikeRate = (double) runsConceded / ballsBowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=" + strikeRate);
        } else {
            System.out.println("Error");
        }
    }

    // Helper method to check for invalid input
    private boolean hasInvalidInput() {
        return wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0 ||
               (matches == 0 && (runsConceded > 0 || ballsBowled > 0));
    }
}

// Testing class with main method
public class ps003 {
    public static void main(String[] args) {
        // Create Bowler object with given input
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);

        // Call the methods of Bowler class
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}
