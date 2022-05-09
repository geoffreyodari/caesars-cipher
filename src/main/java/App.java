import models.Cipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App{
  public static void main (String[] args) throws IOException {
      System.out.println("Welcome to Caesars Cipher");
      System.out.println("Please enter word or sentence for Encryption.");
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String inputString = input.readLine();
      System.out.println("Please enter the cipher digit 1-23.");
      BufferedReader inputNumberString = new BufferedReader(new InputStreamReader(System.in));

      Integer inputInteger = Integer.parseInt(inputNumberString.readLine());
      Cipher outputObject = new Cipher(inputString,inputInteger);
      String output = outputObject.getEncryption();

      System.out.println("Your encrypted message is.");
      System.out.println(output );

  }

}
