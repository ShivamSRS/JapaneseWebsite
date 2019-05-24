/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japensemultilingualapi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Fetch {
private Connection connection;
	private Statement statement;

	public Fetch() { }

	public List<Coverter> getEnglishWord() throws SQLException {
		String query = "SELECT * FROM testing1234";
		List<Coverter> list = new ArrayList<>();
		Coverter coverter = null;
		ResultSet rs = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				coverter = new Coverter();
				/*Retrieve one employee details 
				and store it in employee object*/
				coverter.setId(rs.getInt("id"));
				coverter.setEnglishWord(rs.getString("Address"));
				

				//add each employee to the list
				list.add(coverter);
			}
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		return list;
	}
}