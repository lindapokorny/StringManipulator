package com.pursuit.junitappfromscratch;

public class StringManipulator {
    private static StringManipulator instance;

    public static StringManipulator getInstance() {
        if (instance == null) {
            instance = new StringManipulator();
        }
        return instance;
    }

    public static boolean isLessThan10(String input) {
        if (input.length() < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddLength(String input) {
        if (input.length() % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static String zipperWords(String first, String second) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                result.append((char) (first.charAt(i)));
                result.append((char) (second.charAt(j)));
            }
        }

        return String.valueOf(result);
    }

    public static String deconstructedWord(String word) {
        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' ||
                    word.charAt(i) == 'I' ||
                    word.charAt(i) == 'O' ||
                    word.charAt(i) == 'U') {
                word1.append(word.charAt(i));
            } else {
                if (word.charAt(i) != 'A' ||
                        word.charAt(i) != 'E' ||
                        word.charAt(i) != 'I' ||
                        word.charAt(i) != 'O' ||
                        word.charAt(i) != 'U') {
                    word2.append(word.charAt(i));
                }
            }

        }


        return word2.toString() + " " + word1.toString();
    }

    public static int wordSum(String first, String second) {
        int first1 = first.length();
        int second1 = second.length();
        return first1 + second1;
    }


  /*  public static String longestWord(String[] words){
        for (int i = 0; i < longestWord(words).length() ; i++) {
            if (longestWord(words[i])){
                return
        }

}*/
  public static String[] wordSort(String[] words){

      return words;
  }

}