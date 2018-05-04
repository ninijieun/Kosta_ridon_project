package kosta.ridonbox.model.dto;

public class MemberDTO {
	private String memberId;	//회원아이디 
	private String memberPwd;   //회원비밀번호 
	private String email;		// 이메일 
	private String phone;		//핸드폰번호 
	private String joinDate; 	//가입일자
	
	public MemberDTO(String memberId, String memberPwd, String email, String phone, String joinDate) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.email = email;
		this.phone = phone;
		this.joinDate = joinDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}
