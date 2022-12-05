package com.java.core.Strings;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * The String class represents character strings
 * Strings are constant; their values cannot be changed after they are created.
 * Because String objects are immutable they can be shared.
 *
 * String buffers support mutable strings
 * String uses memory pool when we created string using below
 * String s1 = "rahul"
 * String s2 = "rahul" 
 * s1 and s2 are equal
 * String s3 = new "rahul", this will not go into pool
 * s1 == s3 are not equal
 */

@Slf4j
public class StringsExample {

    // String para = new String("String buffers support mutable strings");
    String para = "String buffers support mutable strings";

    public static void main(String[] args) {
        StringsExample strings = new StringsExample();

        strings.charAt(0);

        strings.codePointAt(0);

        strings.compareTo();

        strings.concat("!");

        strings.contains("support");

        strings.contentEquals();

        strings.endsWith();

        strings.equals();

        strings.format();

        strings.indexOf("support");

        strings.join();

        strings.repeat();

        strings.replace();

        strings.split();
    }

    // Returns the char value at the specified index.
    public void charAt(int index) {
        log.info(String.valueOf(para.charAt(index)));
    }

    // Returns the character (Unicode code point) at the specified index.
    // codePointBefore(int index): Returns the character (Unicode code point) before the specified index.
    public void codePointAt(int index) {
        log.info(String.valueOf(para.codePointAt(index)));
    }

    // Compares two strings lexicographically.
    // compareToIgnoreCase(String str): Compares two strings lexicographically, ignoring case differences.
    public void compareTo() {
        log.info(String.valueOf("rahul".compareTo("rahul")));
        log.info(String.valueOf("rahul".compareTo("rahul1")));
        log.info(String.valueOf("rahul".compareTo("rahu")));
    }

    // Concatenates the specified string to the end of this string.
    public void concat(String atEnd) {
        log.info(para.concat(atEnd));
    }

    // Returns true if and only if this string contains the specified sequence of char values.
    public void contains(String str) {
        log.info(String.valueOf(para.contains(str)));
    }

    // Compares this string to the specified CharSequence.
    // contentEquals(CharSequence cs) & contentEquals(StringBuffer sb)
    public void contentEquals() {
        log.info(String.valueOf("rahul".contentEquals("rahul")));
        log.info(String.valueOf("rahul".contentEquals("rahul1")));
        log.info(String.valueOf("rahul".contentEquals("rahu")));
    }

    // Tests if this string ends with the specified suffix.
    public void endsWith() {
        log.info(String.valueOf("rahul".endsWith("l")));
        log.info(String.valueOf("rahul".endsWith("e")));
    }

    // Compares this string to the specified object.
    // equalsIgnoreCase(String anotherString): Compares this String to another String, ignoring case considerations.
    public void equals() {
        log.info(String.valueOf("rahul".equals("rahul")));
        log.info(String.valueOf("rahul".equals("e")));
    }

    // Returns a formatted string using the specified format string and arguments.
    public void format() {
        log.info(String.valueOf(String.format("rahul %s", "choudhary")));
    }

    // Returns the index within this string of the first occurrence of the specified character.
    // indexOf(String str, int fromIndex): Returns the index within this string of the first occurrence
    // of the specified substring, starting at the specified index.
    // lastIndexOf(String str): Returns the index within this string of the last occurrence of the specified substring.
    // lastIndexOf(String str, int fromIndex): Returns the index within this string of the last occurrence
    // of the specified substring, searching backward starting at the specified index.
    public void indexOf(String str) {
        log.info(String.valueOf(para.indexOf(str)));
    }

    // isBlank(): Returns true if the string is empty or contains only white space codepoints, otherwise false.
    // isEmpty(): Returns true if, and only if, length() is 0.
    // length(): Returns the length of this string.
    // matches(String regex): Tells whether or not this string matches the given regular expression

    // Returns a new String composed of copies of the CharSequence elements joined together with a
    // copy of the specified delimiter.
    public void join() {
        log.info(String.join(" ", "Hi", "Rahul"));
    }

    // Returns a string whose value is the concatenation of this string repeated count times.
    public void repeat() {
        log.info("rahul".repeat(2));
    }

    // Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
    // replaceAll(String regex, String replacement)
    // replaceFirst(String regex, String replacement)
    public void replace() {
        log.info("rahul".replace('a', 'j'));
    }

    // split(String regex): Splits this string around matches of the given regular expression.
    // split(String regex, int limit)
    public void split() {
        String[] s = para.split(" ");
        log.info(Arrays.toString(s));
    }

    // startsWith(String prefix): Tests if this string starts with the specified prefix.
    // startsWith(String prefix, int toffset): Tests if the substring of this string beginning
    // at the specified index starts with the specified prefix.

    // strip(): Returns a string whose value is this string, with all leading and trailing white space removed.
    // stripLeading(): Returns a string whose value is this string, with all leading white space removed.
    // stripTrailing((): Returns a string whose value is this string, with all trailing white space removed.
    // trim(): Returns a string whose value is this string, with all leading and trailing space removed

    // subSequence(int beginIndex, int endIndex): Returns a character sequence that is a subsequence of this sequence.

    // substring(int beginIndex): Returns a string that is a substring of this string.
    // substring(int beginIndex, int endIndex): Returns a string that is a substring of this string.

    // toCharArray(): Converts this string to a new character array.

    // toLowerCase(): Converts all of the characters in this String to lower case using the rules of the default locale.
    // toUpperCase(): Converts all of the characters in this String to upper case using the rules of the default locale.

    // valueOf(int i): Returns the string representation of the int argument.
    // valueOf(boolean b), valueOf(char c), valueOf(char[] data), valueOf(char[] data, int offset, int count)
    // valueOf(double d), valueOf(float f), valueOf(int i), valueOf(long l), valueOf(Object obj)
}
