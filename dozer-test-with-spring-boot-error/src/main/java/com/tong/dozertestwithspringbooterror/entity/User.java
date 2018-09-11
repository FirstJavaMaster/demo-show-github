package com.tong.dozertestwithspringbooterror.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // if change next line to `@ManyToOne`, dozer works!
    // @ManyToOne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corporation_id", nullable = false)
    @NotFound
    private Corporation corporation;

    private String userName;
}
