package com.simple.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.simple.dao.PersonDAO;
import com.simple.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	private PersonDAO dao;

	@Override
	public List<Map<String, Object>> personList(Map<String, Object> params) throws Exception {
		return dao.personList(params);
	}

}
