package dto;

import java.sql.Statement;

import com.monkeyjump.model.ScoreDB;

public class ScoreBoard {

	private int player_score;
	private String player_name;
	public int getPlayer_score() {
		return player_score;
	}
	public void setPlayer_score(int player_score) {
		this.player_score = player_score;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name ) {
		this.player_name = player_name;
	}
	
}
