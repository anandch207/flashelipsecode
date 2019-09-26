package com.akshay.pkg2;
class Task1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(10/1);
		System.out.println("task1");
	}
	}
public class test5  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 t1= new Task1();
t1.start();
System.out.println("main");
	}

}
