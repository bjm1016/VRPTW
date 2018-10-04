package vrptw;

import edu.sru.thangiah.zeus.core.Settings;
import edu.sru.thangiah.zeus.core.ZeusProblemInfo;

public class VRPTWRoot {

	public VRPTWRoot() 
	{
		
		   setZeusProblemInfo();
		   new VRPTW(); 	   
	}

	
	void setZeusProblemInfo() 
	{ 
		ZeusProblemInfo.setTempFileLocation("temp");
	    ZeusProblemInfo.setInputPath("data\\vrptw\\problems\\");
	    ZeusProblemInfo.setOutputPath("data\\vrptw\\results\\"); 
	} 
} // End VRPTW Class Definition
