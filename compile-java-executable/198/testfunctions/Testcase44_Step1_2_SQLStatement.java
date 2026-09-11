import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class testcase44_step1_2_sqlstatement {

	public static void testcase44_step1_2_sqlstatement() {
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_5 = 0;
			Connection VERINTQLABConn_5 = null;
			Statement VERINTQLABStmt_5 = null;
			ResultSet VERINTQLABRs_5 = null;
			try {
				VERINTQLABConn_5 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_5 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_5 = VERINTQLABConn_5.createStatement();
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.ichemployee where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.ichemployee where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.fkemp2employeeid where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid ='PHS1REP0044';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PHS1REP0044';" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_5 = VERINTQLABStmt_5.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode,   issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PHS1REP0044', 'HSS1', 'REP0044', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHS1REP0044', 'CTest03', '3453452', '2022-04-02', 'Dedicated Expert, Care SMB', 'Active', 'Test', 'CO-Colorado Springs Call Center',   'Test', '', 'Test', 'Test', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PHS1REP0044', 'HSS1', 'REP0044', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHS1REP0044', 'CTest03', '3453452', '2022-04-02', 'Dedicated Expert, Care SMB', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', 'Test', 'Test', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_5);
				System.out.println("----");
		
				if (VERINTQLABRs_5 != null) { try { VERINTQLABRs_5.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_5 = null; }
				VERINTQLABRs_5 = VERINTQLABStmt_5.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PHS1REP0044';");
				StringBuilder _dbOut_5_10 = new StringBuilder();
				boolean _dbHasRow_5_10 = false;
				if (VERINTQLABRs_5.next()) {
					_dbHasRow_5_10 = true;
					java.sql.ResultSetMetaData _dbMeta_5_10 = VERINTQLABRs_5.getMetaData();
					int _dbCols_5_10 = _dbMeta_5_10.getColumnCount();
					var_P_1 = VERINTQLABRs_5.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PHS1REP0044';");
					}
					for (int _c = 1; _c <= _dbCols_5_10; _c++) {
						if (_c > 1) _dbOut_5_10.append(",");
						_dbOut_5_10.append(_dbMeta_5_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
					}
					while (VERINTQLABRs_5.next()) {
						_dbOut_5_10.append(" | ");
						for (int _c = 1; _c <= _dbCols_5_10; _c++) {
							if (_c > 1) _dbOut_5_10.append(",");
							_dbOut_5_10.append(_dbMeta_5_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PHS1REP0044';" + " = " + (_dbHasRow_5_10 ? _dbOut_5_10.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_5 != null) { try { VERINTQLABRs_5.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_5 = null; }
				VERINTQLABRs_5 = VERINTQLABStmt_5.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_5_11 = new StringBuilder();
				boolean _dbHasRow_5_11 = false;
				if (VERINTQLABRs_5.next()) {
					_dbHasRow_5_11 = true;
					java.sql.ResultSetMetaData _dbMeta_5_11 = VERINTQLABRs_5.getMetaData();
					int _dbCols_5_11 = _dbMeta_5_11.getColumnCount();
					var_Success = VERINTQLABRs_5.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_5_11; _c++) {
						if (_c > 1) _dbOut_5_11.append(",");
						_dbOut_5_11.append(_dbMeta_5_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
					}
					while (VERINTQLABRs_5.next()) {
						_dbOut_5_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_5_11; _c++) {
							if (_c > 1) _dbOut_5_11.append(",");
							_dbOut_5_11.append(_dbMeta_5_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_5_11 ? _dbOut_5_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_5 != null) { try { VERINTQLABRs_5.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_5 = null; }
				VERINTQLABRs_5 = VERINTQLABStmt_5.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PHS1REP0044';");
				StringBuilder _dbOut_5_12 = new StringBuilder();
				boolean _dbHasRow_5_12 = false;
				if (VERINTQLABRs_5.next()) {
					_dbHasRow_5_12 = true;
					java.sql.ResultSetMetaData _dbMeta_5_12 = VERINTQLABRs_5.getMetaData();
					int _dbCols_5_12 = _dbMeta_5_12.getColumnCount();
					var_Success = VERINTQLABRs_5.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PHS1REP0044';");
					}
					for (int _c = 1; _c <= _dbCols_5_12; _c++) {
						if (_c > 1) _dbOut_5_12.append(",");
						_dbOut_5_12.append(_dbMeta_5_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
					}
					while (VERINTQLABRs_5.next()) {
						_dbOut_5_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_5_12; _c++) {
							if (_c > 1) _dbOut_5_12.append(",");
							_dbOut_5_12.append(_dbMeta_5_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_5.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PHS1REP0044';" + " = " + (_dbHasRow_5_12 ? _dbOut_5_12.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_5 != null) try { VERINTQLABRs_5.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_5 != null) try { VERINTQLABStmt_5.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_5 != null) try { VERINTQLABConn_5.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
