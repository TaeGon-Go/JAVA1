
public class AccountingApp {

	public static void main(String[] args) { // 문자열
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : "+valueOfSupply); // 공급가		
		System.out.println("VAT : "+ vat ); // 부가세 10% 		
		System.out.println("Total : "+ total ); // 공급가 합계 				
		System.out.println("Expense : "+ expense ); // 비용 30%라 가정 		
		System.out.println("Income : "+ income ); // 순수이익  공급가-비용 		
		System.out.println("Dividend1 : "+ dividend1 ); // 배당금 1 		
		System.out.println("Dividend2 : "+ dividend2 ); // 2		
		System.out.println("Dividend3 : "+ dividend3 ); // 3
 		
 		
		
		

	}

}
