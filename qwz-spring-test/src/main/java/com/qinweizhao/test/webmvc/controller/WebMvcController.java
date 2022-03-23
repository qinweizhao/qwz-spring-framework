package com.qinweizhao.test.webmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qinweizhao
 * @since 2022/3/23
 */
@RestController
public class WebMvcController {

		@RequestMapping("/hello")
		public String sayHello(HttpServletRequest request, HttpServletResponse response) {
			return "Hello World";
		}
}
