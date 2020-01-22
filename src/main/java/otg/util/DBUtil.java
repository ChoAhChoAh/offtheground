package otg.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DBUtil {

	public DBUtil() {
		
	}
	
	public static void setBasicParameter(PreparedStatement pstmt,Object ...args) throws SQLException{
		try {
			for(int i=0;i<args.length;i++) {
				if(args[i] instanceof Integer) {
					pstmt.setInt(i+1, (Integer)args[i]);
				}else if(args[i] instanceof Long) {
					pstmt.setLong(i+1, (Long)args[i]);
				}else if(args[i] instanceof Double){
					pstmt.setDouble(i+1, (Double)args[i]);
				}else if(args[i] instanceof Float) {
					pstmt.setDouble(i+1, (Float)args[i]);
				}else if(args[i] instanceof String){
					pstmt.setString(i+1, (String)args[i]);
				}else if(args[i] instanceof Date) {
					pstmt.setDate(i+1, new java.sql.Date(((Date)args[i]).getTime()));
				}
			}
		} catch (SQLException e) {
			throw e;
		}
	}
	
	public static void closeResultSet_PreparedStatement_Connection(ResultSet rs,PreparedStatement pstmt,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(Exception e) {
				
			}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			}catch(Exception e) {
				
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				
			}
		}
	}

}
