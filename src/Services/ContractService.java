package Services;

import java.util.Calendar;
import java.util.Date;

import Entities.Contract;
import Entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinepaymentService;
	
	public ContractService (OnlinePaymentService onlinePaymentService) {
		this.onlinepaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
			// basicQuota = 200
		for (int i=1; i<= months; i++) {
			 double updatedQuota = basicQuota + onlinepaymentService.interest(basicQuota, i );
			 // updatedQuota = 202
			 double fullQuota = updatedQuota + onlinepaymentService.paymentFee(updatedQuota);
			// updatedQuota = 206.04
			 Date dueDate = addMonths(contract.getDate(), i);
			 contract.getInstallments().add(new Installment(dueDate,fullQuota));
		}	
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
		
		
		
	}
				
	
	
	
	
	
	
	
	
	
	
	
}
