package vrptw;
import edu.sru.thangiah.zeus.core.Nodes;

public class VRPTWNodes extends Nodes{
	
	public VRPTWNodes(VRPTWShipment shipment)
	{
		setShipment(shipment);
	}
	public VRPTWNodes getVRPTWNext(){
		return (VRPTWNodes) getNext();
	}
	
	public VRPTWNodes()
	{
		
	}
}
