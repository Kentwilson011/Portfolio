
package main.rentalsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class RENTALSYSTEM {
    
    static void reset(){
          
        System.out.println(" ");
    
        //DATE AND TIME//
        SimpleDateFormat date = new SimpleDateFormat("MM/dd//yyyy");
        SimpleDateFormat date_time = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm"); //Not Used//
        Date now = new Date();
        
        //FOR USER NAME AND PASSWORD
        StringBuffer admin_u = new StringBuffer("jan123");
        StringBuffer admin_p = new StringBuffer("chan123");
        String admin_username1 = admin_u.toString(); // convert to compare//
        String admin_pass1 = admin_p.toString();
        
        
        String fullname = "Jan Nichols Maristela";
        String owner_age = "20";
        
        
        //ARRAYS FOR HISTORY//
        String[] hroom = {"","","","","",};
        String[] hbalance = {"","","'","",""};
        String[] hname = {"","","","","",};
        String[] haddress = {"","","","",""};
        String[] hdate_r = {"","","","",""};
        String[] hcontact = {"","","","",""};
        String[] hdelete = {"","","","",""};
        
         //ROOMS VARIABLE//             //PAYMENT OF THE COSTUMER//                     //USERNAME & PASSWORD ADMIN//
        int room001 = 1;                double balance001 = 0;                         
        int room002 = 1;                double balance002 = 2500;                         
        int room003 = 0;                double balance003 = 0;                            
        int room004 = 1;                double balance004 = 3000;                         
        int room005 = 0;                double balance005 = 0;

    
    //NAME OF COSTUMER//                                                 //NUMBER OF COSTUMER//             
                                   
    StringBuffer name001 = new StringBuffer("Kent Gildo");         StringBuffer cnumber001 = new StringBuffer("972654952");
    StringBuffer name002 = new StringBuffer("Leizel Binatao");     StringBuffer cnumber002 = new StringBuffer("051388819");
    StringBuffer name003 = new StringBuffer();                           StringBuffer cnumber003 = new StringBuffer();
    StringBuffer name004 = new StringBuffer("Korina Dansuli");     StringBuffer cnumber004 = new StringBuffer("686540442");
    StringBuffer name005 = new StringBuffer();                           StringBuffer cnumber005 = new StringBuffer();
    
    
    //ADRESS OF THE COSTUMER//                                           //DATE OF BOOK//
    StringBuffer address001 = new StringBuffer("Bulua CDO city");   StringBuffer date001 = new StringBuffer("04/01/2023");
    StringBuffer address002 = new StringBuffer("Iligan City");      StringBuffer date002 = new StringBuffer("02/14/2023");
    StringBuffer address003 = new StringBuffer();                         StringBuffer date003 = new StringBuffer();
    StringBuffer address004 = new StringBuffer("Bukidnon");         StringBuffer date004 = new StringBuffer("08/25/2022");
    StringBuffer address005 = new StringBuffer();                         StringBuffer date005 = new StringBuffer();
    
    
   
    
    //ROOM PRICES//
    double room001_p = 6000;
    double room002_p = 5000;
    double room003_p = 2500;
    double room004_p = 4000;
    double room005_p = 3500;
    
    //ARRAY OF PAYMENT RECORD EVERY ROOM//
    int s_r001 = 2;
    int s_r002 = 1;
    int s_r003 = 1;
    int s_r004 = 1;
    int s_r005 = 1;
    
    String[] p_room001 = {"Payment: 1000.0","","","",""};         
    String[] p_room002 = {"","","","",""};
    String[] p_room003 = {"","","","",""};
    String[] p_room004 = {"","","","",""};
    String[] p_room005 = {"","","","",""};
    
    String[] p_date001 = {"Date: 04/20/2023  8:44","","","",""};
    String[] p_date002 = {"","","","",""};
    String[] p_date003 = {"","","","",""};
    String[] p_date004 = {"","","","",""};
    String[] p_date005 = {"","","","",""};
    
    String[] p_total001 = {"New Balance: 1000.0","","","",""};
    String[] p_total002 = {"","","","",""};
    String[] p_total003 = {"","","","",""};
    String[] p_total004 = {"","","","",""};
    String[] p_total005 = {"","","","",""};
    
    String[] p_balance001 = {"Balance: 2000.0","","","",""};
    String[] p_balance002 = {"","","","",""};
    String[] p_balance003 = {"","","","",""};
    String[] p_balance004 = {"","","","",""};
    String[] p_balance005 = {"","","","",""};
        
    
        
        //NEEDED VARIABLE//
        boolean try_c = false; //for the try catch//
            
        
        int admin_forgot_pass = 0;
        int jan = 0;   
        int history = 1;
        String vacant_ = "(VACANT)";
        String occu_ = "(OCCUPIED)";
        
        
        while (true) {//MAIN LOOPS
            
            int back = 0;
            
            
            System.out.println(" ");
            System.out.println("                                                           -   WELCOME TO CAHILES BOARDING HOUSE   -");
            System.out.println("                                                                 Carmen Cagayan de Oro City");
            System.out.println(" ");
            System.out.println("     [1] LOG IN");
            System.out.println("     [2] OFF THE SYSTEM"); 
            if (admin_forgot_pass >= 1) { System.out.println("     [90] FORGOT USERNAME/PASSWORD?"); } 
            
            while (true) {//WHILE TRUE 1
                Scanner input = new Scanner (System.in);    
                System.out.print("        >> ");
                String user = input.nextLine();

                if (user.equals("1")) {
                    
                    System.out.println(" ");
                    System.out.println("                                                                         -  LOG IN  -");
                    System.out.println(" ");

                    int a = 3;
                    while (a > 0 ) {

                        Scanner input1 = new Scanner (System.in);
                        System.out.print("     Enter Username: ");
                        String user_name = input1.nextLine();
                        System.out.print("     Enter Password: ");
                        String password = input1.nextLine();

                        if (user_name.equals(admin_username1)&& password.equals(admin_pass1)){
                        admin_forgot_pass = admin_forgot_pass - admin_forgot_pass;
                        break;
                          } 
                        else {
                        a--;
                        System.out.println("     Wrong Username/Password! Please Try Again.");
                        System.out.println("     Attempt Left: "+a);
                        System.out.println(" ");
                          }
          
                    
                    } //whileloop(a > 0)
                    
                    
                    if (a == 0){
                    System.out.println("     Sorry You Have Use All Your Attepmts.");
                    System.out.println("     Back To Menu");
                    admin_forgot_pass++;
                    break;
                    //BACK TO MENU//
                    } else {
                    }//CONDITION FOR ATTEMPTS// 

                    
                    //NEEDED VARIABLE FOR THIS SATEMEMNT//
                    String mmenu = ""; //mmenu = main menu
                    String aroom = ""; //aroom = admin room
                    //int aroom1 = 0; // aroom = admin room 1
                    back = 0; //for back option
                    
                    System.out.println("                                                                        -WELCOME ADMIN-   ");
                    while (true) {// WHILE 2
                    System.out.println("      ");
                    System.out.println("                                                                       -   MAIN MENU  -");
                    System.out.println("      [1]Rooms Privilege");
                    System.out.println("      [2]Check/Add Room Information");
                    System.out.println("      [3]Change Username And Password");
                    System.out.println("      [4]Archive");
                    System.out.println("      [5]Log Out"); 
                    
                    
                    while (true) {//WHILE 3
                    System.out.print("        >> ");
                    mmenu = input.nextLine();
                    
                    if (mmenu.equals("1")) {
                        
                        String croom = "";
                        while (true) {
                        System.out.println(" ");
                        System.out.println("                                                                         -   ROOMS   -   ");
                        System.out.println(" ");
                        System.out.println("     ROOMS NUMBER          ");
                        System.out.print("     [1] ROOM 001          "); if(room001 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [2] ROOM 002          ");if(room002 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [3] ROOM 003          ");if(room003 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [4] ROOM 004          ");if(room004 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [5] ROOM 005          ");if(room005 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.println("     [0] BACK"); 


                        while (true) {
                         
                            System.out.print("        >> ");
                            croom = input.nextLine();
                           

                            if (croom.equals("1")){

                                 
                                    Scanner input1 = new Scanner (System.in);
                                    System.out.println("                                                                          -ROOM 001-");
                                    System.out.println("      ");
                                    System.out.println("     ROOM PRIVILEGE");
                                    System.out.println("     []BED NUMBER: 5");
                                    System.out.println("     []FREE WATER");
                                    System.out.println("     []FREE ELECTRICITY");
                                    System.out.println("     []TILES FLOOR");
                                    System.out.println("     []OWN CR");
                                    System.out.println("     []OWN KITCHEN");
                                    System.out.println("       >PRICE: "+room001_p+"/MONTH");
                                    System.out.println("      ");

                                     System.out.print("     Press Enter To Exit: ");
                                     String check_room = input.nextLine();
                                     break;



                            } else if (croom.equals("2")) {

                                 
                                    Scanner input1 = new Scanner (System.in);
                                    System.out.println("                                                                          -ROOM 002-");
                                    System.out.println("      ");
                                    System.out.println("     ROOM PRIVILEGE");
                                    System.out.println("     []BED NUMBER: 3");
                                    System.out.println("     []FREE WATER");
                                    System.out.println("     []FREE ELECTRICITY");
                                    System.out.println("     []OWN BATHROOM");
                                    System.out.println("       >PRICE: "+room002_p+"/MONTH");
                                    System.out.println("      ");
                                     System.out.print("     Press Enter To Exit: ");
                                     String check_room = input.nextLine();
                                     break;

                                

                            } else if (croom.equals("3")) {

                                
                                    Scanner inpu1t = new Scanner (System.in);
                                    System.out.println("                                                                          -ROOM 003-");
                                    System.out.println("      ");
                                    System.out.println("     ROOM PRIVILEGE");
                                    System.out.println("     []BED NUMBER: 2");
                                    System.out.println("     []FREE WATER");
                                    System.out.println("     []FREE ELECTRICITY");
                                    System.out.println("       >PRICE: "+room003_p+"/MONTH");
                                    System.out.println("      ");
                                     System.out.print("     Press Enter To Exit: ");
                                     String check_room = input.nextLine();
                                     break;

                                

                            } else if (croom.equals("4")) {
                                
                                    Scanner inpu1t = new Scanner (System.in);
                                    System.out.println("                                                                          -ROOM 004-");  
                                    System.out.println("      ");
                                    System.out.println("     ROOM PRIVILEGE");
                                    System.out.println("     []BED NUMBER: 4");
                                    System.out.println("     []FREE WATER");
                                    System.out.println("     []FREE ELECTRICITY");
                                    System.out.println("       >PRICE: "+room004_p+"/MONTH");
                                    System.out.println("      ");
                                     System.out.print("     Press Enter To Exit: ");
                                     String check_room = input.nextLine();
                                     break;

                            } else if (croom.equals("5")) {
                                
                                    Scanner inpu1t = new Scanner (System.in);
                                    System.out.println("                                                                          -ROOM 005-");  
                                    System.out.println("      ");
                                    System.out.println("     ROOM PRIVILEGE");
                                    System.out.println("     []BED NUMBER: 1");
                                    System.out.println("     []FREE WATER");
                                    System.out.println("     []FREE ELECTRICITY");
                                    System.out.println("     []OWN KITCHEN");
                                    System.out.println("     []FREE TV");
                                    System.out.println("       >PRICE: "+room005_p+"/MONTH");
                                    System.out.println("      ");
                                     System.out.print("     Press Enter To Exit: ");
                                     String check_room = input.nextLine();
                                     break;

                            } else if (croom.equals("0")) {
                                back+=2;
                                break;

                            } else { System.out.println("     Not In The Choices, Please Try!");}  

                        if (back > 0) {back--; break;}    
                        }   

                        if (back > 0) {back--; break;}
                        }//LOOPS FOR CHECK ROOMS//
                        

                    
                    } else if (mmenu.equals("2")) {
                        
                        while (true) {//1
                        
                        System.out.println("                                                                       -  ROOMS DATA  -"); 
                        System.out.println(" ");
                        System.out.println("     ROOM NUMBER          ");
                        System.out.print("     [1] ROOM 001          "); if(room001 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [2] ROOM 002          ");if(room002 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [3] ROOM 003          ");if(room003 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [4] ROOM 004          ");if(room004 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.print("     [5] ROOM 005          ");if(room005 == 0) {System.out.println(vacant_);} else {System.out.println(occu_);}
                        System.out.println("     [0] BACK"); 
                        
                        
                        while (true) {//WHILE 4
                            
                            System.out.print("        >> ");
                            aroom = input.nextLine();
                            
                            if (aroom.equals("1")) {
                                           
                                
                                while (true) {//2
                             
                                System.out.println("     ");                
                                System.out.println("                                                                  -  ROOM 001 INFORMATIONS  -");
                                System.out.println("     ");
                                if (room001 == 0) {
                                    System.out.println("     ROOM STATUS: VACANT");
                                    } else {
                                    System.out.println("     ROOM STATUS: OCCUPIED");
                                    }
                                    System.out.println("     NAME: "+ name001);
                                    System.out.println("     PERMANENT ADDRESS: "+ address001);
                                    System.out.println("     CONTACT NUMBER: 09"+ cnumber001);
                                    System.out.println("     BALANCE: "+ balance001);
                                    System.out.println("     DATE OCCUPIED: "+ date001);

                                if (room001 == 1) {
                                System.out.println("     [1] Edit Informations ");
                                System.out.println("     [2] Payment Record ");
                                System.out.println("     [0] Back ");
                                
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) { 
                                            
                                            while (true) {//j1
                                            System.out.println(" ");
                                            System.out.println("                                                                    -   EDIT INFORMATION   -");
                                            System.out.println(" ");
                                            System.out.println("     [A] Edit All Informations ");
                                            System.out.println("     [B] Add Payment / Add Balance ");
                                            System.out.println("     [C] Edit Name ");
                                            System.out.println("     [D] Edit Address ");
                                            System.out.println("     [E] Edit Contact Number ");
                                            System.out.println("     [F] Change to Vacant and Move To Archive");
                                            System.out.println("     [G] To Exit "); 
                                            
                                                while (true) {//j2
                                                System.out.print("        >> ");
                                                String c = input.nextLine();
                                                
                                                if (c.equalsIgnoreCase("A")) {
                                                    
                                                    System.out.println("                                                                   - EDIT ALL INFORMATIONS - ");
                                                    System.out.println(" ");
                                                    int ab = 0;//Just for test exp//       
                                                    name001.setLength(0);
                                                    
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name001.append(cc);
                                                    address001.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address001.append(o);
                                                    
                                                    cnumber001.setLength(0);
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber001.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;

                                                    
                                                } else if (c.equalsIgnoreCase("B")) {
                                                    
                                                    
                                                    while (true) {
                  
                                                      System.out.println(" ");
                                                      System.out.println("                                                                 -  ADD PAYMENT/ADD BALANCE  -");
                                                      System.out.println(" ");
                                                      System.out.println("     [A] Add Payment");
                                                      System.out.println("     [B] Add Balance");
                                                      System.out.println("     [C] Back"); 
                                                      
                                                      while (true) {
                                                      System.out.print("        >> ");
                                                      String cc = input.nextLine();

                                                      if (cc.equalsIgnoreCase("A")) {
                                                          double cash_a = 0;
                                                           if (balance001 > 0) {
                                                          System.out.println("                                                                         -ADD PAYMENT-");
                                                          System.out.println(" ");
                                                          
                                                          System.out.println("     Balance: "+balance001);
                                                          
                                                          int w = 0;
                                                          do {
                                                          Scanner input1 = new Scanner (System.in);
                                                          try {
                                                          
                                                          System.out.print("     Enter Cash Amount: ");
                                                          cash_a = input1.nextInt();
                                                          try_c = false;
                                                          w++;
                                                          } catch (Exception e) {
                                                          System.out.println("     Please Enter A Number! Try Again.");
                                                              try_c = true;
                                                          }
                                                          if (cash_a <= balance001 && w >= 1) {
                                                              if (cash_a >= (balance001 * 0.50)){
                                                              
                                                              try_c = false;}
                                                              else {System.out.println("     You Must Pay Atleast 50% Of Your Current Balance"); try_c = true; }
                                                          } else if (cash_a > balance001) {
                                                              System.out.println("     The Cash Is Greater Than The Balance!");
                                                              try_c = true;
                                                          } else {try_c = true;}
                                                          } while (try_c);

                                                          System.out.println("     Payment Done...");
                                                          int s = 0;
                                                          if (s_r001 == 1) { s = 0; }
                                                          else if (s_r001 == 2) { s = 1; }
                                                          else if (s_r001 == 3) { s = 2; }
                                                          else if (s_r001 == 4) { s = 3; }
                                                          else if (s_r001 == 5) { s = 4; }
                                                          
                                                          String ss = date_time.format(now);
                                                          double sss = balance001-cash_a;
                                                          
                                                          p_date001[s] = ("Date: "+ss);
                                                          p_balance001[s] = ("Balance: "+balance001);
                                                          p_room001[s] = ("Payment: "+cash_a);
                                                          p_total001[s] = ("New Balance: "+sss);
                                                          s_r001++;
                                                          balance001 = balance001-cash_a;
                                                          back+=4;
                                                          break;
                                                        } else { System.out.println("     This Room Does'nt Have Any Balance.");}

                                                      } else if (cc.equalsIgnoreCase("B")) {
                                                          double balance =0;

                                                          System.out.println("                                                                         -ADD BALANCE-");
                                                          System.out.println(" ");
                                                          System.out.println("     Balance Added...");
                                                          balance001 += room001_p;
                                                          back+=4;
                                                          break;

                                                      } else if (cc.equalsIgnoreCase("C")) {
                                                          back+=2;
                                                          break;

                                                      } else { System.out.println("     Not In The Choices, Please Try Again!");  }


                                                      if (back > 0){back--;  break;}
                                                      
                                                      }
                                                    if (back > 0){back--;  break;}
                                                    }
                                                    
                                                } else if (c.equalsIgnoreCase("C")) {
                                                    
                                                    System.out.println("                                                                        -  EDIT NAME  -");
                                                    name001.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name001.append(cc);
                                                    
                                                    System.out.println("     Name Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                  
                                                } else if (c.equalsIgnoreCase("D")) {
                                                    
                                                    System.out.println("                                                                      -  EDIT ADDRESS  -");
                                                    address001.setLength(0);
                                                    System.out.print("    System Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address001.append(o);
                                                    
                                                    System.out.println("     Address Is Succefully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("E")) {
                                                    
                                                    cnumber001.setLength(0);
                                                    System.out.println("                                                                   -  EDIT CONTACT NUMBER  -");
                                                    int ab = 0;
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber001.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("F")) {
                                                    
                                                    
                                                    
                                                        int h = 0;
                                                        
                                                        if (history == 1) {h = 0; }
                                                        else if (history == 2) {h = 1;}
                                                        else if (history == 3) {h = 2;}
                                                        else if (history == 4) {h = 3;}
                                                        else if (history == 5) {h = 4;}
                                                        
                                                        
                                                        hname[h] = "Name: "+name001;
                                                        haddress[h] = "Address: "+address001;
                                                        hcontact[h] = "Contact Number: 09"+cnumber001;
                                                        hbalance[h] = "Balance: "+balance001;
                                                        hdate_r[h] = "Date Occupied: "+ date001;
                                                        hroom[h] = "Room#: Room 001";
                                                        String archive_date = date_time.format(now);
                                                        
                                                        hdelete[h] = "Archive Date: "+archive_date;
                                                  
                                                        room001 = room001 - room001;
                                                        name001.setLength(0);
                                                        cnumber001.setLength(0);
                                                        address001.setLength(0);
                                                        balance001 = balance001 - balance001;
                                                        date001.setLength(0);
                                                        history++;
                                                        s_r001 = 1;
                                                        System.out.println("     Successfully Moved To Archive.");
                                                        back+=2;
                                                        break;
                                                        
                                                        
                                                   
                                          
                                                    
                                                } else if (c.equalsIgnoreCase("G")) {
                                                    back+=2;
                                                    break;
                                                    
                                                } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                                                
                                                                                       
                                                if (back > 0){back--;  break;}
                                                }//j2


                                            if (back > 0){back--;  break;}
                                            }//j1
                                            

                                        } else if (b.equals("2")) {
                                            
                                            System.out.println("                                                               -   ROOM 001 PAYMENT RECORD   -");
                                            System.out.println("     ");
                                            if (s_r001 == 1) { System.out.println("     No Payment Yet.");   
                                            
                                            } else {
                                                
                                                if (s_r001 >= 2) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date001[0]);
                                                    System.out.println("                                "+p_balance001[0]);
                                                    System.out.println("                              - "+p_room001[0]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total001[0]);
                                                    System.out.println(" ");}
                                                if (s_r001 >= 3) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date001[1]);
                                                    System.out.println("                                "+p_balance001[1]);
                                                    System.out.println("                              - "+p_room001[1]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total001[1]);
                                                    System.out.println(" ");}
                                                if (s_r001 >= 4) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date001[2]);
                                                    System.out.println("                                "+p_balance001[2]);
                                                    System.out.println("                              - "+p_room001[2]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total001[2]);
                                                    System.out.println(" ");}
                                                if (s_r001 >=5) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date001[3]);
                                                    System.out.println("                                "+p_balance001[3]);
                                                    System.out.println("                              - "+p_room001[3]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total001[3]);
                                                    System.out.println(" ");}
                                                
                                                    
                                                
                                                
                                            }
                                            
                                            System.out.print("     Press Enter To Exit: ");
                                            String m = input.nextLine();
                                            break;
                                            
                                  
                                        }else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }


                                    if (back > 0){back--;  break;}
                                    }//3

                                
                                } else { 
                                    System.out.println("     [1] Add Informations "); 
                                    System.out.println("     [0] Back ");
                                    
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) {  
                                            
                                            int cnumber = 0;
                                            int ab = 0;
                                            
                                            
                                            System.out.println("                                                                     - ADD INFORMATIONS - ");
                                            System.out.println("  ");
                                            System.out.print("     Enter A Name: ");
                                            String c = input.nextLine();
                                            System.out.print("     Enter Address: ");
                                            String cc = input.nextLine();
                                            
                                            
                                            System.out.println("     NOTE!FORMAT 972654952, Please Don't Include The '09' ");
                                            do {
                                                Scanner input1 = new Scanner (System.in);
                                                try {

                                                System.out.print("     Enter A Contact#:09");
                                                cnumber = input1.nextInt();
                                                try_c = false;


                                                } catch (Exception e) {
                                                System.out.println("     Please Enter A Number! Try Again.");
                                                ab = 1;
                                                try_c = true;
                                                } 
                                                String ccc = Long.toString(cnumber);
                                                if ((ccc.length()==9)) { 
                                                    break;
                                                } else if (ab == 1) { ab--;  
                                                
                                                } else {
                                                    System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                    try_c = true; 
                                                } 
                                                
                                            } while (try_c);
                                            
                                            String ccc = date.format(now);
                                            balance001 = balance001 + room001_p;
                                            room001++;
                                            
                                            name001.append(c);
                                            address001.append(cc);
                                            date001.append(ccc);
                                            cnumber001.append(cnumber);
                                            
                                            
                                            
                                            System.out.println("     The Informations Is Succesfuully Added!");
                                            break;

                                     
                                        } else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3
                                    
                             
                                }
                                
                                if (back > 0){back--;  break;}
                                }//2
                                
                                
                            } else if (aroom.equals("2")) { 
                                
                                
                                while (true) {//2
                              
                                
                                System.out.println("     ");
                                System.out.println("                                                                  -  ROOM 002 INFORMATIONS  -");
                                
                                if (room002 == 0) {
                                    System.out.println("     ROOM STATUS: VACANT");
                                    } else {
                                    System.out.println("     ROOM STATUS: OCCUPIED");
                                    }
                                    System.out.println("     NAME: "+ name002);
                                    System.out.println("     PERMANENT ADDRESS: "+ address002);
                                    System.out.println("     CONTACT NUMBER: 09"+ cnumber002);
                                    System.out.println("     BALANCE: "+ balance002);
                                    System.out.println("     DATE OCCUPIED: "+ date002);

                                if (room002 == 1) {
                                System.out.println("     [1] Edit Informations ");
                                System.out.println("     [2] Payment Record ");
                                System.out.println("     [0] Back ");
                                
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) { 
                                            
                                            while (true) {//j1
                                            System.out.println(" ");
                                            System.out.println("                                                                    -   EDIT INFORMATION   -");
                                            System.out.println(" ");
                                            System.out.println("     [A] Edit All Informations ");
                                            System.out.println("     [B] Add Payment / Add Balance ");
                                            System.out.println("     [C] Edit Name ");
                                            System.out.println("     [D] Edit Address ");
                                            System.out.println("     [E] Edit Contact Number ");
                                            System.out.println("     [F] Change to Vacant and Move To Archive");
                                            System.out.println("     [G] To Exit "); 
                                            
                                                while (true) {//j2
                                                System.out.print("        >> ");
                                                String c = input.nextLine();
                                                
                                                if (c.equalsIgnoreCase("A")) {
                                                    
                                                    System.out.println("                                                                   - EDIT ALL INFORMATIONS - ");
                                                    System.out.println(" ");
                                                    int ab = 0;//Just for test exp//
                                                    name002.setLength(0);
                                                    cnumber002.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name002.append(cc);
                                                    address002.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address002.append(o);
                                                    
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber002.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;

                                                    
                                                } else if (c.equalsIgnoreCase("B")) {
                                                    
                                                    
                                                    while (true) {
                  
                                                
                                                     
                                                      System.out.println(" ");
                                                      System.out.println("                                                                 -  ADD PAYMENT/ADD BALANCE  -");
                                                      System.out.println(" ");
                                                      System.out.println("     [A] Add Payment");
                                                      System.out.println("     [B] Add Balance");
                                                      System.out.println("     [C] Back"); 
                                                      
                                                      while (true) {
                                                      System.out.print("        >> ");
                                                      String cc = input.nextLine();

                                                      if (cc.equalsIgnoreCase("A")) {
                                                          double cash_a = 0;
                                                           if (balance002 > 0) {
                                                          System.out.println("                                                                         -ADD PAYMENT-");
                                                          System.out.println(" ");
                                                          
                                                          System.out.println("     Balance: "+balance002);
                                                          
                                                          int w = 0;
                                                          do {
                                                          Scanner input1 = new Scanner (System.in);
                                                          try {
                                                          
                                                          System.out.print("     Enter Cash Amount: ");
                                                          cash_a = input1.nextInt();
                                                          try_c = false;
                                                          w++;
                                                          } catch (Exception e) {
                                                          System.out.println("     Please Enter A Number! Try Again.");
                                                              try_c = true;
                                                          }
                                                          if (cash_a <= balance002 && w >= 1) {
                                                              if (cash_a >= (balance002 * 0.50)){
                                                              
                                                              try_c = false;}
                                                              else {System.out.println("     You Must Pay Atleast 50% Of Your Current Balance"); try_c = true; }
                                                          } else if (cash_a > balance002) {
                                                              System.out.println("     The Cash Is Greater Than The Balance!");
                                                              try_c = true;
                                                          } else {try_c = true;}
                                                          } while (try_c);

                                                          System.out.println("     Payment Done...");
                                                          int s = 0;
                                                          if (s_r002 == 1) { s = 0; }
                                                          else if (s_r002 == 2) { s = 1; }
                                                          else if (s_r002 == 3) { s = 2; }
                                                          else if (s_r002 == 4) { s = 3; }
                                                          else if (s_r002 == 5) { s = 4; }
                                                          
                                                          String ss = date_time.format(now);
                                                          double sss = balance002-cash_a;
                                                          
                                                          p_date002[s] = ("Date: "+ss);
                                                          p_balance002[s] = ("Balance: "+balance002);
                                                          p_room002[s] = ("Payment: "+cash_a);
                                                          p_total002[s] = ("New Balance: "+sss);
                                                          s_r002++;
                                                          balance002 = balance002-cash_a;
                                                          back+=4;
                                                          break;
                                                        } else { System.out.println("     This Room Does'nt Have Any Balance.");}

                                                      } else if (cc.equalsIgnoreCase("B")) {
                                                          double balance =0;

                                                          System.out.println("                                                                         -ADD BALANCE-");
                                                          System.out.println(" ");
                                                          System.out.println("     Balance Added...");
                                                          balance002 += room002_p;
                                                          back+=4;
                                                          break;

                                                      } else if (cc.equalsIgnoreCase("C")) {
                                                          back+=2;
                                                          break;

                                                      } else { System.out.println("     Not In The Choices, Please Try Again!"); jan++; }





                                                      if (back > 0){back--;  break;}
                                                      
                                                      }
                                                    if (back > 0){back--;  break;}
                                                    }
                                                    
                                                } else if (c.equalsIgnoreCase("C")) {
                                                    
                                                    System.out.println("                                                                        -  EDIT NAME  -");
                                                    name002.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name002.append(cc);
                                                    
                                                    System.out.println("     Name Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    

                                                    
                                                } else if (c.equalsIgnoreCase("D")) {
                                                    
                                                    System.out.println("                                                                      -  EDIT ADDRESS  -");
                                                    address002.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address002.append(o);
                                                    
                                                    System.out.println("     Address Is Succefully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("E")) {
                                                    
                                                    cnumber002.setLength(0);
                                                    System.out.println("                                                                   -  EDIT CONTACT NUMBER  -");
                                                    int ab = 0;
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber002.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("F")) {
                                                    
                                                    
                                                    
                                                        int h = 0;
                                                        
                                                        if (history == 1) {h = 0; }
                                                        else if (history == 2) {h = 1;}
                                                        else if (history == 3) {h = 2;}
                                                        else if (history == 4) {h = 3;}
                                                        else if (history == 5) {h = 4;}
                                                        
                                                        
                                                        hname[h] = "Name: "+name002;
                                                        haddress[h] = "Address: "+address002;
                                                        hcontact[h] = "Contact Number: 09"+cnumber002;
                                                        hbalance[h] = "Balance: "+balance002;
                                                        hdate_r[h] = "Date Occupied: "+ date002;
                                                        hroom[h] = "Room#: Room 002";
                                                        String archive_date = date_time.format(now);
                                                        
                                                        hdelete[h] = "Archive Date: "+archive_date;
                                                  
                                                        room002 = room002 - room002;
                                                        name002.setLength(0);
                                                        cnumber002.setLength(0);
                                                        address002.setLength(0);
                                                        balance002 = balance002 - balance002;
                                                        date002.setLength(0);
                                                        history++;
                                                        s_r002 = 1;
                                                        System.out.println("     Successfully Moved To Archive.");
                                                        back+=2;
                                                        break;
                                                        
                                                        
                                                   
                                                    
                                                    
                                                    
                                                    
                                                } else if (c.equalsIgnoreCase("G")) {
                                                    back+=2;
                                                    break;
                                                    
                                                } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                                                
                                                
                                                
                                                
                                                
                                                
                                                if (back > 0){back--;  break;}
                                                }//j2


                                            
                                            
                                            
                                            
                                            if (back > 0){back--;  break;}
                                            }//j1
                                            

                                        } else if (b.equals("2")) {
                                            
                                            System.out.println("                                                               -   ROOM 002 PAYMENT RECORD   -");
                                            System.out.println("     ");
                                            if (s_r002 == 1) { System.out.println("     No Payment Yet.");   
                                            
                                            } else {
                                                
                                                if (s_r002 >= 2) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date002[0]);
                                                    System.out.println("                                "+p_balance002[0]);
                                                    System.out.println("                              - "+p_room002[0]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total002[0]);
                                                    System.out.println(" ");}
                                                if (s_r002 >= 3) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date002[1]);
                                                    System.out.println("                                "+p_balance002[1]);
                                                    System.out.println("                              - "+p_room002[1]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total002[1]);
                                                    System.out.println(" ");}
                                                if (s_r002 >= 4) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date002[2]);
                                                    System.out.println("                                "+p_balance002[2]);
                                                    System.out.println("                              - "+p_room002[2]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total002[2]);
                                                    System.out.println(" ");}
                                                if (s_r002 >=5) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date002[3]);
                                                    System.out.println("                                "+p_balance002[3]);
                                                    System.out.println("                              - "+p_room002[3]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total002[3]);
                                                    System.out.println(" ");}
                                                    
                                                
                                                
                                            }
                                            
                                            System.out.print("     Press Enter To Exit: ");
                                            String m = input.nextLine();
                                            break;
                                            
                                            


                                        }else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3

                                
                                } else { 
                                    System.out.println("     [1] Add Informations "); 
                                    System.out.println("     [0] Back ");
                                    
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) {  
                                            
                                            int cnumber = 0;
                                            int ab = 0;
                                            
                                            
                                            System.out.println("                                                                     - ADD INFORMATIONS - ");
                                            System.out.println("  ");
                                            System.out.print("     Enter A Name: ");
                                            String c = input.nextLine();
                                            System.out.print("     Enter Address: ");
                                            String cc = input.nextLine();
                                            
                                            
                                            System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                            do {
                                                Scanner input1 = new Scanner (System.in);
                                                try {

                                                System.out.print("     Enter A Contact#:09");
                                                cnumber = input1.nextInt();
                                                try_c = false;


                                                } catch (Exception e) {
                                                System.out.println("     Please Enter A Number! Try Again.");
                                                ab = 1;
                                                try_c = true;
                                                } 
                                                String ccc = Long.toString(cnumber);
                                                if ((ccc.length()==9)) { 
                                                    break;
                                                } else if (ab == 1) { ab--;  
                                                
                                                } else {
                                                    System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                    try_c = true; 
                                                } 
                                                
                                            } while (try_c);
                                            
                                            String ccc = date.format(now);
                                            balance002 = balance002 + room002_p;
                                            room002++;
                                            
                                            name002.append(c);
                                            address002.append(cc);
                                            date002.append(ccc);
                                            cnumber002.append(cnumber);
                                            
                                            
                                            
                                            System.out.println("     The Informations Is Succesfuully Added!");
                                            break;

                                            
                                            



                                        
                                        } else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3
                                    
                                    
                                    
                                }
                                
                                if (back > 0){back--;  break;}
                                }//2
                                

                                
                                
                            
                            } else if (aroom.equals("3")) {
                                
                                
                                 while (true) {//2
                              
                                
                                
                                System.out.println("     ");
                                System.out.println("                                                                  -  ROOM 003 INFORMATIONS  -");
                                System.out.println("     ");
                                if (room003 == 0) {
                                    System.out.println("     ROOM STATUS: VACANT");
                                    } else {
                                    System.out.println("     ROOM STATUS: OCCUPIED");
                                    }
                                    System.out.println("     NAME: "+ name003);
                                    System.out.println("     PERMANENT ADDRESS: "+ address003);
                                    System.out.println("     CONTACT NUMBER: 09"+ cnumber003);
                                    System.out.println("     BALANCE: "+ balance003);
                                    System.out.println("     DATE OCCUPIED: "+ date003);

                                if (room003 == 1) {
                                System.out.println("     [1] Edit Informations ");
                                System.out.println("     [2] Payment Record ");
                                System.out.println("     [0] Back ");
                                
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) { 
                                            
                                            while (true) {//j1
                                            System.out.println(" ");
                                            System.out.println("                                                                    -   EDIT INFORMATION   -");
                                            System.out.println(" ");
                                            System.out.println("     [A] Edit All Informations ");
                                            System.out.println("     [B] Add Payment / Add Balance ");
                                            System.out.println("     [C] Edit Name ");
                                            System.out.println("     [D] Edit Address ");
                                            System.out.println("     [E] Edit Contact Number ");
                                            System.out.println("     [F] Change to Vacant and Move To Archive");
                                            System.out.println("     [G] To Exit "); 
                                            
                                                while (true) {//j2
                                                System.out.print("        >> ");
                                                String c = input.nextLine();
                                                
                                                if (c.equalsIgnoreCase("A")) {
                                                    
                                                    System.out.println("                                                                   - EDIT ALL INFORMATIONS - ");
                                                    System.out.println(" ");
                                                    int ab = 0;//Just for test exp//
                                                    name003.setLength(0);
                                                    cnumber003.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name003.append(cc);
                                                    address003.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address003.append(o);
                                                    
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber003.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers!Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;

                                                    
                                                } else if (c.equalsIgnoreCase("B")) {
                                                    
                                                    
                                                    while (true) {
                  
                                                
                                                     
                                                      System.out.println(" ");
                                                      System.out.println("                                                                 -  ADD PAYMENT/ADD BALANCE  -");
                                                      System.out.println(" ");
                                                      System.out.println("     [A] Add Payment");
                                                      System.out.println("     [B] Add Balance");
                                                      System.out.println("     [C] Back"); 
                                                      
                                                      while (true) {
                                                      System.out.print("        >> ");
                                                      String cc = input.nextLine();

                                                      if (cc.equalsIgnoreCase("A")) {
                                                          double cash_a = 0;
                                                           if (balance003 > 0) {
                                                          System.out.println("                                                                         -ADD PAYMENT-");
                                                          System.out.println(" ");
                                                          
                                                          System.out.println("     Balance: "+balance003);
                                                          
                                                          int w = 0;
                                                          do {
                                                          Scanner input1 = new Scanner (System.in);
                                                          try {
                                                          
                                                          System.out.print("     Enter Cash Amount: ");
                                                          cash_a = input1.nextInt();
                                                          try_c = false;
                                                          w++;
                                                          } catch (Exception e) {
                                                          System.out.println("     Please Enter A Number! Try Again.");
                                                              try_c = true;
                                                          }
                                                          if (cash_a <= balance003 && w >= 1) {
                                                              if (cash_a >= (balance003 * 0.50)){
                                                              
                                                              try_c = false;}
                                                              else {System.out.println("     You Must Pay Atleast 50% Of Your Current Balance"); try_c = true; }
                                                          } else if (cash_a > balance001) {
                                                              System.out.println("     The Cash Is Greater Than The Balance!");
                                                              try_c = true;
                                                          } else {try_c = true;}
                                                          } while (try_c);

                                                          System.out.println("     Payment Done...");
                                                          int s = 0;
                                                          if (s_r003 == 1) { s = 0; }
                                                          else if (s_r003 == 2) { s = 1; }
                                                          else if (s_r003 == 3) { s = 2; }
                                                          else if (s_r003 == 4) { s = 3; }
                                                          else if (s_r003 == 5) { s = 4; }
                                                          
                                                          String ss = date_time.format(now);
                                                          double sss = balance003-cash_a;
                                                          
                                                          p_date003[s] = ("Date: "+ss);
                                                          p_balance003[s] = ("Balance: "+balance003);
                                                          p_room003[s] = ("Payment: "+cash_a);
                                                          p_total003[s] = ("New Balance: "+sss);
                                                          s_r003++;
                                                          balance003 = balance003-cash_a;
                                                          back+=4;
                                                          break;
                                                        } else { System.out.println("     This Room Does'nt Have Any Balance.");}

                                                      } else if (cc.equalsIgnoreCase("B")) {
                                                          double balance =0;

                                                          System.out.println("                                                                         -ADD BALANCE-");
                                                          System.out.println(" ");
                                                          System.out.println("     Balance Added...");
                                                          balance003 += room003_p;
                                                          back+=4;
                                                          break;

                                                      } else if (cc.equalsIgnoreCase("C")) {
                                                          back+=2;
                                                          break;

                                                      } else { System.out.println("     Not In The Choices,Please Try Again!");  }





                                                      if (back > 0){back--;  break;}
                                                      
                                                      }
                                                    if (back > 0){back--;  break;}
                                                    }
                                                    
                                                } else if (c.equalsIgnoreCase("C")) {
                                                    
                                                    System.out.println("                                                                        -  EDIT NAME  -");
                                                    name003.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name003.append(cc);
                                                    
                                                    System.out.println("     Name Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    

                                                    
                                                } else if (c.equalsIgnoreCase("D")) {
                                                    
                                                    System.out.println("                                                                      -  EDIT ADDRESS  -");
                                                    address003.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address003.append(o);
                                                    
                                                    System.out.println("     Address Is Succefully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("E")) {
                                                    
                                                    cnumber003.setLength(0);
                                                    System.out.println("                                                                   -  EDIT CONTACT NUMBER  -");
                                                    int ab = 0;
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber003.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("F")) {
                                                    
                                                    
                                                   
                                                        int h = 0;
                                                        
                                                        if (history == 1) {h = 0; }
                                                        else if (history == 2) {h = 1;}
                                                        else if (history == 3) {h = 2;}
                                                        else if (history == 4) {h = 3;}
                                                        else if (history == 5) {h = 4;}
                                                        
                                                        
                                                        hname[h] = "Name: "+name003;
                                                        haddress[h] = "Address: "+address003;
                                                        hcontact[h] = "Contact Number: 09"+cnumber003;
                                                        hbalance[h] = "Balance: "+balance003;
                                                        hdate_r[h] = "Date Occupied: "+ date003;
                                                        hroom[h] = "Room#: Room 003";
                                                        String archive_date = date_time.format(now);
                                                        
                                                        hdelete[h] = "Archive Date: "+archive_date;
                                                  
                                                        room003 = room003 - room003;
                                                        name003.setLength(0);
                                                        cnumber003.setLength(0);
                                                        address003.setLength(0);
                                                        balance003 = balance003 - balance003;
                                                        date003.setLength(0);
                                                        history++;
                                                        s_r003 =1;
                                                        System.out.println("     Successfully Moved To Archive.");
                                                        back+=2;
                                                        break;
                                                        
                                                        
                                                  
                                                    
                                                } else if (c.equalsIgnoreCase("G")) {
                                                    back+=2;
                                                    break;
                                                    
                                                } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                                                
                                                
                                                
                                                if (back > 0){back--;  break;}
                                                }//j2


                                            
                                            if (back > 0){back--;  break;}
                                            }//j1
                                            

                                        } else if (b.equals("2")) {
                                            
                                            System.out.println("                                                               -   ROOM 003 PAYMENT RECORD   -");
                                            System.out.println("     ");
                                            if (s_r003 == 1) { System.out.println("     No Payment Yet.");   
                                            
                                            } else {
                                                
                                                if (s_r003 >= 2) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date003[0]);
                                                    System.out.println("                                "+p_balance003[0]);
                                                    System.out.println("                              - "+p_room003[0]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total003[0]);
                                                    System.out.println(" ");}
                                                if (s_r003 >= 3) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date003[1]);
                                                    System.out.println("                                "+p_balance003[1]);
                                                    System.out.println("                              - "+p_room003[1]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total003[1]);
                                                    System.out.println(" ");}
                                                if (s_r003 >= 4) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date003[2]);
                                                    System.out.println("                                "+p_balance003[2]);
                                                    System.out.println("                              - "+p_room003[2]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total003[2]);
                                                    System.out.println(" ");}
                                                if (s_r003 >=5) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date003[3]);
                                                    System.out.println("                                "+p_balance003[3]);
                                                    System.out.println("                              - "+p_room003[3]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total003[3]);
                                                    System.out.println(" ");}
                                                    
                                                
                                                
                                            }
                                            
                                            System.out.print("     Press Enter To Exit: ");
                                            String m = input.nextLine();
                                            break;
                                            
                                            


                                        }else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3

                                
                                } else { 
                                    System.out.println("     [1] Add Informations "); 
                                    System.out.println("     [0] Back ");
                                    
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) {  
                                            
                                            int cnumber = 0;
                                            int ab = 0;
                                            
                                            
                                            System.out.println("                                                                  - ADD INFORMATIONS - ");
                                            System.out.println("  ");
                                            System.out.print("     Enter A Name: ");
                                            String c = input.nextLine();
                                            System.out.print("     Enter Address: ");
                                            String cc = input.nextLine();
                                            
                                            
                                            System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                            do {
                                                Scanner input1 = new Scanner (System.in);
                                                try {

                                                System.out.print("     Enter A Contact#: 09");
                                                cnumber = input1.nextInt();
                                                try_c = false;


                                                } catch (Exception e) {
                                                System.out.println("     Please Enter A Number! Try Again.");
                                                ab = 1;
                                                try_c = true;
                                                } 
                                                String ccc = Long.toString(cnumber);
                                                if ((ccc.length()==9)) { 
                                                    break;
                                                } else if (ab == 1) { ab--;  
                                                
                                                } else {
                                                    System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                    try_c = true; 
                                                } 
                                                
                                            } while (try_c);
                                            
                                            String ccc = date.format(now);
                                            balance003 = balance003 + room003_p;
                                            room003++;
                                            
                                            name003.append(c);
                                            address003.append(cc);
                                            date003.append(ccc);
                                            cnumber003.append(cnumber);
                                            
                                            
                                            
                                            System.out.println("     The Informations Is Succesfuully Added!");
                                            break;

                                            
                                            



                                        
                                        } else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3
                                    
                                    
                                    
                                }
                                
                                if (back > 0){back--;  break;}
                                }//2
                            
                            } else if (aroom.equals("4")) {
                                
                                
                                while (true) {//2
                              
                                
                                
                                System.out.println("     ");
                                System.out.println("                                                                  -  ROOM 004 INFORMATIONS  -");
                                System.out.println("     ");
                                if (room004 == 0) {
                                    System.out.println("     ROOM STATUS: VACANT");
                                    } else {
                                    System.out.println("     ROOM STATUS: OCCUPIED");
                                    }
                                    System.out.println("     NAME: "+ name004);
                                    System.out.println("     PERMANENT ADDRESS: "+ address004);
                                    System.out.println("     CONTACT NUMBER: 09"+ cnumber004);
                                    System.out.println("     BALANCE: "+ balance004);
                                    System.out.println("     DATE OCCUPIED: "+ date004);

                                if (room004 == 1) {
                                System.out.println("     [1] Edit Informations ");
                                System.out.println("     [2] Payment Record ");
                                System.out.println("     [0] Back ");
                                
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) { 
                                            
                                            while (true) {//j1
                                            System.out.println(" ");
                                            System.out.println("                                                                    -   EDIT INFORMATION   -");
                                            System.out.println(" ");
                                            System.out.println("     [A] Edit All Informations ");
                                            System.out.println("     [B] Add Payment / Add Balance ");
                                            System.out.println("     [C] Edit Name ");
                                            System.out.println("     [D] Edit Address ");
                                            System.out.println("     [E] Edit Contact Number ");
                                            System.out.println("     [F] Change to Vacant and Move To Archive");
                                            System.out.println("     [G] To Exit "); 
                                            
                                                while (true) {//j2
                                                System.out.print("        >> ");
                                                String c = input.nextLine();
                                                
                                                if (c.equalsIgnoreCase("A")) {
                                                    
                                                    System.out.println("                                                                   - EDIT ALL INFORMATIONS - ");
                                                    System.out.println(" ");
                                                    int ab = 0;//Just for test exp//
                                                    name004.setLength(0);
                                                    cnumber004.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name004.append(cc);
                                                    address004.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address004.append(o);
                                                    
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber004.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;

                                                    
                                                } else if (c.equalsIgnoreCase("B")) {
                                                    
                                                    
                                                    while (true) {
                  
                                                
                                                     
                                                      System.out.println(" ");
                                                      System.out.println("                                                                 -  ADD PAYMENT/ADD BALANCE  -");
                                                      System.out.println(" ");
                                                      System.out.println("     [A] Add Payment");
                                                      System.out.println("     [B] Add Balance");
                                                      System.out.println("     [C] Back"); 
                                                      
                                                      while (true) {
                                                      System.out.print("        >> ");
                                                      String cc = input.nextLine();

                                                      if (cc.equalsIgnoreCase("A")) {
                                                          double cash_a = 0;
                                                           if (balance004 > 0) {
                                                          System.out.println("                                                                         -ADD PAYMENT-");
                                                          System.out.println(" ");
                                                          
                                                          System.out.println("     Balance: "+balance004);

                                                          int w = 0;
                                                          do {
                                                          Scanner input1 = new Scanner (System.in);
                                                          try {
                                                          
                                                          System.out.print("     Enter Cash Amount: ");
                                                          cash_a = input1.nextInt();
                                                          try_c = false;
                                                          w++;
                                                          } catch (Exception e) {
                                                          System.out.println("     Please Enter A Number! Try Again.");
                                                              try_c = true;
                                                          }
                                                          if (cash_a <= balance004 && w >= 1) {
                                                              if (cash_a >= (balance004 * 0.50)){
                                                              
                                                              try_c = false;}
                                                              else {System.out.println("     You Must Pay Atleast 50% Of Your Current Balance"); try_c = true; }
                                                          } else if (cash_a > balance004) {
                                                              System.out.println("     The Cash Is Greater Than The Balance!");
                                                              try_c = true;
                                                          } else {try_c = true;}
                                                          } while (try_c);

                                                          System.out.println("     Payment Done...");
                                                          int s = 0;
                                                          if (s_r004 == 1) { s = 0; }
                                                          else if (s_r004 == 2) { s = 1; }
                                                          else if (s_r004 == 3) { s = 2; }
                                                          else if (s_r004 == 4) { s = 3; }
                                                          else if (s_r004 == 5) { s = 4; }
                                                          
                                                          String ss = date_time.format(now);
                                                          double sss = balance004-cash_a;
                                                          
                                                          p_date004[s] = ("Date: "+ss);
                                                          p_balance004[s] = ("Balance: "+balance004);
                                                          p_room004[s] = ("Payment: "+cash_a);
                                                          p_total004[s] = ("New Balance: "+sss);
                                                          s_r004++;
                                                          balance004 = balance004-cash_a;
                                                          back+=4;
                                                          break;
                                                        } else { System.out.println("     This Room Does'nt Have Any Balance.");}

                                                      } else if (cc.equalsIgnoreCase("B")) {
                                                          double balance =0;

                                                          System.out.println("                                                                         -ADD BALANCE-");
                                                          System.out.println(" ");
                                                          System.out.println("     Balance Added...");
                                                          balance004 += room004_p;
                                                          back+=4;
                                                          break;

                                                      } else if (cc.equalsIgnoreCase("C")) {
                                                          back+=2;
                                                          break;

                                                      } else { System.out.println("     Not In The Choices, Please Try Again!");  }





                                                      if (back > 0){back--;  break;}
                                                      
                                                      }
                                                    if (back > 0){back--;  break;}
                                                    }
                                                    
                                                } else if (c.equalsIgnoreCase("C")) {
                                                    
                                                    System.out.println("                                                                        -  EDIT NAME  -");
                                                    System.out.println(" ");
                                                    name004.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name004.append(cc);
                                                    
                                                    System.out.println("     Name Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    

                                                    
                                                } else if (c.equalsIgnoreCase("D")) {
                                                    
                                                    System.out.println("                                                                      -  EDIT ADDRESS  -");
                                                    System.out.println(" ");
                                                    address004.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address004.append(o);
                                                    
                                                    System.out.println("     Address Is Succefully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("E")) {
                                                    
                                                    cnumber004.setLength(0);
                                                    System.out.println("                                                                   -  EDIT CONTACT NUMBER  -");
                                                    System.out.println(" ");
                                                    int ab = 0;
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber004.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("F")) {
                                                    
                                                    
                                                    if (room004 == 1) {
                                                        int h = 0;
                                                        
                                                        if (history == 1) {h = 0; }
                                                        else if (history == 2) {h = 1;}
                                                        else if (history == 3) {h = 2;}
                                                        else if (history == 4) {h = 3;}
                                                        else if (history == 5) {h = 4;}
                                                        
                                                        
                                                        hname[h] = "Name: "+name004;
                                                        haddress[h] = "Address: "+address004;
                                                        hcontact[h] = "Contact Number: 09"+cnumber004;
                                                        hbalance[h] = "Balance: "+balance004;
                                                        hdate_r[h] = "Date Occupied: "+ date004;
                                                        hroom[h] = "Room#: Room 004";
                                                        String archive_date = date_time.format(now);
                                                        
                                                        hdelete[h] = "Archive Date: "+archive_date;
                                                  
                                                        room004 = room004 - room004;
                                                        name004.setLength(0);
                                                        cnumber004.setLength(0);
                                                        address004.setLength(0);
                                                        balance004 = balance004 - balance004;
                                                        date004.setLength(0);
                                                        history++;
                                                        s_r004 = 1;
                                                        System.out.println("     Successfully Moved To Archive.");
                                                        back+=2;
                                                        break;
                                                        
                                                        
                                                    } else if (room004 == 0){   

                                                            System.out.println("     The Room Does'nt Have Data At All.");
                                                            
                                                    }
                                                    
                                                    
                                                    
                                                    
                                                } else if (c.equalsIgnoreCase("G")) {
                                                    back+=2;
                                                    break;
                                                    
                                                } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                                                
                                                
                                                
                                                
                                                
                                                
                                                if (back > 0){back--;  break;}
                                                }//j2


                                            
                                            
                                            
                                            
                                            if (back > 0){back--;  break;}
                                            }//j1
                                            

                                        } else if (b.equals("2")) {
                                            
                                            System.out.println("                                                               -   ROOM 004 PAYMENT RECORD   -");
                                            System.out.println("     ");
                                            if (s_r004 == 1) { System.out.println("     No Payment Yet.");   
                                            
                                            } else {
                                                
                                                if (s_r004 >= 2) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date004[0]);
                                                    System.out.println("                                "+p_balance004[0]);
                                                    System.out.println("                              - "+p_room004[0]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total004[0]);
                                                    System.out.println(" "); }
                                                if (s_r004 >= 3) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date004[1]);
                                                    System.out.println("                                "+p_balance004[1]);
                                                    System.out.println("                              - "+p_room004[1]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total004[1]);
                                                    System.out.println(" "); }
                                                if (s_r004 >= 4) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date004[2]);
                                                    System.out.println("                                "+p_balance004[2]);
                                                    System.out.println("                              - "+p_room004[2]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total004[2]);
                                                    System.out.println(" ");}
                                                if (s_r004 >=5) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date004[3]);
                                                    System.out.println("                                "+p_balance004[3]);
                                                    System.out.println("                              - "+p_room004[3]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total004[3]);
                                                    System.out.println(" ");}
                                                    
                                                
                                                
                                            }
                                            
                                            System.out.print("     Press Enter To Exit: ");
                                            String m = input.nextLine();
                                            break;
                                            
                                            


                                        }else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3

                                
                                } else { 
                                    System.out.println("     [1] Add Informations "); 
                                    System.out.println("     [0] Back ");
                                    
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) {  
                                            
                                            int cnumber = 0;
                                            int ab = 0;
                                            
                                            
                                            System.out.println("                                                                     - ADD INFORMATIONS - ");
                                            System.out.println("  ");
                                            System.out.print("     Enter A Name: ");
                                            String c = input.nextLine();
                                            System.out.print("     Enter Address: ");
                                            String cc = input.nextLine();
                                            
                                            
                                            System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                            do {
                                                Scanner input1 = new Scanner (System.in);
                                                try {

                                                System.out.print("     Enter A Contact#:09");
                                                cnumber = input1.nextInt();
                                                try_c = false;


                                                } catch (Exception e) {
                                                System.out.println("     Please Enter A Number! Try Again.");
                                                ab = 1;
                                                try_c = true;
                                                } 
                                                String ccc = Long.toString(cnumber);
                                                if ((ccc.length()==9)) { 
                                                    break;
                                                } else if (ab == 1) { ab--;  
                                                
                                                } else {
                                                    System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                    try_c = true; 
                                                } 
                                                
                                            } while (try_c);
                                            
                                            String ccc = date.format(now);
                                            balance004 = balance004 + room004_p;
                                            room004++;
                                            
                                            name004.append(c);
                                            address004.append(cc);
                                            date004.append(ccc);
                                            cnumber004.append(cnumber);
                                            
                                            
                                            
                                            System.out.println("     The Informations Is Succesfuully Added!");
                                            break;

                                            
                                            



                                        
                                        } else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3
                                    
                                    
                                    
                                }
                                
                                if (back > 0){back--;  break;}
                                }//2
                                
                                
                                
                                
                                

                            
                            } else if (aroom.equals("5")) {
                                
                                
                                
                                while (true) {//2
                              
                                
                                
                                System.out.println("     ");
                                System.out.println("                                                                  -  ROOM 005 INFORMATIONS  -");
                                System.out.println("     ");
                                if (room005 == 0) {
                                    System.out.println("     ROOM STATUS: VACANT");
                                    } else {
                                    System.out.println("     ROOM STATUS: OCCUPIED");
                                    }
                                    System.out.println("     NAME: "+ name005);
                                    System.out.println("     PERMANENT ADDRESS: "+ address005);
                                    System.out.println("     CONTACT NUMBER: 09"+ cnumber005);
                                    System.out.println("     BALANCE: "+ balance005);
                                    System.out.println("     DATE OCCUPIED: "+ date005);

                                if (room005 == 1) {
                                System.out.println("     [1] Edit Informations ");
                                System.out.println("     [2] Payment Record ");
                                System.out.println("     [0] Back ");
                                
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) { 
                                            
                                            while (true) {//j1
                                            System.out.println(" ");
                                            System.out.println("                                                                    -   EDIT INFORMATION   -");
                                            System.out.println(" ");
                                            System.out.println("     [A] Edit All Informations ");
                                            System.out.println("     [B] Add Payment / Add Balance ");
                                            System.out.println("     [C] Edit Name ");
                                            System.out.println("     [D] Edit Address ");
                                            System.out.println("     [E] Edit Contact Number ");
                                            System.out.println("     [F] Change to Vacant and Move To Archive");
                                            System.out.println("     [G] To Exit "); 
                                            
                                                while (true) {//j2
                                                System.out.print("        >> ");
                                                String c = input.nextLine();
                                                
                                                if (c.equalsIgnoreCase("A")) {
                                                    
                                                    System.out.println("                                                                   - EDIT ALL INFORMATIONS - ");
                                                    System.out.println(" ");
                                                    int ab = 0;//Just for test exp//
                                                    name005.setLength(0);
                                                    cnumber005.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name005.append(cc);
                                                    address005.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address005.append(o);
                                                    
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber005.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;

                                                    
                                                } else if (c.equalsIgnoreCase("B")) {
                                                    
                                                    
                                                    while (true) {
                  
                                                
                                                     
                                                      System.out.println(" ");
                                                      System.out.println("                                                                 -  ADD PAYMENT/ADD BALANCE  -");
                                                      System.out.println(" ");
                                                      System.out.println("     [A] Add Payment");
                                                      System.out.println("     [B] Add Balance");
                                                      System.out.println("     [C] Back"); 
                                                      
                                                      while (true) {
                                                      System.out.print("        >> ");
                                                      String cc = input.nextLine();

                                                      if (cc.equalsIgnoreCase("A")) {
                                                          double cash_a = 0;
                                                           if (balance005 > 0) {
                                                          System.out.println("                                                                         -ADD PAYMENT-");
                                                          System.out.println(" ");
                                                          
                                                          System.out.println("     Balance: "+balance005);

                                                          int w = 0;
                                                          do {
                                                          Scanner input1 = new Scanner (System.in);
                                                          try {
                                                          
                                                          System.out.print("     Enter Cash Amount: ");
                                                          cash_a = input1.nextInt();
                                                          try_c = false;
                                                          w++;
                                                          } catch (Exception e) {
                                                          System.out.println("     Please Enter A Number! Try Again.");
                                                              try_c = true;
                                                          }
                                                          if (cash_a <= balance005 && w >= 1) {
                                                              if (cash_a >= (balance005 * 0.50)){
                                                              
                                                              try_c = false;}
                                                              else {System.out.println("     You Must Pay Atleast 50% Of Your Current Balance"); try_c = true; }
                                                          } else if (cash_a > balance005) {
                                                              System.out.println("     The Cash Is Greater Than The Balance!");
                                                              try_c = true;
                                                          } else {try_c = true;}
                                                          } while (try_c);

                                                          System.out.println("     Payment Done...");
                                                          int s = 0;
                                                          if (s_r005 == 1) { s = 0; }
                                                          else if (s_r005 == 2) { s = 1; }
                                                          else if (s_r005 == 3) { s = 2; }
                                                          else if (s_r005 == 4) { s = 3; }
                                                          else if (s_r005 == 5) { s = 4; }
                                                          
                                                          String ss = date_time.format(now);
                                                          double sss = balance005-cash_a;
                                                          
                                                          p_date005[s] = ("Date: "+ss);
                                                          p_balance005[s] = ("Balance: "+balance005);
                                                          p_room005[s] = ("Payment: "+cash_a);
                                                          p_total005[s] = ("New Balance: "+sss);
                                                          s_r005++;
                                                          balance005 = balance005-cash_a;
                                                          back+=4;
                                                          break;
                                                        } else { System.out.println("     This Room Does'nt Have Any Balance.");}

                                                      } else if (cc.equalsIgnoreCase("B")) {
                                                          double balance =0;

                                                          System.out.println("                                                                         -ADD BALANCE-");
                                                          System.out.println(" ");
                                                          System.out.println("     Balance Added...");
                                                          balance005 += room005_p;
                                                          back+=4;
                                                          break;

                                                      } else if (cc.equalsIgnoreCase("C")) {
                                                          back+=2;
                                                          break;

                                                      } else { System.out.println("     Not In The Choices, Please Try Again!"); }





                                                      if (back > 0){back--;  break;}
                                                      
                                                      }
                                                    if (back > 0){back--;  break;}
                                                    }
                                                    
                                                } else if (c.equalsIgnoreCase("C")) {
                                                    
                                                    System.out.println("                                                                        -  EDIT NAME  -");
                                                    System.out.println(" ");
                                                    name005.setLength(0);
                                                    System.out.print("     Enter A Name: ");
                                                    String cc = input.nextLine();
                                                    name005.append(cc);
                                                    
                                                    System.out.println("     Name Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    

                                                    
                                                } else if (c.equalsIgnoreCase("D")) {
                                                    
                                                    System.out.println("                                                                      -  EDIT ADDRESS  -");
                                                    System.out.println(" ");
                                                    address005.setLength(0);
                                                    System.out.print("     Enter Address: ");
                                                    String o = input.nextLine();               
                                                    address005.append(o);
                                                    
                                                    System.out.println("     Address Is Succefully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("E")) {
                                                    
                                                    cnumber005.setLength(0);
                                                    System.out.println("                                                                   -  EDIT CONTACT NUMBER  -");
                                                    System.out.println(" ");
                                                    int ab = 0;
                                                    System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                                    int cnumber = 0;
                                                    do {
                                                        Scanner input1 = new Scanner (System.in);
                                                        try {

                                                        System.out.print("     Enter A Contact#: 09");
                                                        cnumber = input1.nextInt();
                                                        try_c = false;


                                                        } catch (Exception e) {
                                                        System.out.println("     Please Enter A Number! Try Again.");
                                                        ab = 1;
                                                        try_c = true;
                                                        } 
                                                        String ccc = Long.toString(cnumber);
                                                        if ((ccc.length()==9)) {
                                                            cnumber005.append(cnumber);
                                                            break;
                                                        } else if (ab == 1) { ab--;  

                                                        } else {
                                                            System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                            try_c = true; 
                                                        } 

                                                    } while (try_c);
                                                    
                                                    System.out.println("     The Informations Is Successfully Changed");
                                                    back+=2;
                                                    break;
                                                    
                                                } else if (c.equalsIgnoreCase("F")) {
                                                    
                                                    
                                                  
                                                        int h = 0;
                                                        
                                                        if (history == 1) {h = 0; }
                                                        else if (history == 2) {h = 1;}
                                                        else if (history == 3) {h = 2;}
                                                        else if (history == 4) {h = 3;}
                                                        else if (history == 5) {h = 4;}
                                                        
                                                        
                                                        hname[h] = "Name: "+name005;
                                                        haddress[h] = "Address: "+address005;
                                                        hcontact[h] = "Contact Number: 09"+cnumber005;
                                                        hbalance[h] = "Balance: "+balance005;
                                                        hdate_r[h] = "Date Occupied: "+ date005;
                                                        hroom[h] = "Room#: Room 005";
                                                        String archive_date = date_time.format(now);
                                                        
                                                        hdelete[h] = "Archive Date: "+archive_date;
                                                  
                                                        room005 = room005 - room005;
                                                        name005.setLength(0);
                                                        cnumber005.setLength(0);
                                                        address005.setLength(0);
                                                        balance005 = balance005 - balance005;
                                                        date005.setLength(0);
                                                        history++;
                                                        s_r005 = 1;
                                                        System.out.println("     Successfully Moved To Archive.");
                                                        back+=2;
                                                        break;
                                                        
                                                        
                                                    
                                                } else if (c.equalsIgnoreCase("G")) {
                                                    back+=2;
                                                    break;
                                                    
                                                } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                                                
                                                
                                                
                                                
                                                
                                                
                                                if (back > 0){back--;  break;}
                                                }//j2


                                            
                                            
                                            
                                            
                                            if (back > 0){back--;  break;}
                                            }//j1
                                            

                                        } else if (b.equals("2")) {
                                            
                                            System.out.println("                                                               -   ROOM 005 PAYMENT RECORD   -");
                                            System.out.println("     ");
                                            if (s_r005 == 1) { System.out.println("     No Payment Yet.");   
                                            
                                            } else {
                                                
                                                if (s_r005 >= 2) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date005[0]);
                                                    System.out.println("                                "+p_balance005[0]);
                                                    System.out.println("                              - "+p_room005[0]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total005[0]);
                                                    System.out.println(" "); }
                                                if (s_r005 >= 3) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date005[1]);
                                                    System.out.println("                                "+p_balance005[1]);
                                                    System.out.println("                              - "+p_room005[1]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total005[1]);
                                                    System.out.println(" "); }
                                                if (s_r005 >= 4) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date005[2]);
                                                    System.out.println("                                "+p_balance005[2]);
                                                    System.out.println("                              - "+p_room005[2]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total005[2]);
                                                    System.out.println(" ");}
                                                if (s_r005 >=5) {
                                                    System.out.println(" ");
                                                    System.out.println("     "+p_date005[3]);
                                                    System.out.println("                                "+p_balance005[3]);
                                                    System.out.println("                              - "+p_room005[3]);
                                                    System.out.println("     -------------------------------------------");
                                                    System.out.println("                             "+p_total005[3]);
                                                    System.out.println(" ");}
                                                    
                                                
                                                
                                            }
                                            
                                            System.out.print("     Press Enter To Exit: ");
                                            String m = input.nextLine();
                                            break;
                                            
                                            


                                        }else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3

                                
                                } else { 
                                    System.out.println("     [1] Add Informations "); 
                                    System.out.println("     [0] Back ");
                                    
                                    while (true) {//3
                                        System.out.print("        >> ");
                                        String b = input.nextLine();

                                        if (b.equals("1")) {  
                                            
                                            int cnumber = 0;
                                            int ab = 0;
                                            
                                            
                                            System.out.println("                                                                     - ADD INFORMATIONS - ");
                                            System.out.println("  ");
                                            System.out.print("     Enter A Name: ");
                                            String c = input.nextLine();
                                            System.out.print("     Enter Address: ");
                                            String cc = input.nextLine();
                                            
                                            
                                            System.out.println("     NOTE! FORMAT 972654952, Please Don't Include The '09' ");
                                            do {
                                                Scanner input1 = new Scanner (System.in);
                                                try {

                                                System.out.print("     Enter A Contact#:09");
                                                cnumber = input1.nextInt();
                                                try_c = false;


                                                } catch (Exception e) {
                                                System.out.println("     Please Enter A Number! Try Again.");
                                                ab = 1;
                                                try_c = true;
                                                } 
                                                String ccc = Long.toString(cnumber);
                                                if ((ccc.length()==9)) { 
                                                    break;
                                                } else if (ab == 1) { ab--;  
                                                
                                                } else {
                                                    System.out.println("     Your Number Must Be 9 Numbers! Please Try Again.");
                                                    try_c = true; 
                                                } 
                                                
                                            } while (try_c);
                                            
                                            String ccc = date.format(now);
                                            balance005 = balance005 + room005_p;
                                            room005++;
                                            
                                            name005.append(c);
                                            address005.append(cc);
                                            date005.append(ccc);
                                            cnumber005.append(cnumber);
                                            
                                            
                                            
                                            System.out.println("     The Informations Is Succesfully Added!");
                                            break;

                                            
                                            



                                        
                                        } else if (b.equals("0")) {
                                            back+=2;
                                            break;

                                        } else { System.out.println("     Not In The Choices, Please Try Again"); }



                                    if (back > 0){back--;  break;}
                                    }//3
                                    
                                    
                                    
                                }
                                
                                if (back > 0){back--;  break;}
                                }//2
                                
                                
                            } else if (aroom.equals("0")) {
                                back+=2;
                                break;
                            
                            } else { System.out.println("     Not In The Choices, Please Try Again!");  }
                            
                             
                            
                            
                            
                        if (back > 0){back--;  break;}    
                        }//WHILE 4
                        
                        if (back > 0){back--;  break;}
                         }//1
                        
                    } else if (mmenu.equals("3")) {
                        
                            int janix = 1;
                        
        
       
                            while (true) {
                            if (janix >= 1) {
                            System.out.println(" ");
                            System.out.println("                                                              -  Change Username And Password  -");
                            System.out.println(" ");
                            System.out.println("     [A] Change Both Username And Password  ");
                            System.out.println("     [B] Change Username Only ");
                            System.out.println("     [C] Change Password Only ");
                            System.out.println("     [D] Exit "); }
                            System.out.print("        >> ");
                            String dd = input.nextLine();


                            if (dd.equalsIgnoreCase("A")) {

                                String new_username = "";
                                String new_password = "";
                                System.out.println("                                                                -  Change Username and Password  -");
                                System.out.println("     Please Enter Your Old Username And Password");

                                int aa = 3;
                                while (aa > 0 ) {


                              System.out.print("     Enter Old User Name: ");
                              String user_name = input.nextLine();
                              System.out.print("     Enter Old Password: ");
                              String password = input.nextLine();

                              if (user_name.equals(admin_username1)&& password.equals(admin_pass1)){
                                    break;
                              } else {

                                    aa--;
                                    System.out.println("     Wrong Username or Password! Please Try Again.");
                                    System.out.println("     Attempt Left: "+aa);
                                    System.out.println(" ");}


                                }

                                if (aa == 0){
                                    System.out.println("     Sorry You Have Use All Your Attepmts.");
                                    janix++;
                                    
                                    
                                } else {

                                while (true) {
                                System.out.println(" ");
                                System.out.println("     Enter Your New Username and Password");
                                System.out.println("     NOTE! USERNAME AND PASSWORD MUST BE AT LEAST 4 CHARACTER AND ABOVE ");
                                System.out.print("     Enter New Username: ");
                                new_username = input.nextLine();
                                System.out.print("     Enter New Password: ");
                                new_password = input.nextLine();


                          if ((new_username.length() == 1) || (new_username.length() == 2) || (new_username.length() == 3)  ) {
                                if ((new_password.length()==1) || (new_password.length()==2)   || (new_password.length()==3) ) { 
                                    System.out.println("     The Username And Password Is Too Short, Please Try Again!"); }
                                else { System.out.println("     The Username Is Too Short, Please Try Agin!"); }
                          } else if  ((new_password.length()==1) || (new_password.length()==2)   || (new_password.length()==2) ) { 
                                System.out.println("     The Password Is Too Short, Please Try Again!");    

                          } else {

                                if (new_username.equals(admin_username1) && new_password.equals(admin_pass1) )  { 
                                    System.out.println("     You Already Use That Username And Password, Please Try again."); 
                                } else if (new_username.equals(admin_username1)) {
                                    System.out.println("     You Already Use That Username, Please Try again.");
                                } else if (new_password.equals(admin_pass1)) {
                                    System.out.println("     You Already Use That Password, Please Try again."); 
                                } else {
                                    int aaa = 3;
                                    while (aaa > 0){
                                        System.out.print("     Verify New Username: ");
                                        String v_username = input.nextLine();
                                        System.out.print("     Verify New Password: ");
                                        String v_password = input.nextLine();

                                    if (v_username.equals(new_username)&& v_password.equals(new_password)){
                                        System.out.println("     Your Username And Password Is Changed! ");
                                        System.out.println("     Session Expired, Logout. ");
                                        admin_u.setLength(0);
                                        admin_p.setLength(0);
                                        admin_u.append(new_username);
                                        admin_p.append(new_password);
                                        admin_username1 = admin_u.toString();//convert to compare//
                                        admin_pass1 = admin_p.toString();
                                        janix++;
                                        back+=5;
                                        break;
                                    } else {
                                        aaa--;
                                        System.out.println("     The Old And New Username/Password Is Not Match, Please Try Again");
                                        System.out.println("     Attempt Left: "+aaa);
                                        System.out.println(" ");}


                                     }//loops for verify//

                                    if (aaa == 0){
                                        System.out.println("     Sorry You Have Use All Your Attepmts."); 
                                        janix++;
                                        break;} } }

                                    if (back >= 1){ back--; break;} 
                                    
                                }
                          }//nested loops for newuser name and pass// 

                            } else if (dd.equalsIgnoreCase("B")) { //Fochange username only//

                              String new_username = "";
                              System.out.println("                                                                  -  CHANGE USERNAME ONLY  -");
                              System.out.println(" ");
                              System.out.println("     Please Enter Your Old Username");

                              int aa = 3; //CHANCES/



                              while (aa > 0) {

                                    System.out.print("     Enter Old Username: ");
                                    String user_name = input.nextLine();


                                    if (user_name.equals(admin_username1)){
                                    break;
                                    } else {

                                    aa--;
                                    System.out.println("     Wrong Username!Please Try Again.");
                                    System.out.println("     Attempt Left: "+aa);
                                    System.out.println(" ");}


                              } 

                                    if (aa == 0){
                                    System.out.println("     Sorry You Have Use All Your Attepmts.");
                                    janix++;
                                     
                                    } else {

                                            System.out.println(" ");
                                            System.out.println("     Enter Your New Username");
                                            System.out.println("     NOTE! USERNAME MUST BE ATLEAST 4 CHARATER AND ABOVE ");
                                            while (true) {



                                                System.out.print("     Enter New Username: ");
                                                new_username = input.nextLine();

                                                if ((new_username.length() == 1) || (new_username.length() == 2) || (new_username.length() == 3)) {
                                                    System.out.println("     The Username Is Too Short");
                                                } else {
                                                       if (new_username.equals(admin_username1)) {
                                                       System.out.println("     You Already Use That Username, Please Try again.");
                                                       } else {
                                                           int aaa = 3
                                                                   ;//FOR CHANCES//

                                                           while (aaa > 0){
                                                               System.out.print("     Verify New Username: ");
                                                               String v_username = input.nextLine();

                                                               if (v_username.equals(new_username)){
                                                                System.out.println("     Your Username Is Changed! ");
                                                                System.out.println("     Session Expired, Logout. ");
                                                                admin_u.setLength(0);
                                                                admin_u.append(new_username);
                                                                admin_username1 = admin_u.toString();//convert to compare//
                                                                janix++;
                                                                back+=5;
                                                                break;

                                                               } else {
                                                                    aaa--;
                                                                    System.out.println("     The New Username Is Not Match, Please Try Again");
                                                                    System.out.println("     Attempt Left: "+aaa);
                                                                    System.out.println(" ");
                                                               } 
                                                           }

                                                               if (aaa == 0){
                                                                    System.out.println("     Sorry You Have Use All Your Attepmts."); 
                                                                    janix++;
                                                                    break;}  

                                                               if (back >= 1){ back--; break;}//USER MENU

                                                       }

                                                       }
                                                }//LOOPS FOR NEW USERNAME
                                    }








                          }else if (dd.equalsIgnoreCase("C")) { //for change password only//


                              String new_password = "";
                              System.out.println("                                                                  -  CHANGE PASSWORD ONLY  -");
                              System.out.println(" ");
                              System.out.println("     Please Enter Your Old Password");

                              int aa = 3; //CHANCES/



                              while (aa > 0) {

                                    System.out.print("     Enter Old Passwrod: ");
                                    String password = input.nextLine();


                                    if (password.equals(admin_pass1)){
                                    break;
                                    } else {

                                    aa--;
                                    System.out.println("     Wrong Password!Please Try Again.");
                                    System.out.println("     Attempt Left: "+aa);
                                    System.out.println(" ");}


                              } 

                                    if (aa == 0){
                                    System.out.println("     Sorry You Have Use All Your Attepmts.");

                                    break;
                                     } else { 

                                    System.out.println(" ");
                                    System.out.println("     Enter Your New Password");
                                    System.out.println("     NOTE! PASSWORD MUST BE ATLEAST 4 CHARATER AND ABOVE ");

                                    while (true) {



                                        System.out.print("     Enter New Password: ");
                                        new_password = input.nextLine();

                                        if ((new_password.length() == 1) || (new_password.length() == 2) || (new_password.length() == 3)) {
                                            System.out.println("     The Password Is Too Short");
                                        } else {
                                               if (new_password.equals(admin_pass1)) {
                                               System.out.println("     You Already Use That Password, Please Try again.");
                                               } else {
                                                   int aaa = 3
                                                           ;//FOR CHANCES//

                                                   while (aaa > 0){
                                                       System.out.print("     Verify New Password: ");
                                                       String v_password = input.nextLine();

                                                       if (v_password.equals(new_password)){
                                                        System.out.println("     Your Password Is Changed! ");
                                                        System.out.println("     Session Expired, Logout. ");
                                                        admin_p.setLength(0);
                                                        admin_p.append(new_password);
                                                        admin_pass1 = admin_p.toString();//convert to compare//
                                                        janix++;
                                                        back+=5;
                                                        break;

                                                       } else {
                                                            aaa--;
                                                            System.out.println("     The Password Is Not Match, Please Try Again");
                                                            System.out.println("     Attempt Left: "+aaa);
                                                            System.out.println(" ");
                                                       } 
                                                   }

                                                       if (aaa == 0){
                                                            janix++;
                                                            System.out.println("     Sorry You Have Use All Your Attepmts.");  
                                                            break;}  

                                                       if (back >= 1){ back--; break;}



                                               }
                                        }
                                    }//LOOPS FOR NEW PASSWORD
                                }




                          } else if (dd.equalsIgnoreCase("D")) {back++; break;



                          } else { System.out.println("     Not In The Choices, Please Try Agin!"); janix = janix - janix;
                                  }  


                            if (back >= 1){ back--; break;}
                            }//mainloops for mmenu3


                        
                        
                    }  else if (mmenu.equals("4")) {//history//
                        
                        
                        System.out.println("     ");
                        System.out.println("                                                                      -   ARCHIVE   -");
                        System.out.println("     ");
                        
                        while (true) {
                        
                        if (history == 1) { 
                            System.out.println("     ");
                            System.out.println("     No Archive...");
                            System.out.println("     ");
                        
                        } else {
                            
                           if (history >= 2 ) {
                           System.out.println("     ");
                           System.out.println("     "+hdelete[0]);
                           System.out.println("     "+hroom[0]);
                           System.out.println("     "+hname[0]);
                           System.out.println("     "+haddress[0]);
                           System.out.println("     "+hcontact[0]);
                           System.out.println("     "+hbalance[0]);
                           System.out.println("     "+hdate_r[0]);
                           System.out.println("     "); }
                           
                           if (history >= 3) {
                           System.out.println("     ");
                           System.out.println("     "+hdelete[1]);
                           System.out.println("     "+hroom[1]);
                           System.out.println("     "+hname[1]);
                           System.out.println("     "+haddress[1]);
                           System.out.println("     "+hcontact[1]);
                           System.out.println("     "+hbalance[1]);
                           System.out.println("     "+hdate_r[1]);
                           System.out.println("     ");}
                           
                           if (history >= 4) {
                           System.out.println("     ");
                           System.out.println("     "+hdelete[2]);
                           System.out.println("     "+hroom[2]);
                           System.out.println("     "+hname[2]);
                           System.out.println("     "+haddress[2]);
                           System.out.println("     "+hcontact[2]);
                           System.out.println("     "+hbalance[2]);
                           System.out.println("     "+hdate_r[2]);
                           System.out.println("     "); }
                           
                           if (history >= 5) {
                           System.out.println("     ");
                           System.out.println("     "+hdelete[3]);
                           System.out.println("     "+hroom[3]);
                           System.out.println("     "+hname[3]);
                           System.out.println("     "+haddress[3]);
                           System.out.println("     "+hcontact[3]);
                           System.out.println("     "+hbalance[3]);
                           System.out.println("     "+hdate_r[3]);
                           System.out.println("     "); }
                           
                           if (history >= 6) {
                           System.out.println("     ");
                           System.out.println("     "+hdelete[4]);
                           System.out.println("     "+hroom[4]);
                           System.out.println("     "+hname[4]);
                           System.out.println("     "+haddress[4]);
                           System.out.println("     "+hcontact[4]);
                           System.out.println("     "+hbalance[4]);
                           System.out.println("     "+hdate_r[4]);
                           System.out.println("     "); }
                           
                        }
                        
                        System.out.println("     [1] Delete Permanently");
                        System.out.println("     [0] Back ");
                        
                        while (true) {
                        System.out.print("       >>  ");
                        String m = input.nextLine();
                        
                        
                        if (m.equals("1")) { 
                            if (history > 1) {System.out.println("     Successfully Deleted!");
                            
                             history = 1; break; 
                            } else { System.out.println("     No Data To Delete!");
                            }
                        
                        
                         
                        } else if (m.equals("0")) { back+=2; break;}
                        else { System.out.println("     Not In The Choices, Please Try Again");}
                        }
                        if (back > 0){back--;  break;}
                        }
                        
                    } else if (mmenu.equals("5")) {
                        back+=2;
                        break;
                        
                    } else { System.out.println("     Not In The Choices, Please Try Again!"); }
                    
                    
                   

                    
                    if (back > 0){back--;  break;}
                    }//WHILE 3
                    
                    
                    
                    
                    
                    if (back > 0){back--;  break;}
                    }//WHILE 2
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
                    
                    
                    
                } else if (user.equals("2")) {
                    back++;
                    break;
                    
                } else if (user.equals("90")) {
                    
                    int score = 0;
                    System.out.println("                                                                   -   FORGOT PASSWORD   -");
                    System.out.println(" ");
                    System.out.print("     Enter The Programmer Full Name Of This System: ");
                    String m = input.nextLine();
                        
                        if (m.equals(fullname)) {
                            score++;
                        }
                        
                    System.out.print("     Enter The Age Of The Programmer Of This System: ");
                    String mm = input.nextLine();
                    
                        if (mm.equals(owner_age)) {
                            score++;
                        }
                    
                        
                    if (score == 2) {
                        System.out.println("     Congrats Here's Your Account..");
                        System.out.println("     Username: "+admin_u);
                        System.out.println("     Password: "+admin_p);
                        System.out.print("     Press Enter To Exit: ");
                        String mmm = input.nextLine();
                        break;
                        
                    } else { System.out.println("     Better Luck Next Time!");
                            break;
                    }    
                    
                    
                    
                } else {System.out.println("     Not In The Choices, Please Try Again!");}
            
            
            
            
            
            
            
            
            
            if (back > 0){back--;  break;}
            }//WHILE TRUE 1//
            
            
                       
            
        if (back > 0){back--;  break;}
        }//MAIN LOOPS//
        
        //SYSTEM POWER OFF//
        System.out.println(" ");
        System.out.println("     Thank You For Using Our System, Have A Good Day!");

        
    }//RESET
    

    public static void main(String[] args) {
       reset();
    }
}
