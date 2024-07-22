package second;
public class gcd {
    public static int Gcd(int x,int y){
        if(y==0){
            return x;
        }
        else {
            return Gcd(y,x%y);
        }
    }
}
