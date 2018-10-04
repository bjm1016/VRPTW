package vrptw;
import edu.sru.thangiah.zeus.core.Depot; 
public class VRPTWDepot 
extends Depot
{
	private float earliestTime;
	private float latestTime; 
	private float serviceTime;
	private float demand;
	private boolean serviced = false; 
	
	public VRPTWDepot(float x, float y, float et, float lt, float st, float d, int dn)
	{
		setXCoord(x);
		setYCoord(y);
		setEarliestTime(et);
		setLatestTime(lt);
		setServiceTime(st);
		setDemand(d);
		setDepotNum(dn);
	}
	
	public String toString()
	{
		String a = "Depot Number: '" + getDepotNum();
		a += "' x: '" + getXCoord() + "' y: '" + getYCoord();
		a += "' Earliest Time: '" + earliestTime; 
		a += "' Latest Time: '" + latestTime; 
		a += "' Service Time: '" + serviceTime; 
		a += "' Demand: '" + demand;
		a += "' Serviced: '" + serviced;
		return a; 
	}
//setter methods
	public void setEarliestTime(float t)
	{
		earliestTime = t;
	}
	public void setLatestTime(float t)
	{
		latestTime = t;
	}
	public void setServiceTime(float t)
	{
		serviceTime = t;
	}
	public void setDemand(float t)
	{
		demand = t;
	}
	public void setServiced(boolean t)
	{
		serviced = t;
	}
	
// getter methods	
	public float getEarliestTime()
	{
		return earliestTime;
	}	
	public float getLatestTime()
	{
		return latestTime;
	}	
	public float getServiceTime()
	{
		return serviceTime;
	}
	public float getDemand()
	{
		return demand;
	}
	public boolean isServiced()
	{
		return serviced;
	}
}