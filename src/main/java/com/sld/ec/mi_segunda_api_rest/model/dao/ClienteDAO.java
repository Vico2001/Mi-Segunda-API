package com.sld.ec.mi_segunda_api_rest.model.dao;

import com.sld.ec.mi_segunda_api_rest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
}
