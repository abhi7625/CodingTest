package testCases;

import java.util.List;

import org.junit.Test;

import io.restassured.path.json.JsonPath;
import resources.response;

import static org.junit.Assert.*;

public class TestCases {
	JsonPath json=new JsonPath(response.responseData());

	

	/*Test case to verify A team consist only 4 Foreign Players*/
	@Test
	public void testForForeignPlayers()
	{
		int foreignPlayerCount=0;
		List<String> allPlayersCountry=json.getList("player.country");
		for(int i=0;i<allPlayersCountry.size();i++)
		{
			if(!(allPlayersCountry.get(i).equals("India")))
			{
				foreignPlayerCount++;
			}
		}
		assertEquals("Expected foreign players in a team are 4 but are :"+foreignPlayerCount,4,foreignPlayerCount);
	}
	
	/*Test case to verify A team consist atleast 1 WicketKeeper*/
	@Test
	public void testForWicketKeeper()
	{
		int wicketKeeperCount=0;
		List<String> allPlayersCountry=json.getList("player.role");
		for(int i=0;i<allPlayersCountry.size();i++)
		{
			if(allPlayersCountry.get(i).equals("Wicket-keeper"))
			{
				wicketKeeperCount++;
			}
		}
		assertTrue("Expected WicketKeeper in a team are atleast 1 but presently there are :"+wicketKeeperCount,wicketKeeperCount>=1);
	}
}
