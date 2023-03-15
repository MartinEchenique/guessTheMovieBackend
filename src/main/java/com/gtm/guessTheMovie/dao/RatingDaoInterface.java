package com.gtm.guessTheMovie.dao;

import com.gtm.guessTheMovie.models.Rating;

public interface RatingDaoInterface {
    Rating getRandom();
    Rating getRandom(int maxPositionByNumberOfVotes);
    Rating getRandom(int maxPositionByNumberOfVotes, String showType);

}
