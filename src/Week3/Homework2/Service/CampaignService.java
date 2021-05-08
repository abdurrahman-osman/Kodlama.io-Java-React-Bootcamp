package Week3.Homework2.Service;

import Week3.Homework2.entities.Campaign;
import Week3.Homework2.entities.Game;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    double getPriceAfterDiscount(Campaign campaign, Game game);
}
