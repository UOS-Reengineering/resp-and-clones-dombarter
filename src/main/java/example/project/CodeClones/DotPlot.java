package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {

        // Print out the initial line
        for (char c: sequence2) {
            System.out.print('\t');
            System.out.print(c);
        }
        System.out.println('\t');

        for (int x = 0; x < sequence1.length; x++) {

            // Print out the character
            System.out.print(sequence1[x]);

            for (int y = 0; y < sequence2.length; y++) {

                // Print a '+' if the characters match
                System.out.print('\t');
                if (sequence1[x] == sequence2[y]) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println('\t');
        }
    }

}
