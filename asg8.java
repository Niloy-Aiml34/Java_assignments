public class asg8 {
    public static void main(String[] args) {
        String str1="y";
        String str2="";
        if(str1.length()==0 && str2.length()==0){
            System.out.println("##");
        }
        else if(str1.length()==0){
            System.out.println("#"+str2.charAt(str2.length()-1));
        }
        else if(str2.length()==0){
            System.out.println(str1.charAt(0)+"#");
        }
        else{
            System.out.println(str1.charAt(0)+""+str2.charAt(str2.length()-1));
        }
    }
}
