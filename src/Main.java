import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        float a, b, c;

        System.out.println("--Use this util to find the average of marks of any 3 subjects-- ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks of the first subject: ");
        a = input.nextFloat();

        System.out.println("Enter the marks of the second subject: ");
        b = input.nextFloat();

        System.out.println("Enter the marks of the third subject: ");
        c = input.nextFloat();

        System.out.println("The average marks is: " + ((a+b+c)/3));
    }
}


/*import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int num ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        num = input.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

    }
}*/
/*import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a, n, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n = input.nextInt();
        System.out.println("enter the second number: ");
        m = input.nextInt();
        System.out.println("before changing position, the numbers are:");
        System.out.println("Number1: "+ n);
        System.out.println("Number2: "+ m);
        a = n;
        n = m;
        m = a;
        System.out.println("  ");
        System.out.println("Number1 after swap: "+ n);
        System.out.println("Number2 after swap: "+ m);
    }
}*/

/*public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
}
*/
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
            }
            case '/' -> {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            }
            default -> System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
*/


/*--------------------------------------------------*/


