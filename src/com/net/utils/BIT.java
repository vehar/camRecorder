package com.net.utils;

/**
 * Created by calc on 15.07.14.
 *
 */
public class BIT {
    public static final int _1 = 0x01;
    public static final int _2 = 0x03;
    public static final int _3 = 0x07;
    public static final int _4 = 0x0f;
    public static final int _5 = 0x1f;
    public static final int _6 = 0x3f;
    public static final int _7 = 0x7f;
    public static final int _8 = 0xff;
    public static final int _16 = 0xffff;

    public static final int RFC_P0 = 0x80;
    public static final int RFC_P1 = 0x40;
    public static final int RFC_P2 = 0x20;
    public static final int RFC_P3 = 0x10;
    public static final int RFC_P4 = 0x08;
    public static final int RFC_P5 = 0x04;
    public static final int RFC_P6 = 0x02;
    public static final int RFC_P7 = 0x01;

    public static int makeInt(byte[] b, int start){
        int i = 0;
        i |= ((int)b[start]) & _8;
        i = i << 8;
        i |= ((int)b[start + 1]) & _8;
        i = i << 8;
        i |= ((int)b[start + 2]) & _8;
        i = i << 8;
        i |= ((int)b[start + 3]) & _8;
        return i;
    }

    public static int makeShort(byte[] b, int start){
        int i = 0;
        i |= ((int)b[start]) & _8;
        i = i << 8;
        i |= ((int)b[start + 1]) & _8;
        return i & _16;
    }

    public static void main(String[] args) {
        byte a = 0;
        a = (byte)0xff;
        System.out.println(a);
        System.out.printf("%x", a);
    }
}
