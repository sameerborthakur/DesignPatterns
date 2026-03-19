package revision1.creational.builder;

public class User
{
	private String name;
	private int age;

	public static class Builder
	{
		private String name;
		private int age =20;

		public Builder setName(String name)
		{
			this.name = name;
			return this;
		}

		public Builder setAge(int age)
		{
			this.age = age;
			return this;
		}
		public User build(){
			User user = new User();
			user.name = name;
			user.age = age;
			return user;
		}
	}

	public String toString()
	{
		return "name: " + name + ", age: " + age;
	}
}
