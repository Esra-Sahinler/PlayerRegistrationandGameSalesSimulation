package Business.Concrete;

import Business.Abstract.PlayerCheckService;
import Business.Abstract.PlayerService;
import Entities.Concrete.Player;

public class PlayerManager implements PlayerService{

	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) 
	{
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("Üye Eklendi: " + player.getFirstName() + " " + player.getLastName());
		}
		else {
			System.out.println("Üye Bilgileri Hatalý");
		}
	}

	@Override
	public void update(Player player) {
		if(playerCheckService.checkIfRealPerson(player))
		{
			System.out.println("Üye Bilgileri Güncellendi: " + player.getFirstName() + " " + player.getLastName() );
		}
		else {
			System.out.println("Üye Bilgileri Hatalý");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println("Üye Silindi");
	}

}
