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
public class Step1_TBox_DB_Run_SQL_Statement_dc675749 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_dc675749() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, OTHER, SELECT | Driver=Generic ODBC
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_4 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_13 = 0;
			Connection VERINTQLABConn_13 = null;
			Statement VERINTQLABStmt_13 = null;
			ResultSet VERINTQLABRs_13 = null;
			try {
				VERINTQLABConn_13 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_13 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_13 = VERINTQLABConn_13.createStatement();
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete from ich.ichemployee where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete  from ich.ichemployeeorgrole where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete  from ich.ichemployeestatus where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete  from ich.ichvendorsiteinfo where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete from ich.fkemp2employeeid where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				System.out.println("delete from ich.fkemp2employeeid where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("delete from ich.stg_ich_employeedelta;");
				System.out.println("delete from ich.stg_ich_employeedelta;" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PTMS1TManager0041', 'FTTMS41', 'LTManager0041', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1TManager0041', 'STest03', '3453452', '2022-04-02','Training Manager','Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PTMS1TManager0041', 'FTTMS41', 'LTManager0041', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1TManager0041', 'STest03', '3453452', '2022-04-02','Training Manager','Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("--Training Manager2  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PTMS1TManager_20041', 'FTTMS41_1', 'LTManager0041_1', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1TManager0041_1', 'STest03', '3453452', '2022-04-02','Training Manager','Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Training Manager2 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PTMS1TManager_20041', 'FTTMS41_1', 'LTManager0041_1', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1TManager0041_1', 'STest03', '3453452', '2022-04-02','Training Manager','Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("--Coach  INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PTMS1Coach0041', 'FTCS41', 'LCoach0041', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1Coach0041', 'STest03', '3453452', '2022-04-02', 'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PTMS1Coach0041', 'FTCS41', 'LCoach0041', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1Coach0041', 'STest03', '3453452', '2022-04-02', 'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_13 = VERINTQLABStmt_13.executeUpdate("--Rep   INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('PTMS1Rep0041', 'FTRepS41', 'LTRep0041', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1Rep0041', 'STest03', '3453452', '2022-04-02', 'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PTMS1Rep0041', 'FTRepS41', 'LTRep0041', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTTMS1Rep0041', 'STest03', '3453452', '2022-04-02', 'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'CO-Colorado Springs Call Center', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_13);
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
				StringBuilder _dbOut_13_13 = new StringBuilder();
				boolean _dbHasRow_13_13 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_13 = true;
					java.sql.ResultSetMetaData _dbMeta_13_13 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_13 = _dbMeta_13_13.getColumnCount();
					var_P_4 = VERINTQLABRs_13.getString(1);
					if (!var_P_4.equals("4")) {
						throw new SQLException("Expected DB cell value 4, got " + var_P_4 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');");
					}
					for (int _c = 1; _c <= _dbCols_13_13; _c++) {
						if (_c > 1) _dbOut_13_13.append(",");
						_dbOut_13_13.append(_dbMeta_13_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_13.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_13; _c++) {
							if (_c > 1) _dbOut_13_13.append(",");
							_dbOut_13_13.append(_dbMeta_13_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PTMS1TManager0041','PTMS1TManager_20041','PTMS1Coach0041','PTMS1Rep0041');" + " = " + (_dbHasRow_13_13 ? _dbOut_13_13.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_13_14 = new StringBuilder();
				boolean _dbHasRow_13_14 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_14 = true;
					java.sql.ResultSetMetaData _dbMeta_13_14 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_14 = _dbMeta_13_14.getColumnCount();
					var_Success = VERINTQLABRs_13.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_13_14; _c++) {
						if (_c > 1) _dbOut_13_14.append(",");
						_dbOut_13_14.append(_dbMeta_13_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_14.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_14; _c++) {
							if (_c > 1) _dbOut_13_14.append(",");
							_dbOut_13_14.append(_dbMeta_13_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_13_14 ? _dbOut_13_14.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager0041');");
				StringBuilder _dbOut_13_15 = new StringBuilder();
				boolean _dbHasRow_13_15 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_15 = true;
					java.sql.ResultSetMetaData _dbMeta_13_15 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_15 = _dbMeta_13_15.getColumnCount();
					var_Success = VERINTQLABRs_13.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager0041');");
					}
					for (int _c = 1; _c <= _dbCols_13_15; _c++) {
						if (_c > 1) _dbOut_13_15.append(",");
						_dbOut_13_15.append(_dbMeta_13_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_15.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_15; _c++) {
							if (_c > 1) _dbOut_13_15.append(",");
							_dbOut_13_15.append(_dbMeta_13_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager0041');" + " = " + (_dbHasRow_13_15 ? _dbOut_13_15.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager_20041');");
				StringBuilder _dbOut_13_16 = new StringBuilder();
				boolean _dbHasRow_13_16 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_16 = true;
					java.sql.ResultSetMetaData _dbMeta_13_16 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_16 = _dbMeta_13_16.getColumnCount();
					var_Success = VERINTQLABRs_13.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager_20041');");
					}
					for (int _c = 1; _c <= _dbCols_13_16; _c++) {
						if (_c > 1) _dbOut_13_16.append(",");
						_dbOut_13_16.append(_dbMeta_13_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_16.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_16; _c++) {
							if (_c > 1) _dbOut_13_16.append(",");
							_dbOut_13_16.append(_dbMeta_13_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1TManager_20041');" + " = " + (_dbHasRow_13_16 ? _dbOut_13_16.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Coach0041');");
				StringBuilder _dbOut_13_17 = new StringBuilder();
				boolean _dbHasRow_13_17 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_17 = true;
					java.sql.ResultSetMetaData _dbMeta_13_17 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_17 = _dbMeta_13_17.getColumnCount();
					var_Success = VERINTQLABRs_13.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Coach0041');");
					}
					for (int _c = 1; _c <= _dbCols_13_17; _c++) {
						if (_c > 1) _dbOut_13_17.append(",");
						_dbOut_13_17.append(_dbMeta_13_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_17.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_17; _c++) {
							if (_c > 1) _dbOut_13_17.append(",");
							_dbOut_13_17.append(_dbMeta_13_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Coach0041');" + " = " + (_dbHasRow_13_17 ? _dbOut_13_17.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_13 != null) { try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_13 = null; }
				VERINTQLABRs_13 = VERINTQLABStmt_13.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Rep0041');");
				StringBuilder _dbOut_13_18 = new StringBuilder();
				boolean _dbHasRow_13_18 = false;
				if (VERINTQLABRs_13.next()) {
					_dbHasRow_13_18 = true;
					java.sql.ResultSetMetaData _dbMeta_13_18 = VERINTQLABRs_13.getMetaData();
					int _dbCols_13_18 = _dbMeta_13_18.getColumnCount();
					var_Success = VERINTQLABRs_13.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Rep0041');");
					}
					for (int _c = 1; _c <= _dbCols_13_18; _c++) {
						if (_c > 1) _dbOut_13_18.append(",");
						_dbOut_13_18.append(_dbMeta_13_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
					}
					while (VERINTQLABRs_13.next()) {
						_dbOut_13_18.append(" | ");
						for (int _c = 1; _c <= _dbCols_13_18; _c++) {
							if (_c > 1) _dbOut_13_18.append(",");
							_dbOut_13_18.append(_dbMeta_13_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_13.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PTMS1Rep0041');" + " = " + (_dbHasRow_13_18 ? _dbOut_13_18.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_13 != null) try { VERINTQLABRs_13.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_13 != null) try { VERINTQLABStmt_13.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_13 != null) try { VERINTQLABConn_13.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
