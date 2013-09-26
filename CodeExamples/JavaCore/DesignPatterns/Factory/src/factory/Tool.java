package factory;

public class Tool extends Product 
{
	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	private int durability;
	
	public Tool(String name)
	{
		super(name);
	}
	
}
