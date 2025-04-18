package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	// Aqui temos uma dependência com a interface OnlinePaymentService
	// Ou seja, essa classe NÃO SE IMPORTA com quem implementa a lógica de pagamento.
	private OnlinePaymentService onlinePaymentService;

	// Construtor da classe: recebemos uma implementação da interface.
	// Por exemplo: new ContractService(new PaypalService());
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	// Esse método vai processar o contrato, dividindo o valor em parcelas
	// e aplicando os juros e taxas de acordo com o serviço de pagamento.
	public void processContract(Contract contract, int months) {
		
		// Valor base de cada parcela (sem juros e taxas)
		double basicQuota = contract.getTotalValue() / months;
		
		// Vamos gerar uma parcela (Installment) para cada mês
		for (int i = 1; i <= months; i++) {
			
			// Data de vencimento da parcela atual (1 mês depois do contrato, 2 meses, etc.)
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			// Calcula o juros da parcela usando a interface
			double interest = onlinePaymentService.interest(basicQuota, i);
			
			// Calcula a taxa de pagamento sobre o valor com juros
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			// Soma o valor base + juros + taxa para obter o valor final da parcela
			double fullQuota = basicQuota + interest + fee;

			// Instancia um Installment e adicionar na lista de Contract
			contract.getInstallments().add(new Installment(fullQuota, dueDate));
			
		}
	}
}
