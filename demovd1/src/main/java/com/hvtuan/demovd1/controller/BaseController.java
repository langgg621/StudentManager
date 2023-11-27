package com.hvtuan.demovd1.controller;

import com.hvtuan.demovd1.service.IBaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class BaseController<TEnity, TDto>  {
    private  final IBaseService<TEnity, TDto> baseService;
    public BaseController(IBaseService<TEnity, TDto> baseService){
        this.baseService=baseService;
    }
    @PostMapping("/add")
    public ResponseEntity<TDto> add(@RequestBody TDto tDto) throws Exception {
        TDto addDto = baseService.add(tDto);
        return new ResponseEntity<>(addDto, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<TDto> update(@PathVariable long ID, @RequestBody TDto tDto){
        TDto updateDto = baseService.update(ID,tDto);
        if (updateDto !=null){
            return  new ResponseEntity<>(updateDto, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        boolean isDelete = baseService.delete(id);
        if (isDelete){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/get-all/paged")
    public ResponseEntity<Page<TDto>> getAll(Pageable pageable){
        Page<TDto> dtoPage = baseService.getAll((pageable));
        return new ResponseEntity<>(dtoPage,HttpStatus.OK);
    }
}
