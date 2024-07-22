class calculate{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        calculate caal = new calculate();
        int sumint = caal.sum(4,5);
        float sumflt = caal.sum(4.5f, 5f);
        System.out.println("Sum of int "+sumint+" Sum of float "+sumflt);
    }
}
