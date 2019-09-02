package global.sesoc.test5.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.test5.dto.Guestbook;

@Repository
public class GuestbookRepository {

	
	@Autowired
	SqlSession session;
	
	public int insert(Guestbook gb){
		GuestbookDAO gbd = session.getMapper(GuestbookDAO.class);
		return gbd.insert(gb);
		
	}
	
	public int getCount(){
		GuestbookDAO gbd = session.getMapper(GuestbookDAO.class);
		return gbd.getCount();
	}
	
	public int delete(int seqno){
		GuestbookDAO gbd = session.getMapper(GuestbookDAO.class);
		return gbd.delete(seqno);
	}
	
	public ArrayList<Guestbook> selectAll(){
		GuestbookDAO gbd = session.getMapper(GuestbookDAO.class);
		return gbd.selectAll();
	}
	
	
}
