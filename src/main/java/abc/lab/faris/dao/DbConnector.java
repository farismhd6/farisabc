package abc.lab.faris.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbConnector {

	Connection getDbConnection() throws SQLException, ClassNotFoundException;

}
