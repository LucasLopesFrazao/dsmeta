package com.lucaslopesfrazao.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaslopesfrazao.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}