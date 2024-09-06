import java.util.*;
import java.io.*;
class SearchTre{
	String treatment,diagnoseddisease,prescription,dischargedate,joiningdate,result;
	int tid;
	
	void display(){
		System.out.println("Record found");
		System.out.println("Name:"+treatment);
		System.out.println("Disease:"+diagnoseddisease);
		System.out.println("Date of Joining"+joiningdate);
		System.out.println("Discharge date:"+dischargedate);
		System.out.println("Result:"+result);
		System.out.println("Treatment ID no:"+tid);
	 }
     void searchtre(){
    	int count=0,i=0,ch;
    	int a[]=new int[100];
    	int stid;
    	Scanner in=new Scanner(System.in);
    	System.out.println("enter treatment id to search");
    	stid=in.nextInt();
        try{
    	File file=new File("treatment.txt");
    	Scanner sc=new Scanner(file);
    	while(sc.hasNext()){
            tid=sc.nextInt();
            a[i]=tid;
            joiningdate=sc.next();
            treatment=sc.next();
            diagnoseddisease=sc.next();
            prescription=sc.next();
            dischargedate=sc.next();
            result=sc.next();
            if(a[i]==stid){
            	count+=1;
            	if(count==1)
            	{
            		display();
            	}
            }
           
         
          
          else {
            	count+=0;
                 }
        
      i++;
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
