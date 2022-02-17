package com.example.JoseER.Proyecto1.repositories;
import com.example.JoseER.Proyecto1.models.usuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
// Genera la conexión con la base de datos
public interface usuarioRepository extends CrudRepository<usuarioModel, Long> {
    public abstract ArrayList<usuarioModel> findByPrioridad(Integer prioridad);
}
