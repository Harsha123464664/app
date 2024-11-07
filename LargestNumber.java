import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("The largest of the given " + n + " natural numbers is: " + largest);
    }
}
