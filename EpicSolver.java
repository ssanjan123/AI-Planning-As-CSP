public class EpicSolver {
    
    static boolean solver(int maxHorizon){
    STRIPS state;
    STRIPS goal;
    int horizon;

    
    horizon = 0;
    boolean solved = false;
    boolean solution = false;
    
    while(!solved){
        //Rename strips to csp
        state = new STRIPS();
        STRIPS prevState = new STRIPS();
        solution = epicSolver(horizon, horizon, state, prevState);
        if(solution){
            solved = true;
            System.out.println("Horizon: " + horizon);
        }
        else{
            if(horizon == maxHorizon)
                return false;
            horizon++;
        }
    }
    return solved;

}


static boolean epicSolver(int horizon, int currentHorizon, STRIPS state, STRIPS prevState){
    boolean solution = false;
    String[] arr = {"PUC", "DELC", "PUM", "DELM", "MCC"};
    if(horizon == 0)
        return solution;
    else{
        for(int i = 0;i < arr.length; i++){
            state.action(arr[i]);
            if(state.getStates().getRLOC() == "OFF" && state.getStates().getSWC() == false){
                solution = true;
                return solution;
            }
            
            else if(state.equals(prevState))
            {
                continue;
            }
            else {
                prevState.printState(currentHorizon - 1);
                STRIPS prevState2 = new STRIPS(state);
                System.out.println(arr[i]);
                state.printState(currentHorizon);
                return epicSolver(--horizon, currentHorizon, state, prevState2);
                
                    //horizon = maxHorizon;
            }
        }
    }
    return solution;
}

public static void main(String args[]){
    boolean check = solver(7);
    System.out.println(check);
}

}



