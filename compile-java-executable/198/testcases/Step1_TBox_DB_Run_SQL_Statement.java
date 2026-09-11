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
public class Step1_TBox_DB_Run_SQL_Statement extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_1 = 0;
			Connection VERINTQLABConn_1 = null;
			Statement VERINTQLABStmt_1 = null;
			ResultSet VERINTQLABRs_1 = null;
			try {
				VERINTQLABConn_1 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_1 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_1 = VERINTQLABConn_1.createStatement();
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.ichemployee where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.ichemployee where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.fkemp2employeeid where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_1 = VERINTQLABStmt_1.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PRS1REP0010', 'RSS10', 'Rep10', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0010', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRS1REP0010', 'RSS10', 'Rep10', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTRS1REP0010', 'STest03', '3453452', NOW()::date -10, 'Apprentice Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_1);
				System.out.println("----");
		
				if (VERINTQLABRs_1 != null) { try { VERINTQLABRs_1.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_1 = null; }
				VERINTQLABRs_1 = VERINTQLABStmt_1.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';");
				StringBuilder _dbOut_1_10 = new StringBuilder();
				boolean _dbHasRow_1_10 = false;
				if (VERINTQLABRs_1.next()) {
					_dbHasRow_1_10 = true;
					java.sql.ResultSetMetaData _dbMeta_1_10 = VERINTQLABRs_1.getMetaData();
					int _dbCols_1_10 = _dbMeta_1_10.getColumnCount();
					var_P_1 = VERINTQLABRs_1.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';");
					}
					for (int _c = 1; _c <= _dbCols_1_10; _c++) {
						if (_c > 1) _dbOut_1_10.append(",");
						_dbOut_1_10.append(_dbMeta_1_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
					}
					while (VERINTQLABRs_1.next()) {
						_dbOut_1_10.append(" | ");
						for (int _c = 1; _c <= _dbCols_1_10; _c++) {
							if (_c > 1) _dbOut_1_10.append(",");
							_dbOut_1_10.append(_dbMeta_1_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRS1REP0010';" + " = " + (_dbHasRow_1_10 ? _dbOut_1_10.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_1 != null) { try { VERINTQLABRs_1.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_1 = null; }
				VERINTQLABRs_1 = VERINTQLABStmt_1.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_1_11 = new StringBuilder();
				boolean _dbHasRow_1_11 = false;
				if (VERINTQLABRs_1.next()) {
					_dbHasRow_1_11 = true;
					java.sql.ResultSetMetaData _dbMeta_1_11 = VERINTQLABRs_1.getMetaData();
					int _dbCols_1_11 = _dbMeta_1_11.getColumnCount();
					var_Success = VERINTQLABRs_1.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_1_11; _c++) {
						if (_c > 1) _dbOut_1_11.append(",");
						_dbOut_1_11.append(_dbMeta_1_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
					}
					while (VERINTQLABRs_1.next()) {
						_dbOut_1_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_1_11; _c++) {
							if (_c > 1) _dbOut_1_11.append(",");
							_dbOut_1_11.append(_dbMeta_1_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_1_11 ? _dbOut_1_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_1 != null) { try { VERINTQLABRs_1.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_1 = null; }
				VERINTQLABRs_1 = VERINTQLABStmt_1.executeQuery("Select rec_status  from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
				StringBuilder _dbOut_1_12 = new StringBuilder();
				boolean _dbHasRow_1_12 = false;
				if (VERINTQLABRs_1.next()) {
					_dbHasRow_1_12 = true;
					java.sql.ResultSetMetaData _dbMeta_1_12 = VERINTQLABRs_1.getMetaData();
					int _dbCols_1_12 = _dbMeta_1_12.getColumnCount();
					var_Success = VERINTQLABRs_1.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';");
					}
					for (int _c = 1; _c <= _dbCols_1_12; _c++) {
						if (_c > 1) _dbOut_1_12.append(",");
						_dbOut_1_12.append(_dbMeta_1_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
					}
					while (VERINTQLABRs_1.next()) {
						_dbOut_1_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_1_12; _c++) {
							if (_c > 1) _dbOut_1_12.append(",");
							_dbOut_1_12.append(_dbMeta_1_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_1.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRS1REP0010';" + " = " + (_dbHasRow_1_12 ? _dbOut_1_12.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_1 != null) try { VERINTQLABRs_1.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_1 != null) try { VERINTQLABStmt_1.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_1 != null) try { VERINTQLABConn_1.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
