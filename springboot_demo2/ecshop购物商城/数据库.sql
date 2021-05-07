-- ��Ʒ�����
create table category( 
    cid number primary key, -- ���
    cname varchar2(20), -- �����
    parent_id number -- ������
);
-- �������
insert into category values(1,'��ʷ����',0);
insert into category values(2,'������',0);
insert into category values(3,'����С˵',0);
insert into category values(4,'�ŵ���ѧ',0);
insert into category values(5,'�ʵ�',1);
insert into category values(6,'ս��',1);
insert into category values(7,'java��',2);
insert into category values(8,'web���',2);
insert into category values(9,'android�ƶ�����',2);
insert into category values(10,'���ܻ�����',2);
insert into category values(11,'��Ϸ���',2);
insert into category values(12,'ϵͳ�ܹ�ѧ',2);
insert into category values(13,'����С˵',3);
insert into category values(14,'ԭ��С˵',3);
insert into category values(15,'�ƻ�δ��',3);
insert into category values(16,'�ഺУ԰',3);
insert into category values(17,'��������',3);
insert into category values(18,'�������',4);
commit;

-- ͼ���
create table book (
   bid number primary key, -- ���
   bname varchar2(50) not null, -- ����
    cid number not null, -- �����ţ���Ӧ���������
   bauthor varchar2(50), -- ����
   bcomment varchar2(100), -- ����
   bpic     varchar2(100), -- ͼƬ
   bprice   number, -- �۸�
   bcount number -- ���
);
-- �������
insert into book values(1,'C++ Primer ϰ���𣨵�4�棩',10,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115155108.jpg',100,10);
insert into book values(2,'Effective C# ���İ����C#�����50�ַ���',10,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115158848.jpg',200,2);
insert into book values(3,'C����������ԣ���2�桤�°棩',8,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787111128069.jpg',200,22);
insert into book values(4,'�����ƣ���2�棩��CLR Via C#',9,'���� �������̻��������','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115134165.jpg',220,220);
insert into book values(5,'C++������ƽ̳̣��ڶ��棩',7,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115139238.jpg',10,50);
insert into book values(6,'���̽�� C++ ����ģ��',11,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115145543.jpg',180,120);
insert into book values(7,'Expert C# 2005 Business Objects���İ�',11,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115155108.jpg',220,90);
insert into book values(8,'Visual C# 2005�����ŵ���ͨ',12,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115158848.jpg',160,80);
insert into book values(9,'Beginning C# Objects���İ桪���������',5,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787121024931.jpg',330,34);
insert into book values(10,'Visual C++2005���ž���',8,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787121038181.jpg',100,20);
insert into book values(11,'���ݽṹ�⼯(C���԰�)',9,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787302114642.jpg',300,19);
insert into book values(12,'C#���ģʽ����������ʦϵ��',18,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787302131007.jpg',200,1);
insert into book values(13,'��ԽC++��׼��Boost�⵼��',6,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787302140160.jpg',200,0);
insert into book values(14,'���ݽṹ���㷨����C++�����������棩',7,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787302142713.jpg',200,30);
insert into book values(15,'C++���˼�루��2�棩��1����׼C++����',14,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787302149118.jpg',200,55);
insert into book values(16,'Visual C++����ͼ��������㷨��ʵ��',8,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787560924182.jpg',200,20);
insert into book values(17,'C����������ԣ���2�桤�°棩ϰ����',9,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115157508.jpg',200,20);
insert into book values(18,'C++��̹淶:101������׼�������ʵ��',11,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115157652.jpg',200,20);
insert into book values(19,'��Ԫ����֮��C#��',10,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115158680.jpg',200,20);
insert into book values(20,'Visual C#2005���򿪷�',8,'����������ʦ��','��1�¡��������š�<br>��2�¡������ͻ������͡�<br>��3�¡���׼�����͡�<br>��4�¡������ָ��','9787115158727.jpg',200,20);
commit;

-- ��Ա��
create table member( 
    mid number primary key, -- ���
    mname varchar2(20), -- �û���
    mpassword varchar2(20), -- ����
    email varchar2(50) -- ����
 );
-- �������
insert into member values(1,'zs','123@qq.com','000000');
insert into member values(2,'ls','456@qq.com','111111');
commit;

-- ��������
create table orders( 
    oid varchar2(50) primary key, -- ���
    mid number, -- ��Ա���`
    odate date, -- ����ʱ��
    oname varchar2(20), -- �ջ�������
    oaddress varchar2(100), -- �ջ���ַ
    otel varchar2(20), -- ��ϵ�绰
    oprice number -- �ܽ��
);
-- �������
insert into orders values('DD2017111122332',1,to_date('2017-6-1','yyyy-MM-dd'),'����','��ɳ���ǲ�','13811112222',400);
commit;

-- �������
create table orderdetails(
    odid number primary key, -- ���
    oid varchar2(50), -- ����������
    bid number, -- ͼ����
    bprice number, -- ͼ��۸�
    nums number -- ��������
);
-- �������
insert into orderdetails values(1,'DD2017111122332',1,100,3);
insert into orderdetails values(2,'DD2017111122332',1,100,10);
commit;


