package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.dto.TaiKhoanDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.ChuDe;
import com.hvtuan.demovd1.model.TaiKhoan;
import com.hvtuan.demovd1.repository.ChuDeRepository;
import com.hvtuan.demovd1.repository.TaiKhoanRepository;
import com.hvtuan.demovd1.service.ITaiKhoanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TaiKhoanService extends BaseService<TaiKhoan,TaiKhoanDto> implements ITaiKhoanService {
    @Autowired
    public TaiKhoanService(TaiKhoanRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }



    @Override
    protected Class<TaiKhoan> getEntityClass() {
        return TaiKhoan.class;
    }

    @Override
    protected Class<TaiKhoanDto> getDtoClass() {
        return TaiKhoanDto.class;
    }


    @Override
    public Page<TaiKhoanDto> findAllByTaiKhoan(String taiKhoan, Pageable pageable) {
        Page<TaiKhoan> taiKhoanPage = ((TaiKhoanRepository) repository).findAllByTaiKhoan(taiKhoan, pageable);
        return taiKhoanPage.map(taiKhoan1 -> modelMapper.map(taiKhoan1, TaiKhoanDto.class));
    }

}
