
import java.util.*;

public class Linear_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enetr a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element for search : ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Element is found at index : " + i);
            }
        }
    }
}
