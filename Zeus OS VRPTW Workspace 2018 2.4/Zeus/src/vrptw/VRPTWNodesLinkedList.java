package vrptw;
import edu.sru.thangiah.zeus.core.NodesLinkedList;
import edu.sru.thangiah.zeus.core.Shipment;
import edu.sru.thangiah.zeus.core.ZeusProblemInfo;
import edu.sru.thangiah.zeus.vrp.VRPNodesLinkedList;
import edu.sru.thangiah.zeus.vrp.VRPShipment;

public class VRPTWNodesLinkedList extends NodesLinkedList{
	
	public VRPTWNodesLinkedList()
	{
		setHead(new VRPTWNodes());
		setTail(new VRPTWNodes());
		linkHeadTail();
	}
	
	public VRPTWNodesLinkedList(VRPTWTruckType truckType, VRPTWDepot depot, int truckNum)
	{
		setTruckType(truckType);
		setTruckNum(truckNum);
		setHead(new VRPTWNodes(new VRPTWShipment()));
		setTail(new VRPTWNodes(new VRPTWShipment()));
		linkHeadTail();
	}
	
	public VRPTWNodes getVRPTWHead()
	{
		return (VRPTWNodes) getHead();
	}
	
	public VRPTWNodes getVRPTWTail()
	{
		return (VRPTWNodes) getTail();
	}
	
	public boolean getInsertShipment(VRPTWNodesLinkedList currNodeLL, VRPTWShipment theShipment) 
	{
		return false;
	}
	public boolean insertShipment(Shipment theShipment) 
	{
	    VRPNodesLinkedList status = (VRPNodesLinkedList) ZeusProblemInfo.getInsertShipType();
	    return getInsertShipment(this, (VRPTWShipment) theShipment);
	}
}
