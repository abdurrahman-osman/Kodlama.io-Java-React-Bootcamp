package Week3.Homework2.Service;

import Week3.Homework2.entities.Campaign;
import Week3.Homework2.entities.Game;
import Week3.Homework2.entities.User;

public interface SaleService {
    void buy(Game game, User user);
    void buy(Game game, User user, Campaign campaign);
}
