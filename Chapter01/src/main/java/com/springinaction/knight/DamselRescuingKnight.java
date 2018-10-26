package com.springinaction.knight;

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        //与RescueDamselQuest紧耦合
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
