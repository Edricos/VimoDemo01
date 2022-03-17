package com.vimo.vimodemo01.mapper;

import com.vimo.vimodemo01.domain.tb_examination;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExaminationMapper {

    List<tb_examination> query();
}
