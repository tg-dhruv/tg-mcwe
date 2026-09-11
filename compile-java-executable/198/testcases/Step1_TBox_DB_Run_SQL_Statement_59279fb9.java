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
public class Step1_TBox_DB_Run_SQL_Statement_59279fb9 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_59279fb9() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_11 = 0;
			Connection VERINTQLABConn_11 = null;
			Statement VERINTQLABStmt_11 = null;
			ResultSet VERINTQLABRs_11 = null;
			try {
				VERINTQLABConn_11 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_11 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_11 = VERINTQLABConn_11.createStatement();
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichemployee where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.ichemployee where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid ='PLTMANAGER0001';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PLTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichloa where employeeid = 'LTMANAGER0001';");
				System.out.println("delete from ich.ichloa where employeeid = 'LTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.hridsemployeeprofile where employeeid = 'LTMANAGER0001';");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid = 'LTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("delete from ich.ichloa_errors where employeeid = 'LTMANAGER0001';");
				System.out.println("delete from ich.ichloa_errors where employeeid = 'LTMANAGER0001';" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_11 = VERINTQLABStmt_11.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PLTMANAGER0001', 'FLTLOA', 'LManager0001', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTLTLOAMANAGER0001', 'STest03', '3453452', '2022-04-02',   'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'TFB Chat', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -39, CURRENT_USER, NOW()::date -39, CURRENT_USER, NOW()::date -39, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PLTMANAGER0001', 'FLTLOA', 'LManager0001', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTLTLOAMANAGER0001', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'TFB Chat', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -39, CURRENT_USER, NOW()::date -39, CURRENT_USER, NOW()::date -39, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_11);
				System.out.println("----");
		
				if (VERINTQLABRs_11 != null) { try { VERINTQLABRs_11.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_11 = null; }
				VERINTQLABRs_11 = VERINTQLABStmt_11.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTMANAGER0001';");
				StringBuilder _dbOut_11_11 = new StringBuilder();
				boolean _dbHasRow_11_11 = false;
				if (VERINTQLABRs_11.next()) {
					_dbHasRow_11_11 = true;
					java.sql.ResultSetMetaData _dbMeta_11_11 = VERINTQLABRs_11.getMetaData();
					int _dbCols_11_11 = _dbMeta_11_11.getColumnCount();
					var_P_1 = VERINTQLABRs_11.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTMANAGER0001';");
					}
					for (int _c = 1; _c <= _dbCols_11_11; _c++) {
						if (_c > 1) _dbOut_11_11.append(",");
						_dbOut_11_11.append(_dbMeta_11_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
					}
					while (VERINTQLABRs_11.next()) {
						_dbOut_11_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_11_11; _c++) {
							if (_c > 1) _dbOut_11_11.append(",");
							_dbOut_11_11.append(_dbMeta_11_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTMANAGER0001';" + " = " + (_dbHasRow_11_11 ? _dbOut_11_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_11 != null) { try { VERINTQLABRs_11.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_11 = null; }
				VERINTQLABRs_11 = VERINTQLABStmt_11.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_11_12 = new StringBuilder();
				boolean _dbHasRow_11_12 = false;
				if (VERINTQLABRs_11.next()) {
					_dbHasRow_11_12 = true;
					java.sql.ResultSetMetaData _dbMeta_11_12 = VERINTQLABRs_11.getMetaData();
					int _dbCols_11_12 = _dbMeta_11_12.getColumnCount();
					var_Success = VERINTQLABRs_11.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_11_12; _c++) {
						if (_c > 1) _dbOut_11_12.append(",");
						_dbOut_11_12.append(_dbMeta_11_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
					}
					while (VERINTQLABRs_11.next()) {
						_dbOut_11_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_11_12; _c++) {
							if (_c > 1) _dbOut_11_12.append(",");
							_dbOut_11_12.append(_dbMeta_11_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_11_12 ? _dbOut_11_12.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_11 != null) { try { VERINTQLABRs_11.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_11 = null; }
				VERINTQLABRs_11 = VERINTQLABStmt_11.executeQuery("select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTMANAGER0001';");
				StringBuilder _dbOut_11_13 = new StringBuilder();
				boolean _dbHasRow_11_13 = false;
				if (VERINTQLABRs_11.next()) {
					_dbHasRow_11_13 = true;
					java.sql.ResultSetMetaData _dbMeta_11_13 = VERINTQLABRs_11.getMetaData();
					int _dbCols_11_13 = _dbMeta_11_13.getColumnCount();
					var_Success = VERINTQLABRs_11.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTMANAGER0001';");
					}
					for (int _c = 1; _c <= _dbCols_11_13; _c++) {
						if (_c > 1) _dbOut_11_13.append(",");
						_dbOut_11_13.append(_dbMeta_11_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
					}
					while (VERINTQLABRs_11.next()) {
						_dbOut_11_13.append(" | ");
						for (int _c = 1; _c <= _dbCols_11_13; _c++) {
							if (_c > 1) _dbOut_11_13.append(",");
							_dbOut_11_13.append(_dbMeta_11_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_11.getString(_c));
						}
					}
				}
				System.out.println("select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTMANAGER0001';" + " = " + (_dbHasRow_11_13 ? _dbOut_11_13.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_11 != null) try { VERINTQLABRs_11.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_11 != null) try { VERINTQLABStmt_11.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_11 != null) try { VERINTQLABConn_11.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
