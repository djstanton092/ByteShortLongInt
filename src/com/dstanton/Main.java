package com.dstanton;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        System.out.println("myMaxIntTest = " +myMaxIntTest);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;

        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue /2);


        byte challengeByte = (byte) 127;
        short challengeShort = (short) 32767;
        int challengeInt = 2147483547;

        long challengeLong = (long)(50000 + ((long) (10 * ((long)(challengeByte) + (long)(challengeShort) + (long)(challengeInt)))));

        System.out.println("challengeByte = " + challengeByte);
        System.out.println("challengeShort = " + challengeShort);
        System.out.println("challengeInt = " + challengeInt);

        System.out.println("Challenge Long = " + challengeLong);
    }
}
