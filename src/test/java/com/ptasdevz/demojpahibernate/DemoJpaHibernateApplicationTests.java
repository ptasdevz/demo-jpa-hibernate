package com.ptasdevz.demojpahibernate;

import com.ptasdevz.demojpahibernate.entites.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoJpaHibernateApplication.class)
public class DemoJpaHibernateApplicationTests {

    @Autowired
    FileService repo;


    @Test
    public void DemoJpaHibernateApplicationTestsInsert() {
        File file = new File();
        file.setContent("some content");
        file.setName("file1");
        repo.save(file);
    }
    @Test
    public void DemoJpaHibernateApplicationTestsInsertThenUpdate() {
        File file = new File();
        file.setContent("some content");
        file.setName("file1");
        repo.save(file);

        file.setContent("updated content");
        repo.save(file);
    }

    @Test
    public void DemoJpaHibernateApplicationTestsInsertThenUpdateThenRemove() {
        File file = new File();
        file.setContent("some content");
        file.setName("file1");
        repo.save(file);

        file.setContent("updated content");
        repo.save(file);

        //repo.delete(file);
    }

}
