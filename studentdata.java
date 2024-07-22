import java.util.ArrayList;

class student{
    int rollno;
    String name;
    int age;
    public student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "ROll No: "+rollno+" Name: "+name+" Age: "+age;
    }
    
}
public class studentdata {
    public static void main(String[] args) {
        ArrayList<student> students= new ArrayList<>();
        students.add(new student(1, "Jack", 19));
        students.add(new student(2, "Sam", 20));
        for(student s1:students){
            System.out.println(s1);
        }
        System.out.println(students);
    }
}
