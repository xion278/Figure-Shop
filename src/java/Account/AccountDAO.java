/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class AccountDAO {
        public AccountDTO checkAccountExist(String username) {
        String query = "select * from account where [user] =?";
        try {
            Connection conn = DBUtils.getConnection();//mo ket noi vs sql server
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new AccountDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void signup(String username, String password) {
        String query = "insert into account\n "
                + "values(?,?,0,0)";
        try {
            Connection conn = DBUtils.getConnection();//mo ket noi vs sql server
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
