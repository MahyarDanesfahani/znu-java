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
}