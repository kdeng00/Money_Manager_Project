package sample;

import java.sql.SQLException;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MoneyManagerControls
{

    public MoneyManagerControls()
    {

    }
    private Button checkButton;
    private ComboBox accountDropDown;
    //Uninitialized menu items
    private Menu mmFileMenu, mmEditMenu, mmHelpMenu;
    private MenuBar mmMenuBar;
    private MenuItem saveToDatabase, closeApplication, addPaycheck, manualMoneyTransfer,
            changePercentages, aboutApplication;

    private Label iPhoneFundPercentageLabel, personalEmergencyFundPercentageLabel,
    familyEmergencyFundPercentageLabel, carFundPercentageLabel, investingFundPercentageLabel,
    clothingFundPercentageLabel, supplementFundPercentageLabel, chessSetFundPercentageLabel,
    runningFundPercentageLabel, miscellaneousFundPercentageLabel;
    private TableView moneyStuff;
    private TextField iPhoneFundPercentageTextField, personalEmergencyFundPercentageTextField,
    familyEmergencyFundPercentageTextField, carFundPercentageTextField, investingFundPercentageTextField,
    clothingFundPercentageTextField, supplementFundPercentageTextField, chessSetFundPercentageTextField,
    runningFundPercentageTextField, miscellaneousFundPercentageTextField;
    final private String accountList[] = {"iPhone Account", "Personal Emergency Account", "Family Emergency Account",
            "Car Account", "Investing Account", "Clothing Account", "Supplement Account",
            "Chess Set Account", "Running Account", "Miscellaneous Account"
    };

    //Menu bar mutator
    public void setmmMenuBar(MenuBar mmMenuBar)
    {
        this.mmMenuBar = mmMenuBar;
    }
    //Menu mutators
    public void setmmFileMenu(Menu mmFileMenu)
    {
        this.mmFileMenu = mmFileMenu;
    }
    public void setmmEditMenu(Menu mmEditMenu)
    {
        this.mmEditMenu = mmEditMenu;
    }
    public void setmmHelpMenu(Menu mmHelpMenu)
    {
        this.mmHelpMenu = mmHelpMenu;
    }
    //Menu item mutators
    public void setSaveToDatabase(MenuItem saveToDatabase)
    {
        this.saveToDatabase = saveToDatabase;
    }
    public void setCloseApplication(MenuItem closeApplication)
    {
        this.closeApplication = closeApplication;
    }
    public void setAddPaycheck(MenuItem addPaycheck)
    {
        this.addPaycheck = addPaycheck;
    }
    public void setManualMoneyTransfer(MenuItem manualMoneyTransfer)
    {
        this.manualMoneyTransfer = manualMoneyTransfer;
    }
    public void setChangePercentages(MenuItem changePercentages)
    {
        this.changePercentages = changePercentages;
    }
    public void setAboutApplication(MenuItem aboutApplication)
    {
        this.aboutApplication = aboutApplication;
    }
    //Label mutators
    public void setiPhoneFundPercentageLabel(Label iPhoneFundPercentageLabel)
    {
        this.iPhoneFundPercentageLabel = iPhoneFundPercentageLabel;
    }
    public void setPersonalEmergencyFundPercentageLabel(Label personalEmergencyFundPercentageLabel)
    {
        this.personalEmergencyFundPercentageLabel = personalEmergencyFundPercentageLabel;
    }
    public void setFamilyEmergencyFundPercentageLabel(Label familyEmergencyFundPercentageLabel)
    {
        this.familyEmergencyFundPercentageLabel = familyEmergencyFundPercentageLabel;
    }
    public void setCarFundPercentageLabel(Label carFundPercentageLabel)
    {
        this.carFundPercentageLabel = carFundPercentageLabel;
    }
    public void setInvestingFundPercentageLabel(Label investingFundPercentageLabel)
    {
        this.investingFundPercentageLabel = investingFundPercentageLabel;
    }
    public void setClothingFundPercentageLabel(Label clothingFundPercentageLabel)
    {
        this.clothingFundPercentageLabel = clothingFundPercentageLabel;
    }
    public void setSupplementFundPercentageLabel(Label supplementFundPercentageLabel)
    {
        this.supplementFundPercentageLabel = supplementFundPercentageLabel;
    }
    public void setChessSetFundPercentageLabel(Label chessSetFundPercentageLabel)
    {
        this.chessSetFundPercentageLabel = chessSetFundPercentageLabel;
    }
    public void setRunningFundPercentageLabel(Label runningFundPercentageLabel)
    {
        this.runningFundPercentageLabel = runningFundPercentageLabel;
    }
    public void setMiscellaneousFundPercentageLabel(Label miscellaneousFundPercentageLabel)
    {
        this.miscellaneousFundPercentageLabel = miscellaneousFundPercentageLabel;
    }
    //Text Field mutators
    public void setiPhoneFundPercentageTextField(TextField iPhoneFundPercentageTextField)
    {
        this.iPhoneFundPercentageTextField = iPhoneFundPercentageTextField;
    }
    public void setPersonalEmergencyFundPercentageTextField(TextField personalEmergencyFundPercentageTextField)
    {
        this.personalEmergencyFundPercentageTextField = personalEmergencyFundPercentageTextField;
    }
    public void setFamilyEmergencyFundPercentageTextField(TextField familyEmergencyFundPercentageTextField)
    {
        this.familyEmergencyFundPercentageTextField = familyEmergencyFundPercentageTextField;
    }
    public void setCarFundPercentageTextField(TextField carFundPercentageTextField)
    {
        this.carFundPercentageTextField = carFundPercentageTextField;
    }
    public void setInvestingFundPercentageTextField(TextField investingFundPercentageTextField)
    {
        this.investingFundPercentageTextField = investingFundPercentageTextField;
    }
    public void setClothingFundPercentageTextField(TextField clothingFundPercentageTextField)
    {
        this.clothingFundPercentageTextField = clothingFundPercentageTextField;
    }
    public void setSupplementFundPercentageTextField(TextField supplementFundPercentageTextField)
    {
        this.supplementFundPercentageTextField = supplementFundPercentageTextField;
    }
    public void setChessSetFundPercentageTextField(TextField chessSetFundPercentageTextField)
    {
        this.chessSetFundPercentageTextField = chessSetFundPercentageTextField;
    }
    public void setRunningFundPercentageTextField(TextField runningFundPercentageTextField)
    {
        this.runningFundPercentageTextField = runningFundPercentageTextField;
    }
    public void setMiscellaneousFundPercentageTextField(TextField miscellaneousFundPercentageTextField)
    {
        this.miscellaneousFundPercentageTextField = miscellaneousFundPercentageTextField;
    }
    public void setAccountDropDown(ComboBox accountDropDown)
    {
        this.accountDropDown = accountDropDown;
    }
    public void setCheckButton(Button checkButton)
    {
        this.checkButton = checkButton;
    }

    //Menu bar accessor
    public MenuBar getmmMenuBar()
    {
        //For File Menu
        setmmFileMenu(new Menu("File"));
        setSaveToDatabase(new MenuItem());
        setCloseApplication(new MenuItem());
        getSaveToDatabase().setText("save");
        getCloseApplication().setText("close");
        getCloseApplication().setOnAction(e ->
        {
            System.exit(0);
        });
        getmmFileMenu().getItems().addAll(getSaveToDatabase(), getCloseApplication());

        //For Edit Menu
        setmmEditMenu(new Menu("Edit"));
        setAddPaycheck(new MenuItem());
        setManualMoneyTransfer(new MenuItem());
        setChangePercentages(new MenuItem());
        getAddPaycheck().setText("add paycheck");
        getAddPaycheck().setOnAction(e ->
        {
            newWindowToAddPaycheck();
        });
        getManualMoneyTransfer().setText("transfer money");
        getChangePercentages().setText("change percentages");
        getChangePercentages().setOnAction( e ->
        {
            newWindowToChangePercentages();
        });
        getmmEditMenu().getItems().addAll(getAddPaycheck(), getManualMoneyTransfer(),
                getChangePercentages());

        //For Help Menu
        setmmHelpMenu(new Menu("Help"));
        setAboutApplication(new MenuItem());
        getAboutApplication().setText("info");
        getmmHelpMenu().getItems().add(getAboutApplication());

        MenuBar bars = new MenuBar();
        bars.getMenus().addAll(getmmFileMenu(), getmmEditMenu(), getmmHelpMenu());
        setmmMenuBar(bars);

        return mmMenuBar;
        }
    //Menu accessors
    public Menu getmmFileMenu()
    {
        return mmFileMenu;
    }
    public Menu getmmEditMenu()
    {
        return mmEditMenu;
    }
    public Menu getmmHelpMenu()
    {
        return mmHelpMenu;
    }
    //Menu item accessors
    public MenuItem getSaveToDatabase()
    {
        return saveToDatabase;
    }
    public MenuItem getCloseApplication()
    {
        return closeApplication;
    }
    public MenuItem getAddPaycheck()
    {
        return addPaycheck;
    }
    public MenuItem getManualMoneyTransfer()
    {
        return manualMoneyTransfer;
    }
    public MenuItem getChangePercentages()
    {
        return changePercentages;
    }
    public MenuItem getAboutApplication()
    {
       return aboutApplication;
    }
    //Label Accessors
    public Label getiPhoneFundPercentageLabel()
    {
        return iPhoneFundPercentageLabel;
    }
    public Label getPersonalEmergencyFundPercentageLabel()
    {
        return personalEmergencyFundPercentageLabel;
    }
    public Label getFamilyEmergencyFundPercentageLabel()
    {
        return familyEmergencyFundPercentageLabel;
    }
    public Label getCarFundPercentageLabel()
    {
        return carFundPercentageLabel;
    }
    public Label getInvestingFundPercentageLabel()
    {
        return investingFundPercentageLabel;
    }
    public Label getClothingFundPercentageLabel()
    {
        return clothingFundPercentageLabel;
    }
    public Label getSupplementFundPercentageLabel()
    {
        return supplementFundPercentageLabel;
    }
    public Label getChessSetFundPercentageLabel() {
        return chessSetFundPercentageLabel;
    }
    public Label getRunningFundPercentageLabel()
    {
        return runningFundPercentageLabel;
    }
    public Label getMiscellaneousFundPercentageLabel()
    {
        return miscellaneousFundPercentageLabel;
    }
    //Text Field accessors
    public TextField getiPhoneFundPercentageTextField()
    {
        return iPhoneFundPercentageTextField;
    }
    public TextField getPersonalEmergencyFundPercentageTextField()
    {
        return personalEmergencyFundPercentageTextField;
    }
    public TextField getFamilyEmergencyFundPercentageTextField()
    {
        return familyEmergencyFundPercentageTextField;
    }
    public TextField getCarFundPercentageTextField()
    {
        return carFundPercentageTextField;
    }
    public TextField getInvestingFundPercentageTextField()
    {
        return investingFundPercentageTextField;
    }
    public TextField getClothingFundPercentageTextField()
    {
        return clothingFundPercentageTextField;
    }
    public TextField getSupplementFundPercentageTextField()
    {
        return supplementFundPercentageTextField;
    }
    public TextField getChessSetFundPercentageTextField()
    {
        return chessSetFundPercentageTextField;
    }
    public TextField getRunningFundPercentageTextField()
    {
        return runningFundPercentageTextField;
    }
    public TextField getMiscellaneousFundPercentageTextField()
    {
        return miscellaneousFundPercentageTextField;
    }
    public Button getCheckButton()
    {
        return checkButton;
    }
    public ComboBox getAccountDropDown()
    {
        return accountDropDown;
    }
    public String[] getAccountList()
    {
        return accountList;
    }


    /*
     * Need to figure out a way that when the button is pressed it will take the selected
     * text from the Combo Box - which is not in the same format as the tables in the
     * database - and grab the corressponding table in the database and display the
     * transaction. What that means is I should be able to effortlessly select a text
     * from the drop-down box, press the button and the contents of the table will be
     * displayed from the database to the table view and table columns.
     *
     * I might run into issues such as missing table columns, logical errors, etc.
     */

    public HBox comboBoxAndButton()
    {
        AccountData ad = new AccountData();
        HBox topOfCenterThis = new HBox();
        //ad.setComboColumData();

        setAccountDropDown(new ComboBox());
        getAccountDropDown().getItems().addAll(getAccountList());
        setCheckButton(new Button("^"));

        Stage yes = new Stage();
        TextField tf = new TextField(""+((Math.random())*100));
        Scene cumDumpster = new Scene(tf);
        yes.setScene(cumDumpster);
        yes.setWidth(300);
        yes.setHeight(300);


        /**
        getCheckButton().setOnAction(e ->
        {
            AccountData junkInTheTrunk = new AccountData();
            junkInTheTrunk.setComboColumData();

            DatabaseConnection dbsql;

            try {
                Main mm = new Main();
                dbsql = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");

                dbsql.setAccount( junkInTheTrunk.getComboColumData().get(getAccountDropDown().getValue())  );

                returnMoneyStuff().getItems().clear();
                returnMoneyStuff().getItems().addAll(dbsql.getAccountInfo());
                mm.getbp().setCenter(returnMoneyStuff());

            }
            catch (SQLException s)
            {
                s.printStackTrace();
            }

        });
        */
        topOfCenterThis.setSpacing(20);
        getAccountDropDown().setMinSize(650, 20);
        topOfCenterThis.getChildren().addAll(getAccountDropDown(), getCheckButton());

        return topOfCenterThis;
    }



    public VBox bpCenterSetup()
    {
        VBox centerThis = new VBox();

        centerThis.getChildren().addAll(comboBoxAndButton(), returnMoneyStuff());

        centerThis.setSpacing(20);
        centerThis.setPadding(new Insets(200,50,200,50));

        return centerThis;
    }
    public VBox bpCenterSetup(TableView returnMoneyStuff)
    {
        VBox centerThis = new VBox();

        centerThis.getChildren().addAll(comboBoxAndButton(), returnMoneyStuff);

        centerThis.setSpacing(20);
        centerThis.setPadding(new Insets(200, 50, 200, 50));

        return centerThis;
    }
    public void listCurrentPercentages(AccountPercentages percentageStorage)
    {
        getiPhoneFundPercentageTextField().setText("" + (percentageStorage.getiPhoneBatteryFundPercentage() * 100));
        getPersonalEmergencyFundPercentageTextField().setText("" + (percentageStorage.getPersonalEmergencyFundPercentage() * 100));
        getFamilyEmergencyFundPercentageTextField().setText("" + (percentageStorage.getFamilyEmergencyFundPercentage() * 100));
        getCarFundPercentageTextField().setText("" + (percentageStorage.getCarFundPercentage() * 100));
        getInvestingFundPercentageTextField().setText("" + (percentageStorage.getInvestingFundPercentage() * 100));
        getClothingFundPercentageTextField().setText("" + (percentageStorage.getClothingFundPercentage() * 100));
        getSupplementFundPercentageTextField().setText("" + (percentageStorage.getSupplementFundPercentage() * 100));
        getChessSetFundPercentageTextField().setText("" + (percentageStorage.getChessSetFundPercentage() * 100));
        getRunningFundPercentageTextField().setText("" + (percentageStorage.getRunningFundPercentage() * 100));
        getMiscellaneousFundPercentageTextField().setText("" + (percentageStorage.getMiscellaneousFundPercentage() * 100));
    }
    public void setUpdatePercentages(AccountPercentages percentagesStorage)
    {
        percentagesStorage.setiPhoneBatteryFundPercentage(stringToDouble(getiPhoneFundPercentageTextField().getText()));
        percentagesStorage.setPersonalEmergencyFundPercentage(stringToDouble(getPersonalEmergencyFundPercentageTextField().getText()));
        percentagesStorage.setFamilyEmergencyFundPercentage(stringToDouble(getFamilyEmergencyFundPercentageTextField().getText()));
        percentagesStorage.setCarFundPercentage(stringToDouble(getCarFundPercentageTextField().getText()));
        percentagesStorage.setInvestingFundPercentage(stringToDouble(getInvestingFundPercentageTextField().getText()));
        percentagesStorage.setClothingFundPercentage(stringToDouble(getClothingFundPercentageTextField().getText()));
        percentagesStorage.setSupplementFundPercentage(stringToDouble(getSupplementFundPercentageTextField().getText()));
        percentagesStorage.setChessSetFundPercentage(stringToDouble(getChessSetFundPercentageTextField().getText()));
        percentagesStorage.setRunningFundPercentage(stringToDouble(getRunningFundPercentageTextField().getText()));
        percentagesStorage.setMiscellaneousFundPercentage(stringToDouble(getMiscellaneousFundPercentageTextField().getText()));
    }
    public void newWindowToChangePercentages()
    {
        Stage percentageStage = new Stage();
        BorderPane percentageBorderPane = new BorderPane();
        AccountPercentages percentageStorage = new AccountPercentages();


        VBox percentageLabels = new VBox();

        setiPhoneFundPercentageLabel(new Label("iPhone Percentage"));
        setPersonalEmergencyFundPercentageLabel(new Label("Personal Emergency Percentage"));
        setFamilyEmergencyFundPercentageLabel(new Label("Family Emergency Percentage"));
        setCarFundPercentageLabel(new Label("Car Percentage"));
        setInvestingFundPercentageLabel(new Label("Investing Percentage"));
        setClothingFundPercentageLabel(new Label("Clothing Percentage"));
        setSupplementFundPercentageLabel(new Label("Supplement Percentage"));
        setChessSetFundPercentageLabel(new Label("Chess Set Percentage"));
        setRunningFundPercentageLabel(new Label("Running Percentage"));
        setMiscellaneousFundPercentageLabel(new Label("Miscellaneous Percentage"));

        percentageLabels.getChildren().addAll(getiPhoneFundPercentageLabel(), getPersonalEmergencyFundPercentageLabel(),
                getFamilyEmergencyFundPercentageLabel(), getCarFundPercentageLabel(), getInvestingFundPercentageLabel(),
                getClothingFundPercentageLabel(), getSupplementFundPercentageLabel(), getChessSetFundPercentageLabel(),
                getRunningFundPercentageLabel(), getMiscellaneousFundPercentageLabel());
        percentageLabels.setPadding(new Insets(10, 10, 10, 10));
        percentageLabels.setSpacing(20);

        VBox percentageTextFields = new VBox();

        setiPhoneFundPercentageTextField(new TextField());
        getiPhoneFundPercentageTextField().setPromptText("Enter Percentage");
        setPersonalEmergencyFundPercentageTextField(new TextField());
        getPersonalEmergencyFundPercentageTextField().setPromptText("Enter Percentage");
        setFamilyEmergencyFundPercentageTextField(new TextField());
        getFamilyEmergencyFundPercentageTextField().setPromptText("Enter Percentage");
        setCarFundPercentageTextField(new TextField());
        getCarFundPercentageTextField().setPromptText("Enter Percentage");
        setInvestingFundPercentageTextField(new TextField());
        getInvestingFundPercentageTextField().setPromptText("Enter Percentage");
        setClothingFundPercentageTextField(new TextField());
        getClothingFundPercentageTextField().setPromptText("Enter Percentage");
        setSupplementFundPercentageTextField(new TextField());
        getSupplementFundPercentageTextField().setPromptText("Enter Percentage");
        setChessSetFundPercentageTextField(new TextField());
        getChessSetFundPercentageTextField().setPromptText("Enter Percentage");
        setRunningFundPercentageTextField(new TextField());
        getRunningFundPercentageTextField().setPromptText("Enter Percentage");
        setMiscellaneousFundPercentageTextField(new TextField());
        getMiscellaneousFundPercentageTextField().setPromptText("Enter Percentage");

        percentageTextFields.getChildren().addAll(getiPhoneFundPercentageTextField(), getPersonalEmergencyFundPercentageTextField(),
                getFamilyEmergencyFundPercentageTextField(), getCarFundPercentageTextField(), getInvestingFundPercentageTextField(),
                getClothingFundPercentageTextField(), getSupplementFundPercentageTextField(), getChessSetFundPercentageTextField(),
                getRunningFundPercentageTextField(), getMiscellaneousFundPercentageTextField());
        percentageTextFields.setPadding(new Insets(10, 10, 10, 10));
        percentageTextFields.setSpacing(10);


        Menu percentageEditMenu = new Menu("Edit");
        MenuItem currentPercentages, updatePercentages, closePercentages;

        currentPercentages = new MenuItem("Load Current Percentages");
        currentPercentages.setOnAction(e ->
        {
            listCurrentPercentages(percentageStorage);
        });
        updatePercentages = new MenuItem("Update Percentages");
        updatePercentages.setOnAction(e ->
        {
            setUpdatePercentages(percentageStorage);
        });
        closePercentages = new MenuItem("Close Percentages Window");
        closePercentages.setOnAction(e ->
        {
            percentageStage.close();
        });

        percentageEditMenu.getItems().addAll(currentPercentages, updatePercentages, closePercentages);

        VBox percentageSign = new VBox();
        for (int i = 0; i < 10; i++)
        {
            percentageSign.getChildren().add(i, new Label("%"));
        }
        percentageSign.setSpacing(21);
        percentageSign.setPadding(new Insets(10, 10, 10, 10));

        percentageBorderPane.setTop(new MenuBar(percentageEditMenu));
        percentageBorderPane.setLeft(percentageLabels);
        percentageBorderPane.setCenter(percentageTextFields);
        percentageBorderPane.setRight(percentageSign);


        Scene percentageScene = new Scene(percentageBorderPane);

        percentageStage.setMinHeight(400);
        percentageStage.setMinWidth(300);
        percentageStage.setScene(percentageScene);
        percentageStage.show();
    }
    public void newWindowToAddPaycheck()
    {
        Stage addMoneyStage = new Stage();
        BorderPane bpAddMoney = new BorderPane();
        VBox vbAddMoneyLeft = new VBox();
        VBox vbAddMoneyCenter = new VBox();
        VBox vbAddMoneyRight = new VBox();

        Label paycheckLabel = new Label("Paycheck");
        Label deductionLabel = new Label("Deduction");

        TextField paycheckTextField = new TextField();
        TextField deductionTextField = new TextField();

        Button doTheDeedButton = new Button(" x ");
        Button changeDeductionTypeButton = new Button(" - ");
        changeDeductionTypeButton.setOnAction(e ->
        {
            if (changeDeductionTypeButton.getText().equalsIgnoreCase(" - "))
            {
                changeDeductionTypeButton.setText("%");
            }
            else if (changeDeductionTypeButton.getText().equalsIgnoreCase("%"))
            {
                changeDeductionTypeButton.setText(" - ");
            }
        });
        doTheDeedButton.setOnAction(e ->
        {
            PaycheckAndDeductions paycheckStuff = new PaycheckAndDeductions();
            paycheckStuff.setPaycheck(Double.parseDouble(paycheckTextField.getText()));

            if (changeDeductionTypeButton.getText().equalsIgnoreCase(" - "))
            {
                paycheckStuff.setDeductionNumber(Double.parseDouble(deductionTextField.getText()));
                paycheckStuff.setNetDistribute(calculateNetDistributeWithNumber(paycheckStuff.getPaycheck(), paycheckStuff.getDeductionNumber()));
            }
            else if (changeDeductionTypeButton.getText().equalsIgnoreCase("%"))
            {
                paycheckStuff.setDeductionPercentage(Double.parseDouble(deductionTextField.getText()));
                paycheckStuff.setNetDistribute(calculateNetDistributeWithPercentage(paycheckStuff.getPaycheck(), paycheckStuff.getDeductionPercentage()));
            }

                paycheckLabel.setText(""+paycheckStuff.getNetDistribute());
        });

        vbAddMoneyLeft.getChildren().addAll(paycheckLabel, deductionLabel);
        vbAddMoneyCenter.getChildren().addAll(paycheckTextField, deductionTextField);
        vbAddMoneyRight.getChildren().addAll(doTheDeedButton, changeDeductionTypeButton);

        vbAddMoneyLeft.setSpacing(35);
        vbAddMoneyLeft.setPadding(new Insets(150, 10, 10, 10));
        vbAddMoneyCenter.setSpacing(20);
        vbAddMoneyCenter.setPadding(new Insets(150, 10, 10, 10));
        vbAddMoneyRight.setSpacing(20);
        vbAddMoneyRight.setPadding(new Insets(150, 10, 10, 10));

        bpAddMoney.setLeft(vbAddMoneyLeft);
        bpAddMoney.setCenter(vbAddMoneyCenter);
        bpAddMoney.setRight(vbAddMoneyRight);

        Scene addMoneyScene = new Scene(bpAddMoney);

        addMoneyStage.setScene(addMoneyScene);
        addMoneyStage.setWidth(450);
        addMoneyStage.setHeight(500);
        addMoneyStage.show();
    }
    public double calculateNetDistributeWithNumber(double paycheck, double number)
    {
        double netDistribute = paycheck - number;

        return netDistribute;
    }
    public double calculateNetDistributeWithPercentage(double paycheck, double percentage)
    {
        double netDistribute = paycheck * (percentage / 100);

        return netDistribute;
    }

    public void setMoneyStuff(TableView moneyStuff)
    {
        this.moneyStuff = moneyStuff;
    }
    public TableView returnMoneyStuff()
    {
        TableView ms = new TableView();

        TableColumn date = new TableColumn("date");
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        date.setMinWidth(100);
        TableColumn account = new TableColumn("Account");
        account.setCellValueFactory(new PropertyValueFactory<>("Account"));
        account.setMinWidth(100);
        TableColumn balance = new TableColumn("Balance");
        balance.setCellValueFactory(new PropertyValueFactory<>("Balance"));
        balance.setMinWidth(100);
        TableColumn transactionType = new TableColumn("Transaction_Type");
        transactionType.setCellValueFactory(new PropertyValueFactory<>("Transaction_Type"));
        transactionType.setMinWidth(150);
        TableColumn transaction = new TableColumn("Transaction");
        transaction.setCellValueFactory(new PropertyValueFactory<>("Transaction"));
        transaction.setMinWidth(100);
        TableColumn comment = new TableColumn("Comment");
        comment.setCellValueFactory(new PropertyValueFactory<>("Comment"));
        comment.setMinWidth(100);

        String bangBang[] = {"Blaow", "Sophisticated", "So Icy"};


        ms.getColumns().addAll(date, account, balance, transactionType, transaction, comment);
        setMoneyStuff(ms);

        return moneyStuff;
    }
    public double stringToDouble(String percentageString)
    {
        return (Double.parseDouble(percentageString) / 100);
    }
}
