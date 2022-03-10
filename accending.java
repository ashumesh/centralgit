import java.io.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
    int myarray[]=new int[5];
    int i,j,temp;
    BufferedReader bfrd=new BufferedReader(new InputStreamReader(System.in));
    for(i=0;i<myarray.length;i++)
    {
      System.out.print("Enter element no."+(i+1)+" :- ");
      myarray[i]=Integer.parseInt(bfrd.readLine()); 
    }
    for(i=0;i<myarray.length;i++)
    {
      for(j=0;j<myarray.length;j++)
      {
       if(myarray[i]<myarray[j])
       {
         temp=myarray[i];
         myarray[i]=myarray[j];
         myarray[j]=temp;
       }
      }
    }
    System.out.println("Elements in ascending order are :- ");
    for(i=0;i<myarray.length;i++)
    {
     System.out.print(myarray[i]+" "); 
    }
  }
}
