package Exception;

import java.util.regex.Pattern;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

    public class UserRegistration extends Throwable {

        public boolean result;

        public static String patternfirstname="[A-Z]{1}[a-z]{2,}";
        public static String patternlastname="[A-Z]{1}[a-z]{2,}";
        public static String patternemail="^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
        public static String patterphonenumber="^[0-9]{2}[ ][0-9]{10}$";
        public static String patterpassword="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

        public boolean Validfirstname(String firstname) {
            Pattern p = Pattern.compile("^[A-Z][a-z]{3,}$");
            Matcher m = p.matcher(firstname);
            return m.find();
        }
        public boolean Validlastname(String lastname)
        {
            Pattern pattern= Pattern.compile(patternlastname);
            return pattern.matcher(lastname).matches();
        }
        public boolean Validemail(String email)
        {
            Pattern pattern = Pattern.compile(patternemail);
            return pattern.matcher(email).find();
        }
        public boolean Validphoneno(String phonenumber) {
            Pattern pattern= Pattern.compile(patterphonenumber);
            return pattern.matcher(phonenumber).find();
        }
        public boolean Validpassword(String password)
        {
            Pattern pattern = Pattern.compile(patterpassword);
            return pattern.matcher(password).find();
        }

    }
