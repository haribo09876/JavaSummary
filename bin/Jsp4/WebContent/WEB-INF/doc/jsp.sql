DROP TABLE MEMBER;

--회원 테이블 생성
CREATE TABLE MEMBER(
    MNO NUMBER NOT NULL,
    EMAIL VARCHAR2(40) NOT NULL,
    PWD VARCHAR2(100) NOT NULL,
    MNAME VARCHAR2(50) NOT NULL,
    CRE_DATE DATE NOT NULL,
    MOD_DATE DATE NOT NULL
);

SELECT *
FROM MEMBER;

--MNO 컬럼을 MEMBER 테이블의 PRIMARY 키 지정
ALTER TABLE MEMBER
ADD CONSTRAINT MEMBER_MNO_PK PRIMARY KEY(MNO);

--EMAIL 컬럼을 유니크 키로 지정
ALTER TABLE MEMBER
ADD CONSTRAINT MEMBER_EMAIL_UK UNIQUE(EMAIL);

SELECT *
FROM MEMBER;

Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (2,'s2@test.com','2222','임꺽정',to_date('20/05/06','RR/MM/DD'),to_date('20/05/06','RR/MM/DD'));
Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (3,'s3@test.com','3333','일지매',to_date('20/05/06','RR/MM/DD'),to_date('20/05/06','RR/MM/DD'));
Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (4,'s4@test.com','4444','이몽룡',to_date('20/05/06','RR/MM/DD'),to_date('20/05/06','RR/MM/DD'));
Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (5,'s5@test.com','5555','성춘향',to_date('20/05/06','RR/MM/DD'),to_date('20/05/06','RR/MM/DD'));
Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (1,'s1@test.com','1111','홍길동',to_date('20/05/11','RR/MM/DD'),to_date('20/05/11','RR/MM/DD'));
Insert into JSP.MEMBER (MNO,EMAIL,PWD,MNAME,CRE_DATE,MOD_DATE) values (43,'dd','dd','디디',to_date('20/05/14','RR/MM/DD'),to_date('20/05/14','RR/MM/DD'));

SELECT *
FROM MEMBER;
