package global.sesoc.test5.dao;

import java.util.ArrayList;

import global.sesoc.test5.dto.Guestbook;

public interface GuestbookDAO {

	public int insert(Guestbook gb);
	
	public int getCount();
	
	public int delete(int seqno);
	
	public ArrayList<Guestbook> selectAll();
	
}
