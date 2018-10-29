package soundsystem;

import java.util.List;

public class Discography implements CompactDisc{
    private String artist;
    private List<CompactDisc> cds;

    public Discography(String artist,List<CompactDisc> cds) {
        this.artist = artist;
        this.cds = cds;
    }

    public void play() {
        System.out.println("Playing  by " + artist);
        for(CompactDisc cd : cds){
            System.out.println("Track: "+ cd);
        }
    }
}
