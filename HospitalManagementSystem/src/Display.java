import java.util.*;
import java.io.*;
class Display{
	String name,gnd,spl,bgr,dis,n;
	long num;
	int age,id;

	void displayall(String n){
		try{
			File file=new File(n);
			Scanner mb=new Scanner(file);
			while(mb.hasNext()){
				name=mb.next();
				num=mb.nextLong();
				age=mb.nextInt();
				gnd=mb.next();
				if(n.equals("doctor.txt")){
					spl=mb.next();
				}
				if(n.equals("Patient.txt")){
					bgr=mb.next();
					dis=mb.next();
				}
				id=mb.nextInt();

				System.out.println("Name:"+name);
				System.out.println("PhoneNumber:"+num);
				System.out.println("Age:"+age);
				System.out.println("Gender:"+gnd);
				if(n.equals("doctor.txt")){
					System.out.println("Specialization:"+spl);
				}
				if(n.equals("Patient.txt")){
					System.out.println("Blood Group:"+bgr);
					System.out.println("Disease:"+dis);
				}
				System.out.println("ID Num:"+id);

			}
		}

		catch(Exception e){
			System.out.println(e);
		}
	}
}