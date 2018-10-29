package soundsystem;


import java.util.List;

public class DVDPlayer implements MediaPlayer{

    private String title;
    private CompactDisc cd;
    private List<String> cds;

    public void play() {
        System.out.println(title);
        cd.play();
        for (String s : cds) {
            System.out.println(s);
        }
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCds(List<String> cds) {
        this.cds = cds;
    }
}
