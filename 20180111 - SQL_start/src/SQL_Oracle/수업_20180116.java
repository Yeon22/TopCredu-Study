package SQL_Oracle;

public class ����_20180116 {

	/*
	 * --SELF JOIN(�������)
		select a.employee_id "�����ȣ", a.first_name "���������̸�",
		        b.employee_id "�����", b.first_name "����̸�"
		from employees a join employees b
		on a.manager_id = b.employee_id
		and a.department_id > 80;
		
		
		--Sub Query(��������)
		select employee_id, first_name, salary
		from employees
		where salary < (select salary from employees where first_name = 'Donald');
		
		select employee_id, first_name, salary
		from employees
		where salary = (select salary from employees where first_name = 'Donald');
		
		select employee_id, first_name, salary, hire_date
		from employees
		where hire_date >= (select hire_date from employees where first_name = 'Donald');
		
		select e.employee_id, e.first_name, e.hire_date, d.department_name
		from employees e join departments d
		on e.department_id = d.department_id
		and hire_date = (select hire_date from employees where first_name = 'Donald');
		
		select first_name, salary
		from employees
		where salary > (select avg(NVL(salary,0)) from employees where department_id = 100);
		
		-- >ANY(�ּҰ� ��ȯ), <AMY(�ִ밪 ��ȯ), <ALL(�ּҰ� ��ȯ), >ALL(�ִ밪 ��ȯ)
		select first_name, salary
		from employees
		where salary > ALL (select salary from employees where department_id = 110);
		
		select department_id, first_name, salary
		from employees
		where (department_id, salary) IN (select department_id, MAX(salary) from employees group by department_id)
		order by 1;
		
		select first_name "����̸�", (select department_name from departments d where e.department_id = d.department_id) "�μ��̸�"
		from employees e;
		
		
		--avg��� ���� �� null�� ���� �����ִ°� ����.
		--����� �޶��� �� �ִ�.
		--100 + 200 + null/3
		--100 + 200 + 0/3
		
		
		--from�� ��������
		select A.department_id , B.first_name , A.salary
		from (select department_id , max(salary) as salary
		      from employees
		      group by department_id) A join employees B
		on A.department_id = B.department_id
		where A.salary = B.salary;
		
		
		--����
		select first_name , NVL(salary,0) as salary 
		from employees;
		
		select first_name , department_id,
		    case department_id when 10 then '�ѹ���'
		                        when 20 then '�λ��'
		                        when 30 then '���ߺ�'
		                        else '�̹���'
		    end "�μ�"
		from employees;
		
		select first_name , department_id,
		    decode(department_id, 10, '�ѹ���', 20, '�λ��', 30, '���ߺ�', '�̹���') as "�μ�"
		from employees;
		
		select first_name, department_id,
		case when department_id between 10 and 30 then '���ڻ��'
		     when department_id between 40 and 50 then '���̿�'
		     when department_id between 60 and 70 then '���ߺ�'
		     else '�̹���'
		end "�μ�"
		from employees;
		
		--��ü ������ �� ���ϱ�
		select count(*) as "������ ��" from employees;
		
		--���� �հ�
		select sum(salary) as "���� �Ѿ�" from employees;
		
		--���� ���
		select avg(salary) as "���� ���" from employees;
		
		--�ְ� ����
		select max(salary) as "�ְ� ����" from employees;
		
		--�μ��� �ѿ�
		select department_id, count(*) as "�ѿ�"
		from employees
		group by department_id;
		
		--�μ��� �����հ�
		select department_id, sum(salary) as "�����հ�"
		from employees
		group by department_id;
		
		--�μ��� �������
		select department_id, avg(salary) as "�������"
		from employees
		group by department_id;
		
		--�μ��� �ְ���
		select department_id, max(salary) as "�ְ���"
		from employees
		group by department_id;
		
		--�μ��� ��������
		select department_id, min(salary) as "��������"
		from employees
		group by department_id;
		
		--�μ��� ������ �հ�
		select department_id, job_id, sum(salary) as "�����հ�"
		from employees
		group by department_id, job_id;
		
		
		--��� ���ֻ��Ǵ°� �̸� ���� ����Ѵ�.
		--������ �������ų� ������ ���� ���Ǵ� ������ �並 ���ؼ� ȿ���� ����.
		--��Ʈ��ũ Ʈ������ ���� �� �ִ�. ������ ���
		--��� ������ ��¹� �нż�
		create view view1
		as
		select first_name, salary, department_id
		from employees;
		
		select first_name, salary from view1;
		
		select first_name, salary from employees;
		
		--��Ʈ��ũ Ʈ���� ����
		--view
		--stored procedure => �Լ�ó�� ȣ���ؼ� ���
		--���ȿ��� ����.(�б� �����̱� ������)
		
		--���� view
		create view view2
		as 
		select subject.subject_name, student.name
		from subject join student
		on subject.subject_id = student.subject_id;
		
		select * from view2;
		
		
		--������ �ڵ�����
		create table board
		(
		    no number not null,
		    title varchar(20) not null,
		    writer varchar(20) not null,
		    wDate char(8) not null
		);
		
		--������ �����
		create sequence board_no
		increment by 1
		minvalue 0
		start with 0;
		
		insert into board values (board_no.nextval, '����Ŭ�� �����Դϱ�?', 'ȫ�浿', '20161221');
		
		select * from board;
		
		insert into board values (board_no.nextval, 'sql�̶�?', '�̼���', '20161221');
		
		--������ ����
		drop sequence board_no;
		
		
		--���̺� delete drop
		delete board; --���븸 ���󰡰� ���̺��� ���´�. commit������ rollback���� ��������.
		
		drop table board; --���̺���� ���� ����.
		
		--���̺� ����
		create table employees2
		as
		select * from employees;
		
		select * from employees2;
		
		--���̺��� ������ �������� ������ �� ��������
		create table employees3
		as
		select * from employees
		where 1 = 2;
		
		select * from employees3;
		
		
		--DML (Data Manipulation Language)
		--������ ó�� ���
		--select(�˻�), insert(�Է�), update(����), delete(����)
		
		--DDL (Data Definition Language)
		--������ ���� ���
		--create(����), alter(����), drop(����)
		
		--DCL
		
		select * from student;
		
		--����
		update student
		set score = 100, name = 'ȫ�浿'
		where name = 'JAMES';
		
		--����
		delete from student --from�� �ٿ��� �ǰ� �����ص� �ȴ�.
		where name = 'ȫ�浿';

	 */
	
}
