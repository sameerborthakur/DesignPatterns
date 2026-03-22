package revision2.creational.builder;

public class Client
{
	public static void main(String[] args)
	{
		User user1 = new User.Builder().setName("Test").setAge(25).build();
		User user2 = new User.Builder().setName("Test2").build();
		System.out.println("user1: " + user1);
		System.out.println("user2: " + user2);
	}
}
