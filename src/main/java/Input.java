public class Input {

    public static String encrypt(String plainText, int cipher) {
        if (cipher > 26) {
            cipher = cipher % 26;
        } else if (cipher < 0) {
            cipher = (cipher % 26) + 26;
        }
        String encrypted = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
//                if (Character.isLowerCase(ch)) {
                char x = (char) (ch + cipher);

                if (x > 'z') {
                    encrypted += (char) (ch - (26 - cipher));
                }
                else {
                    encrypted += x;
                }

//            encrypted = encrypted + (char) x;
            }
        }

        return encrypted;
    }

    public static String decrypt(String plainText, int cipher) {
        if (cipher > 26) {
            cipher = cipher % 26;
        } else if (cipher < 0) {
            cipher = (cipher % 26) + 26;
        }
        String encrypted = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
//                if (Character.isLowerCase(ch)) {
                char x = (char) (ch -cipher);

                if (x < 'a') {
                    encrypted += (char) (ch + (26 - cipher));
                }
                else {
                    encrypted += x;
                }

//            encrypted = encrypted + (char) x;
            }
        }

        return encrypted;
    }

//    public static void main(String[] args){
//        String text = "This is Java";
//        String encrypted = encrypt(text,1);
//        System.out.println(encrypted);
//        String decrypted = decrypt(text, 1);
//        System.out.println(decrypted);
//    }
//
//    public static String decrypt(String plainText, int cipher) {
//        String decrypted = " ";
//        for (int i = 0; i < plainText.length(); i++) {
//            int x = Character.toLowerCase(plainText.charAt(i)) + cipher;
//
//            if (x < 'a')
//                x = x + 26;
//
//            decrypted = decrypted + (char) x;
//
//            return decrypted;
//        }
//    }
}