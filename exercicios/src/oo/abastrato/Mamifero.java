package oo.abastrato;

public abstract class Mamifero extends Animal{

	public abstract String mamar();
	
	@Override
	public final String mover() {
		return "saindo do lugar";
	}

}
