package pe.edu.unmsm.servicios;

import java.util.List;

import pe.edu.unmsm.entidades.Matricula;

public interface IMatriculaServicio {
	public List<Matricula> FindAll();
	public Matricula FindById(Integer id,Integer matricula);
	
}
