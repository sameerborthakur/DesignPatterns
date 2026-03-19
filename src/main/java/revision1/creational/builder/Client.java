package revision1.creational.builder;

public class Client
{
	public static void main(String[] args)
	{
		User user = new User.Builder().setName("test").setAge(45).build();
		System.out.println(user);

		user = new User.Builder().setName("test1").build();
		System.out.println(user);
	}

}
