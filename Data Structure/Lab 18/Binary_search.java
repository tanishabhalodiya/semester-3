
import java.util.*;

public class Binary_search {

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
        int l = 0;
        int r = n - 1;

        for (int i = 0; i <= n; i++) {
            int mid = (l + r) / 2;
            if (key == arr[mid]) {
                System.out.println("Element is present at index : " + mid);
                return;
            } else if (key < arr[mid]) {
                r = mid - 1;

            } else if (key > arr[mid]) {
                l = mid + 1;

            }
        }
    }
}
