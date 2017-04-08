package com.mrdheerajpurohit.utility;

import android.text.TextUtils;

import java.util.Random;

/**
 * Dheeraj Purohit RandomUtility for Android.
 */

public final class RandomUtility {

    public static final String NUMBERS = "0123456789";
    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS_AND_LETTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";

    public static String getRandomNumbersAndLetters(int length) {return getRandom(NUMBERS_AND_LETTERS, length);}

    public static String getRandomNumbers(int length) {
        return getRandom(NUMBERS, length);
    }

    public static String getRandomLetters(int length) {
        return getRandom(LETTERS, length);
    }

    public static String getRandomCapitalLetters(int length) {return getRandom(CAPITAL_LETTERS, length);}

    public static String getRandomLowerCaseLetters(int length) {return getRandom(LOWER_CASE_LETTERS, length);}

    public static String getRandom(String source, int length) {return TextUtils.isEmpty(source) ? null : getRandom(source.toCharArray(), length);}

    public static String getRandom(char[] sourceChar, int length)
    {
        if (sourceChar == null || sourceChar.length == 0 || length < 0)
        {return null;}

        StringBuilder str = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            str.append(sourceChar[random.nextInt(sourceChar.length)]);
        }
        return str.toString();
    }

    public static int getRandom(int max) {
        return getRandom(0, max);
    }

    public static int getRandom(int min, int max) {
        if (min > max) {
            return 0;
        }
        if (min == max) {
            return min;
        }
        return min + new Random().nextInt(max - min);
    }

}
