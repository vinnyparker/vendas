package br.com.venustech.vendas.service;

import br.com.venustech.vendas.repository.ClientesRepository;
import br.com.venustech.vendas.service.model.Cliente;
import org.springframework.stereotype.Service;

/**
 * Project vendas
 * Created by vinny
 * on 04/09/2020
 **/
@Service
public class ClientesService {

    ClientesRepository clientesRepository;

    public void setClientesRepository(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.clientesRepository.salvar(cliente);

    }

    public void validarCliente(Cliente cliente) {

    }
}