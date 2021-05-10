package Week2.Homework2.service.impl;


import Week2.Homework2.base.BaseAbstractCustomerService;
import Week2.Homework2.entities.Customer;

public class NeroAbstractCustomerServiceImpl extends BaseAbstractCustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" saved to nero");
    }
}
