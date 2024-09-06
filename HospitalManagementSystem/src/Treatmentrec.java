import java.util.*;
import java.io.*;

class Treatmentrec{
    String treatment;
    String diagnoseddisease;
    String prescription;
    String dischargedate;
    String result;
    String tid;
    String joining;

    void createandupdate()throws IOException{
        int y,i;
        Scanner in=new Scanner(System.in);
        File file=new File("treatment.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fout3=new BufferedWriter(new FileWriter("tretment.txt",true));
        System.out.println("enter how many records");
        y=in.nextInt();
        for(i=0;i<y;i++)
        {
            System.out.println("enter dateof joining");
            joining=br.readLine();
            System.out.print("Enter Treament:");
            treatment=br.readLine();
            System.out.print("Enter Disease Diagnosed with:");
            diagnoseddisease=br.readLine();
            System.out.print("Enter Medicines Prescribed:");
            prescription=br.readLine();
            System.out.print("Enter Date of Discharge:");
            dischargedate=br.readLine();
            System.out.print("Enter RESULT:");
            result=br.readLine();
            System.out.print("Enter Treatment I.D. Number:");
            tid =br.readLine();

            //Write to file.
            fout3.write(tid);
            fout3.newLine();
            fout3.write(joining);
            fout3.newLine();
            fout3.write(treatment);
            fout3.newLine();
            fout3.write(diagnoseddisease);
            fout3.newLine();
            fout3.write(prescription);
            fout3.newLine();
            fout3.write(dischargedate);
            fout3.newLine();
            fout3.write(result);
            fout3.newLine();
        }
        fout3.close();
        System.out.println("File is created successfully");
    }
}

