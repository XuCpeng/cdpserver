package cn.medemede.cdpserver.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xcp
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class ResultWithData<T> extends Result {

    /**
     * 数据
     */
    private T data;

    public ResultWithData(Integer code, String msg, T data) {
        super(code, msg);
        this.data = data;
    }

    public ResultWithData(ResultEnum resultEnum, T data) {
        super(resultEnum);
        this.data = data;
    }
}
