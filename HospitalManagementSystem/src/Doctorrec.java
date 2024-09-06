import java.util.Scanner;
import java.io.*;

class Doctorrec {
    String dname;
    String dgender;
    String dspecial;
    int dage;
    int sdid;
    int did;
    int dsal;
    int dphonenumber;

    void create()throws IOException{
        int y,l;
        // Creation of Doctor file
        File file= new File("Doctor.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new FileWriter("Doctor.txt",true));
        System.out.println("How many Doctors?\t");
        y= Integer.parseInt(br.readLine());

        for(l=0;l<y;l++)
        {
            System.out.println("Enter Doctor Name:");
            dname=br.readLine();
            System.out.println("Enter Phone Number:");
            dphonenumber= Integer.parseInt(br.readLine());
            System.out.println("Enter Age:");
            dage =Integer.parseInt(br.readLine());
            System.out.println("Enter Gender:");
            dgender=br.readLine();
            System.out.println("Enter Specialisation:");
            dspecial=br.readLine();
            System.out.println(dname+ "Salary");
            dsal=Integer.parseInt(br.readLine());
            System.out.println("Enter I.D. Number:");
            did=Integer.parseInt(br.readLine());

            // Written to Doctor file
            output.write(dname);
            output.newLine();
            output.write(dphonenumber);
            output.newLine();
            output.write(dage);
            output.newLine();
            output.write(dgender);
            output.newLine();
            output.write(dspecial);
            output.newLine();
            output.write(dsal);
            output.newLine();
            output.write(did);
            output.newLine();
            output.newLine();
        }
        output.close();
        System.out.println("File generated Successfully");
    }
}
