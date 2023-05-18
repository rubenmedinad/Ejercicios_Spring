package com.softtek.web.Servicio;

import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Repositorio.IPacienteRepo;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Repository
public class PacienteServicio implements IPacienteServicio{
    @Autowired
    IPacienteRepo IPR;
    @Override
    public String obtenerUno(Paciente paciente){
        return "Paciente creado: " +paciente.toString();
    }
}
