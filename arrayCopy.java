public class arrayCopy {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print("original array: {");
        for(int i:arr){
            System.err.print(i+" ");
        }
        System.out.println("}");
        System.out.println();
        System.out.print("copy array: {");
        int arr2[]= new int[arr.length];
        for(int i=0;i<5;i++){
            arr2[i]=arr[i];
            System.err.print(arr2[i]+" ");
        }
        System.out.println("}");
    }
}
