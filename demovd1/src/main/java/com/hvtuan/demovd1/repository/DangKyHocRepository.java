package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.DangKyHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DangKyHocRepository extends JpaRepository<DangKyHoc,Long> {
}
