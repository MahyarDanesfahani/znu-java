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

}