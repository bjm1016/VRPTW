package vrptw;
import edu.sru.thangiah.zeus.core.Depot; 
public class VRPTWDepot 
extends Depot
{
	public VRPTWDepot() { }
	
	public VRPTWDepot(float x, float y, int dn)
	{
		setXCoord(x);
		setYCoord(y);
		setDepotNum(dn);
	}
}
