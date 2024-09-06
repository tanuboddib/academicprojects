import java.util.*;
import java.io.*;

class MainMod{
    int ch;

    static{
        System.out.println("*********************Welcome********************");
        System.out.println("=======================to=======================");
        System.out.println("*==**==**==HOSPITAL MANAGEMENT SYSTEM==**==**==*");
        System.out.println("================================================");
        System.out.println("************************************************");
    }

    private String UN="Admin";
    private String PD="13779MB";

    int mainmodule(){
        Scanner in=new Scanner(System.in);
        System.out.println("1. Doctors information management ");
        System.out.println("2. Patients information management");
        System.out.println("3. Treatment information management");
        System.out.println("4. Exit");
        System.out.println("enter your choice");
        ch=in.nextInt();
        return ch;
    }

    int submainmodule(){
        int k;
        Scanner sn=new Scanner(System.in);
        System.out.println("1.Create and Update the record\n2.Search for a record\n3.Display record\n4.go to main module");
        System.out.println("Enter your choice");
        k=sn.nextInt();
        return k;
    }

    int security(){
        String UserName,pwd;
        int j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter user name");
        UserName=in.nextLine();
        System.out.println("Enter password");
        pwd=in.nextLine();
        j=check(UserName,pwd);
        return j;
    }

    int check(String Unme,String Pwd){
        int l,m;
        Scanner in=new Scanner(System.in);
        if(Unme.equals(UN))
        {
            if(Pwd.equals(PD))
            {
                l=mainmodule();
                return l;
            }

            else{
                System.out.println("please check ur pwd and enter correct password");
                Pwd=in.nextLine();
                m=check(Unme,Pwd);
                return m;
            }
        }
        else{
            System.out.println("please check ur username and enter correctuser name");
            System.out.println("");
            Unme=in.nextLine();
            m=check(Unme,Pwd);
            return m;
        }
    }

    void processmod(int op)throws IOException{
        int a,c,x,y,k,con;
        String b;
        Scanner in=new Scanner(System.in);
        switch(op)
        {
            case 1:
                System.out.println("**********************************************");
                System.out.println("==============================================");
                System.out.println("*=*=*Welcome to Doctors Management System*=*=*");
                System.out.println("==============================================");
                System.out.println("**********************************************");

                Doctorrec  dc=new Doctorrec();
                Search se=new Search();
                Display da=new Display();
                a=submainmodule();
                if(a==1){
                    dc.create();
                }
                else if(a==2){
                    se.searchdoc();
                }
                else if(a==3){
                    String n="doctor.txt";
                    da.displayall(n);
                }

                else if(a==4){
                    System.out.println("Are u sure to go to main module enter yes");
                    b=in.next();
                    if(b.equals("yes")){
                        con=mainmodule();
                        processmod(con);
                    }
                }
                break;
            case 2:
                System.out.println("**************************************************");
                System.out.println("==================================================");
                System.out.println("*=*=*=*Welcome to Patient Management System*=*=*=*");
                System.out.println("==================================================");
                System.out.println("**************************************************");

                x=submainmodule();
                Patientrec pc=new Patientrec();
                SearchPatient sp=new SearchPatient();
                Display dal=new Display();
                if(x==1){
                    pc.createandupdate();
                }
                else if(x==2){
                    sp.searchpat();
                }
                else if(x==3){
                    String m="Patient.txt";
                    dal.displayall(m);
                }
                else if(x==4){
                    System.out.println("Are u sure to go to main module enter yes");
                    b=in.next();
                    if(b.equals("yes")){
                        con=mainmodule();
                        processmod(con);
                    }
                }
                break;
            case 3:
                System.out.println("**************************************************");
                System.out.println("==================================================");
                System.out.println("*=*=*=*Welcome to Patient Management System*=*=*=*");
                System.out.println("==================================================");
                System.out.println("**************************************************");

                y=submainmodule();
                Treatmentrec tr=new Treatmentrec();
                SearchTre st=new SearchTre();
                Display dp=new Display();
                if(y==1){
                    tr.createandupdate();
                }
                else if(y==2){
                    st.searchtre();
                }
                else if(y==3){
                    String p="treatment.txt";
                    dp.displayall(p);
                }
                else if(y==4){
                    System.out.println("Are u sure to go to main module enter yes");
                    b=in.next();
                    if(b.equals("yes")){
                        con=mainmodule();
                        processmod(con);
                    }
                }
                break;
            case 4:
                System.exit(0);
                break;
            default :
                System.out.println("enter correct choice" );
                con=in.nextInt();
                processmod(con);
        }
    }

    public static void main(String args[])throws IOException{
        int op;
        MainMod obj=new MainMod();
        op=obj.security();
        obj.processmod(op);
    }
}