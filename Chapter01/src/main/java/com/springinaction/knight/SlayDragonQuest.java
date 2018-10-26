package com.springinaction.knight;

import java.io.PrintStream;
/*探险任务——杀死一条龙*/
public class SlayDragonQuest implements Quest{
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("探险任务——杀死恶龙！");
    }
}
