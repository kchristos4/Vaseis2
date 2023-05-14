package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="midyear_population_age_sex")
public class midyear_population_age_sex {
	
	@EmbeddedId
	private CK_ISO_code_Year_Sex ISO_code_Year_Sex;
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	

    @Column(name="max_age")
	private String max_age;

    @Column(name="population_age_0")
	private String population_age_0;

    @Column(name="population_age_1")
	private String population_age_1;

    @Column(name="population_age_2")
	private String population_age_2;

    @Column(name="population_age_3")
	private String population_age_3;

    @Column(name="population_age_4")
	private String population_age_4;

    @Column(name="population_age_5")
	private String population_age_5;

    @Column(name="population_age_6")
	private String population_age_6;

    @Column(name="population_age_7")
	private String population_age_7;

    @Column(name="population_age_8")
	private String population_age_8;

    @Column(name="population_age_9")
	private String population_age_9;

    @Column(name="population_age_10")
	private String population_age_10;

    @Column(name="population_age_11")
	private String population_age_11;

    @Column(name="population_age_12")
	private String population_age_12;

    @Column(name="population_age_13")
	private String population_age_13;

    @Column(name="population_age_14")
	private String population_age_14;

    @Column(name="population_age_15")
	private String population_age_15;

    @Column(name="population_age_16")
	private String population_age_16;

    @Column(name="population_age_17")
	private String population_age_17;

    @Column(name="population_age_18")
	private String population_age_18;

    @Column(name="population_age_19")
	private String population_age_19;

    @Column(name="population_age_20")
	private String population_age_20;

    @Column(name="population_age_21")
	private String population_age_21;

    @Column(name="population_age_22")
	private String population_age_22;

    @Column(name="population_age_23")
	private String population_age_23;

    @Column(name="population_age_24")
	private String population_age_24;

    @Column(name="population_age_25")
	private String population_age_25;

    @Column(name="population_age_26")
	private String population_age_26;

    @Column(name="population_age_27")
	private String population_age_27;

    @Column(name="population_age_28")
	private String population_age_28;

    @Column(name="population_age_29")
	private String population_age_29;

    @Column(name="population_age_30")
	private String population_age_30;

    @Column(name="population_age_31")
	private String population_age_31;

    @Column(name="population_age_32")
	private String population_age_32;

    @Column(name="population_age_33")
	private String population_age_33;

    @Column(name="population_age_34")
	private String population_age_34;

    @Column(name="population_age_35")
	private String population_age_35;

    @Column(name="population_age_36")
	private String population_age_36;

    @Column(name="population_age_37")
	private String population_age_37;

    @Column(name="population_age_38")
	private String population_age_38;

    @Column(name="population_age_39")
	private String population_age_39;

    @Column(name="population_age_40")
	private String population_age_40;

    @Column(name="population_age_41")
	private String population_age_41;

    @Column(name="population_age_42")
	private String population_age_42;

    @Column(name="population_age_43")
	private String population_age_43;

    @Column(name="population_age_44")
	private String population_age_44;

    @Column(name="population_age_45")
	private String population_age_45;

    @Column(name="population_age_46")
	private String population_age_46;

    @Column(name="population_age_47")
	private String population_age_47;

    @Column(name="population_age_48")
	private String population_age_48;

    @Column(name="population_age_49")
	private String population_age_49;

    @Column(name="population_age_50")
	private String population_age_50;

    @Column(name="population_age_51")
	private String population_age_51;

    @Column(name="population_age_52")
	private String population_age_52;

    @Column(name="population_age_53")
	private String population_age_53;

    @Column(name="population_age_54")
	private String population_age_54;

    @Column(name="population_age_55")
	private String population_age_55;

    @Column(name="population_age_56")
	private String population_age_56;

    @Column(name="population_age_57")
	private String population_age_57;

    @Column(name="population_age_58")
	private String population_age_58;

    @Column(name="population_age_59")
	private String population_age_59;

    @Column(name="population_age_60")
	private String population_age_60;

    @Column(name="population_age_61")
	private String population_age_61;

    @Column(name="population_age_62")
	private String population_age_62;

    @Column(name="population_age_63")
	private String population_age_63;

    @Column(name="population_age_64")
	private String population_age_64;

    @Column(name="population_age_65")
	private String population_age_65;

    @Column(name="population_age_66")
	private String population_age_66;

    @Column(name = "population_age_67")
private String population_age_67;

@Column(name = "population_age_68")
private String population_age_68;

@Column(name = "population_age_69")
private String population_age_69;

@Column(name = "population_age_70")
private String population_age_70;

@Column(name = "population_age_71")
private String population_age_71;

@Column(name = "population_age_72")
private String population_age_72;

@Column(name = "population_age_73")
private String population_age_73;

@Column(name = "population_age_74")
private String population_age_74;

@Column(name = "population_age_75")
private String population_age_75;

@Column(name = "population_age_76")
private String population_age_76;

@Column(name = "population_age_77")
private String population_age_77;

@Column(name = "population_age_78")
private String population_age_78;

@Column(name = "population_age_79")
private String population_age_79;

@Column(name = "population_age_80")
private String population_age_80;

@Column(name = "population_age_81")
private String population_age_81;

@Column(name = "population_age_82")
private String population_age_82;

@Column(name = "population_age_83")
private String population_age_83;

@Column(name = "population_age_84")
private String population_age_84;

@Column(name = "population_age_85")
private String population_age_85;

@Column(name = "population_age_86")
private String population_age_86;

@Column(name = "population_age_87")
private String population_age_87;

@Column(name = "population_age_88")
private String population_age_88;

@Column(name = "population_age_89")
private String population_age_89;

@Column(name = "population_age_90")
private String population_age_90;

@Column(name = "population_age_91")
private String population_age_91;

@Column(name = "population_age_92")
private String population_age_92;

@Column(name = "population_age_93")
private String population_age_93;

@Column(name = "population_age_94")
private String population_age_94;

@Column(name = "population_age_95")
private String population_age_95;

@Column(name = "population_age_96")
private String population_age_96;

@Column(name = "population_age_97")
private String population_age_97;

@Column(name = "population_age_98")
private String population_age_98;

@Column(name = "population_age_99")
private String population_age_99;

@Column(name = "population_age_100")
private String population_age_100;


	
	@Override
	public String toString() {
		return "";
	}



	public CK_ISO_code_Year_Sex getISO_code_Year_Sex() {
		return ISO_code_Year_Sex;
	}



	public String getCountry_code() {
		return country_code;
	}



	public String getCountry_name() {
		return country_name;
	}



	public String getMax_age() {
		return max_age;
	}



	public String getPopulation_age_0() {
		return population_age_0;
	}



	public String getPopulation_age_1() {
		return population_age_1;
	}



	public String getPopulation_age_2() {
		return population_age_2;
	}



	public String getPopulation_age_3() {
		return population_age_3;
	}



	public String getPopulation_age_4() {
		return population_age_4;
	}



	public String getPopulation_age_5() {
		return population_age_5;
	}



	public String getPopulation_age_6() {
		return population_age_6;
	}



	public String getPopulation_age_7() {
		return population_age_7;
	}



	public String getPopulation_age_8() {
		return population_age_8;
	}



	public String getPopulation_age_9() {
		return population_age_9;
	}



	public String getPopulation_age_10() {
		return population_age_10;
	}



	public String getPopulation_age_11() {
		return population_age_11;
	}



	public String getPopulation_age_12() {
		return population_age_12;
	}



	public String getPopulation_age_13() {
		return population_age_13;
	}



	public String getPopulation_age_14() {
		return population_age_14;
	}



	public String getPopulation_age_15() {
		return population_age_15;
	}



	public String getPopulation_age_16() {
		return population_age_16;
	}



	public String getPopulation_age_17() {
		return population_age_17;
	}



	public String getPopulation_age_18() {
		return population_age_18;
	}



	public String getPopulation_age_19() {
		return population_age_19;
	}



	public String getPopulation_age_20() {
		return population_age_20;
	}



	public String getPopulation_age_21() {
		return population_age_21;
	}



	public String getPopulation_age_22() {
		return population_age_22;
	}



	public String getPopulation_age_23() {
		return population_age_23;
	}



	public String getPopulation_age_24() {
		return population_age_24;
	}



	public String getPopulation_age_25() {
		return population_age_25;
	}



	public String getPopulation_age_26() {
		return population_age_26;
	}



	public String getPopulation_age_27() {
		return population_age_27;
	}



	public String getPopulation_age_28() {
		return population_age_28;
	}



	public String getPopulation_age_29() {
		return population_age_29;
	}



	public String getPopulation_age_30() {
		return population_age_30;
	}



	public String getPopulation_age_31() {
		return population_age_31;
	}



	public String getPopulation_age_32() {
		return population_age_32;
	}



	public String getPopulation_age_33() {
		return population_age_33;
	}



	public String getPopulation_age_34() {
		return population_age_34;
	}



	public String getPopulation_age_35() {
		return population_age_35;
	}



	public String getPopulation_age_36() {
		return population_age_36;
	}



	public String getPopulation_age_37() {
		return population_age_37;
	}



	public String getPopulation_age_38() {
		return population_age_38;
	}



	public String getPopulation_age_39() {
		return population_age_39;
	}



	public String getPopulation_age_40() {
		return population_age_40;
	}



	public String getPopulation_age_41() {
		return population_age_41;
	}



	public String getPopulation_age_42() {
		return population_age_42;
	}



	public String getPopulation_age_43() {
		return population_age_43;
	}



	public String getPopulation_age_44() {
		return population_age_44;
	}



	public String getPopulation_age_45() {
		return population_age_45;
	}



	public String getPopulation_age_46() {
		return population_age_46;
	}



	public String getPopulation_age_47() {
		return population_age_47;
	}



	public String getPopulation_age_48() {
		return population_age_48;
	}



	public String getPopulation_age_49() {
		return population_age_49;
	}



	public String getPopulation_age_50() {
		return population_age_50;
	}



	public String getPopulation_age_51() {
		return population_age_51;
	}



	public String getPopulation_age_52() {
		return population_age_52;
	}



	public String getPopulation_age_53() {
		return population_age_53;
	}



	public String getPopulation_age_54() {
		return population_age_54;
	}



	public String getPopulation_age_55() {
		return population_age_55;
	}



	public String getPopulation_age_56() {
		return population_age_56;
	}



	public String getPopulation_age_57() {
		return population_age_57;
	}



	public String getPopulation_age_58() {
		return population_age_58;
	}



	public String getPopulation_age_59() {
		return population_age_59;
	}



	public String getPopulation_age_60() {
		return population_age_60;
	}



	public String getPopulation_age_61() {
		return population_age_61;
	}



	public String getPopulation_age_62() {
		return population_age_62;
	}



	public String getPopulation_age_63() {
		return population_age_63;
	}



	public String getPopulation_age_64() {
		return population_age_64;
	}



	public String getPopulation_age_65() {
		return population_age_65;
	}



	public String getPopulation_age_66() {
		return population_age_66;
	}



	public String getPopulation_age_67() {
		return population_age_67;
	}



	public String getPopulation_age_68() {
		return population_age_68;
	}



	public String getPopulation_age_69() {
		return population_age_69;
	}



	public String getPopulation_age_70() {
		return population_age_70;
	}



	public String getPopulation_age_71() {
		return population_age_71;
	}



	public String getPopulation_age_72() {
		return population_age_72;
	}



	public String getPopulation_age_73() {
		return population_age_73;
	}



	public String getPopulation_age_74() {
		return population_age_74;
	}



	public String getPopulation_age_75() {
		return population_age_75;
	}



	public String getPopulation_age_76() {
		return population_age_76;
	}



	public String getPopulation_age_77() {
		return population_age_77;
	}



	public String getPopulation_age_78() {
		return population_age_78;
	}



	public String getPopulation_age_79() {
		return population_age_79;
	}



	public String getPopulation_age_80() {
		return population_age_80;
	}



	public String getPopulation_age_81() {
		return population_age_81;
	}



	public String getPopulation_age_82() {
		return population_age_82;
	}



	public String getPopulation_age_83() {
		return population_age_83;
	}



	public String getPopulation_age_84() {
		return population_age_84;
	}



	public String getPopulation_age_85() {
		return population_age_85;
	}



	public String getPopulation_age_86() {
		return population_age_86;
	}



	public String getPopulation_age_87() {
		return population_age_87;
	}



	public String getPopulation_age_88() {
		return population_age_88;
	}



	public String getPopulation_age_89() {
		return population_age_89;
	}



	public String getPopulation_age_90() {
		return population_age_90;
	}



	public String getPopulation_age_91() {
		return population_age_91;
	}



	public String getPopulation_age_92() {
		return population_age_92;
	}



	public String getPopulation_age_93() {
		return population_age_93;
	}



	public String getPopulation_age_94() {
		return population_age_94;
	}



	public String getPopulation_age_95() {
		return population_age_95;
	}



	public String getPopulation_age_96() {
		return population_age_96;
	}



	public String getPopulation_age_97() {
		return population_age_97;
	}



	public String getPopulation_age_98() {
		return population_age_98;
	}



	public String getPopulation_age_99() {
		return population_age_99;
	}



	public String getPopulation_age_100() {
		return population_age_100;
	}



	public void setISO_code_Year_Sex(CK_ISO_code_Year_Sex iSO_code_Year_Sex) {
		ISO_code_Year_Sex = iSO_code_Year_Sex;
	}



	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}



	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}



	public void setMax_age(String max_age) {
		this.max_age = max_age;
	}



	public void setPopulation_age_0(String population_age_0) {
		this.population_age_0 = population_age_0;
	}



	public void setPopulation_age_1(String population_age_1) {
		this.population_age_1 = population_age_1;
	}



	public void setPopulation_age_2(String population_age_2) {
		this.population_age_2 = population_age_2;
	}



	public void setPopulation_age_3(String population_age_3) {
		this.population_age_3 = population_age_3;
	}



	public void setPopulation_age_4(String population_age_4) {
		this.population_age_4 = population_age_4;
	}



	public void setPopulation_age_5(String population_age_5) {
		this.population_age_5 = population_age_5;
	}



	public void setPopulation_age_6(String population_age_6) {
		this.population_age_6 = population_age_6;
	}



	public void setPopulation_age_7(String population_age_7) {
		this.population_age_7 = population_age_7;
	}



	public void setPopulation_age_8(String population_age_8) {
		this.population_age_8 = population_age_8;
	}



	public void setPopulation_age_9(String population_age_9) {
		this.population_age_9 = population_age_9;
	}



	public void setPopulation_age_10(String population_age_10) {
		this.population_age_10 = population_age_10;
	}



	public void setPopulation_age_11(String population_age_11) {
		this.population_age_11 = population_age_11;
	}



	public void setPopulation_age_12(String population_age_12) {
		this.population_age_12 = population_age_12;
	}



	public void setPopulation_age_13(String population_age_13) {
		this.population_age_13 = population_age_13;
	}



	public void setPopulation_age_14(String population_age_14) {
		this.population_age_14 = population_age_14;
	}



	public void setPopulation_age_15(String population_age_15) {
		this.population_age_15 = population_age_15;
	}



	public void setPopulation_age_16(String population_age_16) {
		this.population_age_16 = population_age_16;
	}



	public void setPopulation_age_17(String population_age_17) {
		this.population_age_17 = population_age_17;
	}



	public void setPopulation_age_18(String population_age_18) {
		this.population_age_18 = population_age_18;
	}



	public void setPopulation_age_19(String population_age_19) {
		this.population_age_19 = population_age_19;
	}



	public void setPopulation_age_20(String population_age_20) {
		this.population_age_20 = population_age_20;
	}



	public void setPopulation_age_21(String population_age_21) {
		this.population_age_21 = population_age_21;
	}



	public void setPopulation_age_22(String population_age_22) {
		this.population_age_22 = population_age_22;
	}



	public void setPopulation_age_23(String population_age_23) {
		this.population_age_23 = population_age_23;
	}



	public void setPopulation_age_24(String population_age_24) {
		this.population_age_24 = population_age_24;
	}



	public void setPopulation_age_25(String population_age_25) {
		this.population_age_25 = population_age_25;
	}



	public void setPopulation_age_26(String population_age_26) {
		this.population_age_26 = population_age_26;
	}



	public void setPopulation_age_27(String population_age_27) {
		this.population_age_27 = population_age_27;
	}



	public void setPopulation_age_28(String population_age_28) {
		this.population_age_28 = population_age_28;
	}



	public void setPopulation_age_29(String population_age_29) {
		this.population_age_29 = population_age_29;
	}



	public void setPopulation_age_30(String population_age_30) {
		this.population_age_30 = population_age_30;
	}



	public void setPopulation_age_31(String population_age_31) {
		this.population_age_31 = population_age_31;
	}



	public void setPopulation_age_32(String population_age_32) {
		this.population_age_32 = population_age_32;
	}



	public void setPopulation_age_33(String population_age_33) {
		this.population_age_33 = population_age_33;
	}



	public void setPopulation_age_34(String population_age_34) {
		this.population_age_34 = population_age_34;
	}



	public void setPopulation_age_35(String population_age_35) {
		this.population_age_35 = population_age_35;
	}



	public void setPopulation_age_36(String population_age_36) {
		this.population_age_36 = population_age_36;
	}



	public void setPopulation_age_37(String population_age_37) {
		this.population_age_37 = population_age_37;
	}



	public void setPopulation_age_38(String population_age_38) {
		this.population_age_38 = population_age_38;
	}



	public void setPopulation_age_39(String population_age_39) {
		this.population_age_39 = population_age_39;
	}



	public void setPopulation_age_40(String population_age_40) {
		this.population_age_40 = population_age_40;
	}



	public void setPopulation_age_41(String population_age_41) {
		this.population_age_41 = population_age_41;
	}



	public void setPopulation_age_42(String population_age_42) {
		this.population_age_42 = population_age_42;
	}



	public void setPopulation_age_43(String population_age_43) {
		this.population_age_43 = population_age_43;
	}



	public void setPopulation_age_44(String population_age_44) {
		this.population_age_44 = population_age_44;
	}



	public void setPopulation_age_45(String population_age_45) {
		this.population_age_45 = population_age_45;
	}



	public void setPopulation_age_46(String population_age_46) {
		this.population_age_46 = population_age_46;
	}



	public void setPopulation_age_47(String population_age_47) {
		this.population_age_47 = population_age_47;
	}



	public void setPopulation_age_48(String population_age_48) {
		this.population_age_48 = population_age_48;
	}



	public void setPopulation_age_49(String population_age_49) {
		this.population_age_49 = population_age_49;
	}



	public void setPopulation_age_50(String population_age_50) {
		this.population_age_50 = population_age_50;
	}



	public void setPopulation_age_51(String population_age_51) {
		this.population_age_51 = population_age_51;
	}



	public void setPopulation_age_52(String population_age_52) {
		this.population_age_52 = population_age_52;
	}



	public void setPopulation_age_53(String population_age_53) {
		this.population_age_53 = population_age_53;
	}



	public void setPopulation_age_54(String population_age_54) {
		this.population_age_54 = population_age_54;
	}



	public void setPopulation_age_55(String population_age_55) {
		this.population_age_55 = population_age_55;
	}



	public void setPopulation_age_56(String population_age_56) {
		this.population_age_56 = population_age_56;
	}



	public void setPopulation_age_57(String population_age_57) {
		this.population_age_57 = population_age_57;
	}



	public void setPopulation_age_58(String population_age_58) {
		this.population_age_58 = population_age_58;
	}



	public void setPopulation_age_59(String population_age_59) {
		this.population_age_59 = population_age_59;
	}



	public void setPopulation_age_60(String population_age_60) {
		this.population_age_60 = population_age_60;
	}



	public void setPopulation_age_61(String population_age_61) {
		this.population_age_61 = population_age_61;
	}



	public void setPopulation_age_62(String population_age_62) {
		this.population_age_62 = population_age_62;
	}



	public void setPopulation_age_63(String population_age_63) {
		this.population_age_63 = population_age_63;
	}



	public void setPopulation_age_64(String population_age_64) {
		this.population_age_64 = population_age_64;
	}



	public void setPopulation_age_65(String population_age_65) {
		this.population_age_65 = population_age_65;
	}



	public void setPopulation_age_66(String population_age_66) {
		this.population_age_66 = population_age_66;
	}



	public void setPopulation_age_67(String population_age_67) {
		this.population_age_67 = population_age_67;
	}



	public void setPopulation_age_68(String population_age_68) {
		this.population_age_68 = population_age_68;
	}



	public void setPopulation_age_69(String population_age_69) {
		this.population_age_69 = population_age_69;
	}



	public void setPopulation_age_70(String population_age_70) {
		this.population_age_70 = population_age_70;
	}



	public void setPopulation_age_71(String population_age_71) {
		this.population_age_71 = population_age_71;
	}



	public void setPopulation_age_72(String population_age_72) {
		this.population_age_72 = population_age_72;
	}



	public void setPopulation_age_73(String population_age_73) {
		this.population_age_73 = population_age_73;
	}



	public void setPopulation_age_74(String population_age_74) {
		this.population_age_74 = population_age_74;
	}



	public void setPopulation_age_75(String population_age_75) {
		this.population_age_75 = population_age_75;
	}



	public void setPopulation_age_76(String population_age_76) {
		this.population_age_76 = population_age_76;
	}



	public void setPopulation_age_77(String population_age_77) {
		this.population_age_77 = population_age_77;
	}



	public void setPopulation_age_78(String population_age_78) {
		this.population_age_78 = population_age_78;
	}



	public void setPopulation_age_79(String population_age_79) {
		this.population_age_79 = population_age_79;
	}



	public void setPopulation_age_80(String population_age_80) {
		this.population_age_80 = population_age_80;
	}



	public void setPopulation_age_81(String population_age_81) {
		this.population_age_81 = population_age_81;
	}



	public void setPopulation_age_82(String population_age_82) {
		this.population_age_82 = population_age_82;
	}



	public void setPopulation_age_83(String population_age_83) {
		this.population_age_83 = population_age_83;
	}



	public void setPopulation_age_84(String population_age_84) {
		this.population_age_84 = population_age_84;
	}



	public void setPopulation_age_85(String population_age_85) {
		this.population_age_85 = population_age_85;
	}



	public void setPopulation_age_86(String population_age_86) {
		this.population_age_86 = population_age_86;
	}



	public void setPopulation_age_87(String population_age_87) {
		this.population_age_87 = population_age_87;
	}



	public void setPopulation_age_88(String population_age_88) {
		this.population_age_88 = population_age_88;
	}



	public void setPopulation_age_89(String population_age_89) {
		this.population_age_89 = population_age_89;
	}



	public void setPopulation_age_90(String population_age_90) {
		this.population_age_90 = population_age_90;
	}



	public void setPopulation_age_91(String population_age_91) {
		this.population_age_91 = population_age_91;
	}



	public void setPopulation_age_92(String population_age_92) {
		this.population_age_92 = population_age_92;
	}



	public void setPopulation_age_93(String population_age_93) {
		this.population_age_93 = population_age_93;
	}



	public void setPopulation_age_94(String population_age_94) {
		this.population_age_94 = population_age_94;
	}



	public void setPopulation_age_95(String population_age_95) {
		this.population_age_95 = population_age_95;
	}



	public void setPopulation_age_96(String population_age_96) {
		this.population_age_96 = population_age_96;
	}



	public void setPopulation_age_97(String population_age_97) {
		this.population_age_97 = population_age_97;
	}



	public void setPopulation_age_98(String population_age_98) {
		this.population_age_98 = population_age_98;
	}



	public void setPopulation_age_99(String population_age_99) {
		this.population_age_99 = population_age_99;
	}



	public void setPopulation_age_100(String population_age_100) {
		this.population_age_100 = population_age_100;
	}



	public countries getC() {
		return c;
	}



	public void setC(countries c) {
		this.c = c;
	}
}