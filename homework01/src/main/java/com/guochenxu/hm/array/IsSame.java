package com.guochenxu.hm.array;

/**
 * @program: oo-java
 * @description: 判断两个数组是否相同
 * @author: 郭晨旭
 * @create: 2023-04-24 21:13
 * @version: 1.0
 **/
public class IsSame {
    public static boolean isSame(int[] a, int[] b) {
        if (a.length != b.length){
            return false;
        }
        for (int i = 0; i < a.length; ++i){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
