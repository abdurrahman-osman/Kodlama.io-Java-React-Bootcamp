package Week2.Homework2.service.impl;

import Week2.Homework2.entities.Customer;
import Week2.Homework2.mernis.RORKPSPublicSoap;
import Week2.Homework2.service.CustomerCheckService;


public class CustomerCheckServiceImpl implements CustomerCheckService {
    private RORKPSPublicSoap kpsPublicSoap = new RORKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        try {
            return kpsPublicSoap.TCKimlikNoDogrula(customer.getTc(), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getBirth().getYear());

        } catch (Exception e) {
            return false;
        }


    }
}
