import java.util.ArrayList;
import java.util.List;

public class Variable{
    String name;
    List<String> domain = new ArrayList<String>();
}
class RLOC extends Variable{
    RLOC(){
        name = "RLOC";
        domain.add("OFF");  domain.add("CS");  domain.add("LAB");  domain.add("MR"); 
    }
    RLOC(String loc){
        name = "RLOC";
        domain.add(loc);
    }
}
class RHC extends Variable{
    RHC(){
        name = "RHC";
        domain.add("TRUE");  domain.add("FALSE"); 
    }
    RHC(String rhc){
        name = "RHC";
        domain.add(rhc);
    }
}
class SWC extends Variable{
    SWC(){
        name = "SWC";
        domain.add("TRUE");  domain.add("FALSE");
    }
    SWC(String swc){
        name = "SWC";
        domain.add(swc);
    }
    
}
class MW extends Variable{
    MW(){
        name = "MW";
        domain.add("TRUE");  domain.add("FALSE");
    }
    MW(String mw){
        name = "MW";
        domain.add(mw);
    }
}
class RHM extends Variable{
    RHM(){
        name = "RHM";
        domain.add("TRUE");  domain.add("FALSE");
    }
    RHM(String rhm){
        name = "RHM";
        domain.add(rhm);
    }
}