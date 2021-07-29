package com.xiaohansong.kvstore.utils;

import org.slf4j.Logger;

/**
 * 公共日志处理类，在一般大型项目中，针对打日志都会做一定的封装
 * 比如：支持可以支持动态改日志级别等能力
 */
public class LoggerUtil {

    public static void debug(Logger logger, String format, Object... arguments) {
        if (logger.isDebugEnabled()) {
            logger.debug(format, arguments);
        }
    }

    public static void info(Logger logger, String format, Object... arguments) {
        if (logger.isInfoEnabled()) {
            logger.info(format, arguments);

        }
    }

    public static void error(Logger logger, Throwable t, String format, Object... arguments) {
        if (logger.isErrorEnabled()) {
            logger.error(format, arguments, t);
        }
    }
}
