import java.io.*;

class Patientrec {
    String pname;
    String pgender;
    String pbloodgroup;
    String pdisease;
    int page;
    int pid;
    int pphonenumber;

    void createandupdate()throws IOException{
        int y,l;
        // Creation of Patient file
        File file= new File("Patient.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fout1 = new BufferedWriter(new FileWriter("Patient.txt",true));
        System.out.println("How many Patients?\t");
        y= Integer.parseInt(br.readLine());

        for(l=0;l<y;l++)
        {
            System.out.println("Enter Patient Name:");
            pname=br.readLine();
            System.out.println("Enter Phone Number:");
            pphonenumber= Integer.parseInt(br.readLine());
            System.out.println("Enter Age:");
            page =Integer.parseInt(br.readLine());
            System.out.println("Enter Gender:");
            pgender=br.readLine();
            System.out.println("Enter Patient blood group:");
            pbloodgroup=br.readLine();
            System.out.println("enter patients disease");
            pdisease=br.readLine();
            System.out.println("Enter I.D. Number:");
            pid=Integer.parseInt(br.readLine());

            // Written to Patient file
            fout1.write(pname);
            fout1.newLine();
            fout1.write(pphonenumber);
            fout1.newLine();
            fout1.write(page);
            fout1.newLine();
            fout1.write(pgender);
            fout1.newLine();
            fout1.write(pbloodgroup);
            fout1.newLine();
            fout1.write(pdisease);
            fout1.newLine();
            fout1.write(pid);
            fout1.newLine();
        }
        fout1.close();
        System.out.println("File is generated successfully");
    }
}
