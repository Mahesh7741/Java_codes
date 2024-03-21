public class stringBasic {
    public static void main(String arg[]){

        //String name="Mahesh";// this not best way to initialize a string data structure 
        // more efficient than below method because his check whether this variable is present in string pool or not 

        // String name=new String("Mahesh");
        //this method is not more efficient than above method becuase of this create multiple instances of string without checking the string pool
        
        String name=new String();
        name="Mahesh";
        System.out.println(name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(0));
        // for(char c:name.toCharArray()){
        //     System.out.print(c);
        // }

        // concat give string 

        // String lastName="Savant";
        // System.out.println(name.concat(" "+lastName));

        // find string length
        // System.out.println(name.length());

        //Substring 
        // System.out.println(name.substring(0));
        // System.out.println(name.substring(0,3));

        System.out.println(name.indexOf("M"));
        
    }
}
