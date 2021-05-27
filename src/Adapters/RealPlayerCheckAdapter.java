package Adapters;

import Business.Abstract.PlayerCheckService;
import Entities.Concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class RealPlayerCheckAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result= false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(), player.getDateOfBirth().getYear());
		} 
		catch (Exception e) 
		{
			System.out.println("Üye Bilgileri Hatalý");
		}
		
		return result;
	}

}
