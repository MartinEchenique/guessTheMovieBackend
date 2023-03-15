package com.gtm.guessTheMovie.dao;

import com.gtm.guessTheMovie.models.Rating;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class RatingDao implements RatingDaoInterface{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Rating getRandom() {
        String queryText = "from Rating ORDER BY RANDOM() LIMIT 1";
        return  (Rating) entityManager.createQuery(queryText).getSingleResult();    }
    @Override
    public Rating getRandom(int maxPositionByNumberOfVotes) {
        String queryText = "from Rating r where r.tconst in (select ra.tconst from Rating ra ORDER BY ra.num_of_votes desc limit :maxPos) ORDER BY RANDOM() LIMIT 1 ";
        Query query = entityManager.createQuery(queryText);
        query.setParameter("maxPos", maxPositionByNumberOfVotes);
        return  (Rating) query.getSingleResult();
    }
    @Override
    public Rating getRandom(int maxPositionByNumberOfVotes, String showType) {

        String queryText = "from Rating r where r.tconst in (select ra.tconst from Rating ra where ra.tconst in (select t.tconst from Title t where t.show_type like :showType) ORDER BY ra.num_of_votes desc limit :maxPos) ORDER BY RANDOM() LIMIT 1 ";
        Query query = entityManager.createQuery(queryText);
        query.setParameter("maxPos", maxPositionByNumberOfVotes);
        query.setParameter("showType", showType);

        return  (Rating) query.getSingleResult();
    }
}
