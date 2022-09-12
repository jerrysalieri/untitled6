import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class App {
    public static void main(String []args)throws IOException{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String one;
        String name;
        String two;
        int age;
        String three;
        String town;
        int year;
        String four;
        String five;
        String pname;
        String six;
        int choice;
        boolean decision;
        String seven;
        String country;
        String eight;
        String national;
        String nine;
        String gender;
        String ten;
        int rate;
        System.out.println("Hello! Let's Input Data!");
        System.out.println("Please enter you name");
        one=in.readLine();
        name=one;
        System.out.println("Let us know your age");
        two=in.readLine();
        age=Integer.parseInt(two);
        System.out.println("Please, write here your home town");
        three=in.readLine();
        town=three;
        System.out.println("Please, enter current year");
        four=in.readLine();
        year=Integer.parseInt(four);
        System.out.println("Please, write your parent's name");
        five=in.readLine();
        pname=five;
        System.out.println("Did you achieve an age of 18?");
        System.out.println("Write '1' if yes, an '2' if no. ");
        six=in.readLine();
        choice=Integer.parseInt(six);
        if(choice ==1){
            decision = true;
        }
        if(choice==2){
            decision=false;
        }
        System.out.println("Please, write what  country are you in right now? ");
        seven=in.readLine();
        country=seven;
        System.out.println("Please, write what is your nationality? ");
        eight=in.readLine();
        national = eight;
        System.out.println("Please, write what is your gender? ");
        nine=in.readLine();
        gender=nine;
        System.out.println("How would you rate our service out of 10");
        ten=in.readLine();
        rate=Integer.parseInt(ten);



        System.out.println("The information you gave us:");
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+ age);
        System.out.println("Your hometown is: "+ town);
        System.out.println("Today is "+ year + " year");
        System.out.println("Your parent's name is: "+ pname);
        if(decision=true){
            System.out.println("You are an adult");
        }
        if(decision=false){
            System.out.println("You are a minor");
        }
        System.out.println("You are in "+country+ " right now");
        System.out.println("Your nationality is: "+ national);
        System.out.println("Your gender is: "+ gender);
        System.out.println("Your rate is "+rate+" out of 10");

    }
}
