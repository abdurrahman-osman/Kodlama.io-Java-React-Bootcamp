package Week2.Homework2;
import Week2.Homework2.base.BaseAbstractCustomerService;
import Week2.Homework2.entities.Customer;
import Week2.Homework2.service.impl.CustomerCheckServiceImpl;
import Week2.Homework2.service.impl.NeroAbstractCustomerServiceImpl;
import Week2.Homework2.service.impl.StarbucksAbstractCustomerServiceImpl;


import java.util.Date;
/*
  2 Farklı kahve zinciri için 2 farklı yöntemle müşteri kaydı yapılacak
  1.zincir için kimlik doğrulaması olmadan kayıt yapılacak
  2.zincir içinse MERNİS sistemi kullanılarak kimlik doğrulaması yapılacak
 */

public class Main {
    public static void main(String[] args) {
        Customer abdurrahman = new Customer("abdurrahman","osman",12345678978L,new Date(2001,12,1));
        Customer mehmet = new Customer("mehmet","baykal",12345678977L,new Date(1994,10,1));

        BaseAbstractCustomerService abdurrahmanService = new NeroAbstractCustomerServiceImpl();
        BaseAbstractCustomerService mehmetService = new StarbucksAbstractCustomerServiceImpl(new CustomerCheckServiceImpl());
        abdurrahmanService.save(abdurrahman);
        mehmetService.save(mehmet);
    }
}
