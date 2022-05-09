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
    public void cipher_testShiftZtoA(){
        String expectedOutput = "Z";
        String actualOutput = new Cipher().startEncryption("Z",1);
        assertEquals(expectedOutput,actualOutput);
    }
}
