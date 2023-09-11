import java.util.Scanner;

class HelloWorld
{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        
        int [][][]a=new int[2][3][4];
        int i,j,k;
        for(i=0; i<=1 ;i++)
        {
            for(j=0 ; j<=2 ; j++)
            {
                for(k=0 ; k<=3 ; k++)
                {
                    System.out.println("Schools " + i +" Classes " + j + " Students " + k);
                    a[i][j][k]=scan.nextInt();
                }
            }
        }
        System.out.println("Roll number of students");
        for(i=0; i<=1 ;i++)
        {
            for(j=0 ; j<=2 ; j++)
            {
                for(k=0; k<=3 ; k++)
                {
                  if(a[i][j][k]<10)
                  {
                    System.out.print(a[i][j][k] + " ");
                  }
                  else
                  {
                    System.out.print(a[i][j][k]);
                  }
                  
                }
                System.out.println();
            }
            System.out.println();
        }  
    }
}