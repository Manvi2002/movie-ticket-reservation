import java.util.*;
class Movie_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String m[]={"Super 30","Article 15","Bharat"};
        String s[]={"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"};
        String t[]={"PVR CINEMAS","PALACE CINEMAS"};
        System.out.println("Threatres available:\n1)PVR CINEMAS\n2)PALACE CINEMAS");
        System.out.println("Enter your choice of threatre");
        int c=sc.nextInt();
        for(int x=0;x<t.length;x++)
        {
            if(c==(x+1))
            {
                System.out.println("Welcome to PVR Cinemas");
                System.out.println("Enter your name");
                String name=sc.next();
                System.out.println();
                System.out.println("The Movies Available are :-");
                System.out.println("1.Super 30\n2.Article 15\n3.Bharat");           
                System.out.println("Enter your choice of movie");
                int mov=sc.nextInt();
                for(int y=0;y<m.length;y++)
                {
                    if(mov==(y+1))
                    {
                        System.out.println("MOVIE :- Super 30");
                        System.out.println();
                        System.out.println("Seats Available :- A1,A2,A3,A4,A5,A6,A7,A8,A9,A10");
                        System.out.println("Enter number of tickets to be booked");
                        int r=sc.nextInt();
                        if(r>s.length)
                        {
                            System.out.println("Seats are Already Booked");
                            break;
                        }
                        System.out.println("Enter seats you want to book");
                        String seats=sc.next();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("NAME :" +name);
                        System.out.println("MOVIE :" +m[y]);
                        System.out.println("SEATS BOOKED :" +seats);
                        System.out.println("AUDI : 02");
                        System.out.println("TOTAL COST : Rs." +275*r);
                        System.out.println("KINDLY SHOW THIS TICKET AT THE ENTRANCE");
                        System.out.println("THANKYOU FOR CHOOSING PVR CINEMAS AS YOUR PRIORITY");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                    }
                    else if(mov==(y+2))
                    {
                        System.out.println("MOVIE :- Article 15");
                        System.out.println();
                        System.out.println("Seats Available :- A1,A2,A3,A4,A5,A6,A7,A8,A9,A10");
                        System.out.println("Enter number of tickets to be booked");
                        int r=sc.nextInt();
                        if(r>s.length)
                        {
                            System.out.println("Seats are Already Booked");
                            break;
                        }
                        System.out.println("Enter seats you want to book");
                        String seats=sc.next();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("NAME :" +name);
                        System.out.println("MOVIE :" +m[y]);
                        System.out.println("SEATS BOOKED :" +seats);
                        System.out.println("AUDI : 01");
                        System.out.println("TOTAL COST : Rs." +275*r);
                        System.out.println("KINDLY SHOW THIS TICKET AT THE ENTRANCE");
                        System.out.println("THANKYOU FOR CHOOSING PVR CINEMAS AS YOUR PRIORITY");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                    }
                    else if(mov==(y+3))
                    {
                        System.out.println("MOVIE :- Bharat");
                        System.out.println();
                        System.out.println("Seats Available :- A1,A2,A3,A4,A5,A6,A7,A8,A9,A10");
                        System.out.println("Enter number of tickets to be booked");
                        int r=sc.nextInt();
                        if(r>s.length)
                        {
                            System.out.println("Seats are Already Booked");
                            break;
                        }
                        System.out.println("Enter seats you want to book");
                        String seats=sc.next();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("NAME :" +name);
                        System.out.println("MOVIE :" +m[y]);
                        System.out.println("SEATS BOOKED :" +seats);
                        System.out.println("AUDI : 03");
                        System.out.println("TOTAL COST : Rs." +275*r);
                        System.out.println("KINDLY SHOW THIS TICKET AT THE ENTRANCE");
                        System.out.println("THANKYOU FOR CHOOSING PVR CINEMAS AS YOUR PRIORITY");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                    }
                    else
                    {
                        System.out.println("Movie not available");
                    }
                }
            }

            else if(c==(x+2))
            {
                System.out.println("Welcome to Palace Cinemas");
                System.out.println("Enter your name");
                String name=sc.next();
                System.out.println();
                System.out.println("The Movies Available are :-");
                System.out.println("1.Super 30\n2.Article 15");           
                System.out.println("Enter your choice of movie");
                int mov=sc.nextInt();
                for(int y=0;y<m.length;y++)
                {
                    if(mov==(y+1))
                    {
                        System.out.println("MOVIE :- Super 30");
                        System.out.println();
                        System.out.println("Seats Available :- A1,A2,A3,A4,A5,A6,A7,A8,A9,A10");
                        System.out.println("Enter number of tickets to be booked");
                        int r=sc.nextInt();
                        if(r>s.length)
                        {
                            System.out.println("Seats are Already Booked");
                            break;
                        }
                        System.out.println("Enter seats you want to book");
                        String seats=sc.next();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("NAME :" +name);
                        System.out.println("MOVIE :" +m[y]);
                        System.out.println("SEATS BOOKED :" +seats);
                        System.out.println("AUDI : 02");
                        System.out.println("TOTAL COST : Rs." +275*r);
                        System.out.println("KINDLY SHOW THIS TICKET AT THE ENTRANCE");
                        System.out.println("THANKYOU FOR CHOOSING PALACE CINEMAS AS YOUR PRIORITY");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                    }
                    else if(mov==(y+2))
                    {
                        System.out.println("MOVIE :- Article 15");
                        System.out.println();
                        System.out.println("Seats Available :- A1,A2,A3,A4,A5,A6,A7,A8,A9,A10");
                        System.out.println("Enter number of tickets to be booked");
                        int r=sc.nextInt();
                        if(r>s.length)
                        {
                            System.out.println("Seats are Already Booked");
                            break;
                        }
                        System.out.println("Enter seats you want to book");
                        String seats=sc.next();
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("NAME :" +name);
                        System.out.println("MOVIE :" +m[y]);
                        System.out.println("SEATS BOOKED :" +seats);
                        System.out.println("AUDI : 01");
                        System.out.println("TOTAL COST : Rs." +275*r);
                        System.out.println("KINDLY SHOW THIS TICKET AT THE ENTRANCE");
                        System.out.println("THANKYOU FOR CHOOSING PALACE CINEMAS AS YOUR PRIORITY");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                    }
                    else
                    {
                        System.out.println("Movie not available");
                    }
                }
            }
            else
            {
                System.out.println("Wrong Input");
            }
        }
    }
}
