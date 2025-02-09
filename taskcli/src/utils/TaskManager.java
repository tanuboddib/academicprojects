package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import taskcli.Task;

import java.io.IOException;

public class TaskManager {
	
	public Task[] tasks = new Task[10000];
	public int size = 0;
	
	public void readJSON() throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader("task_cli.json"));
		String task = null;
		while((task = bf.readLine()) != null) {
			if(task.length() == 1) {
				continue;
			}
			String args[] = task.split(",");
			int id = Integer.parseInt(args[0].split(":")[1]);
			Task t = new Task(id, args[1].split(":")[1], args[2].split(":")[1]);
			tasks[id] = t;
			size = id;
		}
		bf.close();
	}
	
	public void writeJSON() throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("task_cli.json"));
		int i = 1;
		bw.write("{\n");
		while(tasks[i] != null) {
			String line = tasks[i].toJSONEntry();
			bw.write(line+"\n");
			i++;
		}
		bw.write("}\n");
		bw.close();
	}
}
