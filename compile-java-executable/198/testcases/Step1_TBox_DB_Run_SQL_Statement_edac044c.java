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
public class Step1_TBox_DB_Run_SQL_Statement_edac044c extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_run_sql_statement_edac044c() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | DELETE, INSERT, SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			var_Success = "";
			var_Verint_Qlab_Rows_27 = 0;
			Connection VERINTQLABConn_27 = null;
			Statement VERINTQLABStmt_27 = null;
			ResultSet VERINTQLABRs_27 = null;
			try {
				VERINTQLABConn_27 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_27 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_27 = VERINTQLABConn_27.createStatement();
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete from ich.ichemployee where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichemployee where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete  from ich.ichemployeeorgrole where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichemployeeorgrole where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete  from ich.ichemployeestatus where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichemployeestatus where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete  from ich.ichvendorsiteinfo where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichvendorsiteinfo where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete from ich.ichemployeehierarchy_20012  where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichemployeehierarchy_20012 where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete from ich.ichemployeehierarchy_20018  where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.ichemployeehierarchy_20018 where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("delete from ich.stg_ich_employeedelta_hist where employeeid in ('POHS1REP0025');");
				System.out.println("delete from ich.stg_ich_employeedelta_hist where employeeid in ('POHS1REP0025');" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				var_Verint_Qlab_Rows_27 = VERINTQLABStmt_27.executeUpdate("INSERT INTO ich.stg_ich_employeedelta  (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id)  VALUES ('POHS1REP0025', 'FOOH25', 'LREP0025', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTOOH1REP0025', 'STest03', '3453452', NOW()::date -10,  'Elite Expert, Account Care', 'Active', 'Test','CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '','2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));");
				System.out.println("INSERT INTO ich.stg_ich_employeedelta (employeeid, firstname, lastname, managerid, locationid, streamlineloginid, emailid, ntid, samsonid, dealercode, originalhiredate, title, status, resourcetype, \"location\", channel, locationbyzipcode, issupervisor, isexecutive, startdate, enddate, deltaloaddate, createdby, createddate, lastupdatedby, lastupdateddate, id) VALUES ('POHS1REP0025', 'FOOH25', 'LREP0025', 'PSTest01', '20012', 'Test', 'PStestC03@t-mobile.com', 'NTOOH1REP0025', 'STest03', '3453452', NOW()::date -10, 'Elite Expert, Account Care', 'Active', 'Test','CO-Colorado Springs Call Center', 'Test', 'Test', 'Test', '','2024-01-01', '2099-12-31', NOW()::date -10, CURRENT_USER, NOW()::date -10, CURRENT_USER, NOW()::date -10, NEXTVAL('ich.idseq'::regclass));" + " = " + var_Verint_Qlab_Rows_27);
				System.out.println("----");
		
				if (VERINTQLABRs_27 != null) { try { VERINTQLABRs_27.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_27 = null; }
				VERINTQLABRs_27 = VERINTQLABStmt_27.executeQuery("select count(*) from ich.stg_ich_employeedelta where employeeid in ('POHS1REP0025');");
				StringBuilder _dbOut_27_9 = new StringBuilder();
				boolean _dbHasRow_27_9 = false;
				if (VERINTQLABRs_27.next()) {
					_dbHasRow_27_9 = true;
					java.sql.ResultSetMetaData _dbMeta_27_9 = VERINTQLABRs_27.getMetaData();
					int _dbCols_27_9 = _dbMeta_27_9.getColumnCount();
					var_P_1 = VERINTQLABRs_27.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.stg_ich_employeedelta where employeeid in ('POHS1REP0025');");
					}
					for (int _c = 1; _c <= _dbCols_27_9; _c++) {
						if (_c > 1) _dbOut_27_9.append(",");
						_dbOut_27_9.append(_dbMeta_27_9.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
					}
					while (VERINTQLABRs_27.next()) {
						_dbOut_27_9.append(" | ");
						for (int _c = 1; _c <= _dbCols_27_9; _c++) {
							if (_c > 1) _dbOut_27_9.append(",");
							_dbOut_27_9.append(_dbMeta_27_9.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.stg_ich_employeedelta where employeeid in ('POHS1REP0025');" + " = " + (_dbHasRow_27_9 ? _dbOut_27_9.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_27 != null) { try { VERINTQLABRs_27.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_27 = null; }
				VERINTQLABRs_27 = VERINTQLABStmt_27.executeQuery("SELECT ich.fnc_employee_delta_process();");
				StringBuilder _dbOut_27_10 = new StringBuilder();
				boolean _dbHasRow_27_10 = false;
				if (VERINTQLABRs_27.next()) {
					_dbHasRow_27_10 = true;
					java.sql.ResultSetMetaData _dbMeta_27_10 = VERINTQLABRs_27.getMetaData();
					int _dbCols_27_10 = _dbMeta_27_10.getColumnCount();
					var_Success = VERINTQLABRs_27.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "SELECT ich.fnc_employee_delta_process();");
					}
					for (int _c = 1; _c <= _dbCols_27_10; _c++) {
						if (_c > 1) _dbOut_27_10.append(",");
						_dbOut_27_10.append(_dbMeta_27_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
					}
					while (VERINTQLABRs_27.next()) {
						_dbOut_27_10.append(" | ");
						for (int _c = 1; _c <= _dbCols_27_10; _c++) {
							if (_c > 1) _dbOut_27_10.append(",");
							_dbOut_27_10.append(_dbMeta_27_10.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
						}
					}
				}
				System.out.println("SELECT ich.fnc_employee_delta_process();" + " = " + (_dbHasRow_27_10 ? _dbOut_27_10.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_27 != null) { try { VERINTQLABRs_27.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_27 = null; }
				VERINTQLABRs_27 = VERINTQLABStmt_27.executeQuery("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('POHS1REP0025');");
				StringBuilder _dbOut_27_11 = new StringBuilder();
				boolean _dbHasRow_27_11 = false;
				if (VERINTQLABRs_27.next()) {
					_dbHasRow_27_11 = true;
					java.sql.ResultSetMetaData _dbMeta_27_11 = VERINTQLABRs_27.getMetaData();
					int _dbCols_27_11 = _dbMeta_27_11.getColumnCount();
					var_Success = VERINTQLABRs_27.getString(1);
					if (!var_Success.equals("SUCCESS")) {
						throw new SQLException("Expected DB cell value SUCCESS, got " + var_Success + " in query " + "Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('POHS1REP0025');");
					}
					for (int _c = 1; _c <= _dbCols_27_11; _c++) {
						if (_c > 1) _dbOut_27_11.append(",");
						_dbOut_27_11.append(_dbMeta_27_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
					}
					while (VERINTQLABRs_27.next()) {
						_dbOut_27_11.append(" | ");
						for (int _c = 1; _c <= _dbCols_27_11; _c++) {
							if (_c > 1) _dbOut_27_11.append(",");
							_dbOut_27_11.append(_dbMeta_27_11.getColumnLabel(_c)).append("=").append(VERINTQLABRs_27.getString(_c));
						}
					}
				}
				System.out.println("Select rec_status from ich.stg_ich_employeedelta_hist where employeeid in ('POHS1REP0025');" + " = " + (_dbHasRow_27_11 ? _dbOut_27_11.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_27 != null) try { VERINTQLABRs_27.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_27 != null) try { VERINTQLABStmt_27.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_27 != null) try { VERINTQLABConn_27.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
