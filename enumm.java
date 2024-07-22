enum weekends{
    Saturday,Sunday;
}
public class enumm {
    
    public static void main(String[] args) {
        weekends v[]= weekends.values();
        for(weekends i:v){
            System.out.println("Day:"+(i.ordinal()+1)+" of weekend is "+i);
        }
    }
}
