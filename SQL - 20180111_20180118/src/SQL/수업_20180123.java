package SQL;

public class ����_20180123 {
	
	/*
	 * --�̴ϼ����α׷� ���̺� �����
		drop table member;
		
		create table member
		(
		    id varchar2(10) primary key,
		    name varchar2(20),
		    gender varchar2(1),
		    joindate DATE DEFAULT SYSDATE
		);
		
		insert into member values('hkd', 'ȫ�浿', 'm', sysdate);
		insert into member values('lss', '�̼���', 'm', sysdate);
		insert into member values('hj', 'Ȳ����', 'f', sysdate);
		insert into member values('wg', '�հ�', 'm', sysdate);
		insert into member values('pms', '�ڹ���', 'm', sysdate);
		
		drop table goods;
		
		create table goods
		(
		    goodsNo number primary key,
		    goodName varchar(20),
		    price number
		);
		
		 --to_number()�� ���ڿ��� ���ڷ� �������ش�(�ڹٿ��� ����� ��) ���� '999'�� ���� 3�ڸ����� ��� �ø��� �͵� ����
		insert into goods values(to_number('5', '999'), 'mp3', 10000);
		insert into goods values(2, 'camera', 50000);
		insert into goods values(3, 'pc', 700000);
		
		select * from goods;
		
		desc orders;
		drop table orders;
		
		create table orders
		(
		    no number primary key,
		    id varchar(10),
		    orderDate DATE DEFAULT SYSDATE
		);
		
		insert into orders values(1,'hkd', sysdate);
		insert into orders values(2,'wg', sysdate);
		insert into orders values(3,'hkd', sysdate);
		
		select * from orders;
		
		drop table ordersDetail;
		
		create table ordersDetail
		(
		    num number,
		    orderNo number, --�ֹ���ȣ
		    goodsno number,
		    qty number,
		    price number
		);
		
		select * from ordersDetail;
		
		insert into ordersDetail values(1,1,1,1,10000);
		insert into ordersDetail values(2,1,3,1,10000);
		insert into ordersDetail values(3,2,2,2,50000);
		insert into ordersDetail values(4,3,2,1,700000);
		
		select * from member;
		
		select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate
		from member
		where name = 'Ȳ����';
		
		select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate
		from member
		where gender = 'f';
		
		select m.name as name, nvl(s.goodName,' ') as goodName, od.qty as qty, od.price as price
		from member m join orders o
		on m.id = o.id
		join ordersDetail od
		on o.no = od.orderNo
		join goods s
		on od.goodsno = s.goodsno;
		
		commit;
	 */
	
}
