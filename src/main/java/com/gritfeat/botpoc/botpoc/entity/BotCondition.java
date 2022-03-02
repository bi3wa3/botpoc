package com.gritfeat.botpoc.botpoc.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "BotCondition_table")
public class BotCondition {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "\"condition\"")
    private String condition;
    private String timeFrame;
    private boolean deleted;

    //    Auditing Attributes
    @CreatedDate
    private Date createDate;
    @LastModifiedDate
    private Date modifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;
}
