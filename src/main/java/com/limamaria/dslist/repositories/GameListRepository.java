package com.limamaria.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.limamaria.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
