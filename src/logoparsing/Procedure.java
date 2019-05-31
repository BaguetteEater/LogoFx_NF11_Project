package logoparsing;

import java.util.ArrayList;
import java.util.List;

public class Procedure {
    List<String> listParams = new ArrayList<>();

    LogoParser.Liste_instructionsContext listeInstruction;


    public Procedure(List<String> listParams, LogoParser.Liste_instructionsContext listeInstruction) {
        this.listParams = listParams;
        this.listeInstruction = listeInstruction;
    }

    public Procedure() {}

    public List<String> getListParams() {
        return listParams;
    }

    public void setListParams(List<String> listParams) {
        this.listParams = listParams;
    }

    public LogoParser.Liste_instructionsContext getListeInstruction() {
        return listeInstruction;
    }

    public void setListeInstruction(LogoParser.Liste_instructionsContext listeInstruction) {
        this.listeInstruction = listeInstruction;
    }




}
