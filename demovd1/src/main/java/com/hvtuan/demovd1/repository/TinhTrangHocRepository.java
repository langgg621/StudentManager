package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.TinhTrangHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TinhTrangHocRepository extends JpaRepository<TinhTrangHoc,Long> {
    Optional<TinhTrangHoc> findByTenTinhTrang(String tenTinhTrang);
}
