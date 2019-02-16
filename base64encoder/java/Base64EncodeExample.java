import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

class Base64EncodeExample {

    private static String base64Encode(String value) {
        try {
            return Base64.getEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private static String base64EncodeWithoutPadding(String value) {
        try {
            return Base64.getEncoder()
                        .withoutPadding()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String base64UrlEncode(String value) {
        try {
            return Base64.getUrlEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
        
    public static void main(String[] args) {
        System.out.println("Enter a value to Encode or type exit to quit: ");
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(base64Encode(input));
        }

        keyboard.close();
    }
}