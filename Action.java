import java.util.ArrayList;
import java.util.List;

public class Action{
    Action(){}
    String name;
    List<String> domain = new ArrayList<String>();
    List<String> preConArcs = new ArrayList<String>();
    List<String> effectArcs = new ArrayList<String>();
}
class MC extends Action {
    MC() {
        name = "MC";
        domain.add("TRUE");
        effectArcs.add("RLOC");
    }
}
class MCC extends Action{
    MCC(){
        name = "MCC";
        domain.add("TRUE");
        effectArcs.add("RLOC");
    }
}
class PUC extends Action{
    PUC(){
        name = "PUC";
        domain.add("TRUE");domain.add("FALSE");
        preConArcs.add("RLOC"); preConArcs.add("RHC");
        effectArcs.add("RHC");
    }
}
class DELC extends Action{
    DELC(){
        name = "DELC";
        domain.add("TRUE");domain.add("FALSE");
        preConArcs.add("RLOC"); preConArcs.add("RHC");
        effectArcs.add("RHC"); effectArcs.add("SWC");
    }
}
class PUM extends Action{
    PUM(){
        name = "PUM";
        domain.add("TRUE"); domain.add("FALSE");
        preConArcs.add("RLOC"); preConArcs.add("MW");
        effectArcs.add("RHM");effectArcs.add("MW");
    }
}
class DELM extends Action{
    DELM(){
        name = "DELC";
        domain.add("TRUE"); domain.add("FALSE");
        preConArcs.add("RLOC"); preConArcs.add("RHM");
        effectArcs.add("RHM");
    }
}
