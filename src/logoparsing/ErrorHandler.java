package logoparsing;

import logogui.Log;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ErrorHandler {

    private final static Map<ErrorTypes, String> ERROR_TYPES_STRING_MAP ;
    static {
        Map<ErrorTypes, String> tmpMap = new HashMap<>();
        tmpMap.put(ErrorTypes.VariableNonDeclaree, "Variable non déclarée");
        tmpMap.put(ErrorTypes.DivisionParZero, "Division par zéro");
        tmpMap.put(ErrorTypes.LoopSansRepete, "Utilisation de loop hors d'un bloc repete");
        tmpMap.put(ErrorTypes.MoveSansStore, "Utilisation d'un move sans store préalable");
        tmpMap.put(ErrorTypes.FonctionNonDeclaree, "Fonction non déclarée");
        tmpMap.put(ErrorTypes.ProcedureNonDeclaree, "Procédure non déclarée");
        tmpMap.put(ErrorTypes.AriteNonRespectee, "Arite non respectée");
        ERROR_TYPES_STRING_MAP = Collections.unmodifiableMap(tmpMap);
    }

    public void handle(Integer err) {
        Log.appendnl(ERROR_TYPES_STRING_MAP.get(ErrorTypes.forValue(err)));

    }
}
