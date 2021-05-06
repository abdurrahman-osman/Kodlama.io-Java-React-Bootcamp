package Week3.Homework1.service.impl;


import Week3.Homework1.base.BaseAbstractCustomerService;
import Week3.Homework1.entities.Customer;

public class NeroAbstractCustomerServiceImpl extends BaseAbstractCustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" saved to nero");
    }
}
