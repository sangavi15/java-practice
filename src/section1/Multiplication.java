package section1;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sample Input");
        int n = sc.nextInt();
        System.out.println("Sample Output");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();

    }

}
