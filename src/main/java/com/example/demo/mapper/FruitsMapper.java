package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Fruits;

@Mapper
public interface FruitsMapper {
	
	public List<Fruits> selectAll();
}
