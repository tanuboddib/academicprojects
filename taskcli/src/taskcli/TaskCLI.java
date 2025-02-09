package taskcli;

import utils.TaskUtilities;

public class TaskCLI {

	public static void main(String[] args) throws Exception{
		TaskUtilities tu = new TaskUtilities();
		tu.readJSON();
		int id;
		try {
			String command = args[0].trim();
			switch(command) {
				case "add":
					tu.addTask(args[1].trim());
					break;
				case "update":
					id = Integer.parseInt(args[1].trim());
					String tsk = args[2].trim();
					tu.updateTask(id, tsk);
					break;
				case "delete":
					id = Integer.parseInt(args[1].trim());
					tu.deleteTask(id);
					break;
				case "mark-in-progress":
					id = Integer.parseInt(args[1].trim());
					tu.markTask(id, "in-progress");
					break;
				case "mark-done":
					id = Integer.parseInt(args[1].trim());
					tu.markTask(id, "done");
					break;
				case "list":
					if(args.length == 1) {
						tu.display();
					}
					else {
						tu.display(args[1].trim());
					}
					break;
				default:
					System.out.println("Command not defined!");
			}
			tu.writeJSON();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("Can't handle the arguments. " 
					+ "Please enter the correct arguments");
		}
	}
}
