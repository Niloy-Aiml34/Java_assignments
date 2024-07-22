interface polygon {
    int getArea(int len,int bd );
}
class rectangle implements polygon{
    public int getArea(int len,int bd){
        return len*bd;
    }
}
public class intrface{
    public static void main(String[] args) {
        rectangle x = new rectangle();
        System.out.println("Area: "+x.getArea(5,6));
    }
}
