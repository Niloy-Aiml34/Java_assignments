import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter A Integer Number:");
        int n= scanner.nextInt();
        scanner.close();
        if(n%2==0){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
    }
    
}