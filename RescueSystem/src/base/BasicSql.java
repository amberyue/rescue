package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;





import utils.DBUtils;

public class BasicSql {

		public void updateVolunteerSearch(short volunteerStatus,int userId){
			
			Connection conn=null;
			PreparedStatement ps=null;
			
			try {
				conn= DBUtils.getConnection();
				String sql="update users set search=? where UserID=?";
				ps=conn.prepareStatement(sql);
				ps.setShort(1, volunteerStatus);
				ps.setInt(2,userId);
				ps.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				DBUtils.closeALL(null, ps, conn);
			}
		}
}
