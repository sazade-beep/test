package github1;


import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Candidates
        String[] candidates = {"Candidate A", "Candidate B", "Candidate C"};
        int[] votes = new int[candidates.length];

        System.out.println("Welcome to the Online Voting System!");
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }

        // Voting process
        System.out.print("Enter the number of voters: ");
        int numVoters = scanner.nextInt();

        for (int i = 1; i <= numVoters; i++) {
            System.out.print("Voter " + i + ", enter your vote (1-" + candidates.length + "): ");
            int vote = scanner.nextInt();
            if (vote >= 1 && vote <= candidates.length) {
                votes[vote - 1]++;
            } else {
                System.out.println("Invalid vote. Skipping...");
            }
        }

        // Display results
        System.out.println("\nVoting Results:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + ": " + votes[i] + " votes");
        }

        // Determine the winner
        int maxVotes = 0;
        int winnerIndex = -1;
        boolean tie = false;

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winnerIndex = i;
                tie = false;
            } else if (votes[i] == maxVotes) {
                tie = true;
            }
        }

        if (tie) {
            System.out.println("The election resulted in a tie.");
        } else {
            System.out.println("The winner is: " + candidates[winnerIndex]);
        }

        scanner.close();
    }
}
    
