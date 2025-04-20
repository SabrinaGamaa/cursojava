package application.diamante;

import devices.ConcreteScanner; 
import devices.ComboDevices; 
import devices.ConcretePrinter;

// LEMBRANDO QUE ISSO NÃO É HERANÇA MULTIPLA, POIS NÃO HÁ REUSO NA RELAÇÃO ENTRE COMBODEVICES E AS INTERFACES
// COMBODEVICES NÃO HERDA, MAS SIM IMPLEMENTA AS INTERFACES.

public class Program {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("Comportamento da Impressora");	
		// Criando uma instância da ConcretePrinter passando um modelo
		ConcretePrinter p = new ConcretePrinter("1080");
		// Simulando o processamento de um documento para impressão
		p.processDoc("My Letter");
		// Imprimindo o documento "My Letter" usando a impressora
		p.print("My Letter");
		

		System.out.println();
		

		System.out.println("-------------------------------");
		System.out.println("Comportamento do Scan");		
		// Criando uma instância da ConcreteScanner passando um modelo
		ConcreteScanner s = new ConcreteScanner("2003");
		// Simulando o processamento de um documento para digitalização
		s.processDoc("My Email");
		// Digitalizando o documento e exibindo o resultado do scan
		System.out.println("Scan result: " + s.scan());
		
		
		System.out.println();
		
		
		System.out.println("-------------------------------");
		System.out.println("Comportamento do COMBO usando Interfaces");
		// Criando uma instância da ComboDevices (dispositivo que combina scanner e impressora) passando um modelo
		ComboDevices c = new ComboDevices("2017");
		// Simulando o processamento de um documento para o ComboDevice
		c.processDoc("My Brother");
		// Usando a função de impressão do ComboDevice para imprimir um documento
		c.print("Gabriela Silva");
		// Usando a função de digitalização do ComboDevice e exibindo o resultado do scan
		System.out.println("Scan result: " + c.scan());
		
	}

}
