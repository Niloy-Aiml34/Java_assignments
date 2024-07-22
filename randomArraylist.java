import java.util.ArrayList;
import java.util.Collections;

public class randomArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=0;i<10;i++){
            int rand = (int)((Math.random())*100);
            aList.add(rand);
        }
        System.out.println("Before Sorting: "+aList);
        Collections.sort(aList);
        System.out.println("After Sorting: "+aList);
                
    }
}
