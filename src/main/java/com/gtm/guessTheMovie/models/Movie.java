package com.gtm.guessTheMovie.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Actors")

    private String actors;
    @JsonProperty("Genre")

    private String genre;
    @JsonProperty("Released")

    private String releaseDate;
    @JsonProperty("Awards")

    private String keywords;

    @JsonProperty("Plot")

    private String description;
    @JsonProperty("Poster")

    private String image;
    public Movie(String title, String actors,String genre,String releaseDate,
                          String keywords,String description,String image) {
        this.title = title;
        this.actors = actors;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.keywords = keywords;
        this.description = description;
        this.image = image;
    }
    public Movie(){

    };
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
