package com.example.demo.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author longchun
 */
@Document("movieInfo")
public class MovieInfo implements Serializable {
    @Id
    private String id;

    private String mname;
    private String mpic;
    private String murl;
    private String mintro;
    private String mscore;

    public MovieInfo(String id, String mname, String mpic, String murl, String mintro, String mscore) {
        this.id = id;
        this.mname = mname;
        this.mpic = mpic;
        this.murl = murl;
        this.mintro = mintro;
        this.mscore = mscore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpic() {
        return mpic;
    }

    public void setMpic(String mpic) {
        this.mpic = mpic;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public String getMintro() {
        return mintro;
    }

    public void setMintro(String mintro) {
        this.mintro = mintro;
    }

    public String getMscore() {
        return mscore;
    }

    public void setMscore(String mscore) {
        this.mscore = mscore;
    }
}
