package jenkinscertif.team.mej.com;

/**
 * @author ohbali
 * @since 08/02/2016
 * @version 1.0
 *
 *          Model Class
 */

public class Task {

	private int idTask;
	private String descriptionTask;
	private String commentTask;

	/**
	 * Constructor
	 */
	public Task() {
		super();
	}

	/**
	 * Constructor with arguments
	 * 
	 * @param idTask
	 * @param descriptionTask
	 * @param commentTask
	 */
	public Task(int idTask, String descriptionTask, String commentTask) {
		super();
		this.idTask = idTask;
		this.descriptionTask = descriptionTask;
		this.commentTask = commentTask;
	}

	/**
	 * @return id of the task
	 */
	public int getIdTask() {
		return idTask;
	}

	/**
	 * @param idTask
	 */
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	/**
	 * @return description of the task
	 */
	public String getDescriptionTask() {
		return descriptionTask;
	}

	/**
	 * @param descriptionTask
	 */
	public void setDescriptionTask(String descriptionTask) {
		this.descriptionTask = descriptionTask;
	}

	/**
	 * @return commentTask
	 */
	public String getCommentTask() {
		return commentTask;
	}

	/**
	 * @param commentTask
	 */
	public void setCommentTask(String commentTask) {
		this.commentTask = commentTask;
	}

}
