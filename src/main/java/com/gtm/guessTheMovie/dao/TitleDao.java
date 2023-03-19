package com.gtm.guessTheMovie.dao;

import com.gtm.guessTheMovie.models.Title;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class TitleDao implements TitleDaoInterface{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Title> searchByTitle(String searchText) {
        String queryText = "from Title t where t.title like :searchText";
        Query query = entityManager.createQuery(queryText);
        query.setParameter("searchText", "%" + searchText + "%");
        return query.getResultList();
    }
}
