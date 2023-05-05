package de.iav;

public class PalindromCheck {

    public static void main(String[] args) {
        isPalindrome("a");
        //just a comment
    }


    public static boolean isPalindrome(String stringToCheck) {
        if (stringToCheck.equals(" ")) {
            System.out.println("String contains whitespace");
            return true;
        }
        else if (stringToCheck.length() == 1) {
            System.out.println("Length of string: " + stringToCheck.length());
            return true;
        }
        else if (stringToCheck.length() == 2){
            if (stringToCheck.charAt(0) == stringToCheck.charAt(1) ) {
                System.out.println("String contains two consecutive letters");
                return true; }
             else if (stringToCheck.charAt(0) != stringToCheck.charAt(1) ) {
                 System.out.println("String contains two different consecutive letters");
                 return false;
            }
        }
        else if (stringToCheck.charAt(0) == stringToCheck.charAt(1) && stringToCheck.charAt(1) == stringToCheck.charAt(2)) {
            System.out.println("String contains three consecutive letters");
            return true;
        }
        return false;
        }

}
