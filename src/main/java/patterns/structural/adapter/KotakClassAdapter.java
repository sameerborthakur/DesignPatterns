package patterns.structural.adapter;

public class KotakClassAdapter extends KotakBank implements PaymentProcessor
{
	@Override
	public void pay(double amount)
	{
		doTransaction(amount);
	}
}
