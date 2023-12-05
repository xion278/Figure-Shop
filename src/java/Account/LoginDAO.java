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
public class LoginDAO {

    public AccountDTO login(String username, String password) {
        String sql = "SELECT username, password FROM account "
                + " WHERE username = ? and password = ?";
        try {
            Connection conn = DBUtils.getConnection();//mo ket noi vs sql server
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AccountDTO accountDTO = new AccountDTO();

                accountDTO.setUsername(rs.getString("username"));
                accountDTO.setPassword(rs.getString("password"));

                return accountDTO;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
