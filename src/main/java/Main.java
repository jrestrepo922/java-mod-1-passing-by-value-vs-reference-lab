public class Main {
    public static void main(String[] args) {
        NumberContainer myNumber = new NumberContainer();
        multiplyNumbers(myNumber, 12, 3);
        System.out.println("Result = " + myNumber.number);

        // StringContainer myString = new StringContainer();
        // myString.text = "initial value";
        // addText(myString, " - adding new text");
        // System.out.println("modified text: " + myString.text);

        String myString = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString);

    }

    public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
        result = new NumberContainer();
        result.number = firstNumber * secondNumber;
    }

    public static void addText(String result, String newText) {
        result = result + newText;
    }
}
