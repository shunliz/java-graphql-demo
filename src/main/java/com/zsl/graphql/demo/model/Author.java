package com.zsl.graphql.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Author extends BaseEntity {

    @Column(columnDefinition = "varchar(50)")
    private String firstName;

    @Column(columnDefinition = "varchar(50)")
    private String lastName;
}
