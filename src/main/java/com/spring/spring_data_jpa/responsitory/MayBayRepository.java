package com.spring.spring_data_jpa.responsitory;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.spring.spring_data_jpa.entity.MayBay;

public interface MayBayRepository  extends JpaRepository<MayBay, Integer>{
	@Query(value = "SELECT * FROM maybay  WHERE TamBay > ?1", nativeQuery = true)
    List<MayBay> findByTambay(int TamBay);
	
	@Query(value = "SELECT count(*) FROM maybay  WHERE Loai > ?1", nativeQuery = true)
	int countLoaiMB(String loai);
}
