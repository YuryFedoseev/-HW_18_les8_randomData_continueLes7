package guru.qa;

import org.junit.jupiter.api.Test;
import pages.CheckRegistrationPage;
import pages.RegistrationPage;

public class TestWebFormWithPageObject extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckRegistrationPage checkRegistrationPage = new CheckRegistrationPage();

    @Test
    void fullSucsessTest() {

        String userName = "Ivan";
        String userLastName = "Kuzmin";
        String userEmail = "mail@muil.ru";
        String userGender = "Other"; // Female , Male , Other
        String userPhone = "9876543218";
        String userImage = "src/test/resources/image/379-scaled.jpg";
        String userImageName = "379-scaled.jpg";
        String userSubject = "Chemistry";
        String userHobby = "Music";
        String userAddress = "Lenina 14";
        String userState = "Haryana";
        String userCity = "Karnal";


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
