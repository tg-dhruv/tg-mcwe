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
public class Step1_TBox_DB_Open_Connection_45329982 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_open_connection_45329982() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, OTHER, SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_9 = 0;
			Connection VERINTQLABConn_9 = null;
			Statement VERINTQLABStmt_9 = null;
			ResultSet VERINTQLABRs_9 = null;
			try {
				VERINTQLABConn_9 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_9 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_9 = VERINTQLABConn_9.createStatement();
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.ichemployee where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.ichemployee where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.ichemployeeorgrole where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.ichemployeestatus where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.ichvendorsiteinfo where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022', 'PDTS1Manager10022', 'PDTS1Coach0022', 'PDTS1Rep0022');" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("--Manager1 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager0022', 'FDTMS22', 'LDTManger0022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER0022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Manager1 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager0022', 'FDTMS22', 'LDTManger0022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER0022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("--Manager2 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager10022', 'FDTMS122', 'LDTManger10022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER10022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Manager2 INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Manager10022', 'FDTMS122', 'LDTManger10022', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1MANAGER10022', 'STest03', '3453452', '2022-04-02', 'Manager, Team of Experts', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Coach0022', 'FDTCS22', 'LDTCoach0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1COACH0022', 'STest03', '3453452', '2022-04-02',  'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Coach INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Coach0022', 'FDTCS22', 'LDTCoach0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1COACH0022', 'STest03', '3453452', '2022-04-02', 'Coach, Team of Experts Bilingual', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_9 = VERINTQLABStmt_9.executeUpdate("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Rep0022', 'FDTRS22', 'LDTRep0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1REP0022', 'STest03', '3453452', '2022-04-02',  'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("--Rep INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('PDTS1Rep0022', 'FDTRS22', 'LDTRep0022', 'PTTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTDTS1REP0022', 'STest03', '3453452', '2022-04-02', 'Elite Expert, Account Care', 'Active', 'Test', 'CO-Colorado Springs Call Center', 'Test', 'COLORADO SPRINGS', 'Test', '', '2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_9);
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');");
				StringBuilder _dbOut_9_11 = new StringBuilder();
				boolean _dbHasRow_9_11 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_11 = true;
					java.sql.ResultSetMetaData _dbMeta_9_11 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_11 = _dbMeta_9_11.getColumnCount();
					var_P_1 = VERINTQLABRs_9.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_11; _c++) {
						if (_c > 1) _dbOut_9_11.append(",");
						_dbOut_9_11.append(_dbMeta_9_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_11; _c++) {
							if (_c > 1) _dbOut_9_11.append(",");
							_dbOut_9_11.append(_dbMeta_9_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager0022');" + " = " + (_dbHasRow_9_11 ? _dbOut_9_11.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');");
				StringBuilder _dbOut_9_12 = new StringBuilder();
				boolean _dbHasRow_9_12 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_12 = true;
					java.sql.ResultSetMetaData _dbMeta_9_12 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_12 = _dbMeta_9_12.getColumnCount();
					var_P_1 = VERINTQLABRs_9.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');");
					}
					for (int _c = 1; _c <= _dbCols_9_12; _c++) {
						if (_c > 1) _dbOut_9_12.append(",");
						_dbOut_9_12.append(_dbMeta_9_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_12.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_12; _c++) {
							if (_c > 1) _dbOut_9_12.append(",");
							_dbOut_9_12.append(_dbMeta_9_12.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Manager10022');" + " = " + (_dbHasRow_9_12 ? _dbOut_9_12.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');");
				StringBuilder _dbOut_9_13 = new StringBuilder();
				boolean _dbHasRow_9_13 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_13 = true;
					java.sql.ResultSetMetaData _dbMeta_9_13 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_13 = _dbMeta_9_13.getColumnCount();
					var_P_1 = VERINTQLABRs_9.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_13; _c++) {
						if (_c > 1) _dbOut_9_13.append(",");
						_dbOut_9_13.append(_dbMeta_9_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_13.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_13; _c++) {
							if (_c > 1) _dbOut_9_13.append(",");
							_dbOut_9_13.append(_dbMeta_9_13.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Coach0022');" + " = " + (_dbHasRow_9_13 ? _dbOut_9_13.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');");
				StringBuilder _dbOut_9_14 = new StringBuilder();
				boolean _dbHasRow_9_14 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_14 = true;
					java.sql.ResultSetMetaData _dbMeta_9_14 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_14 = _dbMeta_9_14.getColumnCount();
					var_P_1 = VERINTQLABRs_9.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_14; _c++) {
						if (_c > 1) _dbOut_9_14.append(",");
						_dbOut_9_14.append(_dbMeta_9_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_14.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_14; _c++) {
							if (_c > 1) _dbOut_9_14.append(",");
							_dbOut_9_14.append(_dbMeta_9_14.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('PDTS1Rep0022');" + " = " + (_dbHasRow_9_14 ? _dbOut_9_14.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_9_15 = new StringBuilder();
				boolean _dbHasRow_9_15 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_15 = true;
					java.sql.ResultSetMetaData _dbMeta_9_15 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_15 = _dbMeta_9_15.getColumnCount();
					var_Success = VERINTQLABRs_9.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_9_15; _c++) {
						if (_c > 1) _dbOut_9_15.append(",");
						_dbOut_9_15.append(_dbMeta_9_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_15.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_15; _c++) {
							if (_c > 1) _dbOut_9_15.append(",");
							_dbOut_9_15.append(_dbMeta_9_15.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_9_15 ? _dbOut_9_15.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');");
				StringBuilder _dbOut_9_16 = new StringBuilder();
				boolean _dbHasRow_9_16 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_16 = true;
					java.sql.ResultSetMetaData _dbMeta_9_16 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_16 = _dbMeta_9_16.getColumnCount();
					var_Success = VERINTQLABRs_9.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_16; _c++) {
						if (_c > 1) _dbOut_9_16.append(",");
						_dbOut_9_16.append(_dbMeta_9_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_16.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_16; _c++) {
							if (_c > 1) _dbOut_9_16.append(",");
							_dbOut_9_16.append(_dbMeta_9_16.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager0022');" + " = " + (_dbHasRow_9_16 ? _dbOut_9_16.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');");
				StringBuilder _dbOut_9_17 = new StringBuilder();
				boolean _dbHasRow_9_17 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_17 = true;
					java.sql.ResultSetMetaData _dbMeta_9_17 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_17 = _dbMeta_9_17.getColumnCount();
					var_Success = VERINTQLABRs_9.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');");
					}
					for (int _c = 1; _c <= _dbCols_9_17; _c++) {
						if (_c > 1) _dbOut_9_17.append(",");
						_dbOut_9_17.append(_dbMeta_9_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_17.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_17; _c++) {
							if (_c > 1) _dbOut_9_17.append(",");
							_dbOut_9_17.append(_dbMeta_9_17.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Manager10022');" + " = " + (_dbHasRow_9_17 ? _dbOut_9_17.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');");
				StringBuilder _dbOut_9_18 = new StringBuilder();
				boolean _dbHasRow_9_18 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_18 = true;
					java.sql.ResultSetMetaData _dbMeta_9_18 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_18 = _dbMeta_9_18.getColumnCount();
					var_Success = VERINTQLABRs_9.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_18; _c++) {
						if (_c > 1) _dbOut_9_18.append(",");
						_dbOut_9_18.append(_dbMeta_9_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_18.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_18; _c++) {
							if (_c > 1) _dbOut_9_18.append(",");
							_dbOut_9_18.append(_dbMeta_9_18.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Coach0022');" + " = " + (_dbHasRow_9_18 ? _dbOut_9_18.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_9 != null) { try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_9 = null; }
				VERINTQLABRs_9 = VERINTQLABStmt_9.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');");
				StringBuilder _dbOut_9_19 = new StringBuilder();
				boolean _dbHasRow_9_19 = false;
				if (VERINTQLABRs_9.next()) {
					_dbHasRow_9_19 = true;
					java.sql.ResultSetMetaData _dbMeta_9_19 = VERINTQLABRs_9.getMetaData();
					int _dbCols_9_19 = _dbMeta_9_19.getColumnCount();
					var_Success = VERINTQLABRs_9.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');");
					}
					for (int _c = 1; _c <= _dbCols_9_19; _c++) {
						if (_c > 1) _dbOut_9_19.append(",");
						_dbOut_9_19.append(_dbMeta_9_19.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
					}
					while (VERINTQLABRs_9.next()) {
						_dbOut_9_19.append(" | ");
						for (int _c = 1; _c <= _dbCols_9_19; _c++) {
							if (_c > 1) _dbOut_9_19.append(",");
							_dbOut_9_19.append(_dbMeta_9_19.getColumnLabel(_c)).append("=").append(VERINTQLABRs_9.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('PDTS1Rep0022');" + " = " + (_dbHasRow_9_19 ? _dbOut_9_19.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_9 != null) try { VERINTQLABRs_9.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_9 != null) try { VERINTQLABStmt_9.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_9 != null) try { VERINTQLABConn_9.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
