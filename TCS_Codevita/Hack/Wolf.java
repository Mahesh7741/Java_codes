import java.util.*;
import java.util.*;
import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Wolf{
	
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Provided encoded data and custom alphabet
        String encodedData = "HxQLGgECCgMCFRsCCgcRGxkHFAMVDQkLChMBFg4VDgMVAQseHgMUHAUHChMXEAQcAQ8FAAQI";
        char[] alphabet = {'k', 'E', '4', 'W', 'G', 'C', 'Z', 'r', '}', 'q', 'P', 'B', '0', 'e', 'd', 'F', 'i', 'Q', 'g', 'x', '2', '7', 'N', 'm', 'V', 'j', 'l', 'o', 'b', '3', '9', 's', '{', 't', 'a', 'K', 'U', 'p', 'O', '8', '5', 'Y', 'D', '6', 'J', 'u', 'f', 'X', 'v', 'n', 'I', 'R', 'T', 'z', 'y', 'M', 'L', 'S', 'A', 'w', '1', 'h', 'c', 'H'};
        
        // Step 1: Base64 decode the input data
        byte[] decodedBytes = Base64.getDecoder().decode(encodedData);
        
        // Step 2: Convert bytes to binary string
        StringBuilder binaryString = new StringBuilder();
        for (byte b : decodedBytes) {
            binaryString.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }
        
        // Step 3: Break the binary string into 5-bit chunks
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i += 5) {
            if (i + 5 <= binaryString.length()) {
                chunks.add(binaryString.substring(i, i + 5));
            }
        }
        
        // Step 4: Convert 5-bit binary chunks to decimal values
        StringBuilder decodedMessage = new StringBuilder();
        for (String chunk : chunks) {
            int decimalValue = Integer.parseInt(chunk, 2);
            if (decimalValue < alphabet.length) {
                decodedMessage.append(alphabet[decimalValue]);
            }
        }
        
        // Step 5: Compute SHA-1 hash of the decoded message
        String hashedMessage = sha1Hash(decodedMessage.toString());
        
        // Output the decoded message and its hash
        System.out.println("Decoded Message: " + decodedMessage);
        System.out.println("SHA1 Hash: " + hashedMessage);
        
        // Final flag format
        String flag = "HQ9{" + hashedMessage + "}";
        System.out.println("Flag: " + flag);
    }
    
    // Function to compute SHA-1 hash
    public static String sha1Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] result = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : result) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}