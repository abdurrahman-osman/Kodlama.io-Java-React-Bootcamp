package Week3.Homework2;


import Week3.Homework2.Service.Impl.SalesServiceImpl;
import Week3.Homework2.Service.SaleService;
import Week3.Homework2.entities.Campaign;
import Week3.Homework2.entities.Game;
import Week3.Homework2.entities.User;

import java.util.Date;

/*
Gereksinimler

1.     Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule ediniz. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.     Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir. Oyuncunun parametre olarak metotta olmasını kastediyorum.)

3.     Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.

4.     Satışlarda kampanya entegrasyonunu simule ediniz.


 */

public class Main {
    public static void main(String[] args) {
        SaleService saleService = new SalesServiceImpl();
        User user1 = new User(1,"ahmet","mustafa","ahmet@gmail.com","1234",new Date(2000-10-1),1223445L);
        Game game = new Game(2,"Counter Strike",100);
        Game game1 = new Game(4,"Pubg",300);
        Campaign campaign = new Campaign(3,"Efsane Cuma","Seçili oyunlarda şok %20 indirim",0.2);
        saleService.buy(game,user1);
        saleService.buy(game,user1,campaign);

    }
}
