package Exception;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println(checkCredentials("login", "password", "password"));
        System.out.println(checkCredentials("LOGIN", "PASSWORD", "PASSWORD"));
        System.out.println(checkCredentials("LogiN", "pasSwo_rd", "pasSwo_rd"));
        System.out.println(checkCredentials("login&", "password", "password"));
    }


    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            return Data.validateCredentials(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при валидации логина: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при валидации пароля: " +  e.getMessage());
            return false;
        }
    }
}
