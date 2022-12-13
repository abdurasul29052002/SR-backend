package com.example.silkroadsystem.service.template;

import com.example.silkroadsystem.mapper.template.GenericMapper;
import com.example.silkroadsystem.model.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public abstract class GenericService<E, M, R extends JpaRepository<E, Long>, MAPPER extends GenericMapper<E, M>> {

    protected final R repository;

    protected final MAPPER mapper;

    public M save(M model){
        E savedEntity = repository.save(mapper.modelToEntity(model));
        return mapper.entityToModel(savedEntity);
    }

    public M update(M model, Long id){
        E entity = repository.findById(id).orElseThrow();
        mapper.updateEntityFromModel(entity,model);
        E savedEntity = repository.save(entity);
        return mapper.entityToModel(savedEntity);
    }

    public M findById(Long id){
        E entity = repository.findById(id).orElseThrow();
        return mapper.entityToModel(entity);
    }

    public List<M> findAll(){
        return mapper.entitiesToModels(repository.findAll());
    }

    public ApiResponse deleteById(Long id){
        try{
            repository.deleteById(id);
            return new ApiResponse("Deleted", true, null);
        }catch (Exception e){
            return new ApiResponse("Something error", false, null);
        }
    }
}
