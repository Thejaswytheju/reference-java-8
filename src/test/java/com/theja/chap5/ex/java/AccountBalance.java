package com.theja.chap5.ex.java;

public class AccountBalance {
    public static void main(String args[]){
        Balance current[] = new Balance[3];

        current[0] = new Balance("theja",124);
        current[1] = new Balance("varshi",12);
        current[2] = new Balance("chintu",130);
        for (int i = 0;i< 3;i++)
        current[i].show();

    }
}
