public class array{
    public static void main(String arg[]){
        // int [] num={1,2,3};
        // System.out.println(num[2]);
        // String name[]={"Mahesh", "Rajesh","Pankaj","Ujjwal"};
        // System.out.println(name[2]);
        // char symbol[]={'a','b','c','d','e','f'};
        // System.out.println(symbol[2]);

        //2nd method
        int num[]=new int[10];
        // System.out.println(num); 
        for(int i=0;i<num.length;i++){
            num[i]=i;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}