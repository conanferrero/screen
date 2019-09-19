package com.psbc.screen.services.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psbc.screen.entity.ETCEo;
import com.psbc.screen.mapper.ETCMapper;
import com.psbc.screen.services.ETCServices;
import com.psbc.screen.vo.ETCVo;

@Service
public class ETCServicesImpl implements ETCServices {
	
	@Autowired
	private ETCMapper etcMapper;

	@Override
	public ETCVo listETC(int id) {
		List<ETCEo> etcEos = etcMapper.listETC(id);
		
		int total = 0;
		String provinceName="";
		HashMap<String, Integer> monthVolume = new HashMap<String, Integer>();
		ETCVo vo = new ETCVo();
		
		for(ETCEo eo : etcEos) {
			provinceName = eo.getBracnhName();
			total = total + eo.getVolume();
			monthVolume.put(eo.getMonth(), Integer.valueOf(eo.getVolume()));
		}
		
		vo.setProvice(provinceName);
		vo.setTotal(total);
		vo.setMonthlVolume(monthVolume);
		
		return vo;
		
	}

}
