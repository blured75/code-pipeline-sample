package com.blured.awsapigatewayexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int id;
    private String name;
    private double price;
    private String couleurPages;
}
