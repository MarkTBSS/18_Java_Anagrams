//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "HELLO\n" +
                            "hElLo";
        Scanner scanner = new Scanner(mockInput);
        String a = scanner.next();
        String b = scanner.next();
        String lowercaseA = a.toLowerCase();
        String lowercaseB = b.toLowerCase();
        char[] charArrayA = lowercaseA.toCharArray();
        char[] charArrayB = lowercaseB.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        scanner.close();

        String result = "Anagrams";
        if (charArrayA.length == charArrayB.length) {
            for (var i = 0; i < charArrayA.length; i++) {
                if (charArrayA[i] != charArrayB[i]) {
                    result = "Not Anagrams";
                    break;
                }
            }
        } else {
            result = "Not Anagrams";
        }
        System.out.println(result);
    }
}