package com.artHub.sample;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleDAO {

    List<String> findUsers();

}
