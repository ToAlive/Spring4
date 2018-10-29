package soundsystem;

public class SgtPeppers implements CompactDisc{
    private String title = "Sgt.Pepper's Lonely Hearts Club SgtPeppers";
    private String artist = "The SgtPeppers";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
