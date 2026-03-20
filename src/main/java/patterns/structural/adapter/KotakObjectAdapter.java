package patterns.structural.adapter;

public class KotakObjectAdapter implements PaymentProcessor
{
	private KotakBank kotakBank;

	public KotakObjectAdapter(KotakBank kotakBank)
	{
		this.kotakBank = kotakBank;
	}
	@Override
	public void pay(double amount)
	{
		kotakBank.doTransaction(amount);
	}
}
