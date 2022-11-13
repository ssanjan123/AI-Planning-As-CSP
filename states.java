public class states{
    String RLoc;// Domain: Coffee Shop (cs), Sam’s office (off), Mail Room (mr), or Laboratory (lab)
    boolean RHC, SWC, MW, RHM;
    // Constructor
    public states(){
        RLoc = "off";
        RHC = false;
        SWC = true;
        MW = false;
        RHM = true;
    }

    public states(String RLoc, boolean RHC, boolean SWC, boolean MW, boolean RHM){
        this.RLoc = RLoc;
        this.RHC = RHC;
        this.SWC = SWC;
        this.MW = MW;
        this.RHM = RHM;
    }

    public String getRLoc(){
        return RLoc;
    }

    public boolean getRHC(){
        return RHC;
    }

    public boolean getSWC(){
        return SWC;
    }

    public boolean getMW(){
        return MW;
    }

    public boolean getRHM(){
        return RHM;
    } 

    public void setRLoc(String RLoc){
        this.RLoc = RLoc;
    }

    public void setRHC(boolean RHC){
        this.RHC = RHC;
    }

    public void setSWC(boolean SWC){
        this.SWC = SWC;
    }

    public void setMW(boolean MW){
        this.MW = MW;
    }

    public void setRHM(boolean RHM){
        this.RHM = RHM;
    }
    // Print the state
    public void printState(){
        System.out.println("RLoc: " + RLoc + " RHC: " + RHC + " SWC: " + SWC + " MW: " + MW + " RHM: " + RHM);
    }
    
}

