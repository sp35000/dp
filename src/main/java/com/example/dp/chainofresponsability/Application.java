package com.example.dp.chainofresponsability;

public class Application implements HelpInterface {

	@Override
	public void getHelp(int helpConstant)
	{
		System.out.println("This is the Application");
	}
}
