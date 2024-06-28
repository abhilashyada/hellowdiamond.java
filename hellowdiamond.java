import java.util.Scanner;
public class hellowdiamond {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int a = 2;
        for (int i = 1;i <= A;i++) {
            if (i == 1) {
                System.out.println("* ".repeat(A + A));
            } else {
                System.out.println("* ".repeat(A - i + 1) + "  ".repeat((2 * i) - 2) + "* ".repeat(A - i + 1));
            }
        }
        for (int j = 1;j <= A;j++) {
            if (j == A) {
                System.out.println("* ".repeat(A + A));
            } else {
                System.out.println("* ".repeat(j) + "  ".repeat((A + A) - a) + "* ".repeat(j));
                a += 2;
            }
        }
        input.close();
    }
}