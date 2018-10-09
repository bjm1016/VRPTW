package vrptw;
import java.util.Iterator;
import java.util.LinkedList;

import edu.sru.thangiah.zeus.core.DepotLinkedList; 

public class VRPTWDepotList 
implements Iterable<VRPTWDepot>
{
	private LinkedList<VRPTWDepot> depotList = new LinkedList<VRPTWDepot>(); 
	
	public void addDepot(VRPTWDepot depot)
	{
		depotList.add(depot);
	}
	
	
	public void removeDepot(int location)
	{
		depotList.remove(location);
	}
	
	public VRPTWDepot getDepot(int index)
	{
		return depotList.get(index);
	}

	public int length()
	{
		return depotList.size();
	}
	
	public String toString()
	{
		String a = "";
		for(VRPTWDepot depot : depotList)
		{
			a += depot.toString() + "\n";
		}
		return a; 
	}
	
	@Override //@Override wth java
	public Iterator<VRPTWDepot> iterator() {
		// TODO Auto-generated method stub
		return depotList.iterator();
	}
}
