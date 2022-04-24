public class ternary {
    public static void main(String args[]) {
        int numOne = 10;
        int numTwo = 5;
       //  <condition> ? <value if condition is true> : < value if condition is false>
        int min = (numOne < numTwo) ? numOne : numTwo;
        System.out.println(min); //Output will be 5
    }

}
