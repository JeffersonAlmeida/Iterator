package iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		PilhaArray pilha = new PilhaArray(5);
		for(int i = 0 ; i< 5;i++){
			pilha.empilha(new Inteiro(i));
		}
		
		Iterator pilhaIterator = new PilhaArrayIterator(pilha);
		while(pilhaIterator.hasNext()){			
			System.out.println(pilhaIterator.next());
		}
		
	}

}
