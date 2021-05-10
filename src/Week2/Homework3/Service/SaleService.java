package Week2.Homework3.Service;

import Week2.Homework3.entities.Campaign;
import Week2.Homework3.entities.Game;
import Week2.Homework3.entities.User;

public interface SaleService {
    void buy(Game game, User user);
    void buy(Game game, User user, Campaign campaign);
}
