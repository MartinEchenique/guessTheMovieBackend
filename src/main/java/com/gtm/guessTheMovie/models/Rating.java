package com.gtm.guessTheMovie.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

    @Id
    @Column(name="tconst")
    private String tconst;
    @Column(name="average")

    private float average;
    @Column(name="num_of_votes")

    private long num_of_votes;

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public long getNum_of_votes() {
        return num_of_votes;
    }

    public void setNum_of_votes(long num_of_votes) {
        this.num_of_votes = num_of_votes;
    }
}
