package revision1.structural.adapter;

public class KotakBankClassAdapter extends KotakBank implements PaymentProcessor
{
	@Override
	public void pay(int amount)
	{
		completeTransaction(amount);
	}
}
