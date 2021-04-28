package pos_system;

import java.io.Serializable;

public class Foods implements Serializable {
	String FoodName;
	int inNum;
	int[] using;

	Foods(String GetName,int GetNum, int[] uList)
	{
		FoodName = GetName;
		inNum = GetNum;
		using = uList;
	}
	
	boolean CanFoodMaked()
	{
		for(int j=0;j<inNum;j++)
		{
			if(Remains.IngRemains.elementAt(using[j])-1 < 0)
			{
				return false;
			}
		}
			
		return true;
	}
	
	void FoodMaked()
	{
		for(int j=0;j<inNum;j++)
		{
			Remains.IngRemains.setElementAt(Remains.IngRemains.elementAt(using[j])-1, using[j]);
		}
	}
	
	void FoodCanceled()
	{
		for(int j=0;j<inNum;j++)
		{
			Remains.IngRemains.setElementAt(Remains.IngRemains.elementAt(using[j])+1, using[j]);
		}
	}
}
