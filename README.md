<h1>프로젝트 소개</h1>
<span>
    책을 좋아하는 독자들을 위한 사용자 친화적 Ebook 페이지입니다. <br>
    SpringBoot 와 Java를 사용해 프로젝트를 제작했습니다.
</span>
<h3>개발 기간 및 인원</h3>
<span>
    24.07.15 ~ 24.07.26(2주)
    백엔드 3명
</span><br>
<h1>팀원</h1>
<table>
  <tbody>
    <tr>
      <td><a href="https://github.com/97Kcm"><b>김창민</b></a></td>
      <td><a href=""><b>김찬서</b></a></td>
      <td><a href="https://github.com/MisoMarie"><b>임정훈</b></a></td>
     <tr/>
  </tbody>
</table>
<br>

<h1>ERD 구조</h1><br>
<a href="https://www.erdcloud.com/d/cjyA5HGuP34o5wfip">ERD Cloud에서 직접 보기</a><br>
<img src="https://private-user-images.githubusercontent.com/148042427/359342715-5cd0a182-f461-4a8d-a53a-031cf78ce770.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzA1MzcsIm5iZiI6MTcyNDEzMDIzNywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzQyNzE1LTVjZDBhMTgyLWY0NjEtNGE4ZC1hNTNhLTAzMWNmNzhjZTc3MC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNTAzNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kM2I4YmU3OTAxYjE5NTRhNzY4NDM3MTZiOGFiY2M0YTk5MDYwMDRkYzU1MDVmMGMwMzI1NjUzOTFlMjEwYmJiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.S9Yh652TNH7Rt77MezKEuYH0sTDu4X2LqFVbG_LKNOE"/>

<h1>기술 스택</h1>
<br>
<img src="https://skillicons.dev/icons?i=html,css,javascript,java,spring,mysql,theme=light">
<br>

<h1>주요기능</h1>
    <h3>요약</h3>
    <table>
        <thead>
            <tr>
                <th><b>공통</b></th>
                <th><b>사용자</b></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    - 회원가입, 로그인 <br>
                    - 책 이미지 및 책 상세 페이지 조회
                </td>
                <td>
                    - 책 좋아요 목록 관리 <br>
                    - 구입 도서 목록 관리 <br>
                    - 캐쉬 충전 및 책 구매
                </td>
            </tr>
        </tbody>
    </table>
<h2>[공통 기능]</h2>
<h3>회원가입, 로그인</h3>
<ul>
    <li>사용자는 이메일,비밀번호,이름,휴대폰번호 등을 이용해 회원가입 할 수 있다.</li>
    <li>회원가입 시 사용한 아이디와 비밀번호를 통해 로그인 할 수 있다.</li>
    <li>외부 링크로 로그인 시, 회원가입한 개인정보와 일치 시 로그인 할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359353289-cd8fc6be-1e76-43a8-b17b-2f52e7364a32.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzM2NzEsIm5iZiI6MTcyNDEzMzM3MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzUzMjg5LWNkOGZjNmJlLTFlNzYtNDNhOC1iMTdiLTJmNTJlNzM2NGEzMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNTU2MTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kY2E5YzAwMzI3MjYzNWZlMjdlMTk5NGExMTZkYWI0MTVmODg3MjJhZTg5ZWRmOTkyMDE5NWE3Y2U1NWI4ZDM3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.LuA5WzPRZI-xbLvXMT8ekdRAGN1SQUoeJa1nGl-aeXY" width="600px" height="600px" style="display: inline">
<img src="https://private-user-images.githubusercontent.com/148042427/359353287-8edd006d-ca76-406f-b7f5-16dda8e78822.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzM2NzEsIm5iZiI6MTcyNDEzMzM3MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzUzMjg3LThlZGQwMDZkLWNhNzYtNDA2Zi1iN2Y1LTE2ZGRhOGU3ODgyMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNTU2MTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jNDkzZjAwYzk5MzcyMmEwZjM2NzdkNTg0ZDE0OTQ4OGYyYjc5ZmVlMjNkYWM0YmVmMWEyY2JhMWI5ZThiMTI2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.iTATa6CGkr_wyz8NoTlps7xe1DZZ-8Rlo8fiiSwq_XI" width="600px" height="600px" style="display: inline"><br>
<h3>책 이미지 및 책 상세 페이지 조회</h3>
<ul>
    <li>책 카테고리 별 책 목록을 조회할 수 있다.</li>
    <li>책 상세페이지에서 책의 각 챕터를 조회할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359353270-ac95bdf5-a88e-4683-b0f1-ae40d635968d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzM2NzEsIm5iZiI6MTcyNDEzMzM3MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzUzMjcwLWFjOTViZGY1LWE4OGUtNDY4My1iMGYxLWFlNDBkNjM1OTY4ZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNTU2MTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xNTRkZGQ3ZTMzODVlMGEyNjU5OTM3NjRlMmJhNzUwMzJhNzhlYWM1Nzc3MjQ0YWE4NGY3MzExZWZhZWJiYjZiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.lqKLfEEwW9rFbSxnIcs2NnArsUezO6iNPH7P3ngNjmM" width="600px" height="600px" style="display: inline">
<img src="https://private-user-images.githubusercontent.com/148042427/359353281-4f0c54c9-5139-4006-99ba-b7e1c244270a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzM2NzEsIm5iZiI6MTcyNDEzMzM3MSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzUzMjgxLTRmMGM1NGM5LTUxMzktNDAwNi05OWJhLWI3ZTFjMjQ0MjcwYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNTU2MTFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xYTNkYzAzYzI5ZGZiZmYwODhiZTFhNjM1MDNhMTRlMzA4ZjU2OGIyMzljMGNkNmRiZTkwOTFlY2M2MTAwYjIyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.DVzeSmycKx8YR83bJBjp7D-yi-43W7bKDxXXLxI8NAg" width="600px" height="600px" style="display: inline"><br>

<h2>[사용자 기능]</h2>
<h3>좋아요 목록 관리</h3>
<ul>
    <li>사용자가 누른 책 좋아요 목록을 확인하고 추가 및 제거할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359354627-cb282e6e-4f25-4ed3-86e9-fdba5a5189e1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzQwMDcsIm5iZiI6MTcyNDEzMzcwNywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzU0NjI3LWNiMjgyZTZlLTRmMjUtNGVkMy04NmU5LWZkYmE1YTUxODllMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNjAxNDdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mYTk0OTlkZTQxZTZhY2NiMzc0YjNlNjMxMTQwNjQxNTQwNGQ3MDlhMTExYzgwYzkzZWMyYTEzM2EyYzQzZDM3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.RVGcFaAk4POYJ5Y-P2bzeWfFrPE-1NmJaWZ7cFQmY08" width="600px" height="600px" style="display: inline"><br>
<h3>구매 목록 관리</h3>
<ul>
    <li>사용자가 보고 싶은 책 챕터를 구입할 수 있다.</li>
    <li>사용자 캐쉬 부족 시 구입이 되지 않는다.</li>
    <li>사용자가 구입한 챕터 목록을 조회할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359354625-f4a3e6bf-eca3-46e9-8fb0-75a6eb22df20.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzQwMDcsIm5iZiI6MTcyNDEzMzcwNywicGF0aCI6Ii8xNDgwNDI0MjcvMzU5MzU0NjI1LWY0YTNlNmJmLWVjYTMtNDZlOS04ZmIwLTc1YTZlYjIyZGYyMC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNjAxNDdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jMDRjYWNkN2UxYTk3NWMwM2I5YzAwY2FiOGY2MmY3YzExMGU3MDBiMmIxZmMzNDljNzRkNzdmZmVmYzhhN2Y4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.3gQsJ7VYMMqJoSmYvEZMa_bxPRGydHJ2u5tHwKv_EGw" width="600px" height="600px" style="display: inline"><br>
<h3>뷰어 페이지 사용</h3>
<ul>
    <li>사용자가 구입한 챕터를 보기 위한 뷰어 페이지로 이동할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359376330-f75fcf92-3014-4fa8-a1db-7c977609358c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxMzg3MzksIm5iZiI6MTcyNDEzODQzOSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5Mzc2MzMwLWY3NWZjZjkyLTMwMTQtNGZhOC1hMWRiLTdjOTc3NjA5MzU4Yy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQwNzIwMzlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05NTFlNjhlMzUzOTk5ZmVkZDJiYjIwNzU2OTMxYjM1ODk0NmM0NzVjZGVjMjVhZmZkOWFkOGZkY2QyNWEzNDY3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.fz9aezeeKgat7UCe00_W0K0c2yUOEsfhGCnaQrR1KO4" width="600px" height="600px" style="display: inline"><br>
<h3>캐쉬 충전</h3>
<ul>
    <li>사용자가 보유한 캐시를 확인 할 수 있고 부족할 경우 충전이 가능하다.</li>
    <li>보유한 캐시로 책의 각 챕터를 구매할 수 있다.</li>
</ul>
<img src="https://private-user-images.githubusercontent.com/148042427/359434888-b912419a-bca8-46c2-821a-097e78e539ca.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQxNDkwMjksIm5iZiI6MTcyNDE0ODcyOSwicGF0aCI6Ii8xNDgwNDI0MjcvMzU5NDM0ODg4LWI5MTI0MTlhLWJjYTgtNDZjMi04MjFhLTA5N2U3OGU1MzljYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwODIwJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDgyMFQxMDEyMDlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT02OWViNDIwNzA4OGY0YmE0ZWM4NjQzOWZiYzZjNGVlNDM2Y2E2Njc5OTBkNGVlZjVmYTlhNTRjNGRhODlkYThiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.ok4Qb0_zHsIEg3b2Eep7i-6z6Okw5Lu1XNDfJPMd2DE" width="600px" height="600px" style="display: inline"><br>




