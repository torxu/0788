
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
	private MaquinaDeTiquet maquina1;
	private MaquinaDeTiquet maquina2;
	private int totalDinero;

	public EstacionDeTren()
	{
		maquina1 = new MaquinaDeTiquet();
		maquina2 = new MaquinaDeTiquet();
		totalDinero = 0;
    }
  
    public void imprimirTotalDinero()
	{
		totalDinero = maquina1.getTotal();
		totalDinero = totalDinero + maquina2.getTotal();
        System.out.println(totalDinero);
	}
	
	public int totalDinero()
	{
	    return totalDinero;
    }
    
    public void imprimirVenta()
    {
        maquina1.introducirDinero(300);
        maquina1.imprimirTiquet();
        maquina2.introducirDinero(200);
        maquina2.imprimirTiquet();
    }
}
