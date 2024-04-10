
class computer{
    public void playMusic(){
        System.out.println("playing..");
    }
    public String getMePan(){
        return "Pan";
    }

}
public class objectCreatePractice{
    public static void main(String arg[]){
        computer com=new computer();
        com.playMusic();
        System.out.println(com.getMePan());
    }
}