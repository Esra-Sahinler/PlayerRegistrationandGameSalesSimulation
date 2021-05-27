package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Sisteme Eklenemedi !");
		}
		else 
		{
			System.out.println("Oyun Sisteme Baþarýyla Eklendi: " + game.getGameName());
		}
	}

	@Override
	public void update(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Güncellenemedi !");
		}
		else 
		{
			System.out.println("Oyun Baþarýyla Güncellendi: " + game.getGameName());
		}
	}

	@Override
	public void delete(Game game) {
		if(game.getGameName().length()<3 && game.getPrice()<0) 
		{
			System.out.println("Oyun Silinemedi !");
		}
		else 
		{
			System.out.println("Oyun Baþarýyla Silindi: " + game.getGameName());
		}	
	}

}
