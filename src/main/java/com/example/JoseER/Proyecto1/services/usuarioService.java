package com.example.JoseER.Proyecto1.services;

import com.example.JoseER.Proyecto1.models.usuarioModel;
import com.example.JoseER.Proyecto1.repositories.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class usuarioService {
    @Autowired
    usuarioRepository usuarioRepository;

    public ArrayList<usuarioModel> obtenerUsuarios() {
        return (ArrayList<usuarioModel>) usuarioRepository.findAll();

    }

    public usuarioModel guardarUsuario(usuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<usuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public ArrayList<usuarioModel> obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
