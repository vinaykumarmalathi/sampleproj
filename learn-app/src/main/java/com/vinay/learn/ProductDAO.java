package com.vinay.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class ProductDAO {

	public List<Products> getProductDetails() {

		
		List<Products> list = new ArrayList<>();
		int id = 1;
		String name = "HP i3";

		// ADD JAR TO CLASSS PATH
		Connection con = null;
		try {
			// 1. register class
			// Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. get connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductService", "root", "Mvk@123");

			con.setAutoCommit(false);

			// 3 .craete statement
			PreparedStatement ps = con
					.prepareStatement("select * from products_tbl");

			// 4. execute quyery
			ResultSet rs = ps.executeQuery();

			// get data from rs
			while (rs.next()) {

				Products p = new Products();
				p.setProductId(rs.getInt(1));
				p.setProductName(rs.getString(2));
				p.setProductCompany(rs.getString(3));
				p.setProductCost(rs.getLong(4));
				p.setProductDesc(rs.getString(5));
				p.setProductCategrory(rs.getString(6));

				list.add(p);
			}
			rs.close();

			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				// con.commit();

				con.rollback();

				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;

	}

}
