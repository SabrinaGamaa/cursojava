
public class funcoespstring {

	public static void main(String[] args) {
		
		String original = "adeDFEW WEFdewf SAbriNA rfref     ";
		System.out.println("Texto original: " + original + '-');
		
		String lower = original.toLowerCase();
		System.out.println("Texto com tudo minusculo: " + lower + '-');

		String upper = original.toUpperCase();
		System.out.println("Texto maiusculo: " + upper + '-');
		
		String replace = original.replaceAll("SAbriNA", "MaRIa");
		System.out.println("Texto substituido: " + replace + '-');
		
		String trim = original.trim();
		System.out.println("Texto apagado os espaços inicio e final: " + trim + '-');
		
		String substring = original.substring(5, 11);
		System.out.println("Pega o texto na posição idicada até o final ou até onde você preferir: " + substring + '-');
		
//		A primeira ocorrencia do dew - lastIndexOF seria a ultima
		int i = original.indexOf("dew");
		System.out.println("Onde está localizado o primeiro dew: " + i);
		
	}
}

//Tem varios tipo de replace ai eu usei o all
