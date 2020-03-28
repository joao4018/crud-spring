package br.com.crud.config;

/**
 * @author joao4018 25/03/20.
 */
public class SecurityConstants {
    static final String SECRET = "treino";
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/signup";
    static final long EXPIRATION_TIME = 86400000L;

//    public static void main(String[] args) {
//        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
//    }
}
