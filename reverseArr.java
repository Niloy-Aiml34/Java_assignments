import java.util.Scanner;
public class reverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            System.out.print("Array["+i+"]:");
            arr[i]= sc.nextInt();
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
