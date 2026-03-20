package patterns.structural.adapter;

public class YesBankObjectAdapter implements PaymentProcessor
{
	private YesBank yesBank;

	public YesBankObjectAdapter(YesBank yesBank)
	{
		this.yesBank = yesBank;
	}
	@Override
	public void pay(double amount)
	{
		yesBank.makePayment(amount);
	}
}
