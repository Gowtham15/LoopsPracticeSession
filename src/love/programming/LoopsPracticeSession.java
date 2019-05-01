package love.programming;

public class LoopsPracticeSession {
    public static void main(String[] args) {
        // For loop to print 4 rows of 10 *s
        String s = "**********";
        for (int i = 5; i > 0; i--) {
            System.out.println(s);

        }
        System.out.println("----------------------------");
        // For loop to print 1 star to 5 stars
        for (int n = 0; n <= 5; n++) {
            for (int i = 0; i < n; i++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        // For loop to print 5 stars to 1 star
        System.out.println("----------------------------");


        String space = " ";
        for (int n = 0; n <= 5; n++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(space+"*");
            }
            System.out.println(space+space+space);
        }

    }
}


