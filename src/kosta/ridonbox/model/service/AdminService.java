package kosta.ridonbox.model.service;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminService {
		
		
		/**
		 * 이벤트 등록
		 * @param evetDAO 
		 * @return boolean형으로 확
		 */
		public int evetInsert(EventDTO evetDTO) throws SQLException;
		
		//이벤트 수정 수정하기위환 이벤트 게시물에 글번호pk를 넘겨준다
		public int evetUpdate(EventDTO evetNo) throws SQLException;

		//이벤트 삭제 삭제하기 위한 이벤트 게시물 번호pk를 넘겨준다.
		public int evetDelete(int evetNo) throws SQLException;

		//영화 등록
		public int movieInsert(MovieDTO movieDTO) throws SQLException;

		//영화 삭제 영화의 pk를 넘겨받아서 삭제한다.
		public int movieDelete(int movieNo) throws SQLException;

		//상영관 등록 등록여부 체크 (영화를 등록, 시간등록, 인원수 등록)
		public int branchInsert(BranchDTO branchDTO) throws SQLException;

		//상영관 수정 지점pk넘겨 수정 후 지점dao타입을 넘겨서 출력해본다? 
		public BranchDTO branchUpdate(int branchNo) throws SQLException;

		//상영관 삭제 지점 pk넘겨 삭제..확인여부 boolean으로 체크 
		public int branchDelete(int branchNo) throws SQLException;
}
