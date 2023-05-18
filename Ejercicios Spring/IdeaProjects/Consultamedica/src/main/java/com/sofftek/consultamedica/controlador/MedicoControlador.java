package com.sofftek.consultamedica.controlador;
import com.sofftek.consultamedica.modelo.Medico;
import com.sofftek.consultamedica.servicio.IMedicoServicio;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;import lombok.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Data
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    IMedicoServicio servicio;
    @GetMapping
    public Iterable<Medico> obtener(Medico medico){
        return List.of(servicio.obtener(medico));
    }
}
