import java.util.*;

class Sort {
    int a[];
    int n;

    public Sort(int a[], int n) {
        this.a = a;
        this.n = n;
    }

    public void quick_Sort(int lb, int ub) {
        boolean flag = true;
        if (lb < ub) {
            int i = lb;
            int j = ub + 1;
            int key = a[lb];
            while (flag) {
                i = i + 1;
                while (i < n && a[i] < key) {
                    i = i + 1;
                }
                j = j - 1;
                while (a[j] > key) {
                    j = j - 1;
                }
                if (i < j) {
                    int swep = a[j];
                    a[j] = a[i];
                    a[i] = swep;
                } else {
                    flag = false;
                }

            }
            int swep = a[j];
            a[j] = a[lb];
            a[lb] = swep;
            quick_Sort(lb, j - 1);
            quick_Sort(j + 1, ub);
        }
    }

    public void dispaly() {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:" + a[i] + "  ");
        }
    }
}

public class Quick_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        Sort s1 = new Sort(a, n);
        int lb = 0;
        int ub = n - 1;

        s1.quick_Sort(lb, ub);
        s1.dispaly();
    }
}
