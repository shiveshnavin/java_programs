package in.shivesh;

import java.util.Scanner;

public class FindAllSubstring {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in first array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in second array");
        if (n < 0) {
            System.out.println("Invalid range");
            System.exit(0);
        } else {
            for (int i = 0; i < n; i++) {

                a[i] = sc.nextInt();

            }
        }

        System.out.println("Enter the elements in second array");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the elements in second array");

        if (m < 0) {

            System.out.println("Invalid range");
            System.exit(0);
        } else {
            for (int i = 0; i < m; i++) {

                b[i] = sc.nextInt();

            }

            if (n == m && m == n) {

                for (int i = 0; i < n; i++) {

                    a[i] = a[i] + b[i];
                    b[i] = a[i] - b[i];
                    a[i] = a[i] - b[i];

                }

            } else {

                System.out.println("Swaping is not possible");
            }

            System.out.println("The first array after swaping");
            for (int num : a) {

                System.out.println(num);
            }


            System.out.println("The second array after swaping");
            for (int num1 : b) {

                System.out.println(num1);
            }

        }

    }

}
