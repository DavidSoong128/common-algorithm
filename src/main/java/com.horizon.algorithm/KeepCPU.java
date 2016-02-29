package com.horizon.algorithm;

/**
 * @author : DavidSoong
 */
public class KeepCPU {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            for (i = 0; i < 288000000; i++)
                ;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
