package soundsystem;

public class Revolver implements CompactDisc{
    private String title = "Revolver.Pepper's Lonely Hearts Club Band";
    private String artist = "The Revolver";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
