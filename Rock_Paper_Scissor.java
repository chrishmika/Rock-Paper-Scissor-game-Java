import javax.swing.JOptionPane;
import java.util.Random; 
public class Rock_Paper_Scissor 
{
    public static void main(String args[])
    {
        Random numC = new Random();

        String choice[]={"rock","paper","scissor"};
        String userC;
        int countU=0,countC=0;

        JOptionPane.showMessageDialog(null,"Let's Play Rock,Paper,Scissor \nNOTE : Use simple letters only.");
        
        loop:
        while (true)
        {  
            userC = JOptionPane.showInputDialog("Enter your choice :");
            
            int compC = numC.nextInt(2);

            //Comparison with user input
            if (choice[compC].equals(userC))
            {
                JOptionPane.showMessageDialog(null,"We both think the same "+choice[compC]+"");
                countC++;
            }
            else if( userC.equals("paper") && choice[compC].equals("rock")){
                JOptionPane.showMessageDialog(null,"You won 😍 I think "+choice[compC]+"");
                countU++;
            }else if( userC.equals("paper") && choice[compC].equals("scissor")){
                JOptionPane.showMessageDialog(null,"You loose 😍 I think "+choice[compC]+"");
                countC++;
            }else if( userC.equals("rock") && choice[compC].equals("paper")){
                JOptionPane.showMessageDialog(null,"You loose 😍 I think "+choice[compC]+"");
                countC++;
            }else if( userC.equals("rock") && choice[compC].equals("scissor")){
                JOptionPane.showMessageDialog(null,"You won 😍 I think "+choice[compC]+"");
                countU++;
            }else if( userC.equals("scissor") && choice[compC].equals("paper")){
                JOptionPane.showMessageDialog(null,"You loose 😍 I think "+choice[compC]+"");
                countC++;
            }else if( userC.equals("scissor") && choice[compC].equals("rock")){
                JOptionPane.showMessageDialog(null,"You won 😍 I think "+choice[compC]+"");
                countU++;
            }else if( !userC.equals("scissor") || !userC.equals("rock") || !userC.equals("paper")){
                JOptionPane.showMessageDialog(null,"Invalid input Try Again"+"");
            }

            String nextC = JOptionPane.showInputDialog("Do you plaay again Y/N:");
            
            //End or Continue
            if (nextC.equals("n"))
                break;
            else if (nextC.equals("y"))
                continue loop;
            else{
                JOptionPane.showMessageDialog(null,"Invalid input ! \n Game will stop"+"");
                break;
            }
        }

        //Final result
        JOptionPane.showMessageDialog(null,"YOU WON "+countU+" TIMES OUTOF "+(countU+countC)+" TIMES");
        JOptionPane.showMessageDialog(null,"!!THANKS FOR PLAYING!!");
    }    
}