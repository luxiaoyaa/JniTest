package com.strong.encrypt.jnitest;

public class JniUtils {
    public static native String getStringC();

    public static native String myEncrypt(String content);

    public static native String myDecrypt(String content);
    public static String encrypt(String key,String plainText) throws Exception{
        return "";
    }
    public static String decrypt(String key,String cryptedText) throws Exception{
        return "";
    }
}
