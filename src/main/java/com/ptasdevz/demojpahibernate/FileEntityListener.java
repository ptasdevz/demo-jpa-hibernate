package com.ptasdevz.demojpahibernate;

import com.ptasdevz.demojpahibernate.entites.Action;
import com.ptasdevz.demojpahibernate.entites.File;
import com.ptasdevz.demojpahibernate.entites.FileHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import javax.transaction.Transactional;

public class FileEntityListener {
    Logger LOGGER = LoggerFactory.getLogger(FileEntityListener.class);

    @PrePersist
    public void prePersist(File file){
        LOGGER.info("{}", "just before insert");
    }
    @PreUpdate
    public void preUpdate(File file){
        LOGGER.info("{}", "just before update");
    }
    @PreRemove
    public void preRemove(File file){
        LOGGER.info("{}", "just before removal");
    }
    @PostPersist
    public void postPersist(File file){
        perform(file,Action.INSERTED);
        LOGGER.info("{}", "just after insert");
    }
//    @PostRemove
//    public void postRemove(File file){
//        perform(file,Action.DELETED);
//        LOGGER.info("{}", "just after remove");
//    }
    @PostUpdate
    public void postUpdate(File file){
        perform(file,Action.UPDATED);
        LOGGER.info("{}", "just after update");
    }
    @Transactional(Transactional.TxType.MANDATORY)
    void perform(File file, Action action){
        EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new FileHistory(file,action));
    }

}
