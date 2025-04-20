package devices;

public abstract class Device {
	
	public String serialNumber;

	public Device(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	// Método abstrato que deve ser implementado pelas subclasses
	// Cada tipo de dispositivo (scanner, impressora) terá uma implementação própria deste método
	public abstract void processDoc(String doc);

}
