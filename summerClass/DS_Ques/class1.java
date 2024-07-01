package summerClass.DS_Ques;

public class class1 {
    static void equalToI(int a[]){
        for(int i = 0; i < a.length; i++){
            if(a[i]==i){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    static void equalToInfinity(int a[]){
        //Infinity denotes by default values
        
    }
    static void equalToNumber(int a[],int k){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i==j){
                    continue;
                }
                else{
                    if(a[i]+a[j]==k){
                        System.out.println("a:"+a[i]+"\t"+"b:"+a[j]);
                    }
                }
            }
        }
    }
    static void greaterThanNumber(int a[],int k){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j <a.length; j++){
                if(i==j){
                    continue;
                }
                else{
                    if(a[i]+a[j]>k){
                        System.out.println("a:"+a[i]+"\t"+"b:"+a[j]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6};
        equalToI(a);
        System.out.println(".................................");
        equalToNumber(a, 8);
        System.out.println(".................................");
        greaterThanNumber(a, 9);
    }
}
