package com.screen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.screen.entity.ETCEo;

@Mapper
public interface ETCMapper {
	public List<ETCEo> listETC(int provinceId);
}
