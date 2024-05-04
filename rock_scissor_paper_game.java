package DSA_IN_JAVA;
import java.util.*;
class rock_scissor_paper_game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock 1 for scissor & 2 for paper");
         int user_input=sc.nextInt();

         Random kb =new Random();
         int computer_input=kb.nextInt( 3);

         if(user_input==computer_input)
         {
            System.out.println("match is tied");
         }
         else if((user_input==2 && computer_input==00)||(user_input==1 && computer_input==2)||(user_input==0 && computer_input==1))
         {
            System.out.println("user win");
         }
         else{
            System.out.println("computer win");
         }
    }
}