package br.cubosacademy.apirest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Getter
    @Setter
    @Column(nullable = false)
    @NotBlank(message = "O campo é obrogatório")
    private String name;

    @Getter
    @Setter
    @Column(nullable = false)
    @Min(value = 10, message = "O campo price é no mínimo 10 centavos")
    private Integer price;

    @Getter
    @Setter
    @Column()
    private String description;

}
