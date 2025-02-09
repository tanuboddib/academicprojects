package utils;

import taskcli.Task;

public class TaskUtilities extends TaskManager {
	
	public void addTask(String task) {
		Task ntk = new Task();
		size++;
		ntk.setId(size);
		ntk.setStatus("todo");
		ntk.setTaskDes(task);
		tasks[size] = ntk;
	}
	
	public void updateTask(int id, String task) {
		if(tasks[id] != null) {
			tasks[id].setTaskDes(task);
		}
		else {
			System.out.println("Task doesn't exist!");
		}
	}
	
	public void deleteTask(int id) {
		if(tasks[id] != null) {
			Task del = tasks[id];
			System.out.println("Deleting task: " + del.getTaskDes());
			for(int i = del.getId();i<size-1;i++) {
				tasks[i] = tasks[i+1];
				tasks[i].setId(i);
			}
			tasks[size] = null;
		}
		else {
			System.out.println("Task doesn't exist!");
		}
	}
	
	public void markTask(int id, String status) {
		if(tasks[id] != null) {
			tasks[id].setStatus(status);
		}
		else {
			System.out.println("Task doesn't exist!");
		}
	}

	public void display() {
		for(Task task: tasks) {
			if(task != null) {
				System.out.println("ID: " + task.getId() + "\n" + "Task Description: " + task.getTaskDes() + "\n");
			}
		}
	}
	
	public void display(String status) {
		for(Task task: tasks) {
			if(task != null && task.getStatus().equals(status)) {
				System.out.println("ID: " + task.getId() + "\n" + "Task Description: " + task.getTaskDes() + "\n");
			}
		}
	}
}
