package com.example.demo.dao;

import com.example.demo.bean.MovieInfo;

import java.util.List;

public interface IMovieInfoDao {
    /**
     * 总记录数
     * @return
     */
    long total();

    /**
     * 分页查询
     */
    List<MovieInfo> findByPage(int page ,int rows);


}
