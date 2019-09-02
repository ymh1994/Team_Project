create table Guestbook(
seqno number primary key,
name varchar2(30) not null,
password varchar2(20) not null,
content varchar2(2000) not null,
regdate date default sysdate
)


create sequence guestbook_seq

insert into guestbook
values(guestbook_seq.nextval,'홀길동','1234','잘먹고갑니다',sysdate)