import java.util.*;
public class Bill
{
    void calcBill(double charge,String p,String d,int n)
    {    
        Info ob=new Info();
        System.out.println("            YOUR FLIGHT TICKET");
        System.out.println("           ____________________");
        System.out.println();
        System.out.println("                                      Our lowest fares at");
        System.out.println("        IndiGo                        Phohuangng airlines.in");
        System.out.println("__________________________________________________________________________________________________________________________________");
        System.out.println("                                                         SPECIAL SERVICES");
        System.out.println("                                As a courtesy to fellow");
        System.out.println("                                passengers please place");
        System.out.println("                                your carry-on items in the");
        System.out.println("                                overhead bin above your");
        System.out.println("                                own seat. \n");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("  Name           "+ob.name);
        System.out.println();
        System.out.println("  FROM:           "+p+"      TO:      "+d);
        System.out.println();
        int f2=(int)(Math.random()*12);
        int n2=f2;
        int f1=(int)((Math.random()*(320-300))+300);int f=(int)(Math.random()*11);
        System.out.print("  Flight         "+f+"E "+f1+"        Date     ");
        for(int i=0;i<3;i++)
        {
            if(i!=2)
                System.out.print(ob.date[i]+"/");
            else
                System.out.println(ob.date[i]);
        }
        System.out.println("                                                        | Name:"+ob.name);
        int th=(int)((Math.random()*(9-1))+1);
        int ts=(int)((Math.random()*(55-1))+1);
        System.out.println("  Boarding Time  0"+th+":"+ts+"pm"+"        Departure Time 0"+(th+1)+":"+ts+"pm  | Pnr: IR34AS");
        System.out.println("                                                        | Flt: "+f+"E "+f1);
        int s=(int)((Math.random()*(140-100))+100);
        System.out.print("  Sequence       "+s+"           Class     N              | Seat:");
        char alp='A';char al=alp;
        for(int i=1;i<=n;i++) 
        {
            if(alp!='K')
                System.out.print(" "+f2+alp+",");
            else
            {
                f2++;alp='A';
                System.out.print(" "+f2+alp+",");
            }
            alp++;
        }
        System.out.println();
        System.out.println("                                                        | Seq: "+s);
        System.out.print("  Gate           "+(int)((Math.random()*(4-1))+1)+"             Seat Number  ");
        for(int i=1;i<=n;i++) 
        {
            if(al!='K')
                System.out.print(" "+n2+al+",");
            else
            {
                f2++;al='A';
                System.out.print(" "+n2+al+",");
            }
            al++;
        }
        System.out.println();  
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Thank you for choosing Phohuangng airlines today.\nPlease be at your departure gate at the indicated boarding time.");
        System.out.println("\nAny passenger failing to do so may be refused boarding privileges.\nFrisking of passengers and checking of hand baggage is a mandatory procedure.");
        System.out.println("\nPassengers are requested to co-operate with Phohuangng's Security Services Team.\nHave a pleasant flight.");
        System.out.println("Call   0 99 10 38 38 38 / 0124 661 38 38"); 
       System.out.println("Thank You for being with us");
        System.out.println("                           --have a pleasant,safe and comfortable flight");
      }
  }
