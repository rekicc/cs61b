/**
 * Skeleton file for HW0A.
 * Exercises sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */
public class JavaExercises {

    /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on.
     */
    public static void starTriangle() {
        int spaceInitial = 4;
        int lines = 0;
        while (lines < 5) {
            int spaces = spaceInitial;
            int stars = 5 - spaces;
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            spaceInitial--;
            lines++;
        }
    }

    /**
     * Prints each character of a given string followed by its reverse index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
    public static void printIndexed(String s) {
        int sLength = s.length();
        String tmp = "";
        while (sLength > 0) {
            int sIndex = s.length() - sLength;
            tmp = tmp.concat(String.valueOf(s.charAt(sIndex)));
            tmp = tmp.concat(String.valueOf(sLength - 1));
            sLength--;
        }
        System.out.println(tmp);
    }

    /**
     * Returns a new string where each character of the given string is repeated
     * twice.
     * Example: stutter("hello") -> "hheelllloo"
     */
    public static String stutter(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            tmp = tmp.concat(String.valueOf(x));
            tmp = tmp.concat(String.valueOf(x));
        }
        return tmp;
    }

    /**
     * Determines the quadrant of a Cartesian coordinate (x, y).
     * Returns:
     * 1 for the first quadrant (x > 0, y > 0),
     * 2 for the second quadrant (x < 0, y > 0),
     * 3 for the third quadrant (x < 0, y < 0),
     * 4 for the fourth quadrant (x > 0, y < 0),
     * 0 if the point lies on an axis.
     */
    public static int quadrant(int x, int y) {
        int quadrant = 0;
        if ((x == 0) || (y == 0)) {
            ;
        } else if ((x > 0) && (y > 0)) {
            quadrant = 1;
        } else if ((x < 0) && (y > 0)) {
            quadrant = 2;
        } else if ((x < 0) && (y < 0)) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }
        return quadrant;
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4)); // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5)); // Output: 0
    }
}
