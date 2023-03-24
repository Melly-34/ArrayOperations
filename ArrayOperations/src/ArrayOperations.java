import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part a - Read 15 values from user and store in an array
        int[] arr = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Part b - Check if a number is present in the array
        System.out.println("Enter a number to search:");
        int num = sc.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Part c - Reverse the array and print
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - i - 1];
        }
        System.out.println("Elements of reversed array:");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println();

        // Part d - Calculate sum and product of elements
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}