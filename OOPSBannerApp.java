/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize pattern mappings
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
            "  *****   ",
            " *     *  ",
            "*       * ",
            "*       * ",
            "*       * ",
            " *     *  ",
            "  *****   "
        };

        String[] pPattern = {
            " ******   ",
            " *     *  ",
            " *     *  ",
            " ******   ",
            " *        ",
            " *        ",
            " *        "
        };

        String[] sPattern = {
            "  *****  ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };

        String[] spacePattern = {
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern),
            new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieve pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print message as banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}