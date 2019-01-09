package com.auge.common;

import com.auge.common.exception.RRException;
import com.auge.common.utils.SR;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2016-10-27
 */
@RestControllerAdvice
public class AugeExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(RRException.class)
	public SR handleRRException(RRException e){
		SR r = new SR();
		r.setCode(e.getCode()).setMsg(e.getMessage());

		return r;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public SR handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return SR.error("数据库中已存在该记录");
	}

	@ExceptionHandler(Exception.class)
	public SR handleException(Exception e){
		logger.error(e.getMessage(), e);
		return SR.error();
	}
}
