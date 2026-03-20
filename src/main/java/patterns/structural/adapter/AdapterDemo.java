package patterns.structural.adapter;

public class AdapterDemo
{
	public static void main(String[] args)
	{
		PaymentProcessor paymentProcessor = new KotakObjectAdapter(new KotakBank());
		paymentProcessor.pay(10000);

		PaymentProcessor paymentProcessor2 = new YesBankObjectAdapter(new YesBank());
		paymentProcessor2.pay(1231);

		PaymentProcessor paymentProcessor3 = new YesBankClassAdapter();
		paymentProcessor3.pay(1231445);

		PaymentProcessor paymentProcessor4 = new KotakClassAdapter();
		paymentProcessor4.pay(5679999);
	}
}
