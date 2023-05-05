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
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
        assertTrue(isPalindrome);
    }
    @Test
    void checkPalindorm_whenStringContainsOneLetter_shouldReturnTrue() {
        //given
        String StringToCheck = "a";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
        assertTrue(isPalindrome);
    }
    @Test
    void checkPalindorm_whenStringContainsConsecutiveLetters_shouldReturnTrue() {
        //given
        String StringToCheck = "AA";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
        assertTrue(isPalindrome);
    }
    @Test
    void checkPalindorm_whenStringContainsDifferentConsecutiveLetters_shouldReturnFalse() {
        //given
        String StringToCheck = "ab";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
    }
    @Test
    void checkPalindorm_whenStringContainsThreeConsecutiveLetters_shouldReturnTrue() {
        //given
        String StringToCheck = "AAA";
        //when
        boolean isPalindrome = PalindromCheck.isPalindrome(StringToCheck);
        //then
    }

    }