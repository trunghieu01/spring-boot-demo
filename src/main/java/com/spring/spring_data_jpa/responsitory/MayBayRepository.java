package com.spring.spring_data_jpa.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.spring_data_jpa.entity.MayBay; 
@Repository
public interface MayBayRepository  extends JpaRepository<MayBay, Integer>{
	List<MayBay> findByTamBay(int tamBay);
}
