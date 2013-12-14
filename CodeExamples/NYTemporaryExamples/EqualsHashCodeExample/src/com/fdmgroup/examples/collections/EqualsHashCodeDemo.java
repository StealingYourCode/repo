package com.fdmgroup.examples.collections;


class Cat {
	
	private String name;
	private String breed;
	private int age;
	private boolean isFed;	
		
	Cat(String name, String breed){
		
		this.name = name;
		this.breed = breed;
		
		age = 0;
		isFed = false;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Cat))
//			return false;
//		Cat other = (Cat) obj;
//		if (age != other.age)
//			return false;
//		if (breed == null) {
//			if (other.breed != null)
//				return false;
//		} else if (!breed.equals(other.breed))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	
	
}


public class EqualsHashCodeDemo {

	public static void main(String[] args) {
		
	}

}
