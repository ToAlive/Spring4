package soundsystem;

public class WhiteAlbum implements CompactDisc{
    private String title = "WhiteAlbum.Pepper's Lonely Hearts Club Band";
    private String artist = "The WhiteAlbum";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
