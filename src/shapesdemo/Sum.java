package shapesdemo;

import java.util.Scanner;

public class Sum {
    public void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int X = input.nextInt();
        System.out.println("Enter the Second Number: ");
        int Y = input.nextInt();
        int Sum = X+Y;
        System.out.println("Sum: "+Sum);


    }
}
