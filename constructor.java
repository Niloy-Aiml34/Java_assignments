class circle{
    double r;
    public circle(){
        r=1;
    }
    // public double getR() {
    //     return r;
    // }
    // public void setR(double r) {
    //     this.r = r;
    // }
    public circle(int rad){
        this.r = rad;
    }
    public void getArea(){
        double area= Math.PI*Math.pow(r, 2);
        System.out.println("Radius: "+r);
        System.out.println("Area: "+area);
        
    }
}
public class constructor {
    public static void main(String[] args) {
        circle c1= new circle(2);
        circle c2= new circle(12);
        circle c3= new circle(24);
        circle c4 = new circle();
        c1.getArea();
        c2.getArea();
        c3.getArea();
        c4.getArea();

    }
}
