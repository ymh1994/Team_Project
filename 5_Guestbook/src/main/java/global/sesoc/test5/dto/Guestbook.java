package global.sesoc.test5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guestbook {

	private String seqno;
	private String name;
	private String password;
	private String content;
	private String regdate;
	@Override
	public String toString() {
		return "일련번호 = " + seqno + ", 이름 = " + name + ", 비밀번호 = " + password + ", 내용 = " + content
				+ ", 등록일 = " + regdate + "";
	}
	
}
