package Week2.Homework3.Service.Impl;

import Week2.Homework2.mernis.RORKPSPublicSoap;
import Week2.Homework3.Service.UserCheckService;
import Week2.Homework3.entities.User;


public class UserCheckServiceImpl implements UserCheckService {
    RORKPSPublicSoap kpsPublicSoap = new RORKPSPublicSoap();

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
