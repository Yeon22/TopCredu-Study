package SQL_MySQL;

public class ����_20180201 {
	
	/*
	 * -- �����ͺ��̽� ����
		create database company;
		
		-- company �����ͺ��̽� ���
		use company;
		
		create table products
		(
			id int not null auto_increment primary key,
		    name varchar(50) not null,
		    modelnumber varchar(15) not null,
		    series varchar(30) not null
		);
		
		select * from products;
		
		insert into products(name, modelnumber, series) 
		values('eric', '1234567', 'Artist');
		
		insert into products(name, modelnumber, series) 
		values('Jeff', '1234568', 'Artist');
		
		insert into products(name, modelnumber, series) 
		values('American', '1234569', 'American Deluxe');
		
		select * from products
		where series = 'Artist';
		
		select * from products
		where id >1 and id < 5;
		
		-- 3��°���� 2��
		select * from products order by name desc limit 2,2;
		-- 1��°���� 2���� ��ȸ
		select * from products order by name desc limit 2;
		
		-- ������ ����
		update products set name = 'david' where id = 1;
		
		select * from products;
		
		-- ������ ����
		delete from products where id=1;
		
		-- ���̺� ����
		drop table products;
		
		-- DB����
		drop database company;
		
		commit;
		
		
		create database sampledb;
		
		use sampledb;
		
		create table test
		(
			id varchar(10),
		    name varchar(10)
		);
		
		insert into test values('1', 'kkk');
		
		select * from test;
		

	 */

}
