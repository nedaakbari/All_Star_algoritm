
public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 6; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("-------------");
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("-------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("********  finish ******");
    }
}

