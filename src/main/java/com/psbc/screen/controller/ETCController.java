package com.psbc.screen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psbc.screen.services.ETCServices;
import com.psbc.screen.vo.ETCVo;

@RestController
@RequestMapping(value = "/api/screen")
public class ETCController {
	@Autowired
	private ETCServices etcServices;
	
	@RequestMapping(value="/etcs", method=RequestMethod.GET)
	public ETCVo infos(@RequestParam int id) {
		return etcServices.listETC(id);
	}

}
