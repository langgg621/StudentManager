package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.model.ChuDe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuDeRepository extends JpaRepository<ChuDe, Long> {
    Page<ChuDe> findAllByLoaiBaiVietId(long loaiBaiVietId, Pageable pageable);
}
