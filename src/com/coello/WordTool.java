package com.coello;

public class WordTool {
    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String myString = "The river carried the memories from her childhood.";

        System.out.println("Analyzing text:\n" + myString);

        int wc = wt.wordCount(myString);
        System.out.println("Total words: " + wc);

        System.out.println("characters (with spaces): " + wt.symbolCount(myString, true));
        System.out.println("characters (without spaces): " + wt.symbolCount(myString, false));

        char letter = 'e';
        System.out.println("Total count of letter " + letter + ": " + wt.symbolFrequency(myString, letter));
    }

    public int symbolFrequency(String s, char letter) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                count++;
        }

        return count;
    }

    public int symbolCount(String s, boolean withSpaces) {
        if (s == null || s.isEmpty())
            return 0;

        if (!withSpaces)
            s = s.replace(" ", "");

        return s.length();
    }

    public int wordCount(String s) {
        if (s == null || s.isEmpty())
            return 0;

        String[] words = s.split("\\s+");
//        System.out.println("words:");

//        for (String word : words)
//            System.out.println(word);

        return words.length;
    }
}
