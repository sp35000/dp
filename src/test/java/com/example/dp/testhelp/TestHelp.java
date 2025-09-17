package com.example.dp.testhelp;

import com.example.dp.chainofresponsability.Application;
import com.example.dp.chainofresponsability.FrontEnd;
import com.example.dp.chainofresponsability.IntermediateLayer;

public class TestHelp {

	public static void main(String args[])
	{
		final int FRONT_END_HELP = 1;
		final int INTERMEDIATE_LAYER_HELP = 2;
		final int GENERAL_HELP = 3;
		Application app = new Application();
		IntermediateLayer intermediateLayer = new IntermediateLayer(app);
		FrontEnd frontEnd = new FrontEnd(intermediateLayer);
		frontEnd.getHelp(FRONT_END_HELP);
		frontEnd.getHelp(INTERMEDIATE_LAYER_HELP);
		frontEnd.getHelp(GENERAL_HELP);
	}
}
