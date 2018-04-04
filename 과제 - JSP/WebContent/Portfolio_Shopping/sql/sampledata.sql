--���� ������ �Է�
insert into pofol_address values('152-278', '����Ư����', '���α�', '�����з�34�� 55', '08378', '�ڿ��ս��̾𽺹븮2��');

insert into pofol_worker values('admin', 'admin', 'ȫ����', '010-7777-7777');
insert into pofol_worker values('tomas', 'tomas', '�ڹٰ���', '010-8888-8888');

insert into pofol_member (id, pwd, name, zip_num, address, phone)
values ('one', '1111', '�質��', '133-100', '����ü�����������1�� 1���� 21ȣ', '017-7777-7777');
insert into pofol_member (id, pwd, name, zip_num, address, phone)
values ('two', '2222', '�̹���', '130-120', '����ü��ı����2�� ������ ����Ʈ 201�� 505ȣ', '011-1234-4567');

insert into pofol_product(pseq, name, kind, price1, price2, price3, content, image) values(
product_seq.nextval, '���÷��ĵ�Ƽ', '1', '5000', '12000', '7000', '�������� �ĵ�Ƽ�Դϴ�.', 'hoodt01.JPG');
insert into pofol_product(pseq, name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '���̽�ũ���ĵ�Ƽ', '1', '10000', '20000', '10000','���̽�ũ�� ������ �ĵ�Ƽ�Դϴ�.', 'hoodt02.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values( 
product_seq.nextval, '�شܹ���ĵ�����', '2', '13000', '21000', '8000', '�˳��ϰ� ������ �ĵ������Դϴ�.', 'hoodzipup01.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '���͸��տ������ĵ�����', '2', '7000', '34000', '27000', '����ϰ� ���� �ĵ������Դϴ�.', 'hoodzipup02.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, 'Ŀ����ȸ��', '3', '10000', '39000', '29000', '�߱���ĸ�� ��Ƽ��� �Ͽ����ϴ�.', 'cap01.JPG', 'n');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image) values(
product_seq.nextval, '������SMB', '3', '4000', '10000', '6000', 'SMB�귣�� �������Դϴ�.', 'cap02.JPG');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval,  '��û����������', '4', '13000', '36000', '23000', '�ŷ����� ��û ���������Դϴ�.', 'jin01.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval, '��Ƽ���Թ������', '4', '10000', '37800', '27800', '����� ��������Դϴ�.', 'jin02.JPG', 'y');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image) values(
product_seq.nextval,  '�ۼַ�Ʈ����', '5', '30000', '71120', '41120', '�˳��� ���������� �ڶ��մϴ�.', 'backpack01.JPG');
insert into pofol_product(pseq,  name, kind, price1, price2, price3, content, image, bestyn) values(
product_seq.nextval,  '�ε�Ʈ�����̽�����', '5', '57000', '148000', '91000', '�ǿ����̸鼭 �������ϴ�.', 'backpack02.JPG','n');

insert into pofol_cart(cseq, id, pseq, quantity) values(cart_seq.nextval, 'one', 1, 1);

insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'one');
insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'one');
insert into pofol_orders(oseq, id) values(orders_seq.nextval, 'two');

insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 1, 1, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 1, 2, 5);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 2, 4, 3);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 3, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 2, 1);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 6, 2);
insert into pofol_order_detail(odseq, oseq, pseq, quantity)
values(order_detail_seq.nextval, 3, 1, 2);

insert into pofol_qna(qseq, subject, content, id)
values(qna_seq.nextval, '�׽�Ʈ', '��������1', 'one');
insert into pofol_qna(qseq, subject, content, id)
values(qna_seq.nextval, '�׽�Ʈ2', '��������2', 'one');

delete pofol_qna;

--�� �����(���� ��ȸ�� ����)
create or replace view pofol_cart_view
as
select o.cseq, o.id, o.pseq, m.name mname, p.name pname, o.quantity, o.indate, p.price2, o.result
from pofol_cart o, pofol_member m, pofol_product p
where o.id = m.id and o.pseq = p.pseq and result = '1';

create or replace view pofol_order_view
as
select d.odseq, o.oseq, o.id, o.indate, d.pseq, d.quantity, 
m.name mname, m.zip_num, m.address, m.phone, p.name pname, p.price2, d.result
from pofol_orders o, pofol_order_detail d, pofol_member m, pofol_product p
where o.oseq = d.oseq and o.id = m.id and d.pseq = p.pseq;



--����Ʈ ��ǰ
create or replace view pofol_best_pro_view
as
select pseq, name, price2, image
from( select rownum, pseq, name, price2, image
      from pofol_product
      where bestyn='y'
      order by indate desc)
where rownum <= 4;

select * from pofol_best_pro_view;


--�Ż�ǰ
create or replace view pofol_new_pro_view
as
select pseq, name, price2, image
from( select rownum, pseq, name, price2, image
      from pofol_product
      where useyn='y'
      order by indate desc)
where rownum <= 4;

select * from pofol_new_pro_view;

------------------------------------------------------------
desc pofol_product;
commit;