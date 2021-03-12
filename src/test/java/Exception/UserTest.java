package Exception;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;

public class UserTest {
    UserRegistration user = new UserRegistration();


            @Test
            public void firstnametruetest() {
            try {
            user.Validfirstname("Vishal");
            boolean result = user.Validlastname("Salaskar");
            Assertions.assertTrue(result);
            }
            catch (Exception e)
            {
            System.out.println("invalid ");
            }
            }

             @Test
            public void lastnametruetest() {
            try {
            UserRegistration user = new UserRegistration();
            boolean result = user.Validlastname("Salaskar");
            Assertions.assertTrue(result);
            }
            catch (Exception e)
            {
                System.out.println("Invalid");
            }

            @Test
            public void emailtruetest() {
            try {
                UserRegistration user = new UserRegistration();
                boolean result = user.Validemail("vishal@gmail.com");
                Assertions.assertTrue(result);
            }
            catch (Exception e)
            {
                System.out.println("Invalid");
            }
            @Test
            public void phonenotruetest() {
                try {
                    UserRegistration user = new UserRegistration();
                    boolean result = user.Validphoneno("91 9167965231");
                    Assertions.assertTrue(result);
                }
               catch (Exception e)
               {
                   System.out.println("Invalid");
               }

                @Test
                public void passwordtruetest() {
                    try {
                        UserRegistration user = new UserRegistration();
                        boolean result = user.Validpassword("Kaizen#2234");
                        Assertions.assertTrue(result);
                    }
                   catch (Exception e)
                   {
                       System.out.println("Invalid");
                   }

                }

            }

        }

    }
}