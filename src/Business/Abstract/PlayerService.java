package Business.Abstract;

import Entities.Concrete.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
}
