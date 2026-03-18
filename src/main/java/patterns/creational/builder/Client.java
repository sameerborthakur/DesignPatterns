package patterns.creational.builder;

public class Client
{
	public static void main(String[] args)
	{
		User user1 = new User.Builder().setName("Test").setAge(20).build();
		System.out.println(user1.getName());
		System.out.println(user1.getAge());

		User user2 = new User.Builder().setName("Test2").build();
		System.out.println(user2.getName());
		System.out.println(user2.getAge());
	}
}
