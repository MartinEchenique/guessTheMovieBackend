package com.gtm.guessTheMovie.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gtm.guessTheMovie.dao.MovieDao;
import com.gtm.guessTheMovie.dao.RatingDao;
import com.gtm.guessTheMovie.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MovieController {
    private MovieDao movieDAO = new MovieDao();
    @Autowired
    private RatingDao ratingDAO;
    @CrossOrigin("*")
    @RequestMapping(value = "/random+title")
    public Movie randomTitle() {
        String tconst = ratingDAO.getRandom(100, "movie").getTconst();
        String JSONMovie = movieDAO.getMovieByTconst(tconst);
        ObjectMapper om = new ObjectMapper();
        try {
            return om.readValue(JSONMovie, Movie.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}