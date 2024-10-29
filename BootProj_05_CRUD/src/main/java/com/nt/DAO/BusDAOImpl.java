package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Bus;

@Repository
public class BusDAOImpl implements IBusDAO {
	private final String INSERTION_QUERY = "INSERT INTO BUSMANAGEMENT (BusNo, BusName, BusColor, TicketPrice, StartFrom, Destination) VALUES(?,?,?,?,?,?)";
	private final String RETRIVE_DATA = "SELECT * FROM BUSMANAGEMENT";

	@Autowired
	private DataSource ds;

	@Override
	public int insert(Bus bus) {
		int rowUpdated = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERTION_QUERY);
			ps.setInt(1, bus.getBusNo());
			ps.setString(2, bus.getBusName());
			ps.setString(3, bus.getBusColor());
			ps.setDouble(4, bus.getTicketPrice());
			ps.setString(5, bus.getStartsFrom());
			ps.setString(6, bus.getEndsTo());

			rowUpdated = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpdated;
	}

	public List<Bus> retriveBusData() {
		List<Bus> busList = new ArrayList<Bus>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(RETRIVE_DATA);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Bus bus = new Bus();
				bus.setBusNo(rs.getInt(1));
				bus.setBusName(rs.getString(2));
				bus.setBusColor(rs.getString(3));
				bus.setTicketPrice(rs.getDouble(4));
				bus.setStartsFrom(rs.getString(5));
				bus.setEndsTo(rs.getString(6));

				busList.add(bus);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return busList;
	}

}
