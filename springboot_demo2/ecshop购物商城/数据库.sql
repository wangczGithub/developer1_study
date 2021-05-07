-- 商品分类表
create table category( 
    cid number primary key, -- 编号
    cname varchar2(20), -- 类别名
    parent_id number -- 父类编号
);
-- 添加数据
insert into category values(1,'历史人文',0);
insert into category values(2,'软件编程',0);
insert into category values(3,'网络小说',0);
insert into category values(4,'古典文学',0);
insert into category values(5,'皇帝',1);
insert into category values(6,'战争',1);
insert into category values(7,'java书',2);
insert into category values(8,'web编程',2);
insert into category values(9,'android移动开发',2);
insert into category values(10,'智能机器人',2);
insert into category values(11,'游戏设计',2);
insert into category values(12,'系统架构学',2);
insert into category values(13,'武侠小说',3);
insert into category values(14,'原创小说',3);
insert into category values(15,'科幻未来',3);
insert into category values(16,'青春校园',3);
insert into category values(17,'都市言情',3);
insert into category values(18,'三大错误',4);
commit;

-- 图书表
create table book (
   bid number primary key, -- 编号
   bname varchar2(50) not null, -- 书名
    cid number not null, -- 分类编号，对应分类表的外键
   bauthor varchar2(50), -- 作者
   bcomment varchar2(100), -- 描述
   bpic     varchar2(100), -- 图片
   bprice   number, -- 价格
   bcount number -- 库存
);
-- 添加数据
insert into book values(1,'C++ Primer 习题解答（第4版）',10,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115155108.jpg',100,10);
insert into book values(2,'Effective C# 中文版改善C#程序的50种方法',10,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115158848.jpg',200,2);
insert into book values(3,'C程序设计语言（第2版·新版）',8,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787111128069.jpg',200,22);
insert into book values(4,'框架设计（第2版）：CLR Via C#',9,'霍顿 著，李颂华，康会光','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115134165.jpg',220,220);
insert into book values(5,'C++程序设计教程（第二版）',7,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115139238.jpg',10,50);
insert into book values(6,'深度探索 C++ 对象模型',11,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115145543.jpg',180,120);
insert into book values(7,'Expert C# 2005 Business Objects中文版',11,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115155108.jpg',220,90);
insert into book values(8,'Visual C# 2005从入门到精通',12,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115158848.jpg',160,80);
insert into book values(9,'Beginning C# Objects中文版——概念到代码',5,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787121024931.jpg',330,34);
insert into book values(10,'Visual C++2005入门经典',8,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787121038181.jpg',100,20);
insert into book values(11,'数据结构题集(C语言版)',9,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787302114642.jpg',300,19);
insert into book values(12,'C#设计模式——开发大师系列',18,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787302131007.jpg',200,1);
insert into book values(13,'超越C++标准库Boost库导论',6,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787302140160.jpg',200,0);
insert into book values(14,'数据结构与算法分析C++描述（第三版）',7,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787302142713.jpg',200,30);
insert into book values(15,'C++编程思想（第2版）第1卷：标准C++导引',14,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787302149118.jpg',200,55);
insert into book values(16,'Visual C++数字图像处理典型算法及实现',8,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787560924182.jpg',200,20);
insert into book values(17,'C程序设计语言（第2版·新版）习题解答',9,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115157508.jpg',200,20);
insert into book values(18,'C++编程规范:101条规则、准则与最佳实践',11,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115157652.jpg',200,20);
insert into book values(19,'单元测试之道C#版',10,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115158680.jpg',200,20);
insert into book values(20,'Visual C#2005程序开发',8,'蒋爱军，李师贤','第1章　快速入门　<br>第2章　变量和基本类型　<br>第3章　标准库类型　<br>第4章　数组和指针','9787115158727.jpg',200,20);
commit;

-- 会员表
create table member( 
    mid number primary key, -- 编号
    mname varchar2(20), -- 用户名
    mpassword varchar2(20), -- 密码
    email varchar2(50) -- 邮箱
 );
-- 添加数据
insert into member values(1,'zs','123@qq.com','000000');
insert into member values(2,'ls','456@qq.com','111111');
commit;

-- 订单主表
create table orders( 
    oid varchar2(50) primary key, -- 编号
    mid number, -- 会员编号`
    odate date, -- 订单时间
    oname varchar2(20), -- 收货人姓名
    oaddress varchar2(100), -- 收货地址
    otel varchar2(20), -- 联系电话
    oprice number -- 总金额
);
-- 添加数据
insert into orders values('DD2017111122332',1,to_date('2017-6-1','yyyy-MM-dd'),'老铁','长沙望城波','13811112222',400);
commit;

-- 订单详表
create table orderdetails(
    odid number primary key, -- 编号
    oid varchar2(50), -- 订单主表编号
    bid number, -- 图书编号
    bprice number, -- 图书价格
    nums number -- 购买数量
);
-- 添加数据
insert into orderdetails values(1,'DD2017111122332',1,100,3);
insert into orderdetails values(2,'DD2017111122332',1,100,10);
commit;


