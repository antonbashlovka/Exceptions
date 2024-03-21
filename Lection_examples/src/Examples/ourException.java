package Examples;

import java.io.IOException;

public class ourException extends IOException{
    public ourException(String message){
        super(message);
    }

    public String getMessage(){
        return super.getMessage();
    }
    
}
