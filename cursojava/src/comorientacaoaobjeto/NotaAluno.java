package comorientacaoaobjeto;

public class NotaAluno {
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaAluno() {
		double media = (nota1 + nota2 + nota3);
		return media;
	}
	
	public String student() {
		if (mediaAluno() >= 60) {
			return "PASS";
		}
		else {
			System.out.println("FAILED");
			double f = 60 - mediaAluno();
			return "MISSING "
				+ f + " POINTS";
		}
	}
}
