
public class TypeCastingAndConversion {
    public static void main(String[] args){
        // byte b=125;
        // int a=45612;
        // b=a; // not possible
        // a=b; // is possible this type conversion
        // Type casting
        // b=(byte)a;
        // System.out.println(b);
        // float k=10.25f;
        // int l=(int)k;
        // System.out.println(l);

        // special case of byte casting
        int num=257;
        byte b = (byte)num;
        System.out.println(b);

        // type propotion 

        byte x=30;
        byte y=20;

        int result=x*y; 
        System.out.println(result);
    }
}