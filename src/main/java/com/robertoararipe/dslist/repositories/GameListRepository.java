package com.robertoararipe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertoararipe.dslist.entities.Game;
import com.robertoararipe.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}  
