public class wraapperclass {
    public static void main(String[] args) {
        Integer obj1 = 8;
        Double obj2 = 3.14;
        Character obj3 = 'A';

        int objint = obj1.intValue();
        double objdb= obj2.doubleValue();
        char objchar= obj3.charValue();
        System.out.println("Int = "+objint);
        System.out.println("Double = "+objdb);
        System.out.println("Charecter = "+objchar);
    }
}
