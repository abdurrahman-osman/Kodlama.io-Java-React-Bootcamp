package Week3.Homework2.Service.Impl;

import Week3.Homework2.Service.UserCheckService;
import Week3.Homework2.entities.User;
import Week3.mernis.HNSKPSPublicSoap;

public class UserCheckServiceImpl implements UserCheckService {
    HNSKPSPublicSoap kpsPublicSoap = new HNSKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(User user) {
        try {
            return kpsPublicSoap.TCKimlikNoDogrula(user.getNationalityId(), user.getName().toUpperCase(),
                    user.getLastName().toUpperCase(), user.getBirthDate().getYear());

        } catch (Exception e) {
            return false;
        }
    }
}
