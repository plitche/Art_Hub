package com.artHub.sample;

 // import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Mapper
@Mapper
public interface SampleDAO {

    List<String> findUsers();

}
