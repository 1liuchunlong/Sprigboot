package com.example.demo.controller;

import com.example.demo.bean.MovieInfo;
import com.example.demo.dao.IMovieInfoDao;
import com.example.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {
    @Autowired
    private IMovieInfoDao movieInfoDao;

    @GetMapping("/total")
    public ResultVO total(){
        long result=movieInfoDao.total();
        if(result>0){
            return new ResultVO(200,"成功",result);
        }
        if(result==0){
            return new ResultVO(600,"暂无数据");
        }
        return new ResultVO(500,"错误");
    }
    @PostMapping ("/finds")
    public ResultVO finds(Integer page,Integer rows){
        List<MovieInfo> list=movieInfoDao.findByPage(page,rows);
        if(list!=null&& !list.isEmpty()){
            return new ResultVO(200,"成功",list);
        }
            return new ResultVO(600,"暂无数据");
    }
}
