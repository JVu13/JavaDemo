package Java_Demo;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Area four_corners = new Area();

        float length;
        float width;

        System.out.println("Printing Area Program");

        Scanner my_input = new Scanner(System.in);
        System.out.println("Enter Length and Width");
        
        length = my_input.nextFloat();
        width = my_input.nextFloat();

        four_corners.setDim(length, width);
        System.out.println("Length: " + length + " Width: " + width);
        System.out.println("The area is: " + four_corners.getArea());
        my_input.close();
    }
}