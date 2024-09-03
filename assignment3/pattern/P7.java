package assignment3.pattern;

class P7 {
    
    public static void main(String[] args) {
        int n = 6; // Half the height of the diamond (excluding the middle line)

        // Loop for both upper and lower halves of the diamond
        for (int i = 0; i < 2 * n - 1; i++) {
            // number of stars for the current row
            int stars = (i < n) ? (i * 2 + 1) : ((2 * n - i - 1) * 2 - 1);

            //  number of spaces for the current row
            int spaces = (i < n) ? (n - i - 1) : (i - n + 1);

            // Print  spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}
