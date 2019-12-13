package com.festival.msfestival.dao;

import com.festival.msfestival.model.Festival;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestivalDao {
    List<Festival> findAll();
    Festival findById(int id);
    Festival save(Festival festival);
}
