package bean;


import java.util.Date;
import java.util.Map;

public class loginResult {

	private String retcode;
	private String msg;
	private Map data;
	private String userName;
	private String sex;
	private String email;
	private String address;
	private String nation;
	private Date birthday;
	private Contact contact;
	
	public Date getBirthday() {
		return birthday;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	@Override
	public String toString() {
		return "loginResult [retcode=" + retcode + ", msg=" + msg + ", data="
				+ data + ", userName=" + userName + ", sex=" + sex + ", email="
				+ email + ", address=" + address + ", nation=" + nation
				+ ", birthday=" + birthday + ", sessionid=" + sessionid + "]";
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Map getData() {
		return data;
	}
	public void setData(Map data) {
		this.data = data;
	}
	private String sessionid;
	public String getRetcode() {
		return retcode;
	}
	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	
	
}
