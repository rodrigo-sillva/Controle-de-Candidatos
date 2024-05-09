package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			}
		entrandoEmContato(candidato);
}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
		}while(continuarTentando && tentativasRealizadas<3);
	}
	
	//método auxiliar 
		static boolean atender() {
			return new Random().nextInt(3)==1;	
		}
	
	static void imprimirSelecionado() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Impirimindo a lista de candidatos informando o indice de elemento");
		for(int indice = 0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de n " + (indice+1) + " é " + candidatos[indice]);
		}
			System.out.println("Forma abreviada de interação for each");
			
			for(String candidato: candidatos ) {
				System.out.println("O candidato selecionado foi " + candidato);
			}
	}
	public static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	
		int candidatoSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatoSelecionados < 5 && candidatosAtual < candidatos.length) { 
			String candidato = candidatos[candidatosAtual];
				Double salarioPretendido = valorPretendido();
				
				System.out.println("Ocandidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
				if(salarioBase >= salarioPretendido) {
					System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatoSelecionados++;
					}
		 }
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
			}else if(salarioBase==salarioPretendido)
				System.out.println("Ligar para candidato com a contra proposta");
			else {
				System.out.println("Aguardando o resultado dos demais candidados");
			}
	}
}
