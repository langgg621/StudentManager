package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.QuyenHan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenHanRepository extends JpaRepository<QuyenHan,Long> {
}
