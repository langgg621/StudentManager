package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.QuyenHanDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.model.QuyenHan;
import com.hvtuan.demovd1.repository.QuyenHanRepository;
import com.hvtuan.demovd1.service.IQuyenHanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuyenHanService extends BaseService<QuyenHan, QuyenHanDto> implements IQuyenHanService {
    @Autowired
    public QuyenHanService(QuyenHanRepository repository, ModelMapper modelMapper){
        super(repository,modelMapper);
    }
    @Override
    protected Class<QuyenHan> getEntityClass() {
        return QuyenHan.class;
    }

    @Override
    protected Class<QuyenHanDto> getDtoClass() {
        return QuyenHanDto.class;
    }
}
