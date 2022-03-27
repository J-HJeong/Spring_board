# Spring_board
> Spring을 이용한 게시판 프로젝트
   
## 프로젝트 개요
* 개발 언어: JAVA (JDK 1.8)
* 프레임워크: Spring Framework 4.5.1
* DB: MySQL 8.0
* 서버: Apache Tomcat 9.0
* 빌드 도구: Maven
* 테스트: Junit 4.13
* 디자인 프레임워크: Bootstrap

## DB 설계
* 사용자 

| column | type        | requirement | comments  |
|--------|-------------|--------------|---------- |
| userid | varchar(50) | NOT NULL, PK | 사용자 ID |
| passwd | varchar(50) | NOT NULL     | 비밀번호  |
| mobile | varchar(20) | NOT NULL     | 전화번호  |
| email  | vachar(50)  | NOT NULL     | 이메일    |

* 게시글

| column       | type         |     requirement             | comments |
|--------------|--------------|-----------------------------|----------|
| boardnum     | int          | NOT NULL, AUTO_INCREMENT, PK | 게시글 번호 |
| boardtitle   | varchar(100)  | NOT NULL                    | 게시글 제목 |
| boardcontent | varchar(100) | NOT NULL                    | 게시글 내용 |
| view_cnt     | int          | NOT NULL                    | 게시글 조회수 |
| boardwriter  | varchar(50)  | NOT NULL                    | 게시글 작성자 |
| boarddate    | datetime     | DEFAULT CURRENT_TIMESTAMP   | 게시글 작성 날짜 |

## 실행 화면
* 게시글 (페이지 당 게시물 10개로 설정)

![목록](https://user-images.githubusercontent.com/74246386/160269394-1de86ed7-f382-4cb1-8bea-06102748ba40.png)

* 회원가입

![회원가입](https://user-images.githubusercontent.com/74246386/160269353-9393ee62-c880-494a-ad7c-b9f075528376.png)

* 로그인

![로그인](https://user-images.githubusercontent.com/74246386/160269380-0688ee85-ba7b-42e8-a117-607f305e7f7e.png)

* 글 작성

![작성](https://user-images.githubusercontent.com/74246386/160269514-c7194271-8c1b-4d64-a66f-9b547e82744b.png)

* 게시글 조회

![조회](https://user-images.githubusercontent.com/74246386/160269516-0a918c37-6768-4a04-818e-bcd6cd301e32.png)

