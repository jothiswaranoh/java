
  
class jss {

public static void main(String[] args)
{
    int[][] arr={{1,2},{3,4},{1,5},{9,0}};
 /*
    for(int i=0;i<4;i++)
    {
        System.out.print("\n");
        for(int j=0;j<2;j++)
    {
      System.out.print(arr[i][j]+ " ");
    }}*/
   for(int a[]: arr)
    {
          System.out.print("\n");
          for(int b:a)
    
      System.out.print(b+" ");
    }
}
}
