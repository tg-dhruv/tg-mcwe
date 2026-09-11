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
public class Step1_TBox_DB_Run_SQL_Statement_49367390 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_49367390() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, OTHER, SELECT, UPDATE | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_3 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_23 = 0;
			Connection VERINTQLABConn_23 = null;
			Statement VERINTQLABStmt_23 = null;
			ResultSet VERINTQLABRs_23 = null;
			try {
				VERINTQLABConn_23 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_23 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_23 = VERINTQLABConn_23.createStatement();
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ich_initialization_employees where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ich_initialization_employees where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichemployee where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichemployeehierarchy_20018  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichemployeehierarchy_20018 where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichloa where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichloa where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.hridsemployeeprofile where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichloa_errors where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichloa_errors where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.fkemp2employeeid where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.fkemp2employeeid where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichVerintUserProfileAPI where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichVerintUserProfileAPI where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichverintsupervisorapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichverintsupervisorapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.verintteamleadapi  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.verintteamleadapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.verintworkspaceapi  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.verintworkspaceapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.verintorgapi  where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.verintorgapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ichverintjobtitleapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ichverintjobtitleapi where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.ich_verintorg_error_records where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.ich_verintorg_error_records where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.hierarchy_trueup where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.hierarchy_trueup where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("delete from ich.hierarchy_st where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				System.out.println("delete from ich.hierarchy_st where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("--Manager:  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRMANAGER038', 'FVMS1', 'LTMANAGER038', 'PSTest01', '20012', 'Test', 'PVTMANAGER038@t-mobile.com', 'NTVTMANAGER038', 'STest03', '3653652', '2022-04-02',   'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Manager: INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRMANAGER038', 'FVMS1', 'LTMANAGER038', 'PSTest01', '20012', 'Test', 'PVTMANAGER038@t-mobile.com', 'NTVTMANAGER038', 'STest03', '3653652', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("--Coach  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRCOACH038', 'FVMS1', 'LTCOACH038', 'PSTest01', '20018', 'Test', 'PVTCOACH038@t-mobile.com', 'NTVTCOACH038', 'STest03', '3653652', '2022-04-02',   'Coach, Business Sales Support', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRCOACH038', 'FVMS1', 'LTCOACH038', 'PSTest01', '20018', 'Test', 'PVTCOACH038@t-mobile.com', 'NTVTCOACH038', 'STest03', '3653652', '2022-04-02', 'Coach, Business Sales Support', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("--Rep  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRREP038', 'FVMS2', 'LTREP038', 'PSTest01', '20018', 'Test', 'PVTREP038@t-mobile.com', 'NTVTREP038', 'STest03', '3653652', '2022-04-02',   'Account Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRREP038', 'FVMS2', 'LTREP038', 'PSTest01', '20018', 'Test', 'PVTREP038@t-mobile.com', 'NTVTREP038', 'STest03', '3653652', '2022-04-02', 'Account Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
				StringBuilder _dbOut_23_26 = new StringBuilder();
				boolean _dbHasRow_23_26 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_26 = true;
					java.sql.ResultSetMetaData _dbMeta_23_26 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_26 = _dbMeta_23_26.getColumnCount();
					var_P_3 = VERINTQLABRs_23.getString(1);
					if (!var_P_3.equals("3")) {
						throw new SQLException("Expected DB cell value 3, got " + var_P_3 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');");
					}
					for (int _c = 1; _c <= _dbCols_23_26; _c++) {
						if (_c > 1) _dbOut_23_26.append(",");
						_dbOut_23_26.append(_dbMeta_23_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_26.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_26; _c++) {
							if (_c > 1) _dbOut_23_26.append(",");
							_dbOut_23_26.append(_dbMeta_23_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER038','PNVRCOACH038','PNVRREP038');" + " = " + (_dbHasRow_23_26 ? _dbOut_23_26.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_23_27 = new StringBuilder();
				boolean _dbHasRow_23_27 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_27 = true;
					java.sql.ResultSetMetaData _dbMeta_23_27 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_27 = _dbMeta_23_27.getColumnCount();
					var_Success = VERINTQLABRs_23.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_23_27; _c++) {
						if (_c > 1) _dbOut_23_27.append(",");
						_dbOut_23_27.append(_dbMeta_23_27.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_27.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_27; _c++) {
							if (_c > 1) _dbOut_23_27.append(",");
							_dbOut_23_27.append(_dbMeta_23_27.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_23_27 ? _dbOut_23_27.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRMANAGER038') as r where row = 1;");
				StringBuilder _dbOut_23_28 = new StringBuilder();
				boolean _dbHasRow_23_28 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_28 = true;
					java.sql.ResultSetMetaData _dbMeta_23_28 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_28 = _dbMeta_23_28.getColumnCount();
					var_Success = VERINTQLABRs_23.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRMANAGER038') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_23_28; _c++) {
						if (_c > 1) _dbOut_23_28.append(",");
						_dbOut_23_28.append(_dbMeta_23_28.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_28.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_28; _c++) {
							if (_c > 1) _dbOut_23_28.append(",");
							_dbOut_23_28.append(_dbMeta_23_28.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRMANAGER038') as r where row = 1;" + " = " + (_dbHasRow_23_28 ? _dbOut_23_28.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRCOACH038') as r where row = 1;");
				StringBuilder _dbOut_23_29 = new StringBuilder();
				boolean _dbHasRow_23_29 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_29 = true;
					java.sql.ResultSetMetaData _dbMeta_23_29 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_29 = _dbMeta_23_29.getColumnCount();
					var_Success = VERINTQLABRs_23.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRCOACH038') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_23_29; _c++) {
						if (_c > 1) _dbOut_23_29.append(",");
						_dbOut_23_29.append(_dbMeta_23_29.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_29.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_29; _c++) {
							if (_c > 1) _dbOut_23_29.append(",");
							_dbOut_23_29.append(_dbMeta_23_29.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRCOACH038') as r where row = 1;" + " = " + (_dbHasRow_23_29 ? _dbOut_23_29.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRREP038') as r where row = 1;");
				StringBuilder _dbOut_23_30 = new StringBuilder();
				boolean _dbHasRow_23_30 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_30 = true;
					java.sql.ResultSetMetaData _dbMeta_23_30 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_30 = _dbMeta_23_30.getColumnCount();
					var_Success = VERINTQLABRs_23.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRREP038') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_23_30; _c++) {
						if (_c > 1) _dbOut_23_30.append(",");
						_dbOut_23_30.append(_dbMeta_23_30.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_30.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_30; _c++) {
							if (_c > 1) _dbOut_23_30.append(",");
							_dbOut_23_30.append(_dbMeta_23_30.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRREP038') as r where row = 1;" + " = " + (_dbHasRow_23_30 ? _dbOut_23_30.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("update fkemp2employeeid set verintid = '100381' where employeeid =  'PNVRMANAGER038';");
				System.out.println("update fkemp2employeeid set verintid = '100381' where employeeid = 'PNVRMANAGER038';" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRMANAGER038' and verintid = '100381';");
				StringBuilder _dbOut_23_32 = new StringBuilder();
				boolean _dbHasRow_23_32 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_32 = true;
					java.sql.ResultSetMetaData _dbMeta_23_32 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_32 = _dbMeta_23_32.getColumnCount();
					for (int _c = 1; _c <= _dbCols_23_32; _c++) {
						if (_c > 1) _dbOut_23_32.append(",");
						_dbOut_23_32.append(_dbMeta_23_32.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_32.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_32; _c++) {
							if (_c > 1) _dbOut_23_32.append(",");
							_dbOut_23_32.append(_dbMeta_23_32.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRMANAGER038' and verintid = '100381';" + " = " + (_dbHasRow_23_32 ? _dbOut_23_32.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("update fkemp2employeeid set verintid = '100382' where employeeid =  'PNVRCOACH038';");
				System.out.println("update fkemp2employeeid set verintid = '100382' where employeeid = 'PNVRCOACH038';" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRCOACH038' and verintid = '100382';");
				StringBuilder _dbOut_23_34 = new StringBuilder();
				boolean _dbHasRow_23_34 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_34 = true;
					java.sql.ResultSetMetaData _dbMeta_23_34 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_34 = _dbMeta_23_34.getColumnCount();
					for (int _c = 1; _c <= _dbCols_23_34; _c++) {
						if (_c > 1) _dbOut_23_34.append(",");
						_dbOut_23_34.append(_dbMeta_23_34.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_34.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_34; _c++) {
							if (_c > 1) _dbOut_23_34.append(",");
							_dbOut_23_34.append(_dbMeta_23_34.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRCOACH038' and verintid = '100382';" + " = " + (_dbHasRow_23_34 ? _dbOut_23_34.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_23 = VERINTQLABStmt_23.executeUpdate("update fkemp2employeeid set verintid = '100383' where employeeid =  'PNVRREP038';");
				System.out.println("update fkemp2employeeid set verintid = '100383' where employeeid = 'PNVRREP038';" + " = " + var_Verint_Qlab_Rows_23);
				System.out.println("----");
		
				if (VERINTQLABRs_23 != null) { try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_23 = null; }
				VERINTQLABRs_23 = VERINTQLABStmt_23.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRREP038' and verintid = '100383';");
				StringBuilder _dbOut_23_36 = new StringBuilder();
				boolean _dbHasRow_23_36 = false;
				if (VERINTQLABRs_23.next()) {
					_dbHasRow_23_36 = true;
					java.sql.ResultSetMetaData _dbMeta_23_36 = VERINTQLABRs_23.getMetaData();
					int _dbCols_23_36 = _dbMeta_23_36.getColumnCount();
					for (int _c = 1; _c <= _dbCols_23_36; _c++) {
						if (_c > 1) _dbOut_23_36.append(",");
						_dbOut_23_36.append(_dbMeta_23_36.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
					}
					while (VERINTQLABRs_23.next()) {
						_dbOut_23_36.append(" | ");
						for (int _c = 1; _c <= _dbCols_23_36; _c++) {
							if (_c > 1) _dbOut_23_36.append(",");
							_dbOut_23_36.append(_dbMeta_23_36.getColumnLabel(_c)).append("=").append(VERINTQLABRs_23.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRREP038' and verintid = '100383';" + " = " + (_dbHasRow_23_36 ? _dbOut_23_36.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_23 != null) try { VERINTQLABRs_23.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_23 != null) try { VERINTQLABStmt_23.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_23 != null) try { VERINTQLABConn_23.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
