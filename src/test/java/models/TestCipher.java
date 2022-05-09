package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCipher {
    @Test
    public void cipher_testShiftAtoB(){
        String expectedOutput = "B";
        String actualOutput = new Cipher().startEncryption("A",1);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void cipher_testShiftZtoA_1(){
        String expectedOutput = "A";
        String actualOutput = new Cipher().startEncryption("Z",1);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void cipher_testShiftZtoB_2(){
        String expectedOutput = "B";
        String actualOutput = new Cipher().startEncryption("Z",2);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void cipher_IgnoreNonAlphabetCharacters(){
        String expectedOutput = "NZ OBNF JT...";
        String actualOutput = new Cipher().startEncryption("MY NAME IS...",1);
        assertEquals(expectedOutput,actualOutput);
    }
}
