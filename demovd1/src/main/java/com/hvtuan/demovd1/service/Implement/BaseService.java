package com.hvtuan.demovd1.service.Implement;

import com.hvtuan.demovd1.dto.ChuDeDto;
import com.hvtuan.demovd1.model.BaiViet;
import com.hvtuan.demovd1.service.IBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<TEntity, TDto> implements IBaseService<TEntity, TDto> {
    protected final JpaRepository<TEntity, Long> repository;
    protected final ModelMapper modelMapper;
    protected  BaseService(JpaRepository<TEntity, Long> repository, ModelMapper modelMapper){
        this.repository = repository;
        this.modelMapper = modelMapper;
    }


    @Override
    public TDto add(TDto dto) throws Exception {
        TEntity entityToAdd = (TEntity) modelMapper.map(dto, getEntityClass());
        TEntity savedEntity = repository.save(entityToAdd);
        return modelMapper.map(savedEntity, getDtoClass());
    }

    @Override
    public TDto update(long id, TDto dto) {
        TEntity existingEntity = repository.findById(id).orElse(null);

        if (existingEntity != null && dto != null) {
            modelMapper.map(dto, existingEntity);
            repository.save(existingEntity);
            return modelMapper.map(existingEntity, getDtoClass());
        }

        return null;
    }

    @Override
    public boolean delete(long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Page<TDto> getAll(Pageable pageable) {
        Page<TEntity> tEntityPage = repository.findAll(pageable);
        return tEntityPage.map(entity -> modelMapper.map(entity, getDtoClass()));
    }

    protected abstract Class<TEntity> getEntityClass();

    protected abstract Class<TDto> getDtoClass();

}
