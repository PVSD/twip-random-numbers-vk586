package com.company;
import java.util.Arrays;

public class Main {

    public static int runLoop(int run) {
        int lCount = 0;
        boolean exists = false;
        int allNums [] = new int[100];

        for (int i = 0; i <= run; i++)
        {

            // Resets the array for each run
            for (int l = 0; l < allNums.length; l++)
            {
                allNums[l] = 0;
            }

            int index = 0;

            // while (all numbers 1 - 100 do not exist in the array)
            while (index != allNums.length)
            {
                int rando = (int)(Math.random() * 100 + 1);
                exists = false;

                // Checks if the random number exists in the array
                for (int samp : allNums)
                {
                    if (rando == samp)
                    {
                        exists = true;
                    }
                }

                // If the random number does not exist, it is appended to the array
                if (!exists)
                {
                    allNums[index] = rando;
                    index++;
                }

                lCount++;
            }
        }
        return lCount / run;
    }

    public static void main(String[] args) {

        // System.out.println("The average amount of times the loop had to run was " + lCount / run + " times.");
        System.out.println("10 loops: " + runLoop(10));
        System.out.println("100 loops: " + runLoop(100));
        System.out.println("1000 loops: " + runLoop(1000));
        System.out.println("10000 loops: " + runLoop(10000));

        /*
        As the amount of times the program is run increases, the spread of results decreases to a range between 517 - 520.
        This is because the range in the average amount of times the loop was run shrinks with more and more runs, just like
        how repeating a science experiment with multiple trials yields more accuracy.
        */

    }
}
