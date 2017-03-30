package com.trojanus.northwind.repository;

import com.trojanus.northwind.model.Suppliers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by John on 3/27/2017.
 */

@RepositoryRestResource(collectionResourceRel = "suppliers", path = "suppliers")
public interface SuppliersRepository extends CrudRepository<Suppliers, Long>{
    List<Suppliers> findByCompany(String company);

    List<Suppliers> findByFirstname(String firstName);

    List<Suppliers> findByLastname(String lastName);

    List<Suppliers> findByEmail(String email);
}
