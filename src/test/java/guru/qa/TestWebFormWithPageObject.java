package guru.qa;

import org.junit.jupiter.api.Test;
import pages.CheckRegistrationPage;
import pages.RegistrationPage;

public class TestWebFormWithPageObject extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckRegistrationPage checkRegistrationPage = new CheckRegistrationPage();

    @Test
    void fullSuccessTest() {

        registrationPage
                .openPage()
                .closeBanner()
                .setFirstName(userName)
                .setLastName(userLastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setSubject(userSubject)
                .setHobby(userHobby)
                .setImage(userImage)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .setClickSubmit();
        checkRegistrationPage
                .checkNameAndLastName(userName, userLastName)
                .checkEmail(userEmail)
                .checkGender(userGender)
                .checkPhone(userPhone)
                .checkSubject(userSubject)
                .checkImage(userImageName)
                .checkHobby(userHobby)
                .checkAddress(userAddress)
                .checkState(userState)
                .checkCity(userCity);

    }


}
