package models;

public class Cipher {
    public static String startEncryption(String word,Integer cipher){
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Integer stringPosition=0;
        String output = "";

        for(int i = 0;i <word.length();i++){
            stringPosition = alphabet.indexOf(word.charAt(i))+cipher;

            if(stringPosition<26){
                output +=alphabet.charAt(stringPosition);
            }else if(stringPosition>=26){
                output +=alphabet.charAt(stringPosition-26);
            }

        }

        return output;

    }
}
