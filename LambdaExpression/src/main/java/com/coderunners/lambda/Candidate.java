package com.coderunners.lambda;

public class Candidate 
{
	private String name;
	private int age;
	private boolean local;
	
	public Candidate(String name, int age, boolean local) 
	{
		this.name = name;
		this.age = age;
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}
}
