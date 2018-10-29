package soundsystem;

public class HardDaysNight implements CompactDisc{
    private String title = "HardDaysNight.Pepper's Lonely Hearts Club Band";
    private String artist = "The HardDaysNight";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}