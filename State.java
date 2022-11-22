public class State{
    private String RLOC;// Domain: COFFee Shop (cs), Sam’s OFFice (OFF), Mail Room (mr), or Laboratory (lab)
    private boolean RHC, SWC, MW, RHM;
    // Constructor
    public State(){
        RLOC = "OFF";
        RHC = false;
        SWC = true;
        MW = false;
        RHM = true;
    }

    public State(State state){
        this.RLOC = this.getRLOC();
        this.RHC = this.getRHC();
        this.SWC = this.getSWC();
        this.MW = this.getMW();
        this.RHM = this.getRHM();
    }

    public State(String RLOC, boolean RHC, boolean SWC, boolean MW, boolean RHM){
        this.RLOC = RLOC;
        this.RHC = RHC;
        this.SWC = SWC;
        this.MW = MW;
        this.RHM = RHM;
    }

    public String getRLOC(){
        return RLOC;
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

    public void setRLOC(String RLOC){
        this.RLOC = RLOC;
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
   
    
}

