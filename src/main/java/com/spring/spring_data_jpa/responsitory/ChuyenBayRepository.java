package com.spring.spring_data_jpa.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.spring_data_jpa.entity.ChuyenBay;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
        List<ChuyenBay> findByGaden(String gaden);
}
