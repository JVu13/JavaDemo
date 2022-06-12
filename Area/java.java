package Java_Demo.Area;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Area[] rectangles = new Area[3]; //null,null,null

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(
                "Do you want to enter the length and width?: ");

            char choice = input.next().charAt(0); // y/n
            if (choice == 'y')
                rectangles[i] = new Area(input.nextDouble(), input.nextDouble());
            else
                rectangles[i] = new Area();
        }

        System.out.println("The rectangles are:");
        for(int i = 0; i < rectangles.length; i++) {
            System.out.println(
                "Rectangle " + (i+1) + 
                ": Length: " + rectangles[i].getLength() + 
                " : Width: " + rectangles[i].getWidth());
        }
    }
}