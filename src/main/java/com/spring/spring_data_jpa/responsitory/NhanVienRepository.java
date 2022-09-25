package com.spring.spring_data_jpa.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.spring.spring_data_jpa.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	@Query(value = "SELECT * FROM nhanvien  WHERE Luong < ?1", nativeQuery = true)
    List<NhanVien> findByLuong(int luong);
	
	@Query(value = "SELECT sum(Luong) FROM nhanvien", nativeQuery = true)
	double sumLuong();
}
