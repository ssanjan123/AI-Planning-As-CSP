import java.util.List;

public class ArcCon {
    static boolean arcReducePre (Variable variable, Action action, State state){
        boolean success = false;
        if(action.name == "MC" || action.name == "MCC")
            return true;     

        for(int k = 0; k < variable.domain.size(); k++){
            String preConValue = STRIPS.getActualValuePre(action, variable.name, state);
            if(variable.domain.get(k).contains(preConValue)){
                success = true;
            }
        }
        return success;
    }
    

static String arcReduceEffects(Variable variable, Action action, State state){
    String name = "";
    for(int k = 0; k < variable.domain.size(); k++){
        String effectValue = STRIPS.getActualValueEffects(action, variable.name, state);
        if(!variable.domain.get(k).contains(effectValue)){
                variable.domain.remove(effectValue);
            }
    }
    
    return name;
}
}
