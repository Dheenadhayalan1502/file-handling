
package clubmembers;

import java.util.HashSet;
import java.util.Scanner;
public class ClubMembers 
{

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String>obj=new HashSet();
        int choise=0;
        while(choise!=6)
        {
            System.out.println("1.add member");
            System.out.println("2.remove member");
            System.out.println("3.search member");
            System.out.println("4.display member");
            System.out.println("5.count of members");
            System.out.println("6.exit");
            choise=sc.nextInt();
            switch(choise)
            {
                case 1:
                {
                   System.out.println("enter the member name ");
                   String name=sc.nextLine();
                   obj.add(name);
                   break;
                    
                }
                case 2:
                {
                    System.out.println("enter the name to be removed ");
                    String name=sc.nextLine();
                    if(obj.contains(name))
                    {    
                    obj.remove(name);
                    break;
                    }
                    else
                    {
                        System.out.println("not found");
                    }
                    
                }
                case 3:
                {
                    System.out.println("enter the name to search ");
                    String name=sc.nextLine();
                    if(obj.contains(name))
                    {
                        System.out.println("member foun in club");
                    }
                    else
                    {
                        System.out.println("not found");
                    }
                    break;
                }
                case 4:
                {
                    if(obj.isEmpty())
                    {
                        System.out.println("list is empty");
                    }
                    else
                    {
                        for(String m:obj)
                        {
                            System.out.println(m);
                        }
                    }
                  break;
                    
                }
                case 5:
                {
                    System.out.println(obj.size());
                    break;
                }
                case 6:
                {
                    System.out.println("exiting" );
                    break;
                }
                
            }
            
                    
                    
                     
        }
       
            
        sc.close();
        
        
        
    }
    
}
