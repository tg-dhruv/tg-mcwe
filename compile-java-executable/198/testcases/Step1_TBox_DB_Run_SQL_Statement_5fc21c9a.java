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
public class Step1_TBox_DB_Run_SQL_Statement_5fc21c9a extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_5fc21c9a() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, OTHER, SELECT, UPDATE | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_3 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_24 = 0;
			Connection VERINTQLABConn_24 = null;
			Statement VERINTQLABStmt_24 = null;
			ResultSet VERINTQLABRs_24 = null;
			try {
				VERINTQLABConn_24 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_24 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_24 = VERINTQLABConn_24.createStatement();
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ich_initialization_employees where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ich_initialization_employees where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichemployee where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichemployeehierarchy_20018  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichemployeehierarchy_20018 where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.stg_ich_employeedelta_hist  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichloa where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichloa where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.hridsemployeeprofile where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.hridsemployeeprofile where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichloa_errors where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichloa_errors where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.fkemp2employeeid where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.fkemp2employeeid where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichVerintUserProfileAPI where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichVerintUserProfileAPI where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichverintsupervisorapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichverintsupervisorapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.verintteamleadapi  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.verintteamleadapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.verintworkspaceapi  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.verintworkspaceapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.verintorgapi  where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.verintorgapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ichverintjobtitleapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ichverintjobtitleapi where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.ich_verintorg_error_records where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.ich_verintorg_error_records where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.hierarchy_trueup where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.hierarchy_trueup where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("delete from ich.hierarchy_st where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				System.out.println("delete from ich.hierarchy_st where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("--Manager:  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRMANAGER039', 'FVMS1', 'LTMANAGER039', 'PSTest01', '20012', 'Test', 'PVTMANAGER039@t-mobile.com', 'NTVTMANAGER039', 'STest03', '3653652', '2022-04-02',   'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Manager: INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRMANAGER039', 'FVMS1', 'LTMANAGER039', 'PSTest01', '20012', 'Test', 'PVTMANAGER039@t-mobile.com', 'NTVTMANAGER039', 'STest03', '3653652', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("--Coach  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRCOACH039', 'FVMS1', 'LTCOACH039', 'PSTest01', '20018', 'Test', 'PVTCOACH039@t-mobile.com', 'NTVTCOACH039', 'STest03', '3653652', '2022-04-02',   'Coach, Business Sales Support', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRCOACH039', 'FVMS1', 'LTCOACH039', 'PSTest01', '20018', 'Test', 'PVTCOACH039@t-mobile.com', 'NTVTCOACH039', 'STest03', '3653652', '2022-04-02', 'Coach, Business Sales Support', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("--Rep  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PNVRREP039', 'FVMS2', 'LTREP039', 'PSTest01', '20018', 'Test', 'PVTREP039@t-mobile.com', 'NTVTREP039', 'STest03', '3653652', '2022-04-02',   'Account Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '',   '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PNVRREP039', 'FVMS2', 'LTREP039', 'PSTest01', '20018', 'Test', 'PVTREP039@t-mobile.com', 'NTVTREP039', 'STest03', '3653652', '2022-04-02', 'Account Expert, Business', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
				StringBuilder _dbOut_24_26 = new StringBuilder();
				boolean _dbHasRow_24_26 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_26 = true;
					java.sql.ResultSetMetaData _dbMeta_24_26 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_26 = _dbMeta_24_26.getColumnCount();
					var_P_3 = VERINTQLABRs_24.getString(1);
					if (!var_P_3.equals("3")) {
						throw new SQLException("Expected DB cell value 3, got " + var_P_3 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');");
					}
					for (int _c = 1; _c <= _dbCols_24_26; _c++) {
						if (_c > 1) _dbOut_24_26.append(",");
						_dbOut_24_26.append(_dbMeta_24_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_26.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_26; _c++) {
							if (_c > 1) _dbOut_24_26.append(",");
							_dbOut_24_26.append(_dbMeta_24_26.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PNVRMANAGER039','PNVRCOACH039','PNVRREP039');" + " = " + (_dbHasRow_24_26 ? _dbOut_24_26.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_24_27 = new StringBuilder();
				boolean _dbHasRow_24_27 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_27 = true;
					java.sql.ResultSetMetaData _dbMeta_24_27 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_27 = _dbMeta_24_27.getColumnCount();
					var_Success = VERINTQLABRs_24.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_24_27; _c++) {
						if (_c > 1) _dbOut_24_27.append(",");
						_dbOut_24_27.append(_dbMeta_24_27.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_27.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_27; _c++) {
							if (_c > 1) _dbOut_24_27.append(",");
							_dbOut_24_27.append(_dbMeta_24_27.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_24_27 ? _dbOut_24_27.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRMANAGER039') as r where row = 1;");
				StringBuilder _dbOut_24_28 = new StringBuilder();
				boolean _dbHasRow_24_28 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_28 = true;
					java.sql.ResultSetMetaData _dbMeta_24_28 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_28 = _dbMeta_24_28.getColumnCount();
					var_Success = VERINTQLABRs_24.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRMANAGER039') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_24_28; _c++) {
						if (_c > 1) _dbOut_24_28.append(",");
						_dbOut_24_28.append(_dbMeta_24_28.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_28.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_28; _c++) {
							if (_c > 1) _dbOut_24_28.append(",");
							_dbOut_24_28.append(_dbMeta_24_28.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRMANAGER039') as r where row = 1;" + " = " + (_dbHasRow_24_28 ? _dbOut_24_28.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRCOACH039') as r where row = 1;");
				StringBuilder _dbOut_24_29 = new StringBuilder();
				boolean _dbHasRow_24_29 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_29 = true;
					java.sql.ResultSetMetaData _dbMeta_24_29 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_29 = _dbMeta_24_29.getColumnCount();
					var_Success = VERINTQLABRs_24.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRCOACH039') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_24_29; _c++) {
						if (_c > 1) _dbOut_24_29.append(",");
						_dbOut_24_29.append(_dbMeta_24_29.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_29.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_29; _c++) {
							if (_c > 1) _dbOut_24_29.append(",");
							_dbOut_24_29.append(_dbMeta_24_29.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRCOACH039') as r where row = 1;" + " = " + (_dbHasRow_24_29 ? _dbOut_24_29.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row  from ich.stg_ich_employeedelta_hist  						where employeeid ='PNVRREP039') as r where row = 1;");
				StringBuilder _dbOut_24_30 = new StringBuilder();
				boolean _dbHasRow_24_30 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_30 = true;
					java.sql.ResultSetMetaData _dbMeta_24_30 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_30 = _dbMeta_24_30.getColumnCount();
					var_Success = VERINTQLABRs_24.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRREP039') as r where row = 1;");
					}
					for (int _c = 1; _c <= _dbCols_24_30; _c++) {
						if (_c > 1) _dbOut_24_30.append(",");
						_dbOut_24_30.append(_dbMeta_24_30.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_30.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_30; _c++) {
							if (_c > 1) _dbOut_24_30.append(",");
							_dbOut_24_30.append(_dbMeta_24_30.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from (Select rec_status, id, Row_NUMBER() Over (order by ID desc) as row from ich.stg_ich_employeedelta_hist where employeeid ='PNVRREP039') as r where row = 1;" + " = " + (_dbHasRow_24_30 ? _dbOut_24_30.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("update fkemp2employeeid set verintid = '100391' where employeeid =  'PNVRMANAGER039';");
				System.out.println("update fkemp2employeeid set verintid = '100391' where employeeid = 'PNVRMANAGER039';" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRMANAGER039' and verintid = '100391';");
				StringBuilder _dbOut_24_32 = new StringBuilder();
				boolean _dbHasRow_24_32 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_32 = true;
					java.sql.ResultSetMetaData _dbMeta_24_32 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_32 = _dbMeta_24_32.getColumnCount();
					for (int _c = 1; _c <= _dbCols_24_32; _c++) {
						if (_c > 1) _dbOut_24_32.append(",");
						_dbOut_24_32.append(_dbMeta_24_32.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_32.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_32; _c++) {
							if (_c > 1) _dbOut_24_32.append(",");
							_dbOut_24_32.append(_dbMeta_24_32.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRMANAGER039' and verintid = '100391';" + " = " + (_dbHasRow_24_32 ? _dbOut_24_32.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("update fkemp2employeeid set verintid = '100392' where employeeid =  'PNVRCOACH039';");
				System.out.println("update fkemp2employeeid set verintid = '100392' where employeeid = 'PNVRCOACH039';" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRCOACH039' and verintid = '100392';");
				StringBuilder _dbOut_24_34 = new StringBuilder();
				boolean _dbHasRow_24_34 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_34 = true;
					java.sql.ResultSetMetaData _dbMeta_24_34 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_34 = _dbMeta_24_34.getColumnCount();
					for (int _c = 1; _c <= _dbCols_24_34; _c++) {
						if (_c > 1) _dbOut_24_34.append(",");
						_dbOut_24_34.append(_dbMeta_24_34.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_34.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_34; _c++) {
							if (_c > 1) _dbOut_24_34.append(",");
							_dbOut_24_34.append(_dbMeta_24_34.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRCOACH039' and verintid = '100392';" + " = " + (_dbHasRow_24_34 ? _dbOut_24_34.toString() : "(no rows)"));
				System.out.println("----");
		
				var_Verint_Qlab_Rows_24 = VERINTQLABStmt_24.executeUpdate("update fkemp2employeeid set verintid = '100393' where employeeid =  'PNVRREP039';");
				System.out.println("update fkemp2employeeid set verintid = '100393' where employeeid = 'PNVRREP039';" + " = " + var_Verint_Qlab_Rows_24);
				System.out.println("----");
		
				if (VERINTQLABRs_24 != null) { try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_24 = null; }
				VERINTQLABRs_24 = VERINTQLABStmt_24.executeQuery("select count(*) from fkemp2employeeid where employeeid =  'PNVRREP039' and verintid = '100393';");
				StringBuilder _dbOut_24_36 = new StringBuilder();
				boolean _dbHasRow_24_36 = false;
				if (VERINTQLABRs_24.next()) {
					_dbHasRow_24_36 = true;
					java.sql.ResultSetMetaData _dbMeta_24_36 = VERINTQLABRs_24.getMetaData();
					int _dbCols_24_36 = _dbMeta_24_36.getColumnCount();
					for (int _c = 1; _c <= _dbCols_24_36; _c++) {
						if (_c > 1) _dbOut_24_36.append(",");
						_dbOut_24_36.append(_dbMeta_24_36.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
					}
					while (VERINTQLABRs_24.next()) {
						_dbOut_24_36.append(" | ");
						for (int _c = 1; _c <= _dbCols_24_36; _c++) {
							if (_c > 1) _dbOut_24_36.append(",");
							_dbOut_24_36.append(_dbMeta_24_36.getColumnLabel(_c)).append("=").append(VERINTQLABRs_24.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from fkemp2employeeid where employeeid = 'PNVRREP039' and verintid = '100393';" + " = " + (_dbHasRow_24_36 ? _dbOut_24_36.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_24 != null) try { VERINTQLABRs_24.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_24 != null) try { VERINTQLABStmt_24.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_24 != null) try { VERINTQLABConn_24.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
