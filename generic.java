public class generic {
    @SuppressWarnings("hiding")
    public static <Integer,String> void display(Integer T,String U){
        System.out.println("Data1: "+T);
        System.out.println("Data2: "+U);
    }
    public static void main(String[] args) {
        int i =50;
        String s ="hello world";
        display(i, s);
    }
}
