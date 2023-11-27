package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.TinhTrangHocDto;
import com.hvtuan.demovd1.model.TinhTrangHoc;
import com.hvtuan.demovd1.repository.TinhTrangHocRepository;
import com.hvtuan.demovd1.service.ITinhTrangHocService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TinhTrangHocService extends BaseService<TinhTrangHoc, TinhTrangHocDto > implements ITinhTrangHocService {
    @Autowired
    public TinhTrangHocService(TinhTrangHocRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }
    @Override
    protected Class<TinhTrangHoc> getEntityClass() {
        return TinhTrangHoc.class;
    }

    @Override
    protected Class<TinhTrangHocDto> getDtoClass() {
        return TinhTrangHocDto.class;
    }


    @Override
    public Optional<TinhTrangHocDto> findByTenTinhTrang(String tenTinhTrang) {
        Optional<Optional<TinhTrangHoc>> tinhTrangHocOptional = Optional.ofNullable(((TinhTrangHocRepository) repository).findByTenTinhTrang(tenTinhTrang));

        return tinhTrangHocOptional.map(tinhTrangHoc -> modelMapper.map(tinhTrangHoc, TinhTrangHocDto.class));

    }

}
