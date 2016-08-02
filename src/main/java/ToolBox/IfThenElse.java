package ToolBox;

/**
 * Created by Justin on 7/12/16.
 */



        public class IfThenElse {




        private int currentSpeed = 100;

        //if-then-else

    private boolean isMoving() {
        // the "if" clause: currentSpeed is greater than zero
        // the "then" clause: currentSpeed is greater than zero: return true
// the "else" clause: currentSpeed was not greater than zero: return false
        return currentSpeed > 0;
    }

    // if-then
    public void applyBrakes() {
        // the "if" clause: bicycle must be moving
        if (isMoving()) {
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
    }

    // nested if-then-else and if-then-else-if
    public void howFast() {
        // the outer "if" clause: bicycle must be moving
        if (isMoving()) {
            // the inner "if" clause: currentSpeed operators
            if (currentSpeed <= 20) {
                System.out.println("bicycle is moving slow!");
            } else if (currentSpeed > 20 && currentSpeed <= 35) {
                System.out.println("Bicycle is moving average");
            } else {
                System.out.println("Is moving Crazy Fast!");
            }
        } else {
            System.out.println("Bicycle is stopped.");
        }
    }
}






