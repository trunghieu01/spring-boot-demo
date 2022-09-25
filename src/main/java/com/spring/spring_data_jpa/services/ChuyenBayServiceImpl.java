package com.spring.spring_data_jpa.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.spring_data_jpa.entity.ChuyenBay;
import com.spring.spring_data_jpa.responsitory.ChuyenBayRepository;

public class ChuyenBayServiceImpl implements ChuyenBayService {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> findAll() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

}
