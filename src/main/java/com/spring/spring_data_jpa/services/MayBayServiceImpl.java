package com.spring.spring_data_jpa.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.spring_data_jpa.entity.MayBay;
import com.spring.spring_data_jpa.responsitory.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService {

	@Autowired
    private MayBayRepository maybayRepository;


	@Override
	@Transactional
	public List<MayBay> findByTamBay(int tamBay) {
		// TODO Auto-generated method stub
		return maybayRepository.findByTambay(tamBay);
	}


	@Override
	@Transactional
	public List<MayBay> findAll() {
		// TODO Auto-generated method stub
		return maybayRepository.findAll();
	}


}