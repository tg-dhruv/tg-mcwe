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
public class Step1_TBox_DB_Run_SQL_Statement_63f682a1 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_63f682a1() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_12 = 0;
			Connection VERINTQLABConn_12 = null;
			Statement VERINTQLABStmt_12 = null;
			ResultSet VERINTQLABRs_12 = null;
			try {
				VERINTQLABConn_12 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_12 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_12 = VERINTQLABConn_12.createStatement();
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichemployee where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.ichemployee where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid ='PLTCOACH0002';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PLTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichloa where employeeid = 'LTCOACH0002';");
				System.out.println("delete from ich.ichloa where employeeid = 'LTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.hridsemployeeprofile where employeeid = 'LTCOACH0002';");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid = 'LTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("delete from ich.ichloa_errors where employeeid = 'LTCOACH0002';");
				System.out.println("delete from ich.ichloa_errors where employeeid = 'LTCOACH0002';" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_12 = VERINTQLABStmt_12.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PLTCOACH0002', 'FLTLOA', 'LCoach0002', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTLTLOACOACH0002', 'STest03', '3453452', '2022-04-02',   'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'TFB Chat', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -39, CURRENT_USER, NOW()::date -39, CURRENT_USER, NOW()::date -39, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PLTCOACH0002', 'FLTLOA', 'LCoach0002', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTLTLOACOACH0002', 'STest03', '3453452', '2022-04-02', 'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'TFB Chat', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -39, CURRENT_USER, NOW()::date -39, CURRENT_USER, NOW()::date -39, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_12);
				System.out.println("----");
		
				if (VERINTQLABRs_12 != null) { try { VERINTQLABRs_12.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_12 = null; }
				VERINTQLABRs_12 = VERINTQLABStmt_12.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTCOACH0002';");
				StringBuilder _dbOut_12_11 = new StringBuilder();
				boolean _dbHasRow_12_11 = false;
				if (VERINTQLABRs_12.next()) {
					_dbHasRow_12_11 = true;
					java.sql.ResultSetMetaData _dbMeta_12_11 = VERINTQLABRs_12.getMetaData();
					int _dbCols_12_11 = _dbMeta_12_11.getColumnCount();
					var_P_1 = VERINTQLABRs_12.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTCOACH0002';");
					}
					for (int _c = 1; _c <= _dbCols_12_11; _c++) {
						if (_c > 1) _dbOut_12_11.append(",");
						_dbOut_12_11.append(_dbMeta_12_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
					}
					while (VERINTQLABRs_12.next()) {
						_dbOut_12_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_12_11; _c++) {
							if (_c > 1) _dbOut_12_11.append(",");
							_dbOut_12_11.append(_dbMeta_12_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PLTCOACH0002';" + " = " + (_dbHasRow_12_11 ? _dbOut_12_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_12 != null) { try { VERINTQLABRs_12.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_12 = null; }
				VERINTQLABRs_12 = VERINTQLABStmt_12.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_12_12 = new StringBuilder();
				boolean _dbHasRow_12_12 = false;
				if (VERINTQLABRs_12.next()) {
					_dbHasRow_12_12 = true;
					java.sql.ResultSetMetaData _dbMeta_12_12 = VERINTQLABRs_12.getMetaData();
					int _dbCols_12_12 = _dbMeta_12_12.getColumnCount();
					var_Success = VERINTQLABRs_12.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_12_12; _c++) {
						if (_c > 1) _dbOut_12_12.append(",");
						_dbOut_12_12.append(_dbMeta_12_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
					}
					while (VERINTQLABRs_12.next()) {
						_dbOut_12_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_12_12; _c++) {
							if (_c > 1) _dbOut_12_12.append(",");
							_dbOut_12_12.append(_dbMeta_12_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_12_12 ? _dbOut_12_12.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_12 != null) { try { VERINTQLABRs_12.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_12 = null; }
				VERINTQLABRs_12 = VERINTQLABStmt_12.executeQuery("select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTCOACH0002';");
				StringBuilder _dbOut_12_13 = new StringBuilder();
				boolean _dbHasRow_12_13 = false;
				if (VERINTQLABRs_12.next()) {
					_dbHasRow_12_13 = true;
					java.sql.ResultSetMetaData _dbMeta_12_13 = VERINTQLABRs_12.getMetaData();
					int _dbCols_12_13 = _dbMeta_12_13.getColumnCount();
					var_Success = VERINTQLABRs_12.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTCOACH0002';");
					}
					for (int _c = 1; _c <= _dbCols_12_13; _c++) {
						if (_c > 1) _dbOut_12_13.append(",");
						_dbOut_12_13.append(_dbMeta_12_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
					}
					while (VERINTQLABRs_12.next()) {
						_dbOut_12_13.append(" | ");
						for (int _c = 1; _c <= _dbCols_12_13; _c++) {
							if (_c > 1) _dbOut_12_13.append(",");
							_dbOut_12_13.append(_dbMeta_12_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_12.getString(_c));
						}
					}
				}
				System.out.println("select rec_status from ich.stg_ich_employeedelta_hist where employeeid = 'PLTCOACH0002';" + " = " + (_dbHasRow_12_13 ? _dbOut_12_13.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_12 != null) try { VERINTQLABRs_12.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_12 != null) try { VERINTQLABStmt_12.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_12 != null) try { VERINTQLABConn_12.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
