package logoparsing;

import java.util.List;

public class Fonction extends Procedure {
    private LogoParser.Retour_foncContext retour;

    public LogoParser.Retour_foncContext getRetour() {
        return retour;
    }

    public void setRetour(LogoParser.Retour_foncContext retour) {
        this.retour = retour;
    }

    public Fonction(List<String> listParams, LogoParser.Liste_instructionsContext listeInstruction, LogoParser.Retour_foncContext retour) {
        super(listParams, listeInstruction);
        this.retour = retour;
    }

    public Fonction() {}
}
