import java.util.Random;

public class lengthCharacter {

    public static void main(String[] args) {
        String x= "We Learning Java";
        System.out.println("The vale of x is: "+x);

        //Getting value in lowercase
        System.out.println("The vale of x with lower case: "+x.toLowerCase());
        //Getting value in uppercase
        System.out.println("The vale of x with upper case: "+x.toUpperCase());
        //Ignore Case Sensitive
        System.out.println("Comparing with x value- "+x.equalsIgnoreCase("We Learning Java"));


        //Calculating length
        System.out.println("The length of the Above String is- : "+x.length());

        //To Check any indexNumber character  from the String Value
        System.out.println("Above String value contains "+x.charAt(4));
        //To check any character from the above String value
        System.out.println("Above String value contains "+x.contains("a"));
        //Concat any value
        System.out.println("Student ID- ".concat("16029-669-09"));

        //SubString help to split any String value
        System.out.println("After splitting by using Substring- "+x.substring(4));
        //Using Beginning  and Ending Index
        System.out.println("After splitting by using Substring- "+x.substring(1,5));


        //Using Random to genarate Random Number
        Random random= new Random();
        int RandomNUmber=random.nextInt(100);
        System.out.println("sayed"+RandomNUmber+"@gmail.com");


        //call Static method
        lengthCharacter.name();
        //call static with the argument
        lengthCharacter.name2("Fat ", "Fish");

        //calling the return type method
        lengthCharacter object=new lengthCharacter();
        int summationResult=object.summation();
        System.out.println("The Returned Value from the Return Type method- "+summationResult);


        // Calling the Return type method with the parameter
        int subtractResult= object.subtract(50, 10);
        System.out.println("The Returned Value from the Return Type method with Argument is - "+subtractResult);

       // LearnSingleTon learn=LearnSingleTon.singleton();
    }

    //create a non-return type Static Method
    public static void name() {
        System.out.println("Fat");
        System.out.println("Razib");
    }

    //non-return type Static method with Argument, using the same name

    public static void name2(String x, String y){

        System.out.println(x+y);


    }

    // Return type method
    public int summation(){
        int firstNumber, secondNumber, sum;
        firstNumber=10;
        secondNumber=20;
        sum=firstNumber+secondNumber;
        return sum;
    }

    //Return type method with the Argument
    public int subtract(int firstValue, int secondValue){
        int finalValue= firstValue-secondValue;
        return finalValue;
    }
}