package iterator;

public class PilhaArrayIterator implements Iterator {
	private PilhaArray pilha;
	private int pos = -1;
	
	public PilhaArrayIterator(PilhaArray pilha){
		this.pilha = pilha;
	}
	
	@Override
	public boolean hasNext() {
		return (pos < this.pilha.getTopo());
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public void setPilha(PilhaArray pilha) {
		this.pilha = pilha;
	}

	@Override
	public Object next() {
		pos++;
		return this.pilha.getP()[pos];
	}

	public Pilha getPilha() {
		return pilha;
	}

}
