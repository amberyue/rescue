package bean;

public class Contact {
	
		private String UserID ;
		private String cName;
		private String TelNo;
		private String RelationShip;
		
		public String getUserID() {
			return UserID;
		}
		public void setUserID(String userID) {
			UserID = userID;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public String getTelNo() {
			return TelNo;
		}
		public void setTelNo(String telNo) {
			TelNo = telNo;
		}
		public String getRelationShip() {
			return RelationShip;
		}
		public void setRelationShip(String relationShip) {
			RelationShip = relationShip;
		}
}
