// import states.java



public class Rob {

    // private variables of Rob
    private states s;

    // Constructor
    public Rob(){
        s = new states();
    }
    
    public void action(String a){
        if(a.equals("mc")){
            if(s.getRLoc().equals("cs")){
                s.setRLoc("off");
            }
            else if(s.getRLoc().equals("off")){
                s.setRLoc("lab");
            }
            else if(s.getRLoc().equals("lab")){
                s.setRLoc("mr");
            }
            else if(s.getRLoc().equals("mr")){
                s.setRLoc("cs");
            }
        }
        else if(a.equals("mcc")){
            if(s.getRLoc().equals("cs")){
                s.setRLoc("mr");
            }
            else if(s.getRLoc().equals("off")){
                s.setRLoc("cs");
            }
            else if(s.getRLoc().equals("mr")){
                s.setRLoc("lab");
            }
            else if(s.getRLoc().equals("lab")){
                s.setRLoc("off");
            }
        }
        else if(a.equals("PUC")){//Pick up coffee
            if(s.getRLoc().equals("cs") && s.getRHC() == false){
                s.setRHC(true);
            }
            // Ask if we need to take in consideration the fact that Rob
            // can't pick up the coffee if he is already holding mail
        }
        else if(a.equals("DelC")){//Deliver coffee
            if(s.getRLoc().equals("off") && s.getRHC() == true){
                s.setRHC(false);
                s.setSWC(false);
            }
        }
        else if(a.equals("PUM")){//Pick up mail
            if(s.getRLoc().equals("mr") && s.getRHM() == false && s.getMW() == true){

                s.setRHM(true);
                s.setMW(false);
            }
        }
        else if(a.equals("DelM")){//Deliver mail
            if(s.getRLoc().equals("off") && s.getRHM() == true){
                s.setRHM(false);
            }
        }
    }

    public states getStates(){
        return s;
    }

    public void setStates(states s){
        this.s = s;
    }

    // Print the state
    public void printState(){
        System.out.println("Rob is at " + s.getRLoc());
        System.out.println("Rob has coffee: " + s.getRHC());
        System.out.println("Sam wants coffee: " + s.getSWC());
        System.out.println("Mail is waiting: " + s.getMW());
        System.out.println("Rob has mail: " + s.getRHM());
    }

}
