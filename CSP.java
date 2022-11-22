import java.util.List;
import java.util.ArrayList;

public class CSP{

    static List<Action> actions = new ArrayList<Action>();
    static List<Variable> variables = new ArrayList<Variable>();
    static State state = new State();

    static boolean solve(){
        boolean success = false;;
    
        for(int i = 0; i < actions.size(); i++){

            for(int j = 0; j < actions.get(i).preConArcs.size(); j++){

                for(int k = 0; k < variables.size(); k++){

                    if(variables.get(k).name == actions.get(i).preConArcs.get(j)){

                        if( !ArcCon.arcReducePre(variables.get(k), actions.get(i), state))
                            actions.get(i).domain.remove(0);
            }
        }
    }
    }
    //for each action which is true, recurse and check goal
    //return if state = goal, if not then 
    //sends back to arc consistency with new state for up to horizon
    //if horizon is max, return false
    //if only actions are move, then send
    //create new state, send to effects, copy everything from prev state to this state except name returned
    //for each action in the actions
    //call arcReduceEffects on newVariables and the action
    
    return success;
    
    }
    static List<Action> createActionList(){
        MC mc = new MC();
        PUC puc = new PUC();
        DELC delc = new DELC();
        PUM pum = new PUM();
        DELM delm = new DELM();
        List<Action> actions = new ArrayList<Action>();
        actions.add(mc); actions.add(puc); actions.add(delc); actions.add(pum); actions.add(delm);
        return actions;
    }

    static List<Variable> createVariableList(String[] stateArr){
        RLOC rloc = new RLOC(stateArr[0]);
        RHC rhc = new RHC(stateArr[1]);
        SWC swc = new SWC(stateArr[2]);
        MW mw = new MW(stateArr[3]);
        RHM rhm = new RHM(stateArr[4]);
        List<Variable> variables = new ArrayList<Variable>();
        variables.add(rloc); variables.add(rhc); variables.add(swc); variables.add(mw); variables.add(rhm);
        return variables;
    }

    static void stripsToCSP(String[] stateArr, int horizon, String[] goalArr){
        actions = createActionList();
        variables = createVariableList(stateArr);
    
    }
    
    


}