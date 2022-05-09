package models;

public class Cipher {
    public static String startEncryption(String word,Integer cipher){
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Integer stringPosition=0;
        String output = "";

        for(int i = 0;i <word.length();i++){
            int indexOf = alphabet.indexOf(word.charAt(i));
            stringPosition = indexOf +cipher;

            if(stringPosition<26 && indexOf>-1){
                output +=alphabet.charAt(stringPosition);
            }else if(stringPosition>=26 && indexOf>-1){
                output +=alphabet.charAt(stringPosition-26);
            }else if(indexOf ==-1){
                output +=word.charAt(i);
            }

        }

        return output;

    }
}
