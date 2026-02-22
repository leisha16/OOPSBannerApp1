/**
* @author Leisha
* @version 2
 */

public class OOPSBannerApp1_UC4 {

    public static void main(String[] args) {

        String[] banner = {

            // Line 1
            String.join("   ",
                " ####### ",   // O
                " ####### ",   // O
                " ####### ",   // P
                " ####### "    // S
            ),

            // Line 2
            String.join("   ",
                "##     ##",   // O
                "##     ##",   // O
                "##     ##",   // P
                "##       "    // S
            ),

            // Line 3
            String.join("   ",
                "##     ##",
                "##     ##",
                "##     ##",
                "##       "
            ),

            // Line 4
            String.join("   ",
                "##     ##",
                "##     ##",
                " ####### ",
                " ####### "
            ),

            // Line 5
            String.join("   ",
                "##     ##",
                "##     ##",
                "##       ",
                "       ##"
            ),

            // Line 6
            String.join("   ",
                "##     ##",
                "##     ##",
                "##       ",
                "##     ##"
            ),

            // Line 7
            String.join("   ",
                " ####### ",
                " ####### ",
                "##       ",
                " ####### "
            )
        };

        // For-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}