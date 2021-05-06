package Week3.Homework1.service.impl;


import Week3.Homework1.base.BaseAbstractCustomerService;
import Week3.Homework1.entities.Customer;
import Week3.Homework1.service.CustomerCheckService;

public class StarbucksAbstractCustomerServiceImpl extends BaseAbstractCustomerService {

    private final CustomerCheckService customerCheckService;


    public StarbucksAbstractCustomerServiceImpl(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            System.out.println(customer.getFirstName()+" saved to starbucks");
        }else{
            System.out.println("Not a valid person");
        }
    }
}
