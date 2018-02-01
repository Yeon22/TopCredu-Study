package SQL_Oracle;

public class ����_20180122 {
	
	/*
	 * --�⺻Ű�� ����Ű
		create table test_table
		(
		    id number(10) primary key, --�ߺ��Ұ�, �ݵ�� �Է�
		    test_name varchar2(20),
		    email varchar2(10),
		    str varchar2(20)
		);
		
		create table test2_table
		(
		    test2_id number not null,
		    test2_str varchar(20),
		    test2_fk number(10), --�ܷ�Ű
		    foreign key (test2_fk)
		    REFERENCES test_table(id)
		);
		
		desc test2_table;
		
		--���̺� �ΰ��� ������ 
		--�⺻Ű�δ� id, �׸��� ����Ű�δ� test2_fk��� Į���� �����߰�,
		--����Ű�� �����ϴ� ���� references�� ��õ� test_table�� id���� �����մϴ�.
		
		
		--commit ��������
		--rollback �������� ������.
		
		commit; --������ �����۾��� Ȯ��
		insert, update, delete ��
		
		rollback --�����۾� ���
		
		auto commit �ڵ����� Ŀ��(������ Ŀ���� �Ǳ� ������ rollback �ϱⰡ ��ٷο� �� �ִ�.)
		
		
		ddl -> create, alter, drop
		dml -> select, insert, update, delete
		tcl -> commit, rollback
		
		tcl -> Transition Control Language
		
		
		foreign key : �ܷ�Ű
		primary key : ���̺�� 1��, �⺻Ű unique + not null �� ������ �����̶� ���� �ȴ�.
		unique : �ߺ����� �ʰ�
		
		
		procedure�� ����
		1. ó�� ����� ������ �� �����ȹ�� �����ؼ� ����.
		    �ι�° ������� ���������� �ʰ� �ٷ� �����.
		    => ���� �ӵ��� ������.
		    
		2. �� ������ ������ ������ ����ǰ�, ����� �̸��� ȣ���ϸ� ��.
		    => ��Ʈ��ũ Ʈ���� ����
		    
		3. �ֿ� ������ ���ν����� �����ϸ� ���ȿ��� ����
		    => ���ȼ� ���� ����.
		
		
		
		desc student;
		
		create table bookrent
		(
		    id varchar(10) not null,
		    title varchar(20) not null,
		    rdate char(8) not null
		);
		
		insert into bookrent values ('2015000002', 'java����', '20161227');
		insert into bookrent values ('1234512346', '����Ŭ����', '20161201');
		insert into bookrent values ('1234$12345', 'c++����', '20161202');]
		insert into bookrent values ('2018000001', 'C#����', '20151208');
		insert into bookrent values ('2018000002', 'python����', '20161128');
		insert into bookrent values ('2018000004', 'ruby����', '20151231');
		
		select * from student;
		
		select * from bookrent;
		
		--�л���, å����, ������ (join)
		select student.name, bookrent.title, bookrent.rdate
		from student join bookrent
		on student.id = bookrent.id
		where student.department_id = 'A002'
		order by student.name;
		
		--A002 (��ǻ�ͽý���)
		--R0013 (��Ƽ�̵��)
		--R0012 (��ǻ�Ͱ���)
		
		commit;
		
		select student.name, bookrent.title, bookrent.rdate
		from student join bookrent
		on student.id = bookrent.id;
		
	 */

}
