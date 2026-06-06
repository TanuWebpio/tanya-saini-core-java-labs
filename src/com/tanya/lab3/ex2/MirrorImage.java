package com.tanya.lab3.ex2;

public class MirrorImage {
	public String getImage(String str) {
        StringBuffer sb = new StringBuffer(str);
        String mirror = sb.reverse().toString();

        return str + "|" + mirror;
    }

    public static void main(String[] args) {
        MirrorImage obj = new MirrorImage();

        String result = obj.getImage("EARTH");
        System.out.println(result);
    }
}
