
public class AccountingApp {

	public static void main(String[] args) { // ���ڿ�
		
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
		
		System.out.println("Value of supply : "+valueOfSupply); // ���ް�		
		System.out.println("VAT : "+ vat ); // �ΰ��� 10% 		
		System.out.println("Total : "+ total ); // ���ް� �հ� 				
		System.out.println("Expense : "+ expense ); // ��� 30%�� ���� 		
		System.out.println("Income : "+ income ); // ��������  ���ް�-��� 		
		System.out.println("Dividend1 : "+ dividend1 ); // ���� 1 		
		System.out.println("Dividend2 : "+ dividend2 ); // 2		
		System.out.println("Dividend3 : "+ dividend3 ); // 3
 		
 		
		
		

	}

}