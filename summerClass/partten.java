package summerClass;

class partten {
    public static void main(String[] args) {
        int n=3;
        if(n==0){
            System.out.println("**+**");
        }
        else{
            for(int i=n;i>0;i--){
                System.out.println("****++****");
            }
            System.out.println("  **A**   ");
            for(int i=n;i>0;i--){
                System.out.println("****++****");
            }
        }
    }
}
