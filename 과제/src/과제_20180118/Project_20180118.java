package ����_20180118;

public class Project_20180118 {
	
	/*

	-- 1. depart(�а�) ���̺��� �����Ͻÿ�.
	-- �а�ID, �а���
	create table depart
	(
	    �а�ID VARCHAR2(4),
	    �а��� VARCHAR2(20)
	);


	-- 2. student ���̺��� �����Ͻÿ�.
	-- �й�, �̸�, �а�ID
	create table student
	(
	    �й� VARCHAR2(8),
	    �̸� VARCHAR2(10),
	    �а�ID VARCHAR2(4)
	);


	-- 3. 1���� ������ ���� �����͸� �Է��Ͻÿ�.
	-- 0001,��ǻ�Ͱ��а�
	-- 0002,���ڰ��а�
	insert into depart values('0001', '��ǻ�Ͱ��а�');
	insert into depart values('0002', '���ڰ��а�');


	-- 4. 2���� ������ ���� �����͸� �Է��Ͻÿ�.
	-- 20150001,ȫ�浿,0001
	-- 20160010,�̼���,0002
	insert into student values('20150001', 'ȫ�浿', '0001');
	insert into student values('20160010', '�̼���', '0002');


	-- 5. student���̺��� ���� 'ȫ'���� ����� �˻��Ͻÿ�.
	select * from student
	where �̸� like 'ȫ%';


	-- 6.���� �׸��� ����Ͻÿ�.(����)
	-- �й�, �̸�, �а���
	select s.�й�, s.�̸�, d.�а���
	from student s join depart d
	on s.�а�ID = d.�а�ID;


	-- 7.�а����� ����Ͻÿ�.
	select count(�а���) "�а���"
	from depart;


	-- 8.���ڰ��а� �л������ ����Ͻÿ�.(��������)
	select * from student
	where �а�ID = (select �а�ID
	                from depart
	                where �а��� = '���ڰ��а�');


	-- 9. 2016�й� �л����� ����Ͻÿ�.
	select * from student
	where �й� like '2016%';


	-- 10.���� MS-SQLServer���� ���̺�,������ ���������� Oracle�� �°� �����Ͽ� ���̺�,�����͸� �����Ͻÿ�.
	create table member
	( id VARCHAR2(4) primary key,
	 name VARCHAR2(8),
	 gender VARCHAR2(5),
	 joindate VARCHAR2(20)
	);

	insert into member values('hkd','ȫ�浿','m','2001-01-01');

	insert into member values('lss','�̼���','m','2003-02-01');

	insert into member values('hj','Ȳ����','f','2002-11-13');

	insert into member values('wg','�հ�','m','2005-12-21');

	insert into member values('pms','�ڹ���','m','2006-11-09');


	create table goods
	( goodsNo NUMBER primary key,
	 goodName VARCHAR2(20),
	 price NUMBER
	);

	insert into goods values(1,'mp3',10000);

	insert into goods values(2,'camera',50000);

	insert into goods values(3,'pc',700000);


	create table orders
	( no NUMBER primary key,
	 id VARCHAR2(4),
	 orderDate VARCHAR(20)
	);

	insert into  orders values(1,'hkd','2001-03-27');

	insert into orders values(2,'wg','2005-04-17');

	insert into orders values(3,'hkd','2006-02-07');


	create table ordersDetail
	( num NUMBER,
	 orderNo NUMBER, --�ֹ���ȣ
	 goodsNo NUMBER, -- ��ǰ��ȣ
	 qty NUMBER --��ǰ����
	);

	insert into ordersDetail values(1,1,1,1);

	insert into ordersDetail values(2,1,3,1);

	insert into ordersDetail values(3,2,2,2);

	insert into ordersDetail values(4,3,2,1);


	-- 11. ��üȸ������ ���Ͻÿ�.
	select count(*) "��üȸ����"
	from member;


	-- 12. ���� ȸ������ ���Ͻÿ�.
	-- ����, ȸ����
	select gender "����" , count(*) "ȸ����"
	from member
	group by gender;


	-- 13. ���� ����(��������) �Ǹŵ� ��ǰ���� ����Ͻÿ�.
	-- ��ǰ�� , �Ǹż���
	select g.goodname "��ǰ��" , sum(od.qty) "�Ǹż���"
	from goods g join ordersDetail od
	on g.goodsno = od.goodsno
	group by g.goodname
	order by count(od.qty) DESC;


	-- 14. �ֹ������� ����Ͻÿ�.
	-- ȸ����, ��ǰ��, �ֹ�����
	select m.name "ȸ����" , g.goodName "��ǰ��" , od.qty "�ֹ�����"
	from member m join orders o
	on m.id = o.id
	join  ordersDetail od
	on o.no = od.orderNo
	join goods g
	on od.goodsNo = g.goodsNo
	order by m.name;


	-- 15. ���� 'ȫ'�� ȸ���� �˻��Ͻÿ�.
	select name from member
	where name like 'ȫ%';


	-- 16. �⵵, ��ǰ�� �Ǹż����� ���Ͻÿ�.
	-- �⵵, ��ǰ��, �ǸŰ���
	select substr(o.orderdate, 1, 4) "�⵵" , g.goodName "��ǰ��" , od.qty "�ǸŰ���"
	from orders o join ordersDetail od
	on o.no = od.orderno
	join goods g
	on od.goodsNo = g.goodsNo
	order by o.orderdate;


	-- 17. �⵵�� �Ǹ� �Ѿ�(�ݾ�)�� ���Ͻÿ�.
	-- �⵵, �Ǹ��Ѿ�
	select substr(o.orderdate, 1, 4) "�⵵", sum(od.qty * g.price) "�Ǹ��Ѿ�"
	from orders o join ordersDetail od
	on o.no = od.orderNo
	join goods g
	on od.goodsNo = g.goodsNo
	group by o.orderdate;
	
	 */
	
}
