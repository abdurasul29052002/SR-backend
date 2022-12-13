package com.example.silkroadsystem.controller.template;

import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.ApiResponse;
import com.example.silkroadsystem.service.template.GenericService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericController<E, M, R extends JpaRepository<E, Long>, MAPPER extends GenericMapper<E, M>, S extends GenericService<E, M, R, MAPPER>> {

    protected S service;

    @PostMapping
    public M add(@RequestBody M model){
        return service.save(model);
    }

    @GetMapping("/{id}")
    public M getOneById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<M> getAll(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public M updateById(@RequestBody M model, @PathVariable Long id){
        return service.update(model, id);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
}
