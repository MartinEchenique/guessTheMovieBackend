package com.gtm.guessTheMovie.controllers;

import com.gtm.guessTheMovie.dao.TitleDao;
import com.gtm.guessTheMovie.models.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TitleController {
    @Autowired
    private TitleDao titleDao;
    @CrossOrigin("*")
    @RequestMapping(value = "/search_by_title")
    public List<Title> getByTitle(@RequestParam(value="text", defaultValue = "") String text){
        return titleDao.searchByTitle(text);
    }
}
