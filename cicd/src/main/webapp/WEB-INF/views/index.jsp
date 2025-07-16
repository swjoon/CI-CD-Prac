<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>메인페이지</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }
        header {
            background-color: #333;
            padding: 20px;
            color: white;
            text-align: center;
        }
        nav {
            background-color: #f2f2f2;
            padding: 10px;
            text-align: center;
        }
        nav a {
            margin: 0 15px;
            text-decoration: none;
            color: #333;
        }
        section {
            padding: 40px;
            text-align: center;
        }
        footer {
            background-color: #333;
            padding: 10px;
            color: white;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <h1> 홈페이지 입니다 </h1>
    </header>
    <nav>
        <a href="/">Home</a>
        <a href="https://naver.com">Naver</a>
        <a href="https://google.com">Google</a>
    </nav>

    <section>
        <h2>환영합니다!</h2>
        <p>메인페이지를 꾸며보세요.</p>
    </section>

    <footer>
        &copy; CI-CD-TEST PROJECT
    </footer>
</body>
</html>