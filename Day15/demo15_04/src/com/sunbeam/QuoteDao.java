package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuoteDao {
	private Connection con;
	private PreparedStatement findAllStmt;
	private PreparedStatement findFavoritesByUserIdStmt;
	
	public QuoteDao() throws Exception {
		con = DbUtil.getConnection();
		String findAllSql = "SELECT * FROM quotes";
		findAllStmt = con.prepareStatement(findAllSql);
		String findFavoritesByUserIdSql = "SELECT q.* FROM quotes q JOIN fav_quotes fq ON fq.quote_id = q.id WHERE fq.user_id = ?";
		findFavoritesByUserIdStmt = con.prepareStatement(findFavoritesByUserIdSql);
	}
	public void close() {
		try {
			findAllStmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Quote> findAll() throws Exception {
		List<Quote> list = new ArrayList<>();
		try(ResultSet rs = findAllStmt.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String quote = rs.getString("quote");
				String author = rs.getString("author");
				int userId = rs.getInt("user_id");
				Timestamp ts = rs.getTimestamp("created_at");
				Date d = null;
				if(ts != null)
					d = new Date( ts.getTime() );
				Quote q = new Quote(id, quote, author, userId, d);
				list.add(q);
			}
		}
		return list;
	}
	
	public List<Quote> findFavoritesByUserId(int userId) throws Exception {
		List<Quote> list = new ArrayList<>();
		findFavoritesByUserIdStmt.setInt(1, userId);
		try(ResultSet rs = findFavoritesByUserIdStmt.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String quote = rs.getString("quote");
				String author = rs.getString("author");
				userId = rs.getInt("user_id");
				Timestamp ts = rs.getTimestamp("created_at");
				Date d = null;
				if(ts != null)
					d = new Date( ts.getTime() );
				Quote q = new Quote(id, quote, author, userId, d);
				list.add(q);
			}
		}
		return list;
	}
}









