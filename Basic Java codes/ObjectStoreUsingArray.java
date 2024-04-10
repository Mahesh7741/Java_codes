
class Student{
    int id;
    String name;
    boolean Regular;
}

public class ObjectStoreUsingArray {
    public static void main(String args[]){
        Student s1=new Student();
        s1.id=43;
        s1.name="Mahesh";
        s1.Regular=true;
        Student s2=new Student();
        s2.id=19;
        s2.name="Ujjwal";
        s2.Regular=true;
        Student s3=new Student();
        s3.id=56;
        s3.name="Rajesh";
        s3.Regular=true;

        Student data[]=new Student[3];
        data[0]=s1;
        data[1]=s2;
        data[2]=s3;

        // print data

        for(int i=0;i<data.length;i++) {
            System.out.println(data[i].id+ "  "+data[i].name+ " "+data[i].Regular);
        }
    }
}
