package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Ranking;


@Repository
public interface RankingRepository extends JpaRepository<Ranking, Integer> {

	List<Ranking> findAllSort(String nivel);

	List<Ranking> findByNivelOrderByPontuacaoDesc(String nivel);


}
