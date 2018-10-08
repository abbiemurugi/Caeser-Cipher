//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Input i = new Input();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = myScanner.nextLine();
        System.out.println("Enter Key");
        String key = myScanner.nextLine();
        int keyInput = Integer.parseInt(key);

//        int encrypt = key.encrypt(sentence, key);
        String encrypt = Input.encrypt(sentence,keyInput);
        String decrypt = Input.decrypt(sentence,keyInput);

        System.out.println("Choose A to Encrypt\nEnter B to Decrypt");

        String userInput = myScanner.nextLine();
       String input =  userInput.toLowerCase();

        if (input.equals("a")) {

            System.out.println(encrypt);
        }
        else if(input.equals("b")){
            System.out.println(decrypt);
        }
        else {
            System.out.println("Invalid choice");
        }



    }
}



















