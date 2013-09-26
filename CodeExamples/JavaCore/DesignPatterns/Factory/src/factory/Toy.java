package factory;

public class Toy extends Product 
{
	private Integer age;
	
	public Toy(String name)
	{
		super(name);
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	
}
