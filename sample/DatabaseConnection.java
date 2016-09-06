package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class DatabaseConnection
{

	public DatabaseConnection()
	{
	}
	public DatabaseConnection(String databaseURL, String username, String password) throws SQLException
	{
		hahaha = DriverManager.getConnection(databaseURL, username, password);

	}

	private Connection hahaha;
	private String account;
	private Statement insertStatement;
	private Statement listStatement;
	private ResultSet statementExe;
	private List<AccountInfo> accountDetails;
	private Map<String, String> dbTableList;
	private List accountListPre = new ArrayList();
	private List accountListPost = new ArrayList();
	final private String[] dbTableListValue = {"iPhone", "Personal Emergency", "Family Emergency", "Car", "Investing", "Clothing", "Supplement", "Chess Set", "Running", "Miscellaneous"};

	public void setAccount(String account)
	{
		this.account = account;
	}
	public void setInsertStatement() throws  SQLException
	{
		hahaha = DriverManager.getConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
		insertStatement = hahaha.createStatement();
	}
	public void setAccountDetails(ArrayList accountDetails)
	{
        this.accountDetails = accountDetails;
	}

	/*
	 * going to use the account variable for multi-purpose use
	 * at the moment it is just used for testing the table
	 * switching but soon it will be used for adding values
	 * to tables.
	 */
	public void setDbTableList()
	{
		AccountData bamb = new AccountData();
		String list[] = bamb.getAccountList();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(list[i] + " " + dbTableListValue[i]);
			dbTableList.put(list[i], dbTableListValue[i]);
		}
	}
	public void insertsToTable(String date, String account, String balance, String transaction_Type, String transaction, String comment) throws SQLException
	{
		setInsertStatement();
		getInsertStatement().executeUpdate("insert into " + account + " (Date, Account, Balance, Transaction_Type, Transaction, Comment)"
		+ " values (" + date + ", " + dbTableList.get(account) + ", " + balance + ", " + transaction_Type + ", " + transaction + ", " + comment + ")");

	}
	public void insertsToTable(String date, String[] accountNames, String[] accountNamesAccess, double[] accountBalances, String type, double[] accountAmounts, String comments) throws SQLException
	{
		setInsertStatement();

		for (int i = 0; i < 10; i++)
		{
			getInsertStatement().executeUpdate("insert into " + accountNamesAccess[i] + "(Date, Account, Balance, Transaction_Type, Transaction, Comment)"
					+ " values('" + date + "', '" + accountNames[i] + "', " + accountBalances[i] + ", '" + type + "', " + accountAmounts[i] + ", '" + comments + "')");
		}
	}

	public String getAccount()
	{
		return account;
	}
	public List getAccountListPre()
	{
		return accountListPre;
	}
	public List getAccountListPost()
	{
		return accountListPost;
	}
	public List getAccountDetails()
	{
		return accountDetails;
	}
	public Statement getInsertStatement()
	{
		return insertStatement;
	}
	public List<AccountInfo> getAccountInfo() throws SQLException
	{
		String que = "select * from " + getAccount() + " order by Date Desc";
		try(
			Statement listStatement = hahaha.createStatement();
			ResultSet statementExe = listStatement.executeQuery(que);
		)
		{
			setAccountDetails(new ArrayList<>());
            while (statementExe.next())
            {
                String date = statementExe.getString("Date");
                String accountName = statementExe.getString("Account");
                String balance = statementExe.getString("Balance");
                String transaction_Type = statementExe.getString("Transaction_Type");
                String transaction = statementExe.getString("Transaction");
                String comment = statementExe.getString("Comment");

                AccountInfo ai = new AccountInfo(date, accountName, balance, transaction_Type, transaction, comment);
                getAccountDetails().add(ai);
            }
            return getAccountDetails();
        }
    }
	public String getBalanceOfAccount(String account) throws SQLException
	{
		//String que = "select balance from " + "iPhoneAccount" + " order by Date Desc limit 1";
		String balance = "";

		String que = "select * from " + account + " order by Date Desc limit 1";
		try(
				Connection hahaha = DriverManager.getConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
				Statement listStatement = hahaha.createStatement();
				ResultSet statementExe = listStatement.executeQuery(que);
		)
		{
			while (statementExe.next()) {
				balance = statementExe.getString("Balance");
			}
			return balance;
		}
		catch (SQLException ss)
		{
			ss.printStackTrace();
		}
		return balance;
	}
	public void getAccountList()
	{
		String accountList = "show tables from moneydatabase";

		try(
				Statement sonStatement = hahaha.createStatement();
				ResultSet example = sonStatement.executeQuery(accountList);
				)
		{
			while (example.next())
			{
				String tables = example.getString("Tables_in_moneydatabase");
				this.accountListPre.add(tables);
				//System.out.println(tables);

				//System.out.println(tables.length());
				printAccountNamesWithoutAccount(tables, tables.length());
			}

			//System.out.println("\n\nData pulled and put into a data structure and iterated: ");


		}
		catch (SQLException s)
		{
			s.printStackTrace();
		}
	}
	public void printAccountNamesWithoutAccount(String preName, int lettersInName) {


		final int ThereAreSevenLettersInTheWordAccount = 7;
		int loops = lettersInName - ThereAreSevenLettersInTheWordAccount;
		String postName = "";

		for (int i = 0; i < loops; i++)
		{
			postName = postName + preName.charAt(i);
			//System.out.println("Account: " + postName);

			if (i == (loops -1)) {
				this.accountListPost.add(postName);
			}
		}

		Iterator it = this.accountListPost.iterator();

		//System.out.println("\n\n\nAccounts without the 'Account' in the name: ");


	}

}
