package jenkinscertif.team.mej.com;

import java.util.List;

/**
 * @author ohbali
 * @since 08/02/2018
 * @version 1.0
 * 
 * Class for jenkins project test 
 *
 */
public class Mejteam {
	
	
	/**
	 * @param tasks
	 * @return true if number of tasks greater than 2, false if less than 2
	 */
	public Boolean isTeamoccuppied(List<Task> tasks){
		
		Boolean result = false;
		
		result  = tasks.size()>2 ? true : false;
		
		return result;
	}
		
}
