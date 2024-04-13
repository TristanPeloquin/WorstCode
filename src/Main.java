import java.util.Scanner;

public class Main {
    public class class1{public class class2{public class class3{public class class4{public class class5{public class class6{public class class7{public class class8{public class class9{public class class10{public class class11{public class class12{public class class13{public class class14{
        public static final double RATES_OF_I_TAX=10;private static final double RATES_OF_H_INS= 1.5;protected static final double RATES_OF_S_INS= 7;
        public static void main(String args[]){
            int grosssalary=1000;int net=class14.calc(grosssalary);class14.printincomeinformation(grosssalary, net);}
        public static int calc (int salary){double deductiona= salary*(RATES_OF_I_TAX/ 100);double deductionb=salary*(RATES_OF_H_INS/100);
            double deductionc = salary  * (RATES_OF_S_INS/ 100);int tmp=salary -(int)deductiona-(int)deductionb-(int)deductionc;return tmp;}
        public static void printincomeinformation(int allsalary, int homepay){System.out.println("Gross income: " + allsalary + " doller\nNet income:   " + homepay + "doller\n");
            if (3000<allsalary){System.out.println("You get great salary!\nDo your best at work!\n");;}if (3000>=allsalary) {System.out.println("You're glowing up now!\nDo your best at work!\n");}}}}}}}}}}}}}}}}

        private static Number recursions = new Number(1, 2, 3, 4, 5);
        public static void main(String[] args) throws InterruptedException {
            Scanner scanner = new Scanner(System.in);System.out.println("Welcome to the convoluted number multiplier!");
            System.out.println("Please input the first number:");String firstInput = scanner.nextLine();int firstNumber = parseInput(firstInput);
            System.out.println("Please input the second number:");String secondInput = scanner.nextLine();int secondNumber = parseInput(secondInput);
            int result = multiplyNumbers(new Number(firstNumber/10000, (firstNumber%10000)/1000, (firstNumber%1000)/100, (firstNumber%100)/10, firstNumber%10), new Number(secondNumber/10000, (secondNumber%10000)/1000, (secondNumber%1000)/100, (secondNumber%100)/10, secondNumber%10));
            System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is: " + result);}

        private static int parseInput(String input) {
            int result = 0;char[] inputChars = input.toCharArray();for (char c : inputChars) {result += Character.getNumericValue(Character.toLowerCase(Character.toUpperCase(c)));}
            return result;}

        private static int multiplyNumbers(Number x, Number y) throws InterruptedException {
            recursions.setNum(recursions.getNum()-1);if(recursions.getNum()==0){System.out.println("calculating...");return multiplyNumbers(x, y);}
            for(int i = 0; i<1934567; i++){System.out.print("calculating...");}System.out.println("\n");int result = 0;int b = y.getNum();int a = x.getNum();
            while (b != 0) {if ((b & 1) != 0) {result += a;}a <<= 1;b >>= 1;}return result;}}
