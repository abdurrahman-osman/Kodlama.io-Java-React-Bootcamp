package Week3.Homework1.service.impl;

import Week3.Homework1.entities.Customer;
import Week3.mernis.HNSKPSPublicSoap;
import Week3.Homework1.service.CustomerCheckService;


public class CustomerCheckServiceImpl implements CustomerCheckService {
    private HNSKPSPublicSoap ibskpsPublicSoap = new HNSKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        try {
            return ibskpsPublicSoap.TCKimlikNoDogrula(customer.getTc(), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getBirth().getYear());

        } catch (Exception e) {
            return false;
        }


    }
}
