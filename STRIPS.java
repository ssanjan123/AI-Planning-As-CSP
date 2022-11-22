// import states.java



public class STRIPS {

    // private variables of Rob
    private State s;

    // Constructor
    public STRIPS(){
        s = new State();
    }
    public STRIPS(STRIPS state){
        s = new State();
        s.setMW(state.getStates().getMW());
        s.setRHC(state.getStates().getRHC());
        s.setRHM(state.getStates().getRHM());
        s.setRLOC(state.getStates().getRLOC());
        s.setSWC(state.getStates().getSWC());
    }
    public boolean equals(STRIPS strips){
        if(strips.s.getMW() == s.getMW() && strips.s.getRHC() == s.getRHC() && strips.s.getRHM() == s.getRHM() && strips.s.getRLOC() == s.getRLOC() && strips.s.getSWC() == s.getSWC())
        return true;
        else
        return false;
    }
    public static String getActualValuePre(String action, String variableName, State state){
        String str = "";
        if(action == "PUC"){
            if(variableName == "RLOC")
                str =  "CS";
            else if(variableName == "RHC")
                str =  "FALSE";
        }
        else if(action == "DELC"){
            if(variableName == "RLOC")
                str =  "OFF";
            if(variableName == "SWC")
                str =  "FALSE";
        }
        else if(action == "PUM"){
            if(variableName == "RLOC")
                str =  "MR";
            else if(variableName == "MW")
                str =  "TRUE";
        }
        else if(action == "DELM"){
            if(variableName == "RLOC")
                str =  "OFF";
            else if(variableName == "SWC")
                str =  "FALSE";
        }
    
        return str;
    }
    
    public static String getActualValueEffects (String action, String variableName, State state){
        String str = "";
        //if action is "PUC" then
        //if variable is RHC then str = "TRUE"
        if(action == "PUC"){
            if(variableName == "RHC")
                str =  "TRUE";
        }
        else if(action == "DELC"){
            if(variableName == "RHC")
                str =  "FALSE";
            else if(variableName == "SWC")
                str =  "FALSE";
        }
        else if(action == "PUM"){
            if(variableName == "RHM")
                str =  "TRUE";
               
            else if(variableName == "MW")
                str =  "FALSE";
        }
        else if(action == "DELM"){
            if(variableName == "RHM")
                str =  "FALSE";
        }
        else if(action == "MC"){
            if(variableName == "RLOC"){
                if(state.getRLOC() == "CS")
                    str =  "OFF";
                else if(state.getRLOC() == "OFF")
                    str =  "LAB";
                else if(state.getRLOC() == "LAB")
                    str =  "MR";
                else if(state.getRLOC() == "MR")
                    str =  "CS";
            }
        }
        else if(action == "MCC"){
            if(variableName == "RLOC"){
                if(state.getRLOC() == "OFF")
                    str =  "CS";
                else if(state.getRLOC() == "CS")
                    str =  "MR";
                else if(state.getRLOC() == "MR")
                    str =  "LAB";
                else if(state.getRLOC() == "LAB")
                    str =  "OFF";
            }
        }
        return str;
        
    }
    
    public void action(String a){
        if(a.equals("MC")){
            if(s.getRLOC().equals("CS")){
                //effects
                s.setRLOC("OFF");
            }
            else if(s.getRLOC().equals("OFF")){
                s.setRLOC("LAB");
            }
            else if(s.getRLOC().equals("LAB")){
                s.setRLOC("MR");
            }
            else if(s.getRLOC().equals("MR")){
                s.setRLOC("CS");
            }
        }
        else if(a.equals("MCC")){
            if(s.getRLOC().equals("CS")){
                s.setRLOC("MR");
            }
            else if(s.getRLOC().equals("OFF")){
                s.setRLOC("CS");
            }
            else if(s.getRLOC().equals("MR")){
                s.setRLOC("LAB");
            }
            else if(s.getRLOC().equals("LAB")){
                s.setRLOC("OFF");
            }
        }
        else if(a.equals("PUC")){//Pick up cOFFee
            if(s.getRLOC().equals("CS") && s.getRHC() == false){
                s.setRHC(true);
            }
            // Ask if we need to take in consideration the fact that Rob
            // can't pick up the cOFFee if he is already holding mail
        }
        else if(a.equals("DELC")){//Deliver cOFFee
            if(s.getRLOC().equals("OFF") && s.getRHC() == true){
                s.setRHC(false);
                s.setSWC(false);
            }
        }
        else if(a.equals("PUM")){//Pick up mail
            if(s.getRLOC().equals("MR") && s.getRHM() == false && s.getMW() == true){

                s.setRHM(true);
                s.setMW(false);
            }
        }
        else if(a.equals("DELM")){//Deliver mail
            if(s.getRLOC().equals("OFF") && s.getRHM() == true){
                s.setRHM(false);
            }
        }
    }

    public State getStates(){
        return s;
    }

    public void setStates(State s){
        this.s = s;
    }

    // Print the state
    public void printState(int horizon){
        System.out.println("RLoc" + horizon + " = " + s.getRLOC());
        System.out.println("RHC" + horizon + " = " + s.getRHC());
        System.out.println("SWC" + horizon + " = " + s.getSWC());
        System.out.println("MW" + horizon + " = " + s.getMW());
        System.out.println("RHM" + horizon + " = " + s.getRHM());
    }

}
