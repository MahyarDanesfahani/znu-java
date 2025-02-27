import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ? ");
        String name = scanner.nextLine();
        System.out.println("welcome " + name);

        System.out.println("please enter the weight (kilograms) : ");
        double m = scanner.nextDouble();
        System.out.println("please enter the height (meter) : ");
        double h = scanner.nextDouble();

        earth(m,h);

        System.out.println("please enter the double number : ");
        double x = scanner.nextDouble();
        check(x);

        System.out.println("please enter your income : ");
        int income = scanner.nextInt();
        tax(income);

        System.out.println("please enter the 3 string : ");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        String n3 = scanner.nextLine();
        sort(n3,n2,n1);

    }
    public static void earth(double weight , double height){
        final double g = 9.8d ;
        double result = weight * height * g ;
        System.out.println("the Earth's gravitational potential energy is : " + result);
    }
    public static void check(double x){
        if ( x == 0 ){
            System.out.println(x);
        } else if (x > 1000000) {
            System.out.println("the number is positive and large ");
        }
        else {
            System.out.println("the number is negative and small");
        }
    }
    public static void tax(int income){
        double tax ;
        if ( income <= 50000){
            tax = income / 100;
            System.out.println("the tax of your income is : " + tax);
        } else if ( income > 50000 && income <= 75000) {
            tax = 2 *(income / 100);
            System.out.println("the tax of your income is : " + tax);
        } else if (income >75000 && income <= 100000) {
            tax =  3 * (income / 100);
            System.out.println("the tax of your income is : " + tax);
        } else if ( income > 100000 && income <= 250000) {
            tax = 4 * (income / 100);
            System.out.println("the tax of your income is : " + tax);
        } else if ( income > 250000 && income <= 500000) {
            tax = 5 * (income / 100);
            System.out.println("the tax of your income is : " + tax);
        } else {
            tax = 6 * (income / 100);
            System.out.println("the tax of your income is : " + tax);
        }
    }
    public static void sort(String n1 , String n2 , String n3){
        String first , second , third ;
        if (n1.compareTo(n2) <= 0 && n1.compareTo(n3) <= 0) {
            first = n1;
            if (n2.compareTo(n3) <= 0) {
                second = n2;
                third = n3;
            } else {
                second = n3;
                third = n2;
            }
        } else if (n2.compareTo(n1) <= 0 && n2.compareTo(n3) <= 0) {
            first = n2;
            if (n1.compareTo(n3) <= 0) {
                second = n1;
                third = n3;
            } else {
                second = n3;
                third = n1;
            }
        } else {
            first = n3;
            if (n1.compareTo(n2) <= 0) {
                second = n1;
                third = n2;
            } else {
                second = n2;
                third = n1;
            }
        }
        System.out.println(" the sort of string");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }

}