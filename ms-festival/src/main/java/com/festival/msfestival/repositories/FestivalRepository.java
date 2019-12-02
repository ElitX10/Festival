package com.festival.msfestival.repositories;

import com.festival.msfestival.model.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long> {
    List<Festival> findAll();

    Festival findById(int id);

    Festival save(Festival festival);
}
