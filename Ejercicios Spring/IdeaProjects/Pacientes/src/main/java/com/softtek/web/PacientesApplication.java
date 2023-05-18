package com.softtek.web;

import com.softtek.web.Controlador.PacienteControlador;
import com.softtek.web.Modelo.Paciente;
import com.softtek.web.Servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacientesApplication implements CommandLineRunner {
@Autowired
private PacienteServicio PS;
	@Autowired
	private PacienteControlador PC;

	public static void main(String[] args) {
		SpringApplication.run(PacientesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Paciente p1 = new Paciente(1,"Rubén",20);
		System.out.println(PS.obtenerUno(p1));
		System.out.println(PC.obtenerUno(p1));
	}
}
