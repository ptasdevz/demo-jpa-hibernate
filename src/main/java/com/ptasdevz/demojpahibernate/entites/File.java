package com.ptasdevz.demojpahibernate.entites;

import com.ptasdevz.demojpahibernate.FileEntityListener;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@EntityListeners(FileEntityListener.class)
public class File extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String content;

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
