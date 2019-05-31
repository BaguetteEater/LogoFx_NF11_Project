package logoparsing;

import logogui.Log;

import java.util.Map;

public enum ErrorTypes {

    VariableNonDeclaree(-1),
    DivisionParZero(-2),
    LoopSansRepete(-3),
    MoveSansStore(-4),
    FonctionNonDeclaree(-5),
    ProcedureNonDeclaree(-6),
    AriteNonRespectee(-7),
    SymboleNonReconnu(-8);

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;

    }

    private Integer code;

    ErrorTypes(Integer code){
        this.code = code;
        getMappings().put(code, this);
    }


    private static java.util.HashMap<Integer, ErrorTypes> mappings;
    private static java.util.HashMap<Integer, ErrorTypes> getMappings()
    {
        if (mappings == null)
        {
            mappings = new java.util.HashMap<>();
        }
        return mappings;
    }

    public static ErrorTypes forValue(Integer err) {
        return getMappings().get(err);
    }





}
