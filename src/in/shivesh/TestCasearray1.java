package in.shivesh;

import java.util.Scanner;

public class TestCasearray1 {


        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.print("Enter no of courses");
            int n=scan.nextInt();scan.nextLine();
            String as ="";

            if(n<=0) {
                System.out.println("Invalid range");
            }
            else {
                System.out.println("enter the courses");
                for (int i = 0; i < n; i++) {

                    as+=","+ scan.nextLine();


                }
                System.out.println("Enter coursed to be searched ");
                String h = scan.nextLine();
                if(!as.contains(h))
                {
                    System.out.println("Invalid Course");

                }
                else
                {
                    System.out.println(h+" is availabel");
                    System.out.println();
                }


            }


        }



}

