package Week3.Homework2.Service.Impl;

import Week3.Homework2.Service.CampaignService;
import Week3.Homework2.Service.SaleService;
import Week3.Homework2.Service.UserCheckService;
import Week3.Homework2.entities.Campaign;
import Week3.Homework2.entities.Game;
import Week3.Homework2.entities.User;

public class SalesServiceImpl implements SaleService {
    private CampaignService campaignService = new CampaignServiceImpl();

    @Override
    public void buy(Game game, User user) {
        if (user.isVerified())
        System.out.println("Buyer : "+user.getName()+" "+user.getLastName()+"  Price: "+game.getPrice());
        else System.out.println("Error! user unverified");
    }

    @Override
    public void buy(Game game, User user, Campaign campaign) {
        if (user.isVerified())
        System.out.println("Buyer: "+user.getName() + " "+user.getLastName()+" Original Price: "+game.getPrice()+ " Discounted price:"+campaignService.getPriceAfterDiscount(campaign,game));
        else System.out.println("Error! user unverified");
    }
}
