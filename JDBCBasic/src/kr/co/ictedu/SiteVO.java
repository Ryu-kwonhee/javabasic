package kr.co.ictedu;

public class SiteVO {
	
	
	private String name;
	private String id;
	private String pw;
	private String nick;
	private String email;
	
	
	public SiteVO() {
		
	}


	public SiteVO(String name, String id, String pw, String nick, String email) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "SiteVO [name=" + name + ", id=" + id + ", pw=" + pw + ", nick=" + nick + ", email=" + email + "]";
	}
	
	
}
