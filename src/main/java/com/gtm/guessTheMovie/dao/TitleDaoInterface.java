package com.gtm.guessTheMovie.dao;

import com.gtm.guessTheMovie.models.Title;

import java.util.List;

public interface TitleDaoInterface {
    List<Title> searchByTitle(String searchText);
}
