package first;
public class fact {
    public static int factorial(int i){
        if(i==0 || i==1){
            return 1;
        }
        else{
            return i*factorial(i-1);
        }
    }
}
