package devices;

public class ConcretePrinter extends Device implements Printer{

	// Construtor que chama o construtor da classe base (Device) e inicializa o número de série
	public ConcretePrinter(String serialNumber) {
	    super(serialNumber); // Chama o construtor da classe pai (Device) para inicializar o número de série
	}

	// Implementação do método abstrato 'processDoc' da classe base
	// Define como a impressora vai processar o documento
	@Override
	public void processDoc(String doc) {
	    System.out.println("Printer processing: " + doc); // Simula o processamento do documento pela impressora
	}

	// Implementação do método 'print' para imprimir o documento
	@Override
	public void print(String doc) {
	    System.out.println("Printing: " + doc); // Simula a impressão do documento
	}
	
	
	
}
