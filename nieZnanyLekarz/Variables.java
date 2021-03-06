package nieZnanyLekarz;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LoginScreen extends BufferedReaderClass{

    private String[] array_userAndPassword          = {
                                                        "admin", "123",
                                                        "tgrabarczyk@nzl.pl", "tgpass",
                                                        "mjazdzewska@nzl.pl", "mjpass",
                                                        "kturski@nzl.pl", "ktpass"
                                                        };
    List<String> list_userAndPassword               = new ArrayList<>(Arrays.asList(array_userAndPassword));
} // Login Screen
class AllDoctors extends LoginScreen {
    String[] array_nieZnanyLekarzDoctors            = {
                                                        "Internist",
                                                        "Oncologist",
                                                        "Cardiologist"
                                                        };
    List<String> list_nieZnanyLekarzDoctors         = new ArrayList<>(Arrays.asList(array_nieZnanyLekarzDoctors));

    JButton[] button_doctorSpecialization           = new JButton[list_nieZnanyLekarzDoctors.size()];
    JFrame[] frame_nieZnanyLekarzSpecialist         = new JFrame[list_nieZnanyLekarzDoctors.size()];
} // All doctors specializations
class Internists extends AllDoctors{
    private String[] array_internistsIcons          = {
                                                        "nieZnanyLekarz/doctorPictures/ginekolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/ginekolog2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista2nd.jpg"
                                                        };


    List<String> list_internistsIcons               = new ArrayList<>(Arrays.asList(array_internistsIcons));
} // Internists Information
class DatesInternist extends Internists {
    private String[] array_datesFirstInternist      = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstInternist           = new ArrayList<>(Arrays.asList(array_datesFirstInternist));
    JFrame frame_datesFirstInternist = new JFrame("Calendar First Internist");
    JButton[] button_datesFirstInternist = new JButton[list_datesFirstInternist.size()];


    private String[] array_datesSecondInternist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondInternist          = new ArrayList<>(Arrays.asList(array_datesSecondInternist));
    JFrame frame_datesSecondInternist = new JFrame("Calendar Second Internist");
    JButton[] button_datesSecondInternist = new JButton[list_datesSecondInternist.size()];


    private String[] array_datesThirdInternist      = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdInternist           = new ArrayList<>(Arrays.asList(array_datesThirdInternist));
    JFrame frame_datesThirdInternist = new JFrame("Calendar Third Internist");
    JButton[] button_datesThirdInternist = new JButton[list_datesThirdInternist.size()];

    private String[] array_datesFourthInternist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthInternist          = new ArrayList<>(Arrays.asList(array_datesFourthInternist));
    JFrame frame_datesFourthInternist = new JFrame("Calendar Fourth Internist");
    JButton[] button_datesFourthInternist = new JButton[list_datesFourthInternist.size()];


}
class Oncologists extends DatesInternist{
    private String[] array_oncologistsIcons         = {
                                                        "nieZnanyLekarz/doctorPictures/internista1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog2nd.jpg"
                                                        };
    List<String> list_oncologistsIcons              = new ArrayList<>(Arrays.asList(array_oncologistsIcons));

} // Oncologists Information
class DatesOncologists extends Oncologists {
    private String[] array_datesFirstOncologist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstOncologist          = new ArrayList<>(Arrays.asList(array_datesFirstOncologist));
    JFrame frame_datesFirstOncologist = new JFrame("Calendar First Oncologist");
    JButton[] button_datesFirstOncologist = new JButton[list_datesFirstOncologist.size()];


    private String[] array_datesSecondOncologist    = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondOncologist         = new ArrayList<>(Arrays.asList(array_datesSecondOncologist));
    JFrame frame_datesSecondOncologist = new JFrame("Calendar Second Oncologist");
    JButton[] button_datesSecondOncologist = new JButton[list_datesSecondOncologist.size()];


    private String[] array_datesThirdOncologist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdOncologist          = new ArrayList<>(Arrays.asList(array_datesThirdOncologist));
    JFrame frame_datesThirdOncologist = new JFrame("Calendar Third Oncologist");
    JButton[] button_datesThirdOncologist = new JButton[list_datesThirdOncologist.size()];

    private String[] array_datesFourthOncologist    = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthOncologist         = new ArrayList<>(Arrays.asList(array_datesFourthOncologist));
    JFrame frame_datesFourthOncologist = new JFrame("Calendar Fourth Oncologist");
    JButton[] button_datesFourthOncologist = new JButton[list_datesFourthOncologist.size()];
}
class Cardiologists extends DatesOncologists {
    private String[] array_cardiologistsIcons       = {
                                                        "nieZnanyLekarz/doctorPictures/onkolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/pediatra1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/pediatra2nd.jpg"
                                                        };
    List<String> list_cardiologistsIcons            = new ArrayList<>(Arrays.asList(array_cardiologistsIcons));
} // Cardiologists Information
class DatesCardiologists extends Cardiologists {
    private String[] array_datesFirstCardiologist   = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstCardiologist        = new ArrayList<>(Arrays.asList(array_datesFirstCardiologist));
    JFrame frame_datesFirstCardiologist = new JFrame("Calendar First Cardiologist");
    JButton[] button_datesFirstCardiologist = new JButton[list_datesFirstCardiologist.size()];


    private String[] array_datesSecondCardiologist  = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondCardiologist       = new ArrayList<>(Arrays.asList(array_datesSecondCardiologist));
    JFrame frame_datesSecondCardiologist = new JFrame("Calendar Second Cardiologist");
    JButton[] button_datesSecondCardiologist = new JButton[list_datesSecondCardiologist.size()];


    private String[] array_datesThirdCardiologist   = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdCardiologist        = new ArrayList<>(Arrays.asList(array_datesThirdCardiologist));
    JFrame frame_datesThirdCardiologist = new JFrame("Calendar Third Cardiologist");
    JButton[] button_datesThirdCardiologist = new JButton[list_datesThirdCardiologist.size()];

    private String[] array_datesFourthCardiologist  = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthCardiologist       = new ArrayList<>(Arrays.asList(array_datesFourthCardiologist));
    JFrame frame_datesFourthCardiologist = new JFrame("Calendar Fourth Cardiologist");
    JButton[] button_datesFourthCardiologist = new JButton[list_datesFourthCardiologist.size()];

}
class CreateListOfDoctorNames extends DatesCardiologists {
    List<List<String>> listOfDoctorNames = new ArrayList<>();

    void createListOfDoctorNames() {
        listOfDoctorNames.add(list_internistNames);
        listOfDoctorNames.add(list_oncologistNames);
        listOfDoctorNames.add(list_cardiologistNames);
    }

}
class Variables extends CreateListOfDoctorNames {
    JFrame frame_loginScreen                        = new JFrame("Login to nieZnany Lekarz");
    JFrame frame_selectDoctorSpeciality             = new JFrame("Doctor speciality - nieZnany Lekarz");

    JTextField textField_username                   = new JTextField("admin");
    JPasswordField textField_password               = new JPasswordField("123");
    JButton button_submit                           = new JButton("Log in");
    JButton button_backUp                           = new JButton("Back");

    boolean setLayoutDocSpecialityAlreadyExecuted   = false;
    boolean setLayoutDoctorsAlreadyExecuted         = false;
} // Other Variables
