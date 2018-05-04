package kosta.ridonbox.model.dao;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminDAO {
	/**
	 * 관리자 로그인 반환되는 인트형으로 관리자모드인지 아닌지 구분
	 * @param id 관리자아이디 
	 * @param pw 관리자비밀번호 
	 * @return int형으로 관리자모드인지 아닌지 구분한다.
	 */
	public int loginManager(String id, String pw) throws SQLException;
	
	/**
	 * 이벤트 등록
	 * @param evetDAO 
	 * @return boolean형으로 확
	 */
	public boolean evetInsert(EventDTO evetDTO) throws SQLException;
	
	//이벤트 수정 수정하기위환 이벤트 게시물에 글번호pk를 넘겨준다
	public EventDTO evetUpdate(int evetNo) throws SQLException;

	//이벤트 삭제 삭제하기 위한 이벤트 게시물 번호pk를 넘겨준다.
	public boolean evetDelete(int evetNo) throws SQLException;

	//영화 등록
	public boolean movieInsert(MovieDTO movieDTO) throws SQLException;

	//영화 수정 (개인적으로 수정할 부분이 발생할 것이라 생각되지않음)

	
	//영화 삭제 영화의 pk를 넘겨받아서 삭제한다.
	public boolean movieDelete(int movieNo) throws SQLException;

	//지점 등록 등록여부 체크
	public int branchInsert(BranchDTO branchDTO) throws SQLException;

	//지점 수정 지점pk넘겨 수정 후 지점dao타입을 넘겨서 출력해본다? 
	public BranchDTO branchUpdate(int branchNo) throws SQLException;

	//지점 삭제 지점 pk넘겨 삭제..확인여부 boolean으로 체크 
	public boolean branchDelete(int branchNo) throws SQLException;
}
