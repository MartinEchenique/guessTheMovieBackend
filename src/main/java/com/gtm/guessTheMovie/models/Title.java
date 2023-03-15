package com.gtm.guessTheMovie.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="title")
public class Title {
    @Id
    @Column(name = "tconst")
    private String tconst;
    @Column(name = "title")

    private String title;
    @Column(name = "is_adult")

    private boolean is_adult;
    @Column(name = "show_type")

    private String show_type;
    @Column(name = "release_year")

    private int release_year;
    @Column(name = "end_year")

    private int end_year;

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIs_adult() {
        return is_adult;
    }

    public void setIs_adult(boolean is_adult) {
        this.is_adult = is_adult;
    }

    public String getShow_type() {
        return show_type;
    }

    public void setShow_type(String show_type) {
        this.show_type = show_type;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getEnd_year() {
        return end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    @Override
    public String toString() {
        return "Title{" +
                "tconst='" + tconst + '\'' +
                ", title='" + title + '\'' +
                ", is_adult=" + is_adult +
                ", show_type='" + show_type + '\'' +
                ", release_year=" + release_year +
                ", end_year=" + end_year +
                '}';
    }
}
