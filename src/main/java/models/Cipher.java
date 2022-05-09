package models;

public class Cipher {
    public static String startEncryption(String word,Integer cipher){
        String originalMessage = word;
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String output = null;
        int newCharacterPosition;


        for(int i = 1;i <= originalMessage.length();i++){

            newCharacterPosition = alphabet.indexOf(originalMessage.charAt(i))+cipher;
            output += alphabet.charAt(newCharacterPosition);

        }

        return output;

    }
}
