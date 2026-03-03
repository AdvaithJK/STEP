/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create a String array to store 7 lines of the banner
        String[] lines = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join("", "  *****   ", "  *****   ", " *******  ", "  *****  ");
        lines[1] = String.join("", " *     *  ", " *     *  ", " *      * ", " *     * ");
        lines[2] = String.join("", "*       * ", "*       * ", " *      * ", " *       ");
        lines[3] = String.join("", "*       * ", "*       * ", " ******   ", "  *****  ");
        lines[4] = String.join("", "*       * ", "*       * ", " *        ", "       * ");
        lines[5] = String.join("", " *     *  ", " *     *  ", " *        ", " *     * ");
        lines[6] = String.join("", "  *****   ", "  *****   ", " *        ", "  *****  ");

        // Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}