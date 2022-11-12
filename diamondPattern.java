/**
 * diamondPattern
 */
public class diamondPattern {

    public static void diamond(int n) {
        // First Half
        // outer shell or row count
        for (int i = 1; i <= n; i++) {
            // inner shell
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // second Half
        // Reverse the first half

        for (int i = n; i >= 1; i--) {
            // inner shell
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        diamond(5);
    }
}