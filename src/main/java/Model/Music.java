package Model;

import lombok.Getter;

public class Music {
    @Getter private Integer musicid;
    @Getter private String musicname;
    @Getter private String musicartist;
    @Getter private String musicimg;

    public Music(Integer musicid, String musicname, String musicartist, String musicimg){
        super();
        this.musicid = musicid;
        this.musicname = musicname;
        this.musicartist = musicartist;
        this.musicimg = musicimg;
    }
}
