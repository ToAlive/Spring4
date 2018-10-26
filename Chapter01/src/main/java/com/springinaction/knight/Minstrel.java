package com.springinaction.knight;

import java.io.PrintStream;

/*
 * AOP应用：吟游诗人
 * */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("探险之前....");
    }

    public void singAfterQuest(){
        stream.println("探险之后....");
    }
}
