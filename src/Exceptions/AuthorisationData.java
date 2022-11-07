package Exceptions;

public class AuthorisationData {

    private AuthorisationData() {

    }
    public static boolean logAndPassValid (String login, String password, String passwordConfirm){
        try {
            logAndPassCheck(login, password, passwordConfirm);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void logAndPassCheck (String login, String password, String passwordConfirm) throws WrongLoginException, WrongPasswordException{
        if(!isLogPassValid(login)){
            throw new WrongLoginException("Введите правильный логин");
        }
        if (!isLogPassValid(password)){
            throw new WrongPasswordException("Введите правильный пароль");
        }
        if (!password.equals(passwordConfirm)){
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }

    public static boolean isLogPassValid(String s) {
        String allowedSymbols = "abcdefghijklmnopqrstuvwxyz0123456789_";
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!allowedSymbols.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
