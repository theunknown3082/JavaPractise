/*import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        double[] New = new double[5];
        int i;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first Marks: ");
        New[0] = input.nextDouble();
        System.out.println("Enter the second Marks: ");
        New[1] = input.nextDouble();
        System.out.println("Enter the third Marks: ");
        New[2] = input.nextDouble();
        System.out.println("Enter the forth Marks: ");
        New[3] = input.nextDouble();
        System.out.println("Last Marks: ");
        New[4] = input.nextDouble();


        System.out.println(Arrays.toString(New));

        for(i=0; i<New.length;i++){
            System.out.println("Array element[" +i+"]="+New[i]);
        }

        double Sum = (New[0]+New[1]+New[2]+New[3]+New[4]);
        System.out.println("The sum of marks is: "+Sum);

        double Average=Sum/5;
        System.out.println("Average: "+Average);
    }
}

*/
/*import java.util.Arrays;*/










/*

import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        char[] charArray={'h','i',' ','j','a','v','a'};
        byte[] ascii={65,66,67,68,69,70};
        String str="Welcome";
        String str1=new String("Welcome to Java");
        String str2=new String(charArray);
        String str3=new String(charArray,3,2);
        String str4=new String(ascii);
        String str5=new String(ascii,2,3);
        String str6=new String();
        String str7=new String(str);
        System.out.println("str = "+str);
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        System.out.println("str3 = "+str3);
        System.out.println("str4 = "+str4);
        System.out.println("str5 = "+str5);
        System.out.println("str6 = "+str6);
        System.out.println("str7 = "+str7);
    }
}
*/




/*import java.util.Scanner;
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
*/

/*import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int a, num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        a = input.nextInt();
        num = a;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;

        }
        System.out.println("the reversed number is: "+ reversed);
    if (reversed == a){
        System.out.println("the number is palandrome!!");
    }
    else {
        System.out.println(" The number is not palandrome----");

    }

    }
}
*/
/*
import java.util.Scanner;
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
/*import java.util.Scanner;*/

/*public class Main {
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
}*/



/*--------------------------------------------------*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class rect {
            int length,width;
            void input(){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the length of desired rectangle: ");
                length = input.nextInt();
                System.out.println("Enter the width of desired rectangle: ");
                width = input.nextInt();
            }
            void area(){
                int area;
                area = length*width;
                System.out.println("Area is: "+ area);
            }
        }

        rect r = new rect();
        r.input();
        r.area();
    }
}