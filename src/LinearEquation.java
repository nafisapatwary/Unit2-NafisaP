public class LinearEquation {

    //    private String coords;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor method takes in user input as integers and assigns user inputted values to instance variables
    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // slopeAsFraction method calculates the numerator and denominator and then returns a string with them in fraction form
    public String slopeAsFraction(){
        int slopeNum = y2 - y1;
        int slopeDen = x2 - x1;
        return (slopeNum + "/" + slopeDen + "x");
    }

    // slopeAsDecimal method returns a double which represents the slope as a decimal
    public double slopeAsDecimal(){
        return Math.round((((double)y2 - y1) / (x2 - x1)) * 100.0) / 100.0;
    }

    // calculateYIntercept returns a double that is the y intercept for the equation that the points make
    // It takes the equation y = mx + b by manipulating the equation to b = -mx + y
    public double yIntercept()
    {
        return Math.round(((slopeAsDecimal() * -1 * x1) + y1) * 100.0) / 100.0;
    }

    // distance returns the distance as a double by using the distance formula (sqrt of x2-x1 squared plus y2-y1 squared)
    public double distance()
    {
        return Math.round(Math.sqrt(((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2))) * 100.0) / 100.0;
    }

    // createLinearEquation returns a string with the slope as a fraction and the y intercept formatted in the equation
    // form y = mx + b
    public String createLinearEquation()
    {
        return ("Linear Equation: y = " + slopeAsFraction() + " + " + yIntercept());
    }

    // solveForPoint returns a string after calculating the y value associated with the inputted x3 value
    // The string is returned in (x,y) format
    public String solveForPoint(double x3)
    {
        double newY = slopeAsDecimal() * (x3) + yIntercept();
        return ("New Point: (" + x3 + "," + newY + ")");
    }

    // toString will return a string with all the information about the points that should be printed
    public String toString(){
        return ("First Pair: (" + x1 + "," + y1 + ")\nSecond pair: (" + x2 + "," + y2 + ")\nSlope of line: "
                + slopeAsDecimal() + "\nY-intercept: " + yIntercept() + "\nSlope intercept form: "
                + createLinearEquation() + "\nDistance between points: " + distance());

    }
}
