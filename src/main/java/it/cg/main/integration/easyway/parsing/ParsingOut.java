package it.cg.main.integration.easyway.parsing;

import com.pass.global.WSPassProHelloWorldOperation;

import it.cg.main.dto.RoutingDTO;

public class ParsingOut
{
	
	
	public WSPassProHelloWorldOperation getParsing(RoutingDTO request)
	{
		
		WSPassProHelloWorldOperation getService = new WSPassProHelloWorldOperation();
		
		getService.setArg0(0);
		
		return getService;
	}

}
