package kr.co.bs.dao;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bs.vo.BookVO;

@Repository
public class BookDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertBook(BookVO vo) {
		mybatis.insert("book.insertBook", vo);
	}
	
	public BookVO selectBook(String bno) {
		return mybatis.selectOne("book.selectBook", bno);
	}
	
	public List<BookVO> selectBooks() {
		return mybatis.selectList("book.selectBooks");
	}
	
	public void updateBook(BookVO vo) {
		mybatis.update("book.updateBook", vo);
	}
	
	public void deleteBook(String bno) {
		mybatis.delete("book.deleteBook", bno);
	}
	
}

