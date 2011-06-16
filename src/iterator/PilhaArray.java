package iterator;

import java.util.Arrays;

public class PilhaArray implements Pilha {
	
	public static final int CAPACIDADE = 1000;
	private int capacidade;
	private Object p[];
	private int topo = -1;
	
	// casso não passe nada como parametro a pilha tera tamanho 1000
	public PilhaArray() {
		this(CAPACIDADE);
	}
	
	public PilhaArray(int cap) {
		capacidade = cap;
		p = new Object[capacidade];
    }	
	
	@Override
	public int tamanho() {
		return (topo + 1);
	}

	@Override
	public boolean estaVazia() {
		return (topo < 0);
	}
	
	@Override
	public Object topo() {
		if (!estaVazia()){
			return p[topo];
		}
		return null;
	}

	@Override
	public Object desempilha() {
		if (!estaVazia()) {
			Object elem = p[topo];
			p[topo--] = null;
			return elem;
		}
		return null;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public int getTopo() {
		return topo;
	}

	public void setP(Object p[]) {
		this.p = p;
	}

	public Object[] getP() {
		return p;
	}

	@Override
	public void empilha(Object obj) {
		if (tamanho() != capacidade)
		p[++topo] = obj;
	}
	public Iterator getIterator() {
		return new PilhaArrayIterator(this);
	}

	@Override
	public String toString() {
		return "PilhaArray [p=" + Arrays.toString(p) + "]";
	}
	
	

}
