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
public class Step1_TBox_DB_Run_SQL_Statement_885c45f9 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_885c45f9() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] // Tosca DB: VERINT QLAB | DELETE, OTHER, SELECT | Driver=Generic ODBC
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] 	System.setProperty("http.proxyHost", var_Tunnel_Ip);
		// [DISABLED] 	System.setProperty("http.proxyPort", var_Tunnel_Port);
		// [DISABLED] 	var_P_1 = "";
		// [DISABLED] 	var_Success = "";
		// [DISABLED] 	var_Verint_Qlab_Rows_10 = 0;
		// [DISABLED] 	Connection VERINTQLABConn_10 = null;
		// [DISABLED] 	Statement VERINTQLABStmt_10 = null;
		// [DISABLED] 	ResultSet VERINTQLABRs_10 = null;
		// [DISABLED] 	try {
		// [DISABLED] 		VERINTQLABConn_10 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
		// [DISABLED] 		System.out.println("Connected to database: VERINT QLAB");
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABConn_10 == null) {
		// [DISABLED] 			throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
		// [DISABLED] 		}
		// [DISABLED] 		VERINTQLABStmt_10 = VERINTQLABConn_10.createStatement();
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.ichemployee where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.ichemployee where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeestatus where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
		// [DISABLED] 		System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("--Manager1 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager0022', 'FDTMS22', 'LDTManger0022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER0022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("--Manager1 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager0022', 'FDTMS22', 'LDTManger0022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER0022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("--Manager2 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager10022', 'FDTMS122', 'LDTManger10022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER10022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("--Manager2 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager10022', 'FDTMS122', 'LDTManger10022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER10022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Coach0022', 'FDTCS22', 'LDTCoach0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1COACH0022', 'STest03', '3453452', '2022-04-02',  'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Coach0022', 'FDTCS22', 'LDTCoach0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1COACH0022', 'STest03', '3453452', '2022-04-02', 'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		var_Verint_Qlab_Rows_10 = VERINTQLABStmt_10.executeUpdate("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Rep0022', 'FDTRS22', 'LDTRep0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1REP0022', 'STest03', '3453452', '2022-04-02',  'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
		// [DISABLED] 		System.out.println("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Rep0022', 'FDTRS22', 'LDTRep0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1REP0022', 'STest03', '3453452', '2022-04-02', 'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_10);
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_11 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_11 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_11 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_11 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_11 = _dbMeta_10_11.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_11; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_11.append(",");
		// [DISABLED] 				_dbOut_10_11.append(_dbMeta_10_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_11.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_11; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_11.append(",");
		// [DISABLED] 					_dbOut_10_11.append(_dbMeta_10_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');" + " = " + (_dbHasRow_10_11 ? _dbOut_10_11.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');");
		// [DISABLED] 		StringBuilder _dbOut_10_12 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_12 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_12 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_12 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_12 = _dbMeta_10_12.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_12; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_12.append(",");
		// [DISABLED] 				_dbOut_10_12.append(_dbMeta_10_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_12.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_12; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_12.append(",");
		// [DISABLED] 					_dbOut_10_12.append(_dbMeta_10_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');" + " = " + (_dbHasRow_10_12 ? _dbOut_10_12.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_13 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_13 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_13 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_13 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_13 = _dbMeta_10_13.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_13; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_13.append(",");
		// [DISABLED] 				_dbOut_10_13.append(_dbMeta_10_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_13.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_13; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_13.append(",");
		// [DISABLED] 					_dbOut_10_13.append(_dbMeta_10_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');" + " = " + (_dbHasRow_10_13 ? _dbOut_10_13.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_14 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_14 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_14 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_14 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_14 = _dbMeta_10_14.getColumnCount();
		// [DISABLED] 			var_P_1 = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_P_1.equals("1")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_14; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_14.append(",");
		// [DISABLED] 				_dbOut_10_14.append(_dbMeta_10_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_14.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_14; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_14.append(",");
		// [DISABLED] 					_dbOut_10_14.append(_dbMeta_10_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');" + " = " + (_dbHasRow_10_14 ? _dbOut_10_14.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 		StringBuilder _dbOut_10_15 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_15 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_15 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_15 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_15 = _dbMeta_10_15.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_15; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_15.append(",");
		// [DISABLED] 				_dbOut_10_15.append(_dbMeta_10_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_15.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_15; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_15.append(",");
		// [DISABLED] 					_dbOut_10_15.append(_dbMeta_10_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_10_15 ? _dbOut_10_15.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_16 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_16 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_16 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_16 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_16 = _dbMeta_10_16.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_16; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_16.append(",");
		// [DISABLED] 				_dbOut_10_16.append(_dbMeta_10_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_16.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_16; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_16.append(",");
		// [DISABLED] 					_dbOut_10_16.append(_dbMeta_10_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');" + " = " + (_dbHasRow_10_16 ? _dbOut_10_16.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');");
		// [DISABLED] 		StringBuilder _dbOut_10_17 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_17 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_17 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_17 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_17 = _dbMeta_10_17.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_17; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_17.append(",");
		// [DISABLED] 				_dbOut_10_17.append(_dbMeta_10_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_17.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_17; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_17.append(",");
		// [DISABLED] 					_dbOut_10_17.append(_dbMeta_10_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');" + " = " + (_dbHasRow_10_17 ? _dbOut_10_17.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_18 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_18 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_18 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_18 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_18 = _dbMeta_10_18.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_18; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_18.append(",");
		// [DISABLED] 				_dbOut_10_18.append(_dbMeta_10_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_18.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_18; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_18.append(",");
		// [DISABLED] 					_dbOut_10_18.append(_dbMeta_10_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');" + " = " + (_dbHasRow_10_18 ? _dbOut_10_18.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		if (VERINTQLABRs_10 != null) { try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_10 = null; }
		// [DISABLED] 		VERINTQLABRs_10 = VERINTQLABStmt_10.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');");
		// [DISABLED] 		StringBuilder _dbOut_10_19 = new StringBuilder();
		// [DISABLED] 		boolean _dbHasRow_10_19 = false;
		// [DISABLED] 		if (VERINTQLABRs_10.next()) {
		// [DISABLED] 			_dbHasRow_10_19 = true;
		// [DISABLED] 			java.sql.ResultSetMetaData _dbMeta_10_19 = VERINTQLABRs_10.getMetaData();
		// [DISABLED] 			int _dbCols_10_19 = _dbMeta_10_19.getColumnCount();
		// [DISABLED] 			var_Success = VERINTQLABRs_10.getString(1);
		// [DISABLED] 			if (!var_Success.equals("SUCCESS")) {
		// [DISABLED] 				throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');");
		// [DISABLED] 			}
		// [DISABLED] 			for (int _c = 1; _c <= _dbCols_10_19; _c++) {
		// [DISABLED] 				if (_c > 1) _dbOut_10_19.append(",");
		// [DISABLED] 				_dbOut_10_19.append(_dbMeta_10_19.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 			}
		// [DISABLED] 			while (VERINTQLABRs_10.next()) {
		// [DISABLED] 				_dbOut_10_19.append(" | ");
		// [DISABLED] 				for (int _c = 1; _c <= _dbCols_10_19; _c++) {
		// [DISABLED] 					if (_c > 1) _dbOut_10_19.append(",");
		// [DISABLED] 					_dbOut_10_19.append(_dbMeta_10_19.getColumnLabel(_c)).append("=").append(VERINTQLABRs_10.getString(_c));
		// [DISABLED] 				}
		// [DISABLED] 			}
		// [DISABLED] 		}
		// [DISABLED] 		System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');" + " = " + (_dbHasRow_10_19 ? _dbOut_10_19.toString() : "(no rows)"));
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 	} catch (SQLException e) {
		// [DISABLED] 		System.out.println("Database operation failed: " + e.getMessage());
		// [DISABLED] 		System.out.println("----");
		// [DISABLED] 
		// [DISABLED] 		e.printStackTrace(new java.io.PrintWriter(System.out, true));
		// [DISABLED] 		throw new RuntimeException(e);
		// [DISABLED] 	} finally {
		// [DISABLED] 		if (VERINTQLABRs_10 != null) try { VERINTQLABRs_10.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABStmt_10 != null) try { VERINTQLABStmt_10.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 		if (VERINTQLABConn_10 != null) try { VERINTQLABConn_10.close(); } catch (SQLException e) { /* ignore */ }
		// [DISABLED] 	}
		// [DISABLED] END_CUSTOM_SCRIPT;
	}
}
