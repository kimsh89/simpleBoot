package com.simple.service;

import java.util.List;
import java.util.Map;

public interface PersonService {

	public List<Map<String, Object>> personList(Map<String, Object> params) throws Exception;
}
