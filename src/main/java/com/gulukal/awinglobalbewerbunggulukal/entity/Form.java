package com.gulukal.awinglobalbewerbunggulukal.entity;

import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter

@Entity
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String file;
    private String firstname;
    private String lastname;
    private String email;
    private String jobtitle;
    private String source;
}