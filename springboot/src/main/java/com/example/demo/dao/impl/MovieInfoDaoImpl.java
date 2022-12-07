package com.example.demo.dao.impl;

import com.example.demo.bean.MovieInfo;
import com.example.demo.dao.IMovieInfoDao;
import com.sun.corba.se.impl.orb.ParserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author longchun
 */
@Repository
public class MovieInfoDaoImpl implements IMovieInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public long total() {
        return mongoTemplate.count(new Query(),MovieInfo.class);
    }

    /**
     * 分页查询
     * @param page
     * @param rows
     * @return
     */

    @Override
    public List<MovieInfo> findByPage(int page, int rows) {
        Pageable pageable= PageRequest.of(page-1,rows, Sort.by(Sort.Order.desc("mscore")));

        return mongoTemplate.find(new Query().with(pageable),MovieInfo.class);
    }
}
