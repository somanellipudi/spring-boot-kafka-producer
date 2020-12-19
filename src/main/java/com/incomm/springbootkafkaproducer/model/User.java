package com.incomm.springbootkafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class User {

    private String name;
    private String dept;
    private Long id;
}
