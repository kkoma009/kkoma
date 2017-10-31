/**
 * 
 */
package com.example.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kkoma
 *
 */

@Controller
public class TestController {
	
	@RequestMapping(value="list.do")
	public String printString(Model model) {
		return "list";
	}
}
