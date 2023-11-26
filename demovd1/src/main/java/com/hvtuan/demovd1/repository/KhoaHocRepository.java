package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.HocVien;
import com.hvtuan.demovd1.model.KhoaHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc,Long> {
    Page<KhoaHoc> findByTenKhoaHocContaining(String tenKhoaHoc, Pageable pageable);

    // Phân trang dữ liệu
    Page<KhoaHoc> findAll(Pageable pageable);
}
