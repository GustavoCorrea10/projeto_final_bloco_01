package Repositoy;

import model.Camisa;

public interface CamisaRepositoy {

	
	
	public void listarTodas();
	public void cadastrar(Camisa camisa);
	public void deletar(int numero);
	
}
