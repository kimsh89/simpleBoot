package com.simple.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDAO {

	public List<Map<String, Object>> personList(Map<String, Object> params) throws Exception;
}
