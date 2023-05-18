package com.softtek.web.Controlador;
import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Servicio.IPacienteServicio;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Paciente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PacienteControlador  {
@Autowired
IPacienteServicio IPS;
@GetMapping
    public String obtenerUno(Paciente paciente) {
       return "Paciente creado: " +paciente.toString();
    }
}
