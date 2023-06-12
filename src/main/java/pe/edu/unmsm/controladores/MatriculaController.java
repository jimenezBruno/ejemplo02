package pe.edu.unmsm.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unmsm.entidades.Matricula;
import pe.edu.unmsm.servicios.IMatriculaServicio;

@RestController
public class MatriculaController {
	@Autowired
	private IMatriculaServicio matriculaServicio;
	
	@GetMapping("/todos")
	public List<Matricula> listar(){
		return matriculaServicio.FindAll();
	}
	
	public Matricula matricula(@PathVariable Integer id, @PathVariable Integer matricula) {
		return matriculaServicio.FindById(id, matricula);
	}
}
