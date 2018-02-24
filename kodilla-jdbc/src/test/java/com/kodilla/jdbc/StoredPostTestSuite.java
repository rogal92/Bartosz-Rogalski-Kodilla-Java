//package com.kodilla.jdbc;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import org.junit.Assert;
//
//public class StoredPostTestSuite {
//    @Test
//    public void testUpdateVipLevels() throws SQLException {
//        //given
//        DbManager dbManager = DbManager.getInstance();
//        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
//        Statement statement = dbManager.getConnection().createStatement();
//        statement.executeLargeUpdate(sqlUpdate);
//
//        //when
//        String sqlProcedureCall = "CALL UpdateVipLevels()";
//        statement.execute(sqlProcedureCall);
//
//        //then
//        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
//        ResultSet rs = statement.executeQuery(sqlCheckTable);
//        int howMany = -1;
//        if(rs.next()) {
//            howMany = rs.getInt("HOW_MANY");
//            Assert.assertEquals(0,howMany);
//        }
//    }
//}
