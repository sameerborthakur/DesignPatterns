package patterns.structural.adapter;

public class YesBankClassAdapter extends YesBank implements PaymentProcessor
{

	@Override
	public void pay(double amount)
	{
		makePayment(amount);
	}
}
