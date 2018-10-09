package vrptw;
import edu.sru.thangiah.zeus.core.TruckType;

public class VRPTWTruckType extends TruckType {
	public VRPTWTruckType()
	{
	
	}
	
	public VRPTWTruckType(int truckNum, float maxDuration, float maxCapacity)
	{
		setTruckNo(truckNum);
		setMaxDuration(maxDuration);
		setMaxCapacity(maxCapacity);
		setFixedCost(getMaxCapacity());
	    setVariableCost((double) getMaxCapacity() / 1000);
	}
}
