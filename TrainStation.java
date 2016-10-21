
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
	private MaquinaDeTiquet machine1;
	private MaquinaDeTiquet machine2;
	private int totalMoney;

	public TrainStation()
	{
		machine1 = new MaquinaDeTiquet(300);
		machine2 = new MaquinaDeTiquet(200);
		totalMoney = 0;
    }
  
    public void printTotalMoney()
	{
		totalMoney = machine1.getTotal();
		totalMoney = totalMoney + machine2.getTotal();
        System.out.println(totalMoney);
	}
	
	public int totalMoney()
	{
	    return totalMoney;
    }
}
