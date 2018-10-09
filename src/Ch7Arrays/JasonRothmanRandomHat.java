
package Ch7Arrays;

import java.util.Random;


public class JasonRothmanRandomHat {
    public static void main(String[] args) {
        //create a array for all my teams
        int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] copy = teams;
        //implements random class
        Random rand = new Random();
        System.out.println("ROUND ONE:");
        int x = 0;
        int y = 0;
        for (int i = 0; i <= (copy.length) / 2 - 1; i++) {

            do {
                x = rand.nextInt(teams.length) + 1;

                y= rand.nextInt(teams.length) + 1;
                System.out.println("Team " + teams[x-1] + " VS Team " + teams[y-1]);

            } while(teams[x-1] != 0 && teams[y-1] != 0);
            teams[x-1] = 0;
            teams[y-1] = 0;
        }

        }
    }
