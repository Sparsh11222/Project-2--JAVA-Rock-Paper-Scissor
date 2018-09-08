import java.util.*;
public class Project
{
    public static void main()
    {int sra,srb,spa,spb,ssa,ssb,fa=0,fb=0,ra=0,rb=0,ta,tb,ga,gb; //sra=strength_of_rock_for_A
     int coma[]={1,2,3};                                         //fa=final points for A
     int comb[]={1,2,3};                      //ra=round of 3 points for A
     Scanner re=new Scanner(System.in);
     sra=(int)(Math.random()*3.9);
     spa=(int)(Math.random()*3.9);
     ssa=(int)(Math.random()*3.9);
     srb=(int)(Math.random()*3.9);
     spb=(int)(Math.random()*3.9);
     ssb=(int)(Math.random()*3.9);
     if(sra==0)
     sra=1;
     if(spa==0)
     spa=1;
     if(ssa==0)
     ssa=1;
     if(srb==0)
     srb=1;
     if(spb==0)
     spb=1;
     if(ssb==0)
     ssb=1;
     System.out.println("FOR A->     ROCK=="+sra+"      PAPER=="+spa+"      SCISSORS=="+ssa);
     System.out.println("FOR B->     ROCK=="+srb+"      PAPER=="+spb+"      SCISSORS=="+ssb);
     System.out.println("LET'S Start");
     for(int d=0;d<10000000;d++)
     {System.out.print("");}System.out.println("");System.out.println("");
     for(int i=0;i<20;i++)
     {for(int k=0;k<3;k++)
         {ta=coma[k];tb=comb[k];
          ga=(int)(Math.random()*2.9);
          gb=(int)(Math.random()*2.9);
          coma[k]=coma[ga];comb[k]=comb[gb];
          coma[ga]=ta;comb[gb]=tb;
        }
         for(int j=0;j<3;j++)
         {for(int d=0;d<3000000;d++)
     {System.out.print("");}
             int ia=coma[j];int ib=comb[j];
             if(ia==ib)
             {if(ia==1)
                 {System.out.println("Both A and B chose Rock");
                     if(sra>srb)
                     {ra++;System.out.println("A wins this time");
                     }
                  else
                  {rb++;System.out.println("B wins this time");
                    }
                }
                else
                if(ia==2)
                {System.out.println("Both A and B chose Paper");
                    if(spa>spb)
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
                else
                {System.out.println("Both A and B chose Scissor");
                    if(ssa>ssb)
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
            }
            if(ia==1)
            {
                if(ib==2)
                {System.out.print("A chose Rock");
                    System.out.println(" B chose Paper");
                    if((sra/2)>(spb*2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {
                        rb++;System.out.println("B wins this time");
                    }
                }
                else if(ib==3)
                {System.out.print("A chose Rock");
                    System.out.println(" B chose Scissor");
                    if((sra*2)>=(ssb/2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
            }
            if(ia==2)
            {
                if(ib==3)
                {System.out.print("A chose Paper");
                    System.out.println(" B chose Scissor");
                    if((spa*2)>=(ssb/2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
                else if(ib==1)
                {System.out.print("A chose Paper");
                    System.out.println(" B chose Rock");
                    if((spa/2)>(srb*2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
            }
            if(ia==3)
            {
                if(ib==1)
                {System.out.print("A chose Scissor");
                    System.out.println(" B chose Rock");
                    if((ssa/2)>(ssb*2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
                else if(ib==2)
                {System.out.print("A chose Scissor");
                    System.out.println(" B chose Paper");
                    if((ssa*2)>=(spb*2))
                    {ra++;System.out.println("A wins this time");
                    }
                    else
                    {rb++;System.out.println("B wins this time");
                    }
                }
            }
        }for(int d=0;d<4000000;d++)
     {System.out.print("");} System.out.println("");
        if(ra>rb)
        {System.out.println("A wins the ROUND");
            fa++;
        }else
        {System.out.println("B wins the ROUND");
            fb++;
        }ra=0;rb=0;System.out.println("");
    }for(int d=0;d<10000000;d++)
     {System.out.print("");} 
    System.out.println("Final Score Line");
    System.out.println(fa+"::"+fb);
}
}