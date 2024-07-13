import java.util.*;

 class quiz1 {
    
    
   
    private static int time_limit = 4;
   private  static int score = 0 ;


       private static String[] question  = {"What is the extension of java code files?" , "  Which of the following is not an OOPS concept in Java? " , " What is the extension of compiled java classes?","Which of the following is not a Java features?"};

     private  static String[][] option = {
    {"A. .js ","B. .txt","C. .class" ," D. .java" },
    {"A.  Polymorphism " ," b. Inheritance" , "C. Compilation" , "D. Encapsulation"} ,
     {"A. .js" ," B. .txt", "C. class" ,"D. .java"},
     {"A. Dynamic" ,"B. Architecture Neutral" , "C. Use of pointers", "D. Object-oriented"}
                                                };

      private  static char correctanswer [] = { 'D' , 'C', 'C' , 'C'};    
       
       
     public  void startquiz(){
        Scanner  sc  =  new Scanner(System.in);
        System.out.println("WELCOME TO THE BIGGEST QUIZ IN THE WORLD  ");
     for(int i = 0 ; i< question.length; i++){
        System.out.println("Question  " + ( i +1) + question[i]);
        for(String option  : option[i] ){
      System.out.println(option);
        }

        Timer timer = new Timer();
        TimerTask time = new TimerTask() {
            public void run() {
             System.out.println("time up");
             System.out.println(" new qe.");
             timer.cancel();
             displaynextqe(sc);
            }

        };
        timer.schedule(time, time_limit*2000);

        System.out.println(" A , B , C OR D SELECT YOUR ANSWER  :");
        String useranswer = sc.nextLine().toUpperCase().trim();


        if(!useranswer.isEmpty() && useranswer.charAt(0) == correctanswer[i])
        {
            score ++;
            System.out.println("YOUR ANSWER IS CORRECT ");
        }
        else if(!useranswer.isEmpty()){
            System.out.println("incorrect " +  " the right ans is  "+ correctanswer[i]);

        }
        timer.cancel();
        displaynextqe(sc);
        
     }
       System.out.println("QUIZ COMPLETED");
       System.out.println("your final score is   "+score);
   sc.close();
     }
     public void displaynextqe(Scanner sc){
        System.out.println(" press  enter to continue ");
     }

    }

    public class quiz {
    
        public static void main(String[] args) {
            quiz1 qq = new quiz1();

            qq.startquiz();
           
        }
    }