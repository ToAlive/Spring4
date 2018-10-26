package com.springinaction.knight;
/*
 * 骑士
 */
public class BraveKnight implements Knight{
    private Quest quest;
    /*
     * 管理他的吟游诗人真的是骑士职责范围内的工作吗？在我看来，吟游诗人应该做他分内的事，
     * 根本不需要骑士命令他这么做。毕竟，用诗歌记载骑士的探险事迹，这是吟游诗人的职责。
     * 为什么骑士还需要提醒吟游诗人去做他分内的事情呢？
     * 此外，因为骑士需要知道吟游诗人，所以把吟游诗人注入到BraveKnight类中。这不仅使
     * BraveKnight的代码复杂化，而且还让我疑惑是否还需要一个，不需要吟游诗人的骑士呢？
     * 如果Minstrel为null会发生什么呢？我是否应该引入一个空值校验逻辑来覆盖该场景？
     * 简单的BraveKnight类开始变得复杂，如果你还需要应对没有吟游诗人时的场景，那代码
     * 会变得更复杂。
     * 但利用AOP，你可以声明吟游诗人必须歌颂骑士的探险事迹，而骑士本身并不用直接访问Minstrel
     * 的方法。
     * 要将Minstrel抽象为一个切面，你所需要做的事情就是在一个Spring配置文件中声明它。
     */
    //private Minstrel minstrel;

    //Quest被注入进来
    //public BraveKnight(Quest quest,Minstrel minstrel) {
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        //minstrel.singBeforeQuest();
        quest.embark();
        //minstrel.singAfterQuest();
    }
}

