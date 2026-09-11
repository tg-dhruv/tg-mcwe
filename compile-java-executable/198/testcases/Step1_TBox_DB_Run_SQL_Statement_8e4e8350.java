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
public class Step1_TBox_DB_Run_SQL_Statement_8e4e8350 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_8e4e8350() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_19 = 0;
			Connection VERINTQLABConn_19 = null;
			Statement VERINTQLABStmt_19 = null;
			ResultSet VERINTQLABRs_19 = null;
			try {
				VERINTQLABConn_19 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_19 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_19 = VERINTQLABConn_19.createStatement();
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichemployee where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.ichemployee where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichemployeeorgrole where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichemployeestatus where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.ichemployeestatus where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichloa where employeeid = 'HRIDTMANAGER0042';");
				System.out.println("delete from ich.ichloa where employeeid = 'HRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.hridsemployeeprofile where employeeid = 'HRIDTMANAGER0042';");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid = 'HRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.ichloa_errors where employeeid = 'HRIDTMANAGER0042';");
				System.out.println("delete from ich.ichloa_errors where employeeid = 'HRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.fkemp2employeeid where employeeid ='PHRIDTMANAGER0042';");
				System.out.println("delete from ich.fkemp2employeeid where employeeid ='PHRIDTMANAGER0042';" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_19 = VERINTQLABStmt_19.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PHRIDTMANAGER0042', 'HRID', 'LTMANAGER0042', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHRIDTMANAGER0042', 'CTest03', '3453452', '2022-04-02', 'Training Manager', 'Active',   'Test', 'CO-Colorado Springs Call Center', 'Test', '', 'Test', 'Test', '2023-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10,   NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PHRIDTMANAGER0042', 'HRID', 'LTMANAGER0042', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHRIDTMANAGER0042', 'CTest03', '3453452', '2022-04-02', 'Training Manager', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', 'Test', 'Test', '2023-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_19);
				System.out.println("----");
		
				if (VERINTQLABRs_19 != null) { try { VERINTQLABRs_19.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_19 = null; }
				VERINTQLABRs_19 = VERINTQLABStmt_19.executeQuery("Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0042' ;");
				StringBuilder _dbOut_19_13 = new StringBuilder();
				boolean _dbHasRow_19_13 = false;
				if (VERINTQLABRs_19.next()) {
					_dbHasRow_19_13 = true;
					java.sql.ResultSetMetaData _dbMeta_19_13 = VERINTQLABRs_19.getMetaData();
					int _dbCols_19_13 = _dbMeta_19_13.getColumnCount();
					var_P_1 = VERINTQLABRs_19.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0042' ;");
					}
					for (int _c = 1; _c <= _dbCols_19_13; _c++) {
						if (_c > 1) _dbOut_19_13.append(",");
						_dbOut_19_13.append(_dbMeta_19_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
					}
					while (VERINTQLABRs_19.next()) {
						_dbOut_19_13.append(" | ");
						for (int _c = 1; _c <= _dbCols_19_13; _c++) {
							if (_c > 1) _dbOut_19_13.append(",");
							_dbOut_19_13.append(_dbMeta_19_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0042' ;" + " = " + (_dbHasRow_19_13 ? _dbOut_19_13.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_19 != null) { try { VERINTQLABRs_19.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_19 = null; }
				VERINTQLABRs_19 = VERINTQLABStmt_19.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_19_14 = new StringBuilder();
				boolean _dbHasRow_19_14 = false;
				if (VERINTQLABRs_19.next()) {
					_dbHasRow_19_14 = true;
					java.sql.ResultSetMetaData _dbMeta_19_14 = VERINTQLABRs_19.getMetaData();
					int _dbCols_19_14 = _dbMeta_19_14.getColumnCount();
					var_Success = VERINTQLABRs_19.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_19_14; _c++) {
						if (_c > 1) _dbOut_19_14.append(",");
						_dbOut_19_14.append(_dbMeta_19_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
					}
					while (VERINTQLABRs_19.next()) {
						_dbOut_19_14.append(" | ");
						for (int _c = 1; _c <= _dbCols_19_14; _c++) {
							if (_c > 1) _dbOut_19_14.append(",");
							_dbOut_19_14.append(_dbMeta_19_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_19_14 ? _dbOut_19_14.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_19 != null) { try { VERINTQLABRs_19.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_19 = null; }
				VERINTQLABRs_19 = VERINTQLABStmt_19.executeQuery("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0042';");
				StringBuilder _dbOut_19_15 = new StringBuilder();
				boolean _dbHasRow_19_15 = false;
				if (VERINTQLABRs_19.next()) {
					_dbHasRow_19_15 = true;
					java.sql.ResultSetMetaData _dbMeta_19_15 = VERINTQLABRs_19.getMetaData();
					int _dbCols_19_15 = _dbMeta_19_15.getColumnCount();
					var_Success = VERINTQLABRs_19.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0042';");
					}
					for (int _c = 1; _c <= _dbCols_19_15; _c++) {
						if (_c > 1) _dbOut_19_15.append(",");
						_dbOut_19_15.append(_dbMeta_19_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
					}
					while (VERINTQLABRs_19.next()) {
						_dbOut_19_15.append(" | ");
						for (int _c = 1; _c <= _dbCols_19_15; _c++) {
							if (_c > 1) _dbOut_19_15.append(",");
							_dbOut_19_15.append(_dbMeta_19_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_19.getString(_c));
						}
					}
				}
				System.out.println("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0042';" + " = " + (_dbHasRow_19_15 ? _dbOut_19_15.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_19 != null) try { VERINTQLABRs_19.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_19 != null) try { VERINTQLABStmt_19.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_19 != null) try { VERINTQLABConn_19.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
