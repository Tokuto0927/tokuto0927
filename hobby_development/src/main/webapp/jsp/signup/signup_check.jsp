<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規ユーザー登録確認</title>
<link rel="stylesheet" href="../css/ress.css">
<link rel="stylesheet" href="../css/login.css">
</head>
<body>

    <div id="home" class="mv-top">

        <div class="wrapper">

            <h1>新規ユーザー登録確認</h1>

            <%-- フォームからのデータを取得 --%>
            <% String username = request.getParameter("username"); %>
            <% String password = request.getParameter("password"); %>

            <%-- データベースに接続し、データを格納 --%>
            <% 
            try {
                // JDBCドライバを読み込み
                Class.forName("com.mysql.jdbc.Driver");

                // データベースに接続
                String url = "jdbc:mysql://localhost:8003/phpMyAdmin5"; 
                String user = "root"; 
                String pass = "root"; 
                Connection conn = DriverManager.getConnection(url, user, pass);

                // SQL文を準備
                String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, username);
                pstmt.setString(2, password);

                // SQLを実行
                int result = pstmt.executeUpdate();

                // 実行結果を判定
                if (result == 1) {
                    out.println("<p>ユーザー登録が完了しました。</p>");
                } else {
                    out.println("<p>ユーザー登録に失敗しました。</p>");
                }

                // データベースを切断
                pstmt.close();
                conn.close();

            } catch (ClassNotFoundException e) {
                out.println("<p>ClassNotFoundException: " + e.getMessage() + "</p>");
            } catch (SQLException e) {
                out.println("<p>SQLException: " + e.getMessage() + "</p>");
            }
            %>

            <p><a href="login.jsp" class="link">ログインページへ戻る</a></p>

        </div><!-- /wrapper -->

    </div><!-- home -->

</body>
</html>
