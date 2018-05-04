package kosta.ridonbox.model.service;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminService {
		
		
		/**
		 * �̺�Ʈ ���
		 * @param evetDAO 
		 * @return boolean������ Ȯ
		 */
		public int evetInsert(EventDTO evetDTO) throws SQLException;
		
		//�̺�Ʈ ���� �����ϱ���ȯ �̺�Ʈ �Խù��� �۹�ȣpk�� �Ѱ��ش�
		public int evetUpdate(EventDTO evetNo) throws SQLException;

		//�̺�Ʈ ���� �����ϱ� ���� �̺�Ʈ �Խù� ��ȣpk�� �Ѱ��ش�.
		public int evetDelete(int evetNo) throws SQLException;

		//��ȭ ���
		public int movieInsert(MovieDTO movieDTO) throws SQLException;

		//��ȭ ���� ��ȭ�� pk�� �Ѱܹ޾Ƽ� �����Ѵ�.
		public int movieDelete(int movieNo) throws SQLException;

		//�󿵰� ��� ��Ͽ��� üũ (��ȭ�� ���, �ð����, �ο��� ���)
		public int branchInsert(BranchDTO branchDTO) throws SQLException;

		//�󿵰� ���� ����pk�Ѱ� ���� �� ����daoŸ���� �Ѱܼ� ����غ���? 
		public BranchDTO branchUpdate(int branchNo) throws SQLException;

		//�󿵰� ���� ���� pk�Ѱ� ����..Ȯ�ο��� boolean���� üũ 
		public int branchDelete(int branchNo) throws SQLException;
}
