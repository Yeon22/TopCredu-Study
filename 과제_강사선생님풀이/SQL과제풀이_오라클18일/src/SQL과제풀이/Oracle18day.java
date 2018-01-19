package SQL����Ǯ��;

public class Oracle18day {
	
	/*
	 * --1. depart(�а�) ���̺��� �����Ͻÿ�.
		--�а� ID , �а���
		create table depart(
			depart_id number not null,
			depart_name varchar(20)
		);
		
		drop table student;
		
		
		
		create table student
		(
			st_no varchar(8),
			st_name varchar(20),
			st_depart_id number not null
		);
		
		
		
		insert into depart values(0001,'��ǻ�Ͱ��а�');
		insert into depart values(0002,'���ڰ��а�');
		
		
		
		insert into student values('20150001','ȫ�浿',0001);	
		insert into student values('20160010','�̼���',0002);
		
		
		
		--5.���� ȫ���λ���� �˻�
		select * 
		from student
		where st_name LIKE('ȫ%');
		
		
		select st_no, st_name,depart_name
		from student s join depart d
		on s.st_depart_id = d.depart_id;
		
		
		select count(depart_name) as "�а���"
		from depart;
		
		
		select st_name
		from student
		where st_depart_id  = (select depart_id
								from depart
								where depart_name = '���ڰ��а�');
		
		                        
		
		--2016�й� �л����� ����Ͻÿ�
		select st_name ,st_no
		from student
		where to_number(st_no) >= 20160000;
		
		
		
		
		
		--create table member
		--( id text primary key,
		-- name text,
		-- gender text,
		-- joindate text
		--);
		
		
		
		create table member
		(
			id varchar(20) not null,
			name varchar(20),
			gender char(2),
			joindate varchar(10)
		);
		
		
		
		
		create table goods
		(
			goodsNo number primary key,
			goodName varchar(20),
			price number
		);
		
		
		
		insert into goods values(1,'mp3',10000);
		insert into goods values(2,'camera',50000);
		insert into goods values(3,'pc',700000);
		
		
		
		
		
		create table orders
		( 
			no number primary key,
			id varchar(20),
			orderDate varchar(20)
		);
		
		
		insert into  orders values(1,'hkd','2001-03-27');
		insert into orders values(2,'wg','2005-04-17');
		insert into orders values(3,'hkd','2006-02-07');
		
		
		
		
		
		create table ordersDetail
		(	num number,
			orderNo number, --�ֹ���ȣ
			goodsNo number, -- ��ǰ��ȣ
			qty number--��ǰ����
		);
		
		
		
		insert into ordersDetail values(1,1,1,1);
		insert into ordersDetail values(2,1,3,1);
		insert into ordersDetail values(3,2,2,2);
		insert into ordersDetail values(4,3,2,1);
		
		
		
		select * from ordersDetail;
		
		
		
		
		
		
		
		select count(*) as "��üȸ����"
		from member;
		
		
		
		
		select gender , count(*) as "���� ȸ����"
		from member
		group by gender;
		
		
		
		
		
		
		select nvl(g.goodName,' ') as "��ǰ��", nvl(to_char(g.goodsno),' ') as "��ǰ��ȣ",max(od.qty) as "��ǰ����"
		from goods g join ordersDetail od
		on g.goodsno = od.goodsno
		group by rollup(g.goodName,g.goodsno)
		order by "��ǰ����" desc;
		
		
		
		
		
		
		select m.name , s.goodName , od.qty
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno;
		
		
		
		
		
		
		
		select * from member
		where name like('ȫ%');
		
		
		
		
		
		
		
		--�⵵, ��ǰ��, �ǸŰ���
		select nvl(substr(o.orderDate,1,4),' ') as "�⵵" , nvl(s.goodName,' ') as "��ǰ��" ,sum(od.qty)
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno
		group by rollup(substr(o.orderDate,1,4),s.goodName);
		
		
		
		
		
		
		
		--�⵵�� ,�Ǹ��Ѿ�
		select nvl(substr(o.orderDate,1,4),' ') as "�⵵" ,sum(s.price) as "�Ǹ��Ѿ�"
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderno
		join goods s
		on od.goodsno = s.goodsno
		group by rollup(substr(o.orderDate,1,4) , s.price);

	 */

}
