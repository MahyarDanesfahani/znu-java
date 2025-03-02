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
        //tE5.2
        System.out.println("please enter the double number : ");
        double x = scanner.nextDouble();
        check(x);
        //E5.15
        System.out.println("please enter your income : ");
        int income = scanner.nextInt();
        tax(income);
        //E5.18
        System.out.println("please enter the 3 string : ");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        String n3 = scanner.nextLine();
        sort(n3,n2,n1);
        //E6.1 a,e
        sum100();
        System.out.println("please enter the int number : ");
        int number = scanner.nextInt();
        sumnumberodd(number);
        //E6.2
        processNumbers();
        //E6.3
        System.out.println("please enter the strings : ");
        String input = scanner.nextLine();
        processString(input);


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
    public static  void sum100(){
        int sum = 0;
        for(int i=2 ; i <= 100 ; i++){
            if ( i % 2 == 0){
                sum += i ;
            }
        }
        System.out.println("the sum of even number between 2 and 100 : " + sum);
    }
    public static  int sumnumberodd(int number){
        int s = 0 ;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                s += digit;
            }
            number /= 10;
        }
        System.out.println("the sum of odd number is : " + s);
        return  s ;
    }
    public static void processNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the numbers (the end please enter the 0) : ");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int evenCount = 0, oddCount = 0;
        int cumulativeSum = 0;
        boolean firstInput = true;
        int previousNumber = Integer.MIN_VALUE;
        boolean duplicatePrinted = false;
        StringBuilder cumulativeOutput = new StringBuilder();
        StringBuilder duplicatesOutput = new StringBuilder();
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;

            if (num < min) min = num;
            if (num > max) max = num;

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            cumulativeSum += num;
            cumulativeOutput.append(cumulativeSum).append(" ");

            if (!firstInput && num == previousNumber) {
                if (!duplicatePrinted) {
                    duplicatesOutput.append(num).append(" ");
                    duplicatePrinted = true;
                }
            } else {
                duplicatePrinted = false;
            }

            previousNumber = num;
            firstInput = false;
        }

        System.out.println("\nthe min of number : " + min);
        System.out.println("the max of number : " + max );
        System.out.println("the number of even : " + evenCount);
        System.out.println("the number of odd : " + oddCount);
        System.out.println("the Cumulative totals : "  + cumulativeOutput.toString().trim());
        System.out.println("the All adjacent duplicates : " + (duplicatesOutput.length() > 0 ? duplicatesOutput.toString().trim() : "nothing"));

        scanner.close();
    }
    public static void processString(String input) {
        StringBuilder uppercaseLetters = new StringBuilder();
        StringBuilder everySecondChar = new StringBuilder();
        StringBuilder replacedVowels = new StringBuilder();
        StringBuilder vowelPositions = new StringBuilder();
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseLetters.append(ch);
            }
            if (i % 2 == 1) {
                everySecondChar.append(ch);
            }
            if (vowels.indexOf(ch) != -1) {
                replacedVowels.append('_');
                vowelCount++;
                vowelPositions.append(i).append(" ");
            } else {
                replacedVowels.append(ch);
            }
        }
        System.out.println("\na.Only the uppercase letters in the string : " + (uppercaseLetters.length() > 0 ? uppercaseLetters.toString() : "nothing"));
        System.out.println("b.Every second letter of the string : " + (everySecondChar.length() > 0 ? everySecondChar.toString() : "nothing"));
        System.out.println("c.the string, with all vowels replaced by an underscore : " + replacedVowels.toString());
        System.out.println("d.the number of vowels in the string : " + vowelCount);
        System.out.println("e.the positions of all vowels in the string : " + (vowelPositions.length() > 0 ? vowelPositions.toString().trim() : "nothing"));
    }

}