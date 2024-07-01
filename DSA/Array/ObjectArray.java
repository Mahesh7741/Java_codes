package DSA.Array;

class Student{
    public String name;
    public Integer rollNo;
    Student(String name, Integer rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class ObjectArray {
    
    public static void main(String[] args) {
        Student []arr = new Student[3];
        arr[0] = new Student("MAHESH", 43);
        arr[1] = new Student("RAJESH", 56);
        arr[2] = new Student("SHUBHAM",47);
        for(Student student : arr) {
            System.out.println(student.name+" "+student.rollNo);
        }
    }
}
