package com.sld.ec.mi_segunda_api_rest.service;

import com.sld.ec.mi_segunda_api_rest.model.dto.ClienteDTO;
import com.sld.ec.mi_segunda_api_rest.model.entity.Cliente;

public interface ICliente {

    //Guardar Cliente
    Cliente save(ClienteDTO cliente);

    //Buscar Cliente por ID
    Cliente findByID(Integer id);

    //Borrar Cliente completo
    void delete(Cliente cliente);
}
