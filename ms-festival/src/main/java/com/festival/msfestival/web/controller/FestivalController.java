package com.festival.msfestival.web.controller;

import com.festival.msfestival.dao.FestivalDao;
import com.festival.msfestival.model.Festival;
import com.festival.msfestival.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FestivalController {

//    @Autowired
//    private FestivalDao festivalDao;

    @Autowired
    private FestivalRepository festivalRepository;

    @GetMapping(value = "festivals")
    public List<Festival> listFestivals(){
        return festivalRepository.findAll();
    }

    @GetMapping(value = "festival/{id}")
    public Festival getFestival(@PathVariable int id){
        return festivalRepository.findById(id);
    }


}
