package cn.medemede.cdpserver.dto;

import lombok.Data;

/**
 * @author xcp
 */
@Data
public class Result {
    private Integer code;
    private String msg;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }
}
