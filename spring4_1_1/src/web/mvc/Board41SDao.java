package web.mvc;

import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

public class Board41SDao {
	Logger logger = Logger.getLogger(Board41SDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public int boardSInsert(Map<String, Object> pmap) throws DataAccessException{
		logger.info("boardSInsert 호출 성공");
		int result=0;
		pmap.put("bs_seq", 1);
		pmap.put("bs_size", 50);
		sqlSessionTemplate.insert("boardSInsert",pmap);
		return result;
	}
	public void boardSDelete(Map<String, Object> pmap) {
		// TODO Auto-generated method stub
		
	}
}
