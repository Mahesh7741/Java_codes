class student{
    int id;
    String name;
    boolean Regular;
}


public class forEachLoop{
    public static void main(String arg[]){
        student s1=new student();
        s1.id=43;
        s1.name="Mahesh";
        s1.Regular=true;
        student s2=new student();
        s2.id=19;
        s2.name="ujjwal";
        s2.Regular=true;
        student s3=new student();
        s3.id=56;
        s3.name="Rajesh";
        s3.Regular=true;
        student data[]=new student[3];
        data[0]=s1;
        data[1]=s2;
        data[2]=s3;
        System.out.println("ID"+" |"+"Name"+"   |"+"Regular ");
        // for(int i=0;i<data.length;i++){
        //     System.out.println(data[i].id+" |"+data[i].name+" |"+data[i].Regular);
        // }
        for(student n:data){
            System.out.println(n.id+" |"+n.name+" |"+n.Regular);
        }
    }
}