package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentsService onlinePaymentsService;
	
	public ContractService(OnlinePaymentsService onlinePaymentsService) {
		this.onlinePaymentsService = onlinePaymentsService;	
	}
	
	public void processContract(Contract contract, int months) {
		double value = contract.getTotalValue()/months;
		for(int i = 1; i <= months;i++) {
			double updatedQuota = value + onlinePaymentsService.interest(value, i);
			double fullQuota = updatedQuota + onlinePaymentsService.juro(updatedQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallment().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, N);
		
		return cal.getTime();
	}
}
