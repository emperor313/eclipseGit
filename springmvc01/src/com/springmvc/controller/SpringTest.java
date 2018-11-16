package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springmvc")
@Controller
public class SpringTest {
	public static String SUCCESS = "success";
	
	@RequestMapping("/testPathVariable/{name}")
	public String testPathVariable(@PathVariable("name") Object haha) {
		System.out.println("testPathVariable:" + haha);
		return SUCCESS;
	}
	
	
	 @RequestMapping(value="/requestParamTest", method = RequestMethod.GET)
	    public String requestParamTest(@RequestParam(value="username") String xie, @RequestParam(value="usernick") String hao){
	        System.out.println("requestParam Test");
	        System.out.println("username: " + xie);
	        System.out.println("usernick: " + hao);
	        return SUCCESS;
	    }
	 
	 @RequestMapping("/testRequestHeader")
		public String testRequestHeader(
				@RequestHeader(value = "Accept-Language") String al) {
			System.out.println("testRequestHeader, Accept-Language: " + al);
			return SUCCESS;
		}

	
	 
	/**
	 * 1.*没有数量限制
	 * 2.?只有一个字符
	 * 3.**
	 * @return
	 */
	
//	@RequestMapping(value="testAntPath/*/abc")
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
	
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	@RequestMapping(value="testParamAndHeaders", params= {"username", "age!=11"})
	public String testParamAndHeaders() {
	
		System.out.println("testParamAndHeaders");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMethod", method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testGetMethod", method=RequestMethod.GET)
	public String testGetMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

}
