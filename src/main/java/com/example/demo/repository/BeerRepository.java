package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

	
}
