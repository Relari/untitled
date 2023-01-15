package org.example.business;

import org.example.model.Perro;

import java.util.List;

public interface PerroRegistro {

    List<Perro> listar();

    void agregar(Perro perro);

    void eliminarPorId(Integer idPerro);

    Perro buscarPorId(Integer idPerro);

}
