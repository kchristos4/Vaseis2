package mye030.DBMS_data_visualization;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import mye030.DBMS_data_visualization.controller.DBcontroller;
import mye030.DBMS_data_visualization.DAO.*;
import mye030.DBMS_data_visualization.services.CountryImpl;
import mye030.DBMS_data_visualization.services.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


import mye030.DBMS_data_visualization.*;
import mye030.DBMS_data_visualization.entities.Country;


@SpringBootApplication
@ComponentScan("mye030.DBMS_data_visualization.dao")
public class GraphicalInterface extends JFrame implements CommandLineRunner{

 





private JPanel contentPane;
  @Autowired
  private CountryDAO CountryRepository;
  @Autowired
  private AgeSpecificFertilityRateDAO AgeSpecificFertilityRateRepository;
  @Autowired
  private BirthDeathGrowthRateDAO BirthDeathGrowthRateRepository;
  @Autowired
  private CountryNamesAreaDAO CountryNamesAreaRepository;
  @Autowired
  private DomesticCreditDAO DomesticCreditRepository;
  @Autowired
  private EstimatedGniFemaleDAO EstimatedGniFemaleRepository;
  @Autowired
  private EstimatedGniMaleDAO EstimatedGniMaleRepository;
  @Autowired
  private GdpPerCapitaDAO GdpPerCapitaRepository;
  @Autowired
  private GdpTotalDAO GdpTotalRepository;
  @Autowired
  private GniPerCapitaDAO GniPerCapitaRepository;
  @Autowired
  private GrossFixedCapitalFormationDAO GrossFixedCapitalFormationRepository;
  @Autowired
  private IncomeIndexDAO IncomeIndexRepository;
  @Autowired
  private LabourShareOfGdpDAO LabourShareOfGdpRepository;
  @Autowired
  private MidyearPopulation5yrAgeSexDAO MidyearPopulation5yrAgeSexRepository;
  @Autowired
  private MidyearPopulationAgeCountryCodeDAO MidyearPopulationAgeCountryCodeRepository;
  @Autowired
  private MidyearPopulationAgeSexDAO MidyearPopulationAgeSexRepository;
  @Autowired
  private MidyearPopulationDAO MidyearPopulationRepository;
  @Autowired
  private MortalityLifeExpectancyDAO MortalityLifeExpectancyRepository;
  
  //@Autowired
  //private countriesImpl CService = new countriesImpl(CountryRepository);
  //private DBcontroller Manager = new DBcontroller();
  //private String taxpayersTRN = new String();
  //private JTextField txtTaxRegistrationNumber;
  
  public static void main(String[] args) {
	ConfigurableApplicationContext ctx = new SpringApplicationBuilder(GraphicalInterface.class).headless(false).run(args);
	//SpringApplication.run(GraphicalInterface.class, args);  
    
  }
  
 
  public void run(String... args) throws Exception {
	  EventQueue.invokeLater(new Runnable() {
	      public void run() {
	        try {
	          GraphicalInterface frame = new GraphicalInterface(CountryRepository,
	      			AgeSpecificFertilityRateRepository,
	    			BirthDeathGrowthRateRepository, CountryNamesAreaRepository,
	    			DomesticCreditRepository, EstimatedGniFemaleRepository,
	    			EstimatedGniMaleRepository, GdpPerCapitaRepository,
	    			GdpTotalRepository, GniPerCapitaRepository,
	    			GrossFixedCapitalFormationRepository, IncomeIndexRepository,
	    			LabourShareOfGdpRepository,
	    			MidyearPopulation5yrAgeSexRepository,
	    			MidyearPopulationAgeCountryCodeRepository,
	    			MidyearPopulationAgeSexRepository,
	    			MidyearPopulationRepository,
	    			MortalityLifeExpectancyRepository);
	          frame.initialize();
	          frame.setVisible(true);
	        } catch (Exception e) {
	          e.printStackTrace();
	        }
	      }
	    });
  }
  
  @Autowired
  public GraphicalInterface(CountryDAO countryRepository,
			AgeSpecificFertilityRateDAO ageSpecificFertilityRateRepository,
			BirthDeathGrowthRateDAO birthDeathGrowthRateRepository, CountryNamesAreaDAO countryNamesAreaRepository,
			DomesticCreditDAO domesticCreditRepository, EstimatedGniFemaleDAO estimatedGniFemaleRepository,
			EstimatedGniMaleDAO estimatedGniMaleRepository, GdpPerCapitaDAO gdpPerCapitaRepository,
			GdpTotalDAO gdpTotalRepository, GniPerCapitaDAO gniPerCapitaRepository,
			GrossFixedCapitalFormationDAO grossFixedCapitalFormationRepository, IncomeIndexDAO incomeIndexRepository,
			LabourShareOfGdpDAO labourShareOfGdpRepository,
			MidyearPopulation5yrAgeSexDAO midyearPopulation5yrAgeSexRepository,
			MidyearPopulationAgeCountryCodeDAO midyearPopulationAgeCountryCodeRepository,
			MidyearPopulationAgeSexDAO midyearPopulationAgeSexRepository,
			MidyearPopulationDAO midyearPopulationRepository,
			MortalityLifeExpectancyDAO mortalityLifeExpectancyRepository){
		
		CountryRepository = countryRepository;
		AgeSpecificFertilityRateRepository = ageSpecificFertilityRateRepository;
		BirthDeathGrowthRateRepository = birthDeathGrowthRateRepository;
		CountryNamesAreaRepository = countryNamesAreaRepository;
		DomesticCreditRepository = domesticCreditRepository;
		EstimatedGniFemaleRepository = estimatedGniFemaleRepository;
		EstimatedGniMaleRepository = estimatedGniMaleRepository;
		GdpPerCapitaRepository = gdpPerCapitaRepository;
		GdpTotalRepository = gdpTotalRepository;
		GniPerCapitaRepository = gniPerCapitaRepository;
		GrossFixedCapitalFormationRepository = grossFixedCapitalFormationRepository;
		IncomeIndexRepository = incomeIndexRepository;
		LabourShareOfGdpRepository = labourShareOfGdpRepository;
		MidyearPopulation5yrAgeSexRepository = midyearPopulation5yrAgeSexRepository;
		MidyearPopulationAgeCountryCodeRepository = midyearPopulationAgeCountryCodeRepository;
		MidyearPopulationAgeSexRepository = midyearPopulationAgeSexRepository;
		MidyearPopulationRepository = midyearPopulationRepository;
		MortalityLifeExpectancyRepository = mortalityLifeExpectancyRepository;
	}
  
  
  public void initialize() {
	  
	CountryImpl CService = new CountryImpl(CountryRepository,
  			AgeSpecificFertilityRateRepository,
			BirthDeathGrowthRateRepository, CountryNamesAreaRepository,
			DomesticCreditRepository, EstimatedGniFemaleRepository,
			EstimatedGniMaleRepository, GdpPerCapitaRepository,
			GdpTotalRepository, GniPerCapitaRepository,
			GrossFixedCapitalFormationRepository, IncomeIndexRepository,
			LabourShareOfGdpRepository,
			MidyearPopulation5yrAgeSexRepository,
			MidyearPopulationAgeCountryCodeRepository,
			MidyearPopulationAgeSexRepository,
			MidyearPopulationRepository,
			MortalityLifeExpectancyRepository);
	//System.out.println(CService.findAll().size());			
	//System.out.println(CountryRepository.findAll().get(100).getOfficial_Name());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 480, 530);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(204, 204, 204));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | UnsupportedLookAndFeelException e2) {
      e2.printStackTrace();
    }
    

    
    DBcontroller Manager = new DBcontroller(CService);
    JComboBox<String> countriesDropDownMenu = new JComboBox<>();
    List<String> countriesList = Manager.getCountries();
    for (String c : countriesList) {
    	countriesDropDownMenu.addItem(c);
    }
    JButton buttonAddCountry = new JButton("Add country");
    List<String> selectedCountries = new ArrayList<>();
    DefaultListModel<String> selectedCountriesListModel = new DefaultListModel<>();
    JList<String> selectedCountriesList = new JList<>(selectedCountriesListModel);
    JScrollPane scrollPane = new JScrollPane(selectedCountriesList);

    buttonAddCountry.addActionListener(e -> {
        String selectedCountry = (String) countriesDropDownMenu.getSelectedItem();
        if (!selectedCountries.contains(selectedCountry)) {//if its not already in the selected countries list
        	selectedCountries.add(selectedCountry);
            selectedCountriesListModel.addElement(selectedCountry);
        }
        
    });
    
    
    
    List<String> indicesList = Manager.getIndices();
    JComboBox<String> XIndicesDropDownMenu = new JComboBox<>();
    for (String i : indicesList) {
    	XIndicesDropDownMenu.addItem(i);
    }
    
    JComboBox<String> YIndicesDropDownMenu = new JComboBox<>();
    for (String i : indicesList) {
    	YIndicesDropDownMenu.addItem(i);
    }
    
    
    
    JTextField LowerRangeField = new JTextField();
    JTextField UpperRangeField = new JTextField();

    JCheckBox scatterCheckBox = new JCheckBox("Scatter Plot");
    JCheckBox barCheckBox = new JCheckBox("Barchart");
    JCheckBox lineCheckBox = new JCheckBox("Trendline");
    JLabel lowLabel = new JLabel("From :");
    JLabel highLabel = new JLabel("To :");
    JLabel yearRange = new JLabel("Year Range");
    
    
    JButton btnDeleteCountry = new JButton("Delete Country");
    btnDeleteCountry.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
    	  try {
    	  selectedCountries.remove(selectedCountriesList.getSelectedValue());
    	  selectedCountriesListModel.remove(selectedCountriesList.getSelectedIndex());
    	  }
    	  catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("No Country Selected.Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
          }
      }
    });
    
    
    
    
    
    
    JButton SubmitButton = new JButton("Submit");
    SubmitButton.addActionListener(e -> {
        String Lo = LowerRangeField.getText();
        String Up = UpperRangeField.getText();
        String Xindex = XIndicesDropDownMenu.getSelectedItem().toString();
        String Yindex = YIndicesDropDownMenu.getSelectedItem().toString();
        System.out.println(Xindex + " " + Yindex);
        List<List<List<String>>> Data = new ArrayList<>();
        try {
			Data = Manager.createGraphs(selectedCountries,Xindex,Yindex,Lo,Up);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        if(scatterCheckBox.isSelected()) {
        	ChartDisplay.createScatterPlot(Data,selectedCountries,Xindex,Yindex);
        }
        if(barCheckBox.isSelected()) {
        	ChartDisplay.createBarChart(Data,Xindex,Yindex);
        }
        if(lineCheckBox.isSelected()) {
        	ChartDisplay.createLineChart(Data,selectedCountries,Xindex,Yindex);
        }
    });
    
    
    countriesDropDownMenu.setBounds(5, 10, 150, 25);
    buttonAddCountry.setBounds(5, 45, 150, 25);
    btnDeleteCountry.setBounds(5, 80, 150, 25);
    scrollPane.setBounds(5, 115, 300, 120);
    LowerRangeField.setBounds(45, 275, 110, 25);
    UpperRangeField.setBounds(45, 310, 110, 25);
    XIndicesDropDownMenu.setBounds(5, 345, 150, 25);
    YIndicesDropDownMenu.setBounds(5, 380, 150, 25);
    scatterCheckBox.setBounds(5, 415, 150, 25);
    barCheckBox.setBounds(160, 415, 150, 25);
    lineCheckBox.setBounds(315, 415, 150, 25);
    SubmitButton.setBounds(160, 450, 150, 30);
    lowLabel.setBounds(5, 275, 40, 25);
    highLabel.setBounds(5, 310, 40, 25);
    yearRange.setBounds(65, 255, 70, 25);


    contentPane.add(countriesDropDownMenu);
    contentPane.add(buttonAddCountry);
    contentPane.add(XIndicesDropDownMenu);
    contentPane.add(YIndicesDropDownMenu);
    contentPane.add(SubmitButton);
    contentPane.add(UpperRangeField);
    contentPane.add(LowerRangeField);
    contentPane.add(scrollPane);
    contentPane.add(scatterCheckBox);
    contentPane.add(barCheckBox);
    contentPane.add(lineCheckBox);
    contentPane.add(btnDeleteCountry);
    contentPane.add(lowLabel);
    contentPane.add(highLabel);
    contentPane.add(yearRange);

  }


}