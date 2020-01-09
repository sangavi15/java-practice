package section2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        {
            int n, temp;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no. of elements in array:");
            n = sc.nextInt();
            int a[] = new int[10];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.print("Ascending Order:");
            for (int i = 0; i < 10 - 1; i++) {
                System.out.print(a[i] + ",");
            }
            System.out.print(a[10 - 1]);
            sc.close();
        }

    }

}