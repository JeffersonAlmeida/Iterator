package iterator;

public interface Pilha {
	public int tamanho();
	public boolean estaVazia();
	public Object topo();
	
	//M�todos de atualiza��o
	public void empilha(Object elemento);
	public Object desempilha();
}
