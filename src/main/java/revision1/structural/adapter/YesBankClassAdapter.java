package revision1.structural.adapter;

public class YesBankClassAdapter extends YesBank implements PaymentProcessor
{
	@Override
	public void pay(int amount)
	{
		makePayment(amount);
	}
}
