/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] lines = {

            String.join("", "  *****   ", "  *****   ", " *******  ", "  *****  "),
            String.join("", " *     *  ", " *     *  ", " *      * ", " *     * "),
            String.join("", "*       * ", "*       * ", " *      * ", " *       "),
            String.join("", "*       * ", "*       * ", " ******   ", "  *****  "),
            String.join("", "*       * ", "*       * ", " *        ", "       * "),
            String.join("", " *     *  ", " *     *  ", " *        ", " *     * "),
            String.join("", "  *****   ", "  *****   ", " *        ", "  *****  ")
        };

        // Loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}