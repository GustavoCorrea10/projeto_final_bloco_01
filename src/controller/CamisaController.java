package controller;

import java.util.ArrayList;

import Repositoy.CamisaRepositoy;
import model.Camisa;

public class CamisaController implements CamisaRepositoy {

	private ArrayList<Camisa> listaCamisa = new ArrayList<Camisa>();

	@Override
	public void listarTodas() {

		if (listaCamisa.isEmpty()) {
			System.out.println("Nenhuma camisa encontrada! ");
		} else {
			for (Camisa camisa : listaCamisa) {
				camisa.visualizar();
			}
		}

	}

	@Override
	public void cadastrar(Camisa camisa) {
		listaCamisa.add(camisa);

	}

	 @Override
	    public void deletar(int id) {
	        boolean removed = false;
	        for (Camisa camisa : listaCamisa) {
	            if (camisa.getId() == id) {
	                listaCamisa.remove(camisa);
	                System.out.println("Camisa com ID " + id + " removida com sucesso!");
	                removed = true;
	                break;
	            }
	        }
	        if (!removed) {
	            System.out.println("Camisa com o ID " + id + " não encontrada.");
	        }
	    }

}