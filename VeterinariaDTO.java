package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

public class VeterinariaDTO {
	
	private datosMascotas mascotas;
	private MascotaDAO mascotaDAO;
		
	public VeterinariaDTO() {
		mascotas = new datosMascotas[];
		mascotaDAO = new MascotaDAO();				
	}

	public datosMascotas getMascotas() {
		return mascotas;
	}

	public void setMascotas(String datosMascotas[]) {
		String[] datosMascotas = { "pepe","caballo","lucy","gata","ernesto perez","frailejon"}; 
		this.mascotas = mascotas;
	}

	public MascotaDAO getMascotaDAO() {
		return mascotaDAO;
	}

	public void setMascotaDAO(MascotaDAO mascotaDAO) {
		this.mascotaDAO = mascotaDAO;
	}
	
}
