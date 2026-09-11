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
public class Step1_TBox_DB_Run_SQL_Statement_c28069f0 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_c28069f0() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_3 = 0;
			Connection VERINTQLABConn_3 = null;
			Statement VERINTQLABStmt_3 = null;
			ResultSet VERINTQLABRs_3 = null;
			try {
				VERINTQLABConn_3 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_3 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_3 = VERINTQLABConn_3.createStatement();
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.ichemployee where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.ichemployee where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_3 = VERINTQLABStmt_3.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PRS1REP0011', 'RSS11', 'Rep11', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0011', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRS1REP0011', 'RSS11', 'Rep11', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0011', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_3);
				System.out.println("----");
		
				if (VERINTQLABRs_3 != null) { try { VERINTQLABRs_3.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_3 = null; }
				VERINTQLABRs_3 = VERINTQLABStmt_3.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';");
				StringBuilder _dbOut_3_10 = new StringBuilder();
				boolean _dbHasRow_3_10 = false;
				if (VERINTQLABRs_3.next()) {
					_dbHasRow_3_10 = true;
					java.sql.ResultSetMetaData _dbMeta_3_10 = VERINTQLABRs_3.getMetaData();
					int _dbCols_3_10 = _dbMeta_3_10.getColumnCount();
					var_P_1 = VERINTQLABRs_3.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';");
					}
					for (int _c = 1; _c <= _dbCols_3_10; _c++) {
						if (_c > 1) _dbOut_3_10.append(",");
						_dbOut_3_10.append(_dbMeta_3_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
					}
					while (VERINTQLABRs_3.next()) {
						_dbOut_3_10.append(" | ");
						for (int _c = 1; _c <= _dbCols_3_10; _c++) {
							if (_c > 1) _dbOut_3_10.append(",");
							_dbOut_3_10.append(_dbMeta_3_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0011';" + " = " + (_dbHasRow_3_10 ? _dbOut_3_10.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_3 != null) { try { VERINTQLABRs_3.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_3 = null; }
				VERINTQLABRs_3 = VERINTQLABStmt_3.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_3_11 = new StringBuilder();
				boolean _dbHasRow_3_11 = false;
				if (VERINTQLABRs_3.next()) {
					_dbHasRow_3_11 = true;
					java.sql.ResultSetMetaData _dbMeta_3_11 = VERINTQLABRs_3.getMetaData();
					int _dbCols_3_11 = _dbMeta_3_11.getColumnCount();
					var_Success = VERINTQLABRs_3.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_3_11; _c++) {
						if (_c > 1) _dbOut_3_11.append(",");
						_dbOut_3_11.append(_dbMeta_3_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
					}
					while (VERINTQLABRs_3.next()) {
						_dbOut_3_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_3_11; _c++) {
							if (_c > 1) _dbOut_3_11.append(",");
							_dbOut_3_11.append(_dbMeta_3_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_3_11 ? _dbOut_3_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_3 != null) { try { VERINTQLABRs_3.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_3 = null; }
				VERINTQLABRs_3 = VERINTQLABStmt_3.executeQuery("Select rec_status  from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
				StringBuilder _dbOut_3_12 = new StringBuilder();
				boolean _dbHasRow_3_12 = false;
				if (VERINTQLABRs_3.next()) {
					_dbHasRow_3_12 = true;
					java.sql.ResultSetMetaData _dbMeta_3_12 = VERINTQLABRs_3.getMetaData();
					int _dbCols_3_12 = _dbMeta_3_12.getColumnCount();
					var_Success = VERINTQLABRs_3.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';");
					}
					for (int _c = 1; _c <= _dbCols_3_12; _c++) {
						if (_c > 1) _dbOut_3_12.append(",");
						_dbOut_3_12.append(_dbMeta_3_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
					}
					while (VERINTQLABRs_3.next()) {
						_dbOut_3_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_3_12; _c++) {
							if (_c > 1) _dbOut_3_12.append(",");
							_dbOut_3_12.append(_dbMeta_3_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_3.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0011';" + " = " + (_dbHasRow_3_12 ? _dbOut_3_12.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_3 != null) try { VERINTQLABRs_3.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_3 != null) try { VERINTQLABStmt_3.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_3 != null) try { VERINTQLABConn_3.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
