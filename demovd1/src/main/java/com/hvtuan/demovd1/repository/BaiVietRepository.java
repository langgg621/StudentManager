package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.BaiViet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet, Long> {
    Page<BaiViet> findByTenBaiViet(String tenBaiViet, Pageable pageable);
}
