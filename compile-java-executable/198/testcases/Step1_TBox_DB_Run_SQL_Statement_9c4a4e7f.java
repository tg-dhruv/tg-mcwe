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
public class Step1_TBox_DB_Run_SQL_Statement_9c4a4e7f extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_9c4a4e7f() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] // Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] 	System.setProperty("http.proxyHost", var_Tunnel_Ip);
		// [DISABLED] 	System.setProperty("http.proxyPort", var_Tunnel_Port);
		// [DISABLED] 	var_P_1 = "";
		// [DISABLED] 	var_Success = "";
		// [DISABLED] 	var_Verint_Qlab_Rows_2 = 0;
		// [DISABLED] 	Connection VERINTQLABConn_2 = null;
		// [DISABLED] 	Statement VERINTQLABStmt_2 = null;
		// [DISABLED] 	ResultSet VERINTQLABRs_2 = null;
		// [DISABLED] 	try {
		// [DISABLED] 		VERINTQLABConn_2 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
		// [DISABLED] 		System.out.println("Connected to database: VERINT QLAB");
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABConn_2 == null) {
		// [DISABLED] 			throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
		// [DISABLED] 		}
		// [DISABLED] 		VERINTQLABStmt_2 = VERINTQLABConn_2.createStatement();
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.ichemployee where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployee where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeestatus where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.stg_ich_employeedelta;");
		// [DISABLED] 		System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
		// [DISABLED] 		System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_2 = VERINTQLABStmt_2.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PRS1REP0010', 'RSS10', 'Rep10', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0010', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRS1REP0010', 'RSS10', 'Rep10', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0010', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_2);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_2 != null) { try { VERINTQLABRs_2.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_2 = null; }
		// [DISABLED] 		VERINTQLABRs_2 = VERINTQLABStmt_2.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';");
		// [DISABLED] 		StringBuilder _dbOut_2_10 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_2_10 = false;
		// [DISABLED] 		if (VERINTQLABRs_2.next()) {
		// [DISABLED] 			_dbHasRow_2_10 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_2_10 = VERINTQLABRs_2.getMetaData();
		// [DISABLED] 			int _dbCols_2_10 = _dbMeta_2_10.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_2.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_2_10; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_2_10.append(",");
		// [DISABLED] 				_dbOut_2_10.append(_dbMeta_2_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_2.next()) {
		// [DISABLED] 				_dbOut_2_10.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_2_10; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_2_10.append(",");
		// [DISABLED] 					_dbOut_2_10.append(_dbMeta_2_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';" + " = " + (_dbHasRow_2_10 ? _dbOut_2_10.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_2 != null) { try { VERINTQLABRs_2.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_2 = null; }
		// [DISABLED] 		VERINTQLABRs_2 = VERINTQLABStmt_2.executeQuery("SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 		StringBuilder _dbOut_2_11 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_2_11 = false;
		// [DISABLED] 		if (VERINTQLABRs_2.next()) {
		// [DISABLED] 			_dbHasRow_2_11 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_2_11 = VERINTQLABRs_2.getMetaData();
		// [DISABLED] 			int _dbCols_2_11 = _dbMeta_2_11.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_2.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_2_11; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_2_11.append(",");
		// [DISABLED] 				_dbOut_2_11.append(_dbMeta_2_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_2.next()) {
		// [DISABLED] 				_dbOut_2_11.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_2_11; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_2_11.append(",");
		// [DISABLED] 					_dbOut_2_11.append(_dbMeta_2_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_2_11 ? _dbOut_2_11.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_2 != null) { try { VERINTQLABRs_2.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_2 = null; }
		// [DISABLED] 		VERINTQLABRs_2 = VERINTQLABStmt_2.executeQuery("Select rec_status  from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
		// [DISABLED] 		StringBuilder _dbOut_2_12 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_2_12 = false;
		// [DISABLED] 		if (VERINTQLABRs_2.next()) {
		// [DISABLED] 			_dbHasRow_2_12 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_2_12 = VERINTQLABRs_2.getMetaData();
		// [DISABLED] 			int _dbCols_2_12 = _dbMeta_2_12.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_2.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_2_12; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_2_12.append(",");
		// [DISABLED] 				_dbOut_2_12.append(_dbMeta_2_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_2.next()) {
		// [DISABLED] 				_dbOut_2_12.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_2_12; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_2_12.append(",");
		// [DISABLED] 					_dbOut_2_12.append(_dbMeta_2_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_2.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';" + " = " + (_dbHasRow_2_12 ? _dbOut_2_12.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 	} catch (SQLException e) {
		// [DISABLED] 		System.out.println("Database operation failed: " + e.getMessage());
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		e.printStackTrace(new java.io.PrintWriter(System.out, true));
		// [DISABLED] 		throw new RuntimeException(e);
		// [DISABLED] 	} finally {
		// [DISABLED] 		if (VERINTQLABRs_2 != null) try { VERINTQLABRs_2.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABStmt_2 != null) try { VERINTQLABStmt_2.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABConn_2 != null) try { VERINTQLABConn_2.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 	}
		// [DISABLED] END_CUSTOM_SCRIPT;
	}
}
