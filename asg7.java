public class asg7 {
    public static void main(String[] args) {
        String str1="1";
        String op="";
        if(str1.length()<3){
            for(int i=0;i<3-str1.length();i++){
                op+="#";
            }
            System.out.println("Output: "+str1+""+op);
        }
        else{
            System.out.println("Output: "+str1);
        }
    }
}
