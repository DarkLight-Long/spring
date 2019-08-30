package cn.zz.framework.jdbc.exception;

import cn.zz.framework.jdbc.exception.base.JdbcException;

/**
 * @Author zenghzong
 * @Since 2019/8/28
 * @Version 1.0
 */
public class FormatParamsException extends JdbcException {
    public FormatParamsException() {
        super();
    }

    public FormatParamsException(String msg) {
        super(msg);
    }

    public FormatParamsException(String msg, Exception e) {
        super(msg, e);
    }
}
 