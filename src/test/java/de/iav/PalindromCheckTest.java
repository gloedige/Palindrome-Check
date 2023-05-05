package de.iav;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromCheckTest {

    @Test
    // Testnamen: 
    //when ... unter welcher Bedingung
    //should ... was sollte passieren.
    void checkPalindorm_whenStringIsWhiteSpace_shouldReturnTrue() {
        //given
        String StringToCheck = " ";
        boolean expected = true;
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
        assertTrue(isPalindrome);
    }
}