package com.psbc.screen.services;

import com.psbc.screen.vo.ETCVo;

public interface ETCServices {
	
	// 根据省份，得到月份办理量统计信息
	public ETCVo listETC(int id);
}
