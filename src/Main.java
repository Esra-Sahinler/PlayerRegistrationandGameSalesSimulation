import java.time.LocalDate;

import Adapters.RealPlayerCheckAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.PlayerManager;
import Business.Concrete.SaleManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Player;
import Entities.Concrete.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Esra");
		player1.setLastName("Þahinler");
		player1.setNationalityId("11111111111");
		player1.setDateOfBirth(LocalDate.of(1998, 12, 14));		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Black Desert");
		game1.setPrice(60);
		game1.setDescription("Black Desert ile heyecaný keþfedin");		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz Kampanyasý");
		campaign1.setDiscountPercent(10);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setPlayer(player1);	


		PlayerManager playerManager = new PlayerManager(new RealPlayerCheckAdapter());
		playerManager.add(player1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);
	}
}
