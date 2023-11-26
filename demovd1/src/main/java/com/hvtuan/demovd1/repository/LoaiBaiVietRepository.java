package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.LoaiBaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiBaiVietRepository extends JpaRepository<LoaiBaiViet,Long> {
}
