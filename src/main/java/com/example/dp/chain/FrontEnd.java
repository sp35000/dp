package com.example.dp.chain;

public class FrontEnd implements HelpInterface {

	private static final int FRONT_END_HELP = 1;
	HelpInterface successor;

	public FrontEnd(HelpInterface s) {
		successor = s;
	}

	@Override
	public void getHelp(int helpConstant) {
		if(helpConstant != FRONT_END_HELP){
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the FrontEnd.");
		}
		}
	}	
