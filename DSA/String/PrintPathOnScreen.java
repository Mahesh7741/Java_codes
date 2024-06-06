public class PrintPathOnScreen {
    public static void main(String[] args) {
        String input="COZY";
        printPathOnScreen(input);
    }
    public static void printPathOnScreen(String str){
        int cx=0;
        int cy=0;
        int i=0;
        while(i<str.length()){
            int nx=(str.charAt(i)-'A')/5;
            int ny=(str.charAt(i)-'A'+1)%5;
            while(cx>nx){
                System.out.println("Move Up");
                cx--;
            }
            while(cy>ny){
                System.out.println("Move Left");
                cy--;
            }
            while(cx<nx){
                System.out.println("Move Down");
                cx++;
            }
            while(cy<ny){
                System.out.println("Move Right");
                cy++;
            }
            System.out.println("Press Ok");
            i++;
        }
    }
}
