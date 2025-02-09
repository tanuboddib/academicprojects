package taskcli;

public class Task {
	private int id;
	private String status;
	private String taskDes;
	
	public Task() {
		id = 0;
		status = null;
		taskDes = null;
	}
	
	public Task(int id, String status, String task) {
		this.id = id;
		this.status = status;
		this.taskDes = task;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTaskDes() {
		return taskDes;
	}
	
	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
	
	public String toJSONEntry() {
		return "ID:" + id + ",Status:" + status + ",TaskDes:" + taskDes;
	}

}
