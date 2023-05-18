package com.softtek.web.Repositorio;
import com.softtek.web.Modelo.Paciente;

import org.springframework.stereotype.Repository;


@Repository
public class PacienteRepo implements IPacienteRepo {
    public String obtenerUno(Paciente paciente){
        return "Paciente creado: " + paciente.toString();
    }
}
