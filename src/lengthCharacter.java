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
    }
}

