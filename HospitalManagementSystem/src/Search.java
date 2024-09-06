import java.util.*;
import java.io.*;

class Search{
	String dname;
	String dgender;
	String dspecial;
	int dage;
	int did;
	int dsal;
	int dphonenumber;

	void display(){
		System.out.println("Record found");
		System.out.println("Name:"+dname);
		System.out.println("Gender:"+dgender);
		System.out.println("Phone Number"+dphonenumber);
		System.out.println("Age:"+dage);
		System.out.println("Specialization:"+dspecial);
        System.out.println("salary:"+dsal);
		System.out.println("ID no:"+did);
	 }

     void searchdoc(){
    	int count=0,i=0,ch;
    	int a[]=new int[100];  
        int sdid=0;
    	String sdname="";
    	String name[]=new String[100];
    	Scanner in=new Scanner(System.in);
    	System.out.println("1.Doctor id \n 2.Doctor name");
    	System.out.println("enter your choice");
    	ch=in.nextInt();
    	if (ch==1) {
    	System.out.println("enter doctors id to search");
        sdid=in.nextInt();
        }
        else if(ch==2){
        System.out.println("enter doctor name to search");
        sdname=in.next();
        }

        try{
    	    File file=new File("Doctor.txt");
    	    Scanner sc=new Scanner(file);
    	    while(sc.hasNext()){
                dname=sc.next();
                name[i]=dname;
                dphonenumber=sc.nextInt();
                dage=sc.nextInt();
                dgender=sc.next();
                dspecial=sc.next();
                dsal=sc.nextInt();
                did=sc.nextInt();
                a[i]=did;
                if(ch==1){
                    if(a[i]==sdid){
            	        count+=1;
            	        if(count==1)
            	        {
            	            display();
            	        }
                    }

                    else {
            	        count+=0;
                    }
                }
                else if(ch==2){
                    if(name[i].equals(sdname)){
                        count+=1;
                        if(count==1){
                             display();
                        }
                    }
                    else{
                        count+=0;
                    }
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

    public static void main(String[] args){
	    Search s=new Search();
	    s.searchdoc();
	}
}