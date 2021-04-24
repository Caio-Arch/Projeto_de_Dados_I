
package projeto;
/**
 *
 * @author Caio
 */
public class Projeto {

    public static void main(String[] args) {       
		Notas guilherme = new Notas("guilherme", 7);
                                                          
                System.out.println("Nota de Todos os Alunos: ");
		Notas[] notas = {
				new Notas("Marcio", 4),
				new Notas("Julio", 8.5),
				new Notas("Livia", 10),
				new Notas("Ana", 3),
				new Notas("Caroline", 6.7),
				new Notas("Jonas", 9.3),
				new Notas("Caio", 9),
				new Notas("Carlos", 5),
                                new Notas("Marcio", 4),
				new Notas("Julio", 8.5),
				new Notas("Livia", 10),
				new Notas("joao", 5.6),
				new Notas("Maria", 6.2),
				new Notas("Marcio", 9.7),
				new Notas("Jonathan", 8),
				new Notas("Carla", 10),
                                new Notas("João", 4.7),
				new Notas("Juliano", 8.5),
				new Notas("Juliana", 10),
				new Notas("Ana", 7),
				new Notas("Caroline", 2.7),
				new Notas("Marcos", 9.3),
				new Notas("Caio", 4),
				new Notas("Carlos", 5),
                                guilherme,
                                                                                                              
		};
                ordena(notas, 0, notas.length);
		for(int atual = 0; atual < notas.length; atual++) {
			Notas nota = notas[atual];
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}              
		int menores = encontraMenores(guilherme, notas);
		System.out.println("Numero de Alunos reprovados:  " + menores);
                
                int maior = encontraMaiores(guilherme, notas);
		System.out.println("Numero de Alunos Aprovados:  " + maior);
                
	}
        //Quick sort
	private static void ordena(Notas[] notas, int de, int ate) {
		int elementos = ate - de;
		if(elementos > 1) {
			int posicaoDoPivo = particiona(notas, de, ate);    
			ordena(notas, de, posicaoDoPivo);
			ordena(notas, posicaoDoPivo + 1, ate);
		}
	}	
	private static int particiona(Notas[] notas, int inicial, int termino) {
		int menoresEncontrados = 0;
		Notas pivo = notas[termino - 1];
		for(int analisando = 0; analisando < termino - 1; analisando++) {
			Notas atual = notas[analisando];
			if(atual.getValor() <= pivo.getValor()) {
				troca(notas, analisando, menoresEncontrados);
				menoresEncontrados++;
			}
		}                
		troca(notas, termino -1, menoresEncontrados);
		return menoresEncontrados;                		
	}        
	private static void troca(Notas[] notas, int de, int para) {
		Notas nota1 = notas[de];
		Notas nota2 = notas[para];
		notas[para] = nota1;
		notas[de] = nota2;
	}
        //recursividade
        private static int encontraMenores(Notas busca, Notas[] notas) {
		int menores = 0;
		for(int atual = 0; atual < notas.length; atual++) {
			Notas nota = notas[atual];
			if(nota.getValor() < busca.getValor()) {
				menores++;
			}
		}
		return menores;
	}
        
        private static int encontraMaiores(Notas busca, Notas[] notas) {
		int maiores = 0;
		for(int atual = 0; atual < notas.length; atual++) {
			Notas nota = notas[atual];
			if(nota.getValor() >= busca.getValor()) {
				maiores++;
			}
		}
		return maiores;
	}
}
