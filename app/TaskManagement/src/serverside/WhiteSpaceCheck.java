package serverside;

import serverside.Exceptions.PasswordException;

public class WhiteSpaceCheck extends PasswordException{
    public WhiteSpaceCheck(){
        super(2);
    }
    
}
