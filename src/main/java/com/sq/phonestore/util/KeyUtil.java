package com.sq.phonestore.util;

import java.util.Random;

/**
 * @author SunQiao
 * @create 2021-05-16 15:14
 */
public class KeyUtil {
    public static synchronized String createUniqueKey(){
        Random random = new Random();
        Integer key = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(key);
    }
}
