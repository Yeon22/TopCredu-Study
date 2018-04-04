create table pofol_worker(
    id varchar2(20) primary key,
    pwd varchar2(20),
    name varchar2(40),
    phone varchar2(20)
);

create table pofol_address(
    zip_num varchar2(7) not null,
    sido varchar2(30),
    gugun varchar2(30),
    ro_gil varchar2(100),
    zip_code varchar2(30) not null,
    bunji varchar2(30)
);

create table pofol_member(
    id varchar2(20) primary key,
    pwd varchar2(20),
    name varchar2(40),
    email varchar2(40),
    zip_num varchar2(7),
    address varchar2(100),
    phone varchar2(20),
    useyn char(1) default 'y',
    indate date default sysdate
);


create table pofol_product(
    pseq number(5) primary key,
    name varchar2(100),
    kind char(1),
    price1 number(7) default '0',
    price2 number(7) default '0',
    price3 number(7) default '0',
    content varchar2(1000),
    image varchar2(50) default 'default.jpg',
    useyn char(1) default 'y',
    bestyn char(1) default 'n',
    indate date default sysdate
);

drop sequence pofol_product_seq;
create sequence pofol_product_seq start with 0 increment by 1 minvalue 0 nocache;

create table pofol_cart(
    cseq number(10) primary key, --��ٱ��� ��ȣ
    id varchar(16) references member(id), --�ֹ��� ���̵�(FK : member.id)
    pseq number(5) references product(pseq), --�ֹ� ��ǰ��ȣ(FK : product.pseq)
    quantity number(5) default 1, --�ֹ� ����
    result char(1) default '1', --1:��ó�� 2:ó��
    indate date default sysdate --�ֹ���
);

drop sequence cart_seq;
create sequence pofol_cart_seq start with 0 increment by 1 minvalue 0 nocache;

alter table orders drop primary key cascade;
drop table orders;
create table pofol_orders(
    oseq number(10) primary key, --�ֹ� ��ȣ
    id varchar(16) references member(id), --�ֹ��� ���̵�
    indate date default sysdate --�ֹ���
);

drop sequence pofol_orders_seq;
create sequence pofol_orders_seq start with 0 increment by 1 minvalue 0 nocache;

alter table order_detail drop primary key cascade;
drop table order_detail;
create table pofol_order_detail(
    odseq number(10) primary key, --�ֹ��󼼹�ȣ
    oseq number(10) references orders(oseq), --�ֹ���ȣ
    pseq number(5) references product(pseq), --��ǰ��ȣ
    quantity number(5) default 1, --�ֹ�����
    result char(1) default '1' --1:��ó�� 2:ó��
);

drop sequence order_detail_seq;
create sequence pofol_order_detail_seq start with 0 increment by 1 minvalue 0 nocache;

--Q&A �Խ����� ���� ���θ����� ��ǰ�� ���ǻ��� �Ǵ� ��۹��ǿ� ���� �������� ���׿� ���ؼ� ������ �ϰ��� �� �� ����Ѵ�.
alter table qna drop primary key cascade;
drop table qna;
create table pofol_qna(
    qseq number(5) primary key, --�۹�ȣ
    subject varchar(300), --����
    content varchar(1000), --���ǳ���
    reply varchar(1000), --�亯����
    id varchar(20), --�ۼ���(FK : member.id)
    rep char(1) default '1', --1:�亯 �� 2:�亯 ��
    indate date default sysdate --�ۼ���
);

drop sequence pofol_qna_seq;
create sequence pofol_qna_seq start with 0 increment by 1 minvalue 0 nocache;

commit;

select * from pofol_address;
desc pofol_address;