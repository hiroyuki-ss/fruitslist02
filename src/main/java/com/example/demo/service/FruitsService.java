package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fruits;
import com.example.demo.mapper.FruitsMapper;

@Service
public class FruitsService {

	@Autowired
	private FruitsMapper mapper;

	public List<Fruits> getList() {
		return mapper.selectAll();
	}
}
