package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int number = (int)numberToBeRounded;
        float numbeer = (float) number;
        float numbeeeer = numberToBeRounded - numbeer;
        if(numbeeeer/(0.5) >= 1) {
            number +=1;
            System.out.println(number);
        }
        else {
            System.out.println(number);
        }
    }
}
