package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Task")
@Entity
@NamedQueries({
	@NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t"),
	@NamedQuery(name = "Task.findById", query = "SELECT t FROM Task t WHERE t.id = :id")
})
public class Task {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String taskBody;
	
	public Task() {
		
	}
	
	public String getTaskBody() {
		return taskBody;
	}

	public void setTaskBody(String taskBody) {
		this.taskBody = taskBody;
	}

	public Task(String taskBody) {
		this.taskBody = taskBody;
	}
	
	
}
