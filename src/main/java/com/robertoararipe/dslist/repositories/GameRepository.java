package com.robertoararipe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertoararipe.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}  
