package logoparsing;

public class LogoFxException extends Exception{

    private ErrorTypes codeErreur;

    public LogoFxException(String message, ErrorTypes error) {
        super(message);
        this.codeErreur = codeErreur;
    }

    public ErrorTypes getCodeErreur() {
        return codeErreur;
    }

    public void setCodeErreur(ErrorTypes codeErreur) {
        this.codeErreur = codeErreur;
    }
}
