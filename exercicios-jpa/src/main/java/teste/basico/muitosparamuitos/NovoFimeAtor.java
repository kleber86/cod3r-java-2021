package teste.basico.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFimeAtor {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Star Wars Ep 4", 8.7);
		Filme filmeB = new Filme("O Figitivo", 8.9);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
	}
}
