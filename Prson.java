public class Prson {

   private String surname;
   private String othernames;
   private int age;
   private char marital_status;
   private char gender;
   public Prson(String s, String o,int a,char m,char g)
   {
    surname=s;
    othernames=o;
    age=a;
    marital_status=m;
    gender=g;
   }
   public Prson(String s, String o,int a,char g)
   {
    surname=s;
    othernames=o;
    age=a;
    marital_status='S';
    gender=g;
   }
   public void displayDetails()
   {
    System.out.println("surname: "+ surname +" ");
    System.out.println("othernames: "+ othernames +" ");
    System.out.println("age: "+ age +" ");
    System.out.println("maritial status: "+ marital_status +" ");
    System.out.println("gender: "+ gender +" ");
   }
   public void getMarried(String spname)
   {
    marital_status='M';
     if (gender=='F')
     {
       surname=spname;
     }
   }
   public static void main(String []args)
   {
     Prson Hamadi= new Prson("Hamza","Seko",24,'M');
     Prson Amina= new Prson("Linet","Mutheu",20,'F');
     Amina.displayDetails();
     Hamadi.displayDetails();
    Amina.getMarried("Hamza");
    Amina.displayDetails();
   }    
}
