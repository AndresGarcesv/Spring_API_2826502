package org.productos.spring.java.productos2826502.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import


@AllArgsConstructor
@Getter
@Setter
@Builder
@entity
@Table(name ='products')
public class Product {

    private Long id;
    private String nombre;
    private Double precio;

}
