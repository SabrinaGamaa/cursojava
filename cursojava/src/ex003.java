import java.util.Locale;
import java.util.Scanner;
import comorientacaoaobjeto.NotaAluno;

public class ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		NotaAluno aluno = new NotaAluno();
		aluno.nota1 = 17;
		aluno.nota2 = 10;
		aluno.nota3 = 25;
		
		System.out.println("FINAL GRADE = " + aluno.mediaAluno());
		System.out.println(aluno.student());
		
		sc.close();
		
	}
}
