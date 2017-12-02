package com.theja.chap16.ex.java.com.thread4.java;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String args[]) {
        Exchanger<String> exgr = new Exchanger<String>();

        new UseString(exgr);
        new MakeString(exgr);
    }
}
