package com.ptasdevz.demojpahibernate.entites;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class FileHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "file_id", foreignKey = @ForeignKey( name = "FK_file_history_file"))
    private File file;

    private String fileContent;

    @CreatedBy
    private String  modifiedBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @Enumerated(EnumType.STRING)
    private Action action;

    public FileHistory() {
    }

    public FileHistory(File file, Action action){
        this.action = action;
        this.fileContent = file.toString();
        this.file = file;
    }
}
