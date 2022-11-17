import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cwiczenia6 {



    class Person{

        String nameYusuf;
        String surnameYusuf;
        String streetYusuf;
        String codeYusuf;
        String cityYusuf;


         public void Initialize() throws IOException{
             BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter your surname :");
             surnameYusuf = br.readLine();
             System.out.println("Enter your name :");
             nameYusuf = br.readLine();
             System.out.println("Enter the street :");
             streetYusuf = br.readLine();
             System.out.println("Enter your cod :");
             codeYusuf = br.readLine();
             System.out.println("Enter the city :");
             cityYusuf = br.readLine();

         }
         public void print(){

             System.out.println("Surname:" +surnameYusuf);
             System.out.println("Name:"+nameYusuf);
             System.out.println("Sreet:"+streetYusuf);
             System.out.println("Code:"+codeYusuf);
             System.out.println("City:"+cityYusuf);

         }




    }
    class Staff extends Person{
        String education;
        String position;

        public void Intialize1() throws IOException{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            Initialize();
            System.out.println("Enter your education:");
            education = br.readLine();
            System.out.println("Enter your position");
            position = br.readLine();
        }
        public void print1(){
            print();
            System.out.println("Education:"+education);
            System.out.println("Position:"+position);
        }


    }
    public class Zad1{
        public void main(String[] args) throws IOException{
            Staff employee= new Staff();

            employee.Intialize1();
            employee.print1();

            employee.Initialize();
            employee.print();



        }

    }




}
