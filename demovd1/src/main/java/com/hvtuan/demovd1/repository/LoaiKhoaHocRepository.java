package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.LoaiKhoaHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiKhoaHocRepository extends JpaRepository<LoaiKhoaHoc,Long> {
}
