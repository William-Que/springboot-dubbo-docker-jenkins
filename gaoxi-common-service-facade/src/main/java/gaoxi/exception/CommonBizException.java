package gaoxi.exception;

import java.io.Serializable;

public class CommonBizException extends RuntimeException implements Serializable {

    private ExpCodeEnum codeEnum;

    public CommonBizException(ExpCodeEnum codeEnum){
        super();
        this.codeEnum =codeEnum;
    }

    public CommonBizException(String loginFinal){}

    public ExpCodeEnum getCodeEnum(){
        return codeEnum;
    }

}
