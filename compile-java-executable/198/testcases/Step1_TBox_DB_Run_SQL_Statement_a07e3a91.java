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
public class Step1_TBox_DB_Run_SQL_Statement_a07e3a91 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_a07e3a91() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, OTHER, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_21 = 0;
			Connection VERINTQLABConn_21 = null;
			Statement VERINTQLABStmt_21 = null;
			ResultSet VERINTQLABRs_21 = null;
			try {
				VERINTQLABConn_21 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_21 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_21 = VERINTQLABConn_21.createStatement();
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichemployee where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichloa where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');");
				System.out.println("delete from ich.ichloa where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.hridsemployeeprofile where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.ichloa_errors where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');");
				System.out.println("delete from ich.ichloa_errors where employeeid in ('HRIDTMANAGER0044','HRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.fkemp2employeeid where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');");
				System.out.println("delete from ich.fkemp2employeeid where employeeid in ('PHRIDTMANAGER0044','PHRIDSCOACH044');" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("-- Training Manager  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PHRIDTMANAGER0044', 'HRID', 'LTMANAGER0044', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHRIDTMANAGER0044', 'CTest03', '3453452', '2022-04-02', 'Training Manager', 'Active',   'Test', 'CO-Colorado Springs Call Center', 'Test', '', 'Test', 'Test', '2023-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10,   NEXTVAL('ich.idseq'::regclass));");
				System.out.println("-- Training Manager INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PHRIDTMANAGER0044', 'HRID', 'LTMANAGER0044', 'PTTest01', '200401', 'Test', 'PTtestC03@t-mobile.com', 'NTHRIDTMANAGER0044', 'CTest03', '3453452', '2022-04-02', 'Training Manager', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', 'Test', 'Test', '2023-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_21 = VERINTQLABStmt_21.executeUpdate("--Direct To Manager Rep  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PHRIDSCOACH044', 'HRID', 'LCoach0044', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTHRIDCOACH0044', 'STest03', '3453452', '2022-04-02',   'DIRECT TO MANAGER REP', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Direct To Manager Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PHRIDSCOACH044', 'HRID', 'LCoach0044', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTHRIDCOACH0044', 'STest03', '3453452', '2022-04-02', 'DIRECT TO MANAGER REP', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_21);
				System.out.println("----");
		
				if (VERINTQLABRs_21 != null) { try { VERINTQLABRs_21.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_21 = null; }
				VERINTQLABRs_21 = VERINTQLABStmt_21.executeQuery("Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0044' ;");
				StringBuilder _dbOut_21_14 = new StringBuilder();
				boolean _dbHasRow_21_14 = false;
				if (VERINTQLABRs_21.next()) {
					_dbHasRow_21_14 = true;
					java.sql.ResultSetMetaData _dbMeta_21_14 = VERINTQLABRs_21.getMetaData();
					int _dbCols_21_14 = _dbMeta_21_14.getColumnCount();
					var_P_1 = VERINTQLABRs_21.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0044' ;");
					}
					for (int _c = 1; _c <= _dbCols_21_14; _c++) {
						if (_c > 1) _dbOut_21_14.append(",");
						_dbOut_21_14.append(_dbMeta_21_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
					}
					while (VERINTQLABRs_21.next()) {
						_dbOut_21_14.append(" | ");
						for (int _c = 1; _c <= _dbCols_21_14; _c++) {
							if (_c > 1) _dbOut_21_14.append(",");
							_dbOut_21_14.append(_dbMeta_21_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.stg_ich_employeedelta where employeeid = 'PHRIDTMANAGER0044' ;" + " = " + (_dbHasRow_21_14 ? _dbOut_21_14.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_21 != null) { try { VERINTQLABRs_21.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_21 = null; }
				VERINTQLABRs_21 = VERINTQLABStmt_21.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_21_15 = new StringBuilder();
				boolean _dbHasRow_21_15 = false;
				if (VERINTQLABRs_21.next()) {
					_dbHasRow_21_15 = true;
					java.sql.ResultSetMetaData _dbMeta_21_15 = VERINTQLABRs_21.getMetaData();
					int _dbCols_21_15 = _dbMeta_21_15.getColumnCount();
					var_Success = VERINTQLABRs_21.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_21_15; _c++) {
						if (_c > 1) _dbOut_21_15.append(",");
						_dbOut_21_15.append(_dbMeta_21_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
					}
					while (VERINTQLABRs_21.next()) {
						_dbOut_21_15.append(" | ");
						for (int _c = 1; _c <= _dbCols_21_15; _c++) {
							if (_c > 1) _dbOut_21_15.append(",");
							_dbOut_21_15.append(_dbMeta_21_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_21_15 ? _dbOut_21_15.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_21 != null) { try { VERINTQLABRs_21.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_21 = null; }
				VERINTQLABRs_21 = VERINTQLABStmt_21.executeQuery("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0044'; -- should be success");
				StringBuilder _dbOut_21_16 = new StringBuilder();
				boolean _dbHasRow_21_16 = false;
				if (VERINTQLABRs_21.next()) {
					_dbHasRow_21_16 = true;
					java.sql.ResultSetMetaData _dbMeta_21_16 = VERINTQLABRs_21.getMetaData();
					int _dbCols_21_16 = _dbMeta_21_16.getColumnCount();
					var_Success = VERINTQLABRs_21.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0044'; -- should be success");
					}
					for (int _c = 1; _c <= _dbCols_21_16; _c++) {
						if (_c > 1) _dbOut_21_16.append(",");
						_dbOut_21_16.append(_dbMeta_21_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
					}
					while (VERINTQLABRs_21.next()) {
						_dbOut_21_16.append(" | ");
						for (int _c = 1; _c <= _dbCols_21_16; _c++) {
							if (_c > 1) _dbOut_21_16.append(",");
							_dbOut_21_16.append(_dbMeta_21_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
						}
					}
				}
				System.out.println("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDTMANAGER0044'; -- should be success" + " = " + (_dbHasRow_21_16 ? _dbOut_21_16.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_21 != null) { try { VERINTQLABRs_21.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_21 = null; }
				VERINTQLABRs_21 = VERINTQLABStmt_21.executeQuery("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDSCOACH044'; -- should be success");
				StringBuilder _dbOut_21_17 = new StringBuilder();
				boolean _dbHasRow_21_17 = false;
				if (VERINTQLABRs_21.next()) {
					_dbHasRow_21_17 = true;
					java.sql.ResultSetMetaData _dbMeta_21_17 = VERINTQLABRs_21.getMetaData();
					int _dbCols_21_17 = _dbMeta_21_17.getColumnCount();
					var_Success = VERINTQLABRs_21.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDSCOACH044'; -- should be success");
					}
					for (int _c = 1; _c <= _dbCols_21_17; _c++) {
						if (_c > 1) _dbOut_21_17.append(",");
						_dbOut_21_17.append(_dbMeta_21_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
					}
					while (VERINTQLABRs_21.next()) {
						_dbOut_21_17.append(" | ");
						for (int _c = 1; _c <= _dbCols_21_17; _c++) {
							if (_c > 1) _dbOut_21_17.append(",");
							_dbOut_21_17.append(_dbMeta_21_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_21.getString(_c));
						}
					}
				}
				System.out.println("select rec_status from ich.stg_ich_employeedelta_hist where employeeid='PHRIDSCOACH044'; -- should be success" + " = " + (_dbHasRow_21_17 ? _dbOut_21_17.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_21 != null) try { VERINTQLABRs_21.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_21 != null) try { VERINTQLABStmt_21.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_21 != null) try { VERINTQLABConn_21.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
