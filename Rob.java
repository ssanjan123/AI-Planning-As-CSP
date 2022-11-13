// import states.java



public class Rob {

    // private variables of Rob
    public states s;

    // Constructor
    public Rob(){
        s = new states();
    }
    

    // Constructor
    // public void initialize(){
    //     this.s.setRLoc("off");
    //     this.s.setRHC(false);
    //     this.s.setSWC(true);
    //     this.s.setMW(false);
    //     this.s.setRHM(true);
    // }

    public void action(String a){
        if(a.equals("mc")){
            if(s.RLoc.equals("cs")){
                s.RLoc = "off";
            }
            else if(s.RLoc.equals("off")){
                s.RLoc = "lab";
            }
            else if(s.RLoc.equals("lab")){
                s.RLoc = "mr";
            }
            else if(s.RLoc.equals("mr")){
                s.RLoc = "cs";
            }
        }
        else if(a.equals("mcc")){
            if(s.RLoc.equals("cs")){
                s.RLoc = "mr";
            }
            else if(s.RLoc.equals("off")){
                s.RLoc = "cs";
            }
            else if(s.RLoc.equals("mr")){
                s.RLoc = "lab";
            }
            else if(s.RLoc.equals("lab")){
                s.RLoc = "off";
            }
        }
        else if(a.equals("PUC")){//Pick up coffee
            if(s.RLoc.equals("cs") && s.RHC == false){
                s.RHC = true;
            }
            // Ask if we need to take in consideration the fact that Rob
            // can't pick up the coffee if he is already holding mail
        }
        else if(a.equals("DelC")){//Deliver coffee
            if(s.RLoc.equals("off") && s.RHC == true){
                s.RHC = false;
                s.SWC = false;
            }
        }
        else if(a.equals("PUM")){//Pick up mail
            if(s.RLoc.equals("mr") && s.RHM == false && s.MW == true){
                s.RHM = true;
                s.MW = false;
            }
        }
        else if(a.equals("DelM")){//Deliver mail
            if(s.RLoc.equals("off") && s.RHM == true){
                s.RHM = false;
            }
        }
    }

}
