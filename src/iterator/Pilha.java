package iterator;

public interface Pilha {
	public int tamanho();
	public boolean estaVazia();
	public Object topo();
	
	//Métodos de atualização
	public void empilha(Object elemento);
	public Object desempilha();
}
