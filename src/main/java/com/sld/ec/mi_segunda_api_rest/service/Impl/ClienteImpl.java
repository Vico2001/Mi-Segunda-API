package com.sld.ec.mi_segunda_api_rest.service.Impl;

import com.sld.ec.mi_segunda_api_rest.model.dao.ClienteDAO;
import com.sld.ec.mi_segunda_api_rest.model.dto.ClienteDTO;
import com.sld.ec.mi_segunda_api_rest.model.entity.Cliente;
import com.sld.ec.mi_segunda_api_rest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Service realiza los llamados


@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDAO clienteDAO;

    //Indica que toda transaccion de consulta que se realice sea solo de lectura
    @Override
    @Transactional
    public Cliente save(ClienteDTO clienteDTO) {
        Cliente cliente = Cliente.builder()
                .idCliente(clienteDTO.getIdCliente())
                .nombre(clienteDTO.getNombre())
                .apellido(clienteDTO.getApellido())
                .correo(clienteDTO.getCorreo())
                .fechaRegistro(clienteDTO.getFechaRegistro())
                .build();
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findByID(Integer id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }
}
