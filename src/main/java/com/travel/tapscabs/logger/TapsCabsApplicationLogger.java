package com.travel.tapscabs.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @implNote A custom logging class overriding functionality of slf4j logging.
 * @author Sanyog Varshney
 * @version 1.0
 */
public class TapsCabsApplicationLogger {

    private static final Logger LOG = LoggerFactory.getLogger(TapsCabsApplicationLogger.class);

    /**
     *
     * @return isDebugEnabled
     */
    public boolean isDebugEnabled() {
        return LOG.isDebugEnabled();
    }

    /**
     *
     * @param className
     * @param methodName
     * @param msg
     */
    public void debug(String className, String methodName, String msg) {
        LOG.debug("CLASSNAME : {}, METHODNAME : {}, {}", className, methodName, msg);
    }

    /**
     *
     * @return isInfoEnabled
     */
    public boolean isInfoEnabled() {
        return LOG.isInfoEnabled();
    }

    /**
     *
     * @param className
     * @param methodName
     * @param msg
     */
    public void info(String className, String methodName, String msg) {
        LOG.info("CLASSNAME : {}, METHODNAME : {}, {}", className, methodName, msg);
    }

    /**
     *
     * @return isTraceEnabled
     */
    public boolean isTraceEnabled() {
        return LOG.isTraceEnabled();
    }

    /**
     *
     * @param className
     * @param methodName
     * @param msg
     */
    public void trace(String className, String methodName, String msg) {
        LOG.trace("CLASSNAME : {}, METHODNAME : {}, {}", className, methodName, msg);
    }

    /**
     *
     * @return isErrorEnabled
     */
    public boolean isErrorEnabled() {
        return LOG.isErrorEnabled();
    }

    /**
     *
     * @param msg
     * @param t
     */
    public void error(String msg, Throwable t) {
        LOG.error(msg, t);
    }
}
