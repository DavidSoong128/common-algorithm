package com.horizon.algorithm;

/**
 * @author : DavidSoong
 * @company : www.1289.com
 * @department : JAVA工程师
 * @date : 2015年6月3日 下午8:58:13
 * @see
 * @since : 1.0.0
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
