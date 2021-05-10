package Week2.Homework3.Service.Impl;

import Week2.Homework3.Service.CampaignService;
import Week2.Homework3.Service.SaleService;
import Week2.Homework3.entities.Campaign;
import Week2.Homework3.entities.Game;
import Week2.Homework3.entities.User;

public class SalesServiceImpl implements SaleService {
    private CampaignService campaignService = new CampaignServiceImpl();

    @Override
    public void buy(Game game, User user) {
        System.out.println("Buyer : "+user.getName()+" "+user.getLastName()+"  Price: "+game.getPrice());
    }

    @Override
    public void buy(Game game, User user, Campaign campaign) {
        System.out.println("Buyer: "+user.getName() + " "+user.getLastName()+" Original Price: "+game.getPrice()+ " Discounted price:"+campaignService.getPriceAfterDiscount(campaign,game));

    }
}
