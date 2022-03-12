package com.javatechie.security.dto;

import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ApiKey {

    private String key;
    private List<String> services;
}
