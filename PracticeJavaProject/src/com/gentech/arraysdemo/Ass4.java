package com.gentech.arraysdemo;

public class Ass4 {

	public static void main(String[] args) {
		byte a[] = new byte[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int i = 0;
        do {
            System.out.println(a[i]);
            i++;
        } while (i < a.length);

	}

}
