package section2;

import java.util.Scanner;

public class IncomeTaxSlab {

    public static void main(String[] args) {
        double bal, tax, tax2, tax3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextInt();
        if (salary <= 300000) {
            System.out.println("Tax amount is : 0");
        } else if (salary > 300000 && salary <= 500000) {
            bal = (salary - 250000);
            tax = (bal * 5) / 100;
            System.out.println("Tax amount " + tax);
        } else if (salary > 500000 && salary <= 1000000) {
            bal = (salary - 500000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (bal * 20) / 100;
            System.out.println("tax2");
            System.out.println("Tax amount" + (tax + tax2));
        } else {
            bal = (salary - 1000000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (500000 * 20) / 100;
            System.out.println(tax2);
            tax3 = (bal * 30) / 100;
            System.out.println(tax3);
            System.out.println("Tax amount" + (tax + tax2 + tax3));
        }
        sc.close();

    }

}
