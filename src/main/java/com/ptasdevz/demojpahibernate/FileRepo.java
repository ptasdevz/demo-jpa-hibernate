package com.ptasdevz.demojpahibernate;

import com.ptasdevz.demojpahibernate.entites.File;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
@Qualifier("parent")
public interface FileRepo extends CrudRepository<File,Integer> {

}
