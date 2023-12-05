/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Account.AccountDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

/**
 *
 * @author trong
 */
public class ProductDAO {

    Connection conn = null;//ket noi vs sql server
    PreparedStatement ps = null;//nem query sang sql server
    ResultSet rs = null;//nhan kq tra ve

    public List<ProductDTO> getAllProduct() {
        List<ProductDTO> list = new ArrayList<>();
        String query = "select * from product";
        try {
            conn = DBUtils.getConnection();//mo ket noi vs sql server
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductDTO(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }

        return list;
    }    

    /*    public static void main(String[] args) { //check co du lieu trong sql hay ko
        DAO dao = new DAO();
        List<Product> list = dao.getAllProduct();
        for (Product o : list) {
            System.out.println(o);
        }// run xem co in ra het san pham hay ko
    }*/
}
