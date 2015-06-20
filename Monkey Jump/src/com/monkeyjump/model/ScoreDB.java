package com.monkeyjump.model;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Score;
import dto.ScoreBoard;

public class ScoreDB {
public String InsertScore(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
//Previous Post
}

public ArrayList GetScores(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
ArrayList scores = null;
try {
// Here you can validate before connecting DAO class, eg. User session condition 
Score score= new Score();
scores=score.GetScoress(connection, request, response);
} 
catch (Exception e) {
throw e;
}
return scores;
}

}