import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import static io.testgrid.enums.KeyboardKeys.*;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import org.openqa.selenium.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static io.testgrid.baseClass.driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@Listeners(TestListener.class)
public class Step1_TBox_DB_Run_SQL_Statement_a959c75d extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_a959c75d() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] // Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] 	System.setProperty("http.proxyHost", var_Tunnel_Ip);
		// [DISABLED] 	System.setProperty("http.proxyPort", var_Tunnel_Port);
		// [DISABLED] 	var_P_1 = "";
		// [DISABLED] 	var_Success = "";
		// [DISABLED] 	var_Verint_Qlab_Rows_4 = 0;
		// [DISABLED] 	Connection VERINTQLABConn_4 = null;
		// [DISABLED] 	Statement VERINTQLABStmt_4 = null;
		// [DISABLED] 	ResultSet VERINTQLABRs_4 = null;
		// [DISABLED] 	try {
		// [DISABLED] 		VERINTQLABConn_4 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
		// [DISABLED] 		System.out.println("Connected to database: VERINT QLAB");
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABConn_4 == null) {
		// [DISABLED] 			throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
		// [DISABLED] 		}
		// [DISABLED] 		VERINTQLABStmt_4 = VERINTQLABConn_4.createStatement();
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.ichemployee where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployee where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeestatus where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.stg_ich_employeedelta;");
		// [DISABLED] 		System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
		// [DISABLED] 		System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_4 = VERINTQLABStmt_4.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PRS1REP0011', 'RSS11', 'Rep11', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0011', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRS1REP0011', 'RSS11', 'Rep11', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0011', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_4);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_4 != null) { try { VERINTQLABRs_4.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_4 = null; }
		// [DISABLED] 		VERINTQLABRs_4 = VERINTQLABStmt_4.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';");
		// [DISABLED] 		StringBuilder _dbOut_4_10 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_4_10 = false;
		// [DISABLED] 		if (VERINTQLABRs_4.next()) {
		// [DISABLED] 			_dbHasRow_4_10 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_4_10 = VERINTQLABRs_4.getMetaData();
		// [DISABLED] 			int _dbCols_4_10 = _dbMeta_4_10.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_4.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_4_10; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_4_10.append(",");
		// [DISABLED] 				_dbOut_4_10.append(_dbMeta_4_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_4.next()) {
		// [DISABLED] 				_dbOut_4_10.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_4_10; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_4_10.append(",");
		// [DISABLED] 					_dbOut_4_10.append(_dbMeta_4_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';" + " = " + (_dbHasRow_4_10 ? _dbOut_4_10.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_4 != null) { try { VERINTQLABRs_4.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_4 = null; }
		// [DISABLED] 		VERINTQLABRs_4 = VERINTQLABStmt_4.executeQuery("SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 		StringBuilder _dbOut_4_11 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_4_11 = false;
		// [DISABLED] 		if (VERINTQLABRs_4.next()) {
		// [DISABLED] 			_dbHasRow_4_11 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_4_11 = VERINTQLABRs_4.getMetaData();
		// [DISABLED] 			int _dbCols_4_11 = _dbMeta_4_11.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_4.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_4_11; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_4_11.append(",");
		// [DISABLED] 				_dbOut_4_11.append(_dbMeta_4_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_4.next()) {
		// [DISABLED] 				_dbOut_4_11.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_4_11; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_4_11.append(",");
		// [DISABLED] 					_dbOut_4_11.append(_dbMeta_4_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_4_11 ? _dbOut_4_11.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_4 != null) { try { VERINTQLABRs_4.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_4 = null; }
		// [DISABLED] 		VERINTQLABRs_4 = VERINTQLABStmt_4.executeQuery("Select rec_status  from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
		// [DISABLED] 		StringBuilder _dbOut_4_12 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_4_12 = false;
		// [DISABLED] 		if (VERINTQLABRs_4.next()) {
		// [DISABLED] 			_dbHasRow_4_12 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_4_12 = VERINTQLABRs_4.getMetaData();
		// [DISABLED] 			int _dbCols_4_12 = _dbMeta_4_12.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_4.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_4_12; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_4_12.append(",");
		// [DISABLED] 				_dbOut_4_12.append(_dbMeta_4_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_4.next()) {
		// [DISABLED] 				_dbOut_4_12.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_4_12; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_4_12.append(",");
		// [DISABLED] 					_dbOut_4_12.append(_dbMeta_4_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_4.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';" + " = " + (_dbHasRow_4_12 ? _dbOut_4_12.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 	} catch (SQLException e) {
		// [DISABLED] 		System.out.println("Database operation failed: " + e.getMessage());
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		e.printStackTrace(new java.io.PrintWriter(System.out, true));
		// [DISABLED] 		throw new RuntimeException(e);
		// [DISABLED] 	} finally {
		// [DISABLED] 		if (VERINTQLABRs_4 != null) try { VERINTQLABRs_4.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABStmt_4 != null) try { VERINTQLABStmt_4.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABConn_4 != null) try { VERINTQLABConn_4.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 	}
		// [DISABLED] END_CUSTOM_SCRIPT;
	}
}
