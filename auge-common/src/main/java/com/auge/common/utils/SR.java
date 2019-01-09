/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.auge.common.utils;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.swagger.annotations.ApiModel;

/**
 * 返回数据
 * 
 * @author soya
 * @date 2016年10月27日 下午9:59:27
 */
@ApiModel
public class SR<T>{

	public static int CODE_SUCCESS = 0;
	public static int CODE_FAILED = 500;
	public static int CODE_INVALID_USER = 501;

	private int code;
	private String msg;
	private T payload;
	private Pagination page;

	public SR() {
		this.code = CODE_SUCCESS;
		this.msg = "success";
	}
	
	public static SR error() {
		return error(CODE_FAILED, "未知异常，请联系管理员");
	}
	
	public static SR error(String msg) {
		return error(CODE_FAILED, msg);
	}
	
	public static SR error(int code, String msg) {
		SR r = new SR();
		r.setCode(code);
		r.setMsg(msg);
		return r;
	}

	public static SR ok(String msg) {
		SR r = new SR();
		r.setMsg(msg);
		return r;
	}
	
	public static SR ok() {
		return new SR();
	}

	public int getCode() {
		return code;
	}

	public SR setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public SR setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public T getPayload() {
		return payload;
	}

	public SR setPayload(T payload) {
		this.payload = payload;
		return this;
	}

	public Pagination getPage() {
		return page;
	}

	public SR setPage(Pagination page) {
		this.page = page;
		return this;
	}

	public SR setPagePayLoad(Page page) {
		this.payload = (T)page.getRecords();
		this.page = SuppBeanUtils.copy(page, Pagination.class);
		return this;
	}
}
