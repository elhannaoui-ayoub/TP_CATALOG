package ma.enset.tp_catalog.dao;

import ma.enset.tp_catalog.entities.Product;

import java.util.List;

public interface ProductRepository extends DAO<Product, Long>{

    List<Product> findByQuery(String query);

}
