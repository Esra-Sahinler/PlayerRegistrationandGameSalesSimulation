package Business.Concrete;

import Business.Abstract.PlayerCheckService;
import Entities.Concrete.Player;

public class FakePlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
