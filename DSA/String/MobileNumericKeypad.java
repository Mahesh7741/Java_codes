public class MobileNumericKeypad {
    public static void main(String[] args) {
        String input = "GEEKSFORGEEKS";
        String output = convertStringToNumeric(input);
        System.out.println(output);
        boolean checkEqual = (output.equals("4333355777733366677743333557777"));
        System.out.println(checkEqual);
    }

    public static String convertStringToNumeric(String str) {
        String numeric = new String();
        // for(int i=0; i<str.length(); i++){
        // int value = str.charAt(i)-'A';
        // switch (value) {
        // case 0 :
        // numeric +='2';
        // break;
        // case 1 :
        // numeric +="22";
        // break;
        // case 2:
        // numeric +="222";
        // break;
        // case 3:
        // numeric +='3';
        // break;
        // case 4:
        // numeric +="33";
        // break;
        // case 5:
        // numeric +="333";
        // break;
        // case 6:
        // numeric +='4';
        // break;
        // case 7:
        // numeric +="44";
        // break;
        // case 8:
        // numeric +="444";
        // break;
        // case 9:
        // numeric +='5';
        // break;
        // case 10:
        // numeric +="55";
        // break;
        // case 11:
        // numeric +="555";
        // break;
        // case 12:
        // numeric +='6';
        // break;
        // case 13:
        // numeric +="66";
        // break;
        // case 14:
        // numeric +="666";
        // break;
        // case 15:
        // numeric +='7';
        // break;
        // case 16:
        // numeric +="77";
        // break;
        // case 17:
        // numeric +="777";
        // break;
        // case 18:
        // numeric +="7777";
        // break;
        // case 19:
        // numeric +='8';
        // break;
        // case 20:
        // numeric +="88";
        // break;
        // case 21:
        // numeric +="888";
        // break;
        // case 22:
        // numeric +='9';
        // break;
        // case 23:
        // numeric +="99";
        // break;
        // case 24:
        // numeric +="999";
        // break;
        // case 25:
        // numeric +="9999";
        // break;
        // default:
        // break;
        // }
        // }
        String numericArr[] = { "2", "22", "222", "3", "33", "333", "4",
                "44", "444", "5", "55", "555", "6", "66",
                "666", "7", "77", "777", "7777", "8", "88",
                "888", "9", "99", "999", "9999" };
         for (char c : str.toCharArray()) {
            int value= c-'A';
            numeric +=numericArr[value];
         }
        return numeric;
    }

}
