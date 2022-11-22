

public class Solver {
    
   

boolean solve(){
    boolean solved = false;
    int horizon = 0;
    boolean solution = false;

    while(solved == false){
        String[] state = {"OFF", "FALSE", "TRUE", "FALSE", "TRUE"};
        String[] goal = {"OFF", "FALSE", "FALSE", "FALSE", "TRUE"};
        CSP.stripsToCSP(state, horizon, goal);
        CSP.solve();
        if(solution)
            solved = true;
        else        
            horizon++;
        }
        return solution;//The goal state is RLoc: off and SWC: F.
    }
}
