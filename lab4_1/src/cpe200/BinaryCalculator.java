package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        firstOperand=operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand=operand;
    }

    public String add() {
            double x;
            x = Double.parseDouble(firstOperand.operand) + Double.parseDouble(secondOperand.operand);
            if(x==(int)x) {
                int y=(int)x;
                return Integer.toString(y);
            }
            else{
            return Double.toString(x);
            }
    }

    public String subtract() {
        double x;
        x = Double.parseDouble(firstOperand.operand) - Double.parseDouble(secondOperand.operand);
        x = (double)Math.round(x*100000d)/100000d;
        if(x==(int)x) {
            int y=(int)x;
            return Integer.toString(y);
        }
        else{
            return Double.toString(x);
        }}


    public String multiply() {
        double x;
        x = Double.parseDouble(firstOperand.operand) * Double.parseDouble(secondOperand.operand);
        if(x==(int)x) {
            int y=(int)x;
            return Integer.toString(y);
        }
        else{
            return Double.toString(x);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        double x = Double.parseDouble(firstOperand.operand);
        double y = Double.parseDouble(secondOperand.operand);

        if(y == 0.0 || y == 0){
            throw new ArithmeticException();
        }
        double z = x / y;
        z = (double)Math.round(z*100000d)/100000d;
        if(z != (int)z ){
            return Double.toString(z) ; }
        else{
            int k;
            k = (int)z;
            return Integer.toString(k);
        }
    }

    public String power() {
        double x;
        x=Math.pow(Double.parseDouble(firstOperand.operand),Double.parseDouble(secondOperand.operand));
        if(x==(int)x) {
            int y=(int)x;
            return Integer.toString(y);
        }
        else{
            return Double.toString(x);
        }

    }

}
