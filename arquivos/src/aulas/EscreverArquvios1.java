package aulas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter Cria/Recria o arquivo 
//- acrescenta ao arquivo JÁ existente: new FileWriter(path, true) - NÃO RECRIAR UM NOVO ARQUIVO, SÓ ADICIONA O CONTEUDO NAQUELE ARQUIVO ESPECIFICO SE JÁ TIVER UM CRIADO

public class EscreverArquvios1 {
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\escrevendoarquivos1.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}	
}
