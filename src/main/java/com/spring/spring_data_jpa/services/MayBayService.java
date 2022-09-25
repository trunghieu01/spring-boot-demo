package com.spring.spring_data_jpa.services;

import java.util.List;
import com.spring.spring_data_jpa.entity.MayBay;

public interface MayBayService {
	public  List<MayBay> findByTamBay(int tamBay);
	public List<MayBay> findAll();
}