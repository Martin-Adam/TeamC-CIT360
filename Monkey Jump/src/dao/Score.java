package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ScoreBoard;
public class Score 
{
public String Insertscore(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
	return null;
// Previous Post
}

public ArrayList GetScores(Connection connection,HttpServletRequest request,HttpServletResponse response) throws Exception
{
ArrayList scoreData = new ArrayList();
try
{
PreparedStatement ps = connection.prepareStatement("SELECT player_score,player_name FROM players ORDER BY player_score DESC");
ResultSet rs = ps.executeQuery();
while(rs.next())
{
ScoreBoard scoreObject = new ScoreBoard();
scoreObject.setPlayer_score(rs.getInt("player_score"));
scoreObject.setPlayer_name(rs.getString("player_name"));
scoreData.add(scoreObject);
}
return scoreData;
}
catch(Exception e)
{
throw e;
}
}

public ArrayList GetScoress(Connection connection,
		HttpServletRequest request,
		HttpServletResponse response) {
	// TODO Auto-generated method stub
	return null;
}

}