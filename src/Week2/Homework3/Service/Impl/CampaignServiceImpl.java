package Week2.Homework3.Service.Impl;

import Week2.Homework3.Service.CampaignService;
import Week2.Homework3.entities.Campaign;
import Week2.Homework3.entities.Game;

public class CampaignServiceImpl implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Added to db "+campaign.getName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Updated "+ campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Deleted " + campaign.getName());
    }

    @Override
    public double getPriceAfterDiscount(Campaign campaign, Game game) {
        return (game.getPrice() - (game.getPrice()*campaign.getDiscountRate()));
    }

}
