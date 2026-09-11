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
public class Step1_TBox_DB_Run_SQL_Statement_15bb3c11 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_15bb3c11() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_15 = 0;
			Connection VERINTQLABConn_15 = null;
			Statement VERINTQLABStmt_15 = null;
			ResultSet VERINTQLABRs_15 = null;
			try {
				VERINTQLABConn_15 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_15 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_15 = VERINTQLABConn_15.createStatement();
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ich_initialization_employees where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ich_initialization_employees where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichemployee where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichemployeehierarchy_20018  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichemployeehierarchy_20018 where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichloa where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichloa where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.hridsemployeeprofile where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichloa_errors where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichloa_errors where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.fkemp2employeeid where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.fkemp2employeeid where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichVerintUserProfileAPI where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichVerintUserProfileAPI where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichverintsupervisorapi where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichverintsupervisorapi where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.verintteamleadapi  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.verintteamleadapi where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.verintworkspaceapi  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.verintworkspaceapi where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.verintorgapi  where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.verintorgapi where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ichverintjobtitleapi where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ichverintjobtitleapi where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.ich_verintorg_error_records where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.ich_verintorg_error_records where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.stg_ich_employeedelta where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.stg_ich_employeedelta where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.hierarchy_trueup where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.hierarchy_trueup where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("delete from ich.hierarchy_st where employeeid in ('PRHCMR0020');");
				System.out.println("delete from ich.hierarchy_st where employeeid in ('PRHCMR0020');" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_15 = VERINTQLABStmt_15.executeUpdate("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname,  managerid, locationid, streamlineloginid, emailid, ntid,  samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive,  startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRHCMR0020', 'FRH0020', 'LMANAGER0020', 'PSTest01', '20012', 'Test', 'PStestMR0020@t-mobile.com', 'NTRHMR0020',  'STest01', '3453452',  '2025-01-01','Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', null, 'Test', '',  '2025-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, lineofbusiness, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PRHCMR0020', 'FRH0020', 'LMANAGER0020', 'PSTest01', '20012', 'Test', 'PStestMR0020@t-mobile.com', 'NTRHMR0020', 'STest01', '3453452', '2025-01-01','Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', null, 'Test', '', '2025-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_15);
				System.out.println("----");
		
				if (VERINTQLABRs_15 != null) { try { VERINTQLABRs_15.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_15 = null; }
				VERINTQLABRs_15 = VERINTQLABStmt_15.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRHCMR0020';");
				StringBuilder _dbOut_15_24 = new StringBuilder();
				boolean _dbHasRow_15_24 = false;
				if (VERINTQLABRs_15.next()) {
					_dbHasRow_15_24 = true;
					java.sql.ResultSetMetaData _dbMeta_15_24 = VERINTQLABRs_15.getMetaData();
					int _dbCols_15_24 = _dbMeta_15_24.getColumnCount();
					var_P_1 = VERINTQLABRs_15.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid ='PRHCMR0020';");
					}
					for (int _c = 1; _c <= _dbCols_15_24; _c++) {
						if (_c > 1) _dbOut_15_24.append(",");
						_dbOut_15_24.append(_dbMeta_15_24.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
					}
					while (VERINTQLABRs_15.next()) {
						_dbOut_15_24.append(" | ");
						for (int _c = 1; _c <= _dbCols_15_24; _c++) {
							if (_c > 1) _dbOut_15_24.append(",");
							_dbOut_15_24.append(_dbMeta_15_24.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid ='PRHCMR0020';" + " = " + (_dbHasRow_15_24 ? _dbOut_15_24.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_15 != null) { try { VERINTQLABRs_15.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_15 = null; }
				VERINTQLABRs_15 = VERINTQLABStmt_15.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_15_25 = new StringBuilder();
				boolean _dbHasRow_15_25 = false;
				if (VERINTQLABRs_15.next()) {
					_dbHasRow_15_25 = true;
					java.sql.ResultSetMetaData _dbMeta_15_25 = VERINTQLABRs_15.getMetaData();
					int _dbCols_15_25 = _dbMeta_15_25.getColumnCount();
					var_Success = VERINTQLABRs_15.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_15_25; _c++) {
						if (_c > 1) _dbOut_15_25.append(",");
						_dbOut_15_25.append(_dbMeta_15_25.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
					}
					while (VERINTQLABRs_15.next()) {
						_dbOut_15_25.append(" | ");
						for (int _c = 1; _c <= _dbCols_15_25; _c++) {
							if (_c > 1) _dbOut_15_25.append(",");
							_dbOut_15_25.append(_dbMeta_15_25.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_15_25 ? _dbOut_15_25.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_15 != null) { try { VERINTQLABRs_15.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_15 = null; }
				VERINTQLABRs_15 = VERINTQLABStmt_15.executeQuery("Select rec_status  from ich.stg_ich_employeedelta_hist where employeeid ='PRHCMR0020';");
				StringBuilder _dbOut_15_26 = new StringBuilder();
				boolean _dbHasRow_15_26 = false;
				if (VERINTQLABRs_15.next()) {
					_dbHasRow_15_26 = true;
					java.sql.ResultSetMetaData _dbMeta_15_26 = VERINTQLABRs_15.getMetaData();
					int _dbCols_15_26 = _dbMeta_15_26.getColumnCount();
					var_Success = VERINTQLABRs_15.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRHCMR0020';");
					}
					for (int _c = 1; _c <= _dbCols_15_26; _c++) {
						if (_c > 1) _dbOut_15_26.append(",");
						_dbOut_15_26.append(_dbMeta_15_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
					}
					while (VERINTQLABRs_15.next()) {
						_dbOut_15_26.append(" | ");
						for (int _c = 1; _c <= _dbCols_15_26; _c++) {
							if (_c > 1) _dbOut_15_26.append(",");
							_dbOut_15_26.append(_dbMeta_15_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_15.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid ='PRHCMR0020';" + " = " + (_dbHasRow_15_26 ? _dbOut_15_26.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_15 != null) try { VERINTQLABRs_15.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_15 != null) try { VERINTQLABStmt_15.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_15 != null) try { VERINTQLABConn_15.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
