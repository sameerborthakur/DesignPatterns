package revision1.structural.adapter;

public class YesBankObjectAdapter implements PaymentProcessor
{
	public YesBank yesBank;

	public YesBankObjectAdapter(YesBank yesBank)
	{
		this.yesBank = yesBank;
	}

	@Override
	public void pay(int amount)
	{
		yesBank.makePayment(amount);
	}
}
