package com.guochenxu.hm.array;

/**
 * @program: oo-java
 * @description: 数组复制
 * @author: 郭晨旭
 * @create: 2023-04-24 20:09
 * @version: 1.0
 **/
public class CopyArray {

    public static int[] copyArray(int[] arr, int newLength) {
//        return Arrays.copyOf(arr, newLength);
        int[] dest = new int[newLength];
        int len = Math.min(arr.length, newLength);
        for (int i = 0; i < len; ++i) {
            dest[i] = arr[i];
        }
        return dest;
    }

    public static void copyArray(int[] src, int srcPos, int[] dest, int destPos, int length) throws MyException {
//        System.arraycopy(src, 0, dest, 0, length);
        int srcLen = src.length, destLen = dest.length;
        if (srcPos + length >= srcLen || destPos + length >= destLen) {
            throw new MyException("数组越界");
        }
        for (int i = 0; i < length; ++i) {
            dest[destPos + length] = src[srcPos + length];
        }
    }

    public static int[] copyArray(int[] arr, int start, int end) throws MyException {
//        return Arrays.copyOfRange(arr, start, end);
        if (start >= end) {
            throw new MyException("传参错误");
        }
        int len = arr.length;
        if (start < 0 || end > len) {
            throw new MyException("数组越界");
        }
        int[] dest = new int[end - start];
        for (int i = 0; i < end - start; ++i) {
            dest[i] = arr[start + i];
        }
        return dest;
    }
}
