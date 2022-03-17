package com.vimo.vimodemo01.controller;

import com.vimo.vimodemo01.domain.tb_examination;
import com.vimo.vimodemo01.mapper.ExaminationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/a")
public class AController {

    @Autowired
    private ExaminationMapper examinationMapper;

    @RequestMapping("/queryex")
    public List<tb_examination> queryex(){
        List<tb_examination> tb_examinations = examinationMapper.query();
        return tb_examinations;
    }

}
