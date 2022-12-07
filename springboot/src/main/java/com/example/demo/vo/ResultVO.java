package com.example.demo.vo;

import org.springframework.data.domain.Sort;

import java.util.Objects;

/**
 * 返回值对象
 */
public class ResultVO {
    private Integer code;
    private String msg;
    private Object data;

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof ResultVO)) {return false;}
        ResultVO resultVO = (ResultVO) o;
        return getCode().equals(resultVO.getCode()) && getMsg().equals(resultVO.getMsg()) && getData().equals(resultVO.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getMsg(), getData());
    }

    public ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO() {
        super();
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }
}
