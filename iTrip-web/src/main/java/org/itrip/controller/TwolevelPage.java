package org.itrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwolevelPage {
	@RequestMapping("accommodation")
	public String accommodation() {
		return "accommodation";
	}

}
