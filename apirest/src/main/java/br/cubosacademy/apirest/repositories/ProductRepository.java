package br.cubosacademy.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cubosacademy.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
