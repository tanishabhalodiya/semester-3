import java.util.*;
//RADIX SORT
public class Radix_sort_main {
    public static int getMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            }
        }
        return max;
    }
    public static void radix_Sort(int arr[])
    {
        int m=getMax(arr);
        int place=0;
        int n=arr.length;
        for(place=1 ; (m/place) > 0; place *= 10){
            count_sort(arr,n,place);
        }
    }
    public static void count_sort(int arr[],int n,int place){
        int b[]=new int[n];
        int i;
        int c[]=new int[10];
        for(i=0;i<10;i++){
            c[i]=0;
        }
        for(i=0;i<n;i++){
            c[ (arr[i] / place) % 10]++;
        }
        for(i=1;i<10;i++){
            c[i] += c[i-1];
        }
        for(i=n-1 ; i>=0 ; i--){
            System.out.println("b["+i+"] : "+b[i]);
            b [ c [ ( arr[i] / place) % 10 ] - 1 ] = arr[ i ];
            c [ ( arr [i] / place ) % 10 ]--;
        }
        for(i=0;i<n;i++){
            arr[i]=b[i];
        }
    }
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : " + arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        radix_Sort(arr);
        display(arr);
    }
}