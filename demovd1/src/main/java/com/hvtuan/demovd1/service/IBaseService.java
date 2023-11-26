package com.hvtuan.demovd1.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBaseService<TEntity, TDto> {
    public TDto add(TDto tDto);
    public TDto update(long id, TDto tDto);
    public boolean delete(long id);
    public Page<TDto> getAll(Pageable pageable);
}
