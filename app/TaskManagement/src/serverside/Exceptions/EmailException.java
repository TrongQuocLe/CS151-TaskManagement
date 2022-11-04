package serverside.Exceptions;

public class EmailException extends Exception{
    public EmailException(){
        super("Email does not match pattern string@domain.com");
    }

}
