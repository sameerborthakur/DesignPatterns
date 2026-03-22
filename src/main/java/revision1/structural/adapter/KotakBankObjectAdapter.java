package revision1.structural.adapter;

public class KotakBankObjectAdapter implements PaymentProcessor
{
	KotakBank kotakBank;

	public KotakBankObjectAdapter(KotakBank kotakBank)
	{
		this.kotakBank = kotakBank;
	}

	@Override
	public void pay(int amount)
	{
		kotakBank.completeTransaction(amount);
	}
}
