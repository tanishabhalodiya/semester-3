import java.util.*;

public class LAB29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            
            int[] B = new int[N];
            System.arraycopy(A, 0, B, 0, N);
            
            // Shuffle B to maximize Hamming distance
            shuffleToMaximizeHammingDistance(A, B);
            
            // Calculate the Hamming distance
            int hammingDistance = calculateHammingDistance(A, B);
            
            // Print results
            System.out.println(hammingDistance);
            for (int i = 0; i < N; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void shuffleToMaximizeHammingDistance(int[] A, int[] B) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int j = (i + 1) % N;
            if (A[i] == B[j]) {
                j = (j + 1) % N;
            }
            swap(B, i, j);
        }
    }
    
    private static void swap(int[] B, int i, int j) {
        int temp = B[i];
        B[i] = B[j];
        B[j] = temp;
    }
    
    private static int calculateHammingDistance(int[] A, int[] B) {
        int distance = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                distance++;
            }
        }
        return distance;
    }
}
