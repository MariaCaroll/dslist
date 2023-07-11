package com.limamaria.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limamaria.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
