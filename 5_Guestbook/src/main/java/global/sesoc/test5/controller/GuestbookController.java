package global.sesoc.test5.controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.test5.dao.GuestbookRepository;
import global.sesoc.test5.dto.Guestbook;

@Controller
public class GuestbookController {

	@Autowired
	GuestbookRepository repo;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		return "index2";
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model,Guestbook gb) {
		int count = repo.getCount();
		model.addAttribute("count",count);
		ArrayList<Guestbook>gbList = new ArrayList<>();
		gbList=repo.selectAll();
		model.addAttribute("gbList",gbList);
		return "guestbook";
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String guestbook(Model model,Guestbook gb){
		
		
		System.out.println(gb);
		int result = repo.insert(gb);
		ArrayList<Guestbook>gbList = new ArrayList<>();
		gbList=repo.selectAll();
		model.addAttribute("gbList",gbList);
	
		if (result == 1) {
			model.addAttribute("result", "글등록 성공");
			int count = repo.getCount();
			model.addAttribute("count", count);

		} else {
			model.addAttribute("result", "글등록 실패");

		}

		return "guestbook";

	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int seqno,Model model) {
		
		repo.delete(seqno);
		ArrayList<Guestbook>gbList = new ArrayList<>();
		gbList=repo.selectAll();
		model.addAttribute("gbList",gbList);
		int count = repo.getCount();
		model.addAttribute("count",count);
		return "guestbook";
	}

	
	
}
