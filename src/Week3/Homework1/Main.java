package Week3.Homework1;
import Week3.Homework1.base.BaseAbstractCustomerService;
import Week3.Homework1.entities.Customer;
import Week3.Homework1.service.impl.CustomerCheckServiceImpl;
import Week3.Homework1.service.impl.NeroAbstractCustomerServiceImpl;
import Week3.Homework1.service.impl.StarbucksAbstractCustomerServiceImpl;


import java.util.Date;

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
