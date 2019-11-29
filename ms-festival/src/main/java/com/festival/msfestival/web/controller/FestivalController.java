package com.festival.msfestival.web.controller;

import com.festival.msfestival.dao.FestivalDao;
import com.festival.msfestival.model.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FestivalController {

    @Autowired
    private FestivalDao festivalDao;

    @GetMapping(value = "festivals")
    public List<Festival> listFestivals(){
        return festivalDao.findAll();
    }

    @GetMapping(value = "festival/{id}")
    public Festival getFestival(@PathVariable int id){
        return festivalDao.findById(id);
    }


}
