package com.spring.spring_data_jpa.responsitory;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.spring_data_jpa.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	List<ChuyenBay> findByGaden(String gaden);

	@Query(value = "SELECT * FROM chuyenbay  WHERE DoDai > ?1 and DoDai < ?2", nativeQuery = true)
	List<ChuyenBay> findByDuongbay(int dbay1, int dbay2);

	@Query(value = "SELECT * FROM chuyenbay  WHERE GaDi = ?1 and GaDen = ?2", nativeQuery = true)
	List<ChuyenBay> findBySG_BMT(String gadi, String daden);

	@Query(value = "SELECT COUNT(*) FROM chuyenbay where GaDi = ?1", nativeQuery = true)
	int countChuyenBay(String gadi);
}
