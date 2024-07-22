import java.util.Scanner;
public class sumofdigit {
    public static int calculate(int num){
        if(num<10){
            return num;
        }
        else{
            int ld=num%10;
            int r=num/10;
            return ld+ calculate(r);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter An Integer: ");
        int num= sc.nextInt();
        sc.close();
        int sum = calculate(num);
        System.out.println("Sum of Digits: "+sum);
    }
}
