package com.ex.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ex.demo.Model.Project;

public interface ProjectRepository extends CrudRepository<Project,Long>{
   
    @Override
    List<Project> findAll();
}
