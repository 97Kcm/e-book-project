package com.test5;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DBTryCatch {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // DB 연결 생성
            conn = DriverManager.getConnection("//localhost:3306/web_board_db", "root", "1234");

            // 작업 수행
            log.info("Connected to the database successfully");

        } catch (SQLException e) {
            log.error(e);
            // 예외 처리
        } finally {
            // DB 연결 해제
            if (conn != null) {
                try {
                    conn.close();
                    log.info("Connection closed successfully");
                } catch (SQLException e) {
                    log.error(e);
                    // 예외 처리
                }
            }
        }
        log.info("Connection established");
    }

}
