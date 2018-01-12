package ����_20180112;

public class Project_20180112 {
	
	/* sql ����
	 1. student ���̺��� �����Ͻÿ�. ��� �׸� 
		id varchar(10)
		name varchar(20)
		department varchar(30)
		address varchar(50)

	create table student
	(
	    id varchar(10),
	    name varchar(20),
	    department varchar(30),
	    address varchar(50)
	);


	2. student ���̺� ����Ʈ�� �Է��Ͻÿ�.
		20160001 ȫ�浿 ��ǻ�Ͱ��а� ����� ��������
		20162233 �̼��� ��Ƽ�̵���а� �λ�� ����
		20161177 �հ� ��Ƽ�̵���а� ������ ��ô��
	
	insert into student values (220160001, 'ȫ�浿', '��ǻ�Ͱ��а�', '����� ��������');
	insert into student values (220162233, '�̼���', '��Ƽ�̵���а�', '�λ�� ����');
	insert into student values (220161177, '�հ�', '��Ƽ�̵���а�', '������ ��ô��');


	3. �й�,�̸�,�а��� ����Ͻÿ�.
	
	select id, name, department from student;


	4. ��ǻ�Ͱ��а� �л��� ����Ͻÿ�.

	select id, name, department, address from student where department = '��ǻ�Ͱ��а�';


	5. ����ÿ� ��� �л��� ����Ͻÿ�.
	
	select id, name, department, address from student where address like '�����%';


	6. ��Ƽ�̾��а� �л��� �������� ��� �л��� ����Ͻÿ�.
	
	select id, name, department, address
	from student
	where address like '������%'
	and department = '��Ƽ�̵���а�';


	7. �й������� �����ؼ� ����Ͻÿ�. ��������
	
	select * from student 
	order by id;


	8. �̸������� �����ؼ� ����Ͻÿ�. ��������
	
	select * from student 
	order by name desc;
	
	
	
	9. �а���, �й����� �����ؼ� ����Ͻÿ�. ��� ��������.

	select * from student
	order by department asc, id asc;


	
	10. student2 ���̺��� �����, �����͸� �Է��ؼ�
		20160021 ������ ��ǻ�Ͱ��а� ��õ�� �ϱ�
		20162288 �������� ��Ƽ�̵���а� ���ֽ� ����
		20161177 ��Ȳ ��Ƽ�̵���а� ����� ������
		student, student�� ���ļ� ����ÿ� ��� ����� ����Ͻÿ�.
		
	create table student2
	(
	    id varchar(10),
	    name varchar(20),
	    department varchar(30),
	    address varchar(50)
	);

	insert into student2 values (220160021, '������', '��ǻ�Ͱ��а�', '��õ�� �ϱ�');
	insert into student2 values (220162288, '��������', '��Ƽ�̵���а�', '���ֽ� ����');
	insert into student2 values (220161177, '��Ȳ', '��Ƽ�̵���а�', '����� ����');

	select id, name, department, address 
	from student 
	where address like '�����%'
	union all
	select id, name, department, address
	from student2
	where address like '�����%';
	*/
	
}
