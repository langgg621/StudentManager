package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.DangKyHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DangKyHocRepository extends JpaRepository<DangKyHoc,Long> {
}
