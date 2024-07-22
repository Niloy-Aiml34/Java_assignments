public class hexadecimal {
    public static void main(String[] args) {
        int d = 30;
        System.out.println("Decimal: "+d);
        System.out.println("Hexadecimal of this Decimal: ");
        if(d==0){
            System.out.println();
        }
        else{
            StringBuilder hex= new StringBuilder();
            char hexnum[]= "0123456789ABCDEF".toCharArray();
            while(d!=0){
                int rem = d%16;
                hex.insert(0, hexnum[rem]);
                d=d/16;
            }
            System.out.println(hex.toString());
        }
        
    }
}
