package Week2.Homework3.Service;

import Week2.Homework3.entities.Campaign;
import Week2.Homework3.entities.Game;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    double getPriceAfterDiscount(Campaign campaign, Game game);
}
