package com.theja.chap6.ex.java;

import static com.theja.chap6.ex.java.AskMe.answer;

public class SharedConstantsTest {
    public static void main(String args[]){
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
