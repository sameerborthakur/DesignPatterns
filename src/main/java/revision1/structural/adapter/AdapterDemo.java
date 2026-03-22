package revision1.structural.adapter;

public class AdapterDemo
{
	public static void main(String[] args)
	{
		PaymentProcessor paymentProcessor = new KotakBankObjectAdapter(new KotakBank());
		paymentProcessor.pay(100);

		paymentProcessor = new YesBankObjectAdapter(new YesBank());
		paymentProcessor.pay(100);

		paymentProcessor = new KotakBankClassAdapter();
		paymentProcessor.pay(100);

		paymentProcessor = new YesBankClassAdapter();
		paymentProcessor.pay(100);
	}
}
