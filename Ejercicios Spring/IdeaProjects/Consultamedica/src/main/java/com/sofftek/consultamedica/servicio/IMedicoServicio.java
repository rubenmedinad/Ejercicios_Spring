package com.sofftek.consultamedica.servicio;

import com.sofftek.consultamedica.modelo.Medico;
import java.util.List;

public interface IMedicoServicio {
    public String obtenerUno(Paciente paciente){
        return "Paciente creado: " +paciente.toString();
    }
}
