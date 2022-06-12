package Java_Demo.linkedlists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) { 
            numbers.append(input.nextInt());
        }

        numbers.printLinkedLists();
    }
}
