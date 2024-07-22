public class binaryadd {
    public static void main(String[] args) {
        String b1="100";
        String b2="111";
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2,2);
        int sum=n1+n2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Result: "+result);
    }
}
