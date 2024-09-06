import java.util.*;
import java.io.*;

class SearchPatient{
	String pname;
	String pgender;
	String pbloodgroup;
	String pdisease;
	int page;
	int pid;
	long pphonenumber;

	void display(){
		System.out.println("*******Record found********");
		System.out.println("Name:"+pname);
		System.out.println("Gender:"+pgender);
		System.out.println("Phone Number"+pphonenumber);
		System.out.println("Age:"+page);
		System.out.println("bloodgroup:"+pbloodgroup);
		System.out.println("Disease:"+pdisease);
		System.out.println("ID no:"+pid);
	}

	void searchpat()throws IOException{
		int count=0,i=0,ch;
		int a[]=new int[100];
		int spid=0;
		String spname="";
		String name[]=new String[100];

		Scanner in=new Scanner(System.in);
		System.out.println("1.Patient id \n 2.Patient name");
		System.out.println("enter your choice");
		ch=in.nextInt();
		if (ch==1) {
			System.out.println("enter patient id to search");
			spid=in.nextInt();
		}
		else if(ch==2){
			System.out.println("enter patient name to search");
			spname =in.next();
		}
		try{
			File file=new File("Patient.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNext()){
				pname=sc.next();
				name[i]=pname;
				pphonenumber=sc.nextLong();
				page=sc.nextInt();
				pgender=sc.next();
				pbloodgroup=sc.next();
				pdisease=sc.next();
				pid=sc.nextInt();
				a[i]=pid;
				if(ch==1){
					if(a[i]==spid){
						count+=1;
						if(count==1)
						{
							display();
						}
					}
				}
				else if(ch==2){
					if(name[i].equals(spname)){
						count+=1;
						if(count==1)
						{
							display();
						}
					}
				}

				else {
					count+=0;
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Message"+e);
		}
		if(count==0){
			System.out.println("record notfound");
		}
	}
}
    