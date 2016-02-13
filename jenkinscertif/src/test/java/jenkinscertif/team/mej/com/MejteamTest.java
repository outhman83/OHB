package jenkinscertif.team.mej.com;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MejteamTest {

	private Mejteam mejteam = new Mejteam();
	
	/**
	 * Test if a TeamMej is occupied
	 * 
	 */
	@Test
	public void testIsTeamoccuppiedTrue() {
		
		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < 4; i++) {
			taskList.add(new Task(i, "Description "+i, "Comment "+i));
		}
		assertEquals("Team is occupied", Boolean.TRUE, mejteam.isTeamoccuppied(taskList));
	}
	
	
	/**
	 *  Test if a TeamMej is not occupied
	 */
	@Test
	public void testIsTeamoccuppiedFalse() {
		
		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < 1; i++) {
			taskList.add(new Task(i, "Description "+i, "Comment "+i));
		}
		assertEquals("Team is Not occupied", Boolean.FALSE, mejteam.isTeamoccuppied(taskList));
	}

}
