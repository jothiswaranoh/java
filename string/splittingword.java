  
public class GFG {
  
    
    public static void main(String args[])
    {
        
        String str = "jothis for sam";
        String[] arrOfStr = str.split(" ");
  
        for (int i=arrOfStr.length-1;i>=0;i--)
        System.out.print(arrOfStr[i] +" ");
           
            

    }
}