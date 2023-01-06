package kr.co.bs.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bs.dao.BookDAO;
import kr.co.bs.vo.BookVO;

@Service
public class BookService {
	@Autowired
	private BookDAO dao;
	
	public void insertBook(BookVO vo) {
		dao.insertBook(vo);
	}
	
	public BookVO selectBook(String bno) {
		return dao.selectBook(bno);
	}
	
	public List<BookVO> selectBooks() {
		return dao.selectBooks();
	}
	
	public void updateBook(BookVO vo) {
		dao.updateBook(vo);
	}
	
	public void deleteBook(String bno) {
		dao.deleteBook(bno);
	}
	
}


