package com.hvtuan.demovd1.repository;

import com.hvtuan.demovd1.model.HocVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HocVienRepository extends JpaRepository<HocVien,Long> {
    Page<HocVien> findAllByHoten(Pageable pageable,String hoTen);
    Page<HocVien> findAllByEmail(Pageable pageable,String email);

}
