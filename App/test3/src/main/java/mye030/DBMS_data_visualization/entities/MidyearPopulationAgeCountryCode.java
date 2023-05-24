package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the midyear_population_age_sex database table.
 * 
 */
@Entity
@Table(name="midyear_population_age_country_code")
@NamedQuery(name="MidyearPopulationAgeCountryCode.findAll", query="SELECT m FROM MidyearPopulationAgeCountryCode m")
public class MidyearPopulationAgeCountryCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MidyearPopulationAgeCountryCodePK id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="max_age")
	private String maxAge;

	@Column(name="population_age_0")
	private String populationAge0;

	@Column(name="population_age_1")
	private String populationAge1;

	@Column(name="population_age_10")
	private String populationAge10;

	@Column(name="population_age_100")
	private String populationAge100;

	@Column(name="population_age_11")
	private String populationAge11;

	@Column(name="population_age_12")
	private String populationAge12;

	@Column(name="population_age_13")
	private String populationAge13;

	@Column(name="population_age_14")
	private String populationAge14;

	@Column(name="population_age_15")
	private String populationAge15;

	@Column(name="population_age_16")
	private String populationAge16;

	@Column(name="population_age_17")
	private String populationAge17;

	@Column(name="population_age_18")
	private String populationAge18;

	@Column(name="population_age_19")
	private String populationAge19;

	@Column(name="population_age_2")
	private String populationAge2;

	@Column(name="population_age_20")
	private String populationAge20;

	@Column(name="population_age_21")
	private String populationAge21;

	@Column(name="population_age_22")
	private String populationAge22;

	@Column(name="population_age_23")
	private String populationAge23;

	@Column(name="population_age_24")
	private String populationAge24;

	@Column(name="population_age_25")
	private String populationAge25;

	@Column(name="population_age_26")
	private String populationAge26;

	@Column(name="population_age_27")
	private String populationAge27;

	@Column(name="population_age_28")
	private String populationAge28;

	@Column(name="population_age_29")
	private String populationAge29;

	@Column(name="population_age_3")
	private String populationAge3;

	@Column(name="population_age_30")
	private String populationAge30;

	@Column(name="population_age_31")
	private String populationAge31;

	@Column(name="population_age_32")
	private String populationAge32;

	@Column(name="population_age_33")
	private String populationAge33;

	@Column(name="population_age_34")
	private String populationAge34;

	@Column(name="population_age_35")
	private String populationAge35;

	@Column(name="population_age_36")
	private String populationAge36;

	@Column(name="population_age_37")
	private String populationAge37;

	@Column(name="population_age_38")
	private String populationAge38;

	@Column(name="population_age_39")
	private String populationAge39;

	@Column(name="population_age_4")
	private String populationAge4;

	@Column(name="population_age_40")
	private String populationAge40;

	@Column(name="population_age_41")
	private String populationAge41;

	@Column(name="population_age_42")
	private String populationAge42;

	@Column(name="population_age_43")
	private String populationAge43;

	@Column(name="population_age_44")
	private String populationAge44;

	@Column(name="population_age_45")
	private String populationAge45;

	@Column(name="population_age_46")
	private String populationAge46;

	@Column(name="population_age_47")
	private String populationAge47;

	@Column(name="population_age_48")
	private String populationAge48;

	@Column(name="population_age_49")
	private String populationAge49;

	@Column(name="population_age_5")
	private String populationAge5;

	@Column(name="population_age_50")
	private String populationAge50;

	@Column(name="population_age_51")
	private String populationAge51;

	@Column(name="population_age_52")
	private String populationAge52;

	@Column(name="population_age_53")
	private String populationAge53;

	@Column(name="population_age_54")
	private String populationAge54;

	@Column(name="population_age_55")
	private String populationAge55;

	@Column(name="population_age_56")
	private String populationAge56;

	@Column(name="population_age_57")
	private String populationAge57;

	@Column(name="population_age_58")
	private String populationAge58;

	@Column(name="population_age_59")
	private String populationAge59;

	@Column(name="population_age_6")
	private String populationAge6;

	@Column(name="population_age_60")
	private String populationAge60;

	@Column(name="population_age_61")
	private String populationAge61;

	@Column(name="population_age_62")
	private String populationAge62;

	@Column(name="population_age_63")
	private String populationAge63;

	@Column(name="population_age_64")
	private String populationAge64;

	@Column(name="population_age_65")
	private String populationAge65;

	@Column(name="population_age_66")
	private String populationAge66;

	@Column(name="population_age_67")
	private String populationAge67;

	@Column(name="population_age_68")
	private String populationAge68;

	@Column(name="population_age_69")
	private String populationAge69;

	@Column(name="population_age_7")
	private String populationAge7;

	@Column(name="population_age_70")
	private String populationAge70;

	@Column(name="population_age_71")
	private String populationAge71;

	@Column(name="population_age_72")
	private String populationAge72;

	@Column(name="population_age_73")
	private String populationAge73;

	@Column(name="population_age_74")
	private String populationAge74;

	@Column(name="population_age_75")
	private String populationAge75;

	@Column(name="population_age_76")
	private String populationAge76;

	@Column(name="population_age_77")
	private String populationAge77;

	@Column(name="population_age_78")
	private String populationAge78;

	@Column(name="population_age_79")
	private String populationAge79;

	@Column(name="population_age_8")
	private String populationAge8;

	@Column(name="population_age_80")
	private String populationAge80;

	@Column(name="population_age_81")
	private String populationAge81;

	@Column(name="population_age_82")
	private String populationAge82;

	@Column(name="population_age_83")
	private String populationAge83;

	@Column(name="population_age_84")
	private String populationAge84;

	@Column(name="population_age_85")
	private String populationAge85;

	@Column(name="population_age_86")
	private String populationAge86;

	@Column(name="population_age_87")
	private String populationAge87;

	@Column(name="population_age_88")
	private String populationAge88;

	@Column(name="population_age_89")
	private String populationAge89;

	@Column(name="population_age_9")
	private String populationAge9;

	@Column(name="population_age_90")
	private String populationAge90;

	@Column(name="population_age_91")
	private String populationAge91;

	@Column(name="population_age_92")
	private String populationAge92;

	@Column(name="population_age_93")
	private String populationAge93;

	@Column(name="population_age_94")
	private String populationAge94;

	@Column(name="population_age_95")
	private String populationAge95;

	@Column(name="population_age_96")
	private String populationAge96;

	@Column(name="population_age_97")
	private String populationAge97;

	@Column(name="population_age_98")
	private String populationAge98;

	@Column(name="population_age_99")
	private String populationAge99;
	
	@Column(name="permutation_role")
	private String permutationRole;
	
	@Column(name="population")
	private String population;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public MidyearPopulationAgeCountryCode() {
	}

	public MidyearPopulationAgeCountryCodePK getId() {
		return this.id;
	}

	public void setId(MidyearPopulationAgeCountryCodePK id) {
		this.id = id;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getMaxAge() {
		return this.maxAge;
	}

	public void setMaxAge(String maxAge) {
		this.maxAge = maxAge;
	}

	public String getPopulationAge0() {
		return this.populationAge0;
	}

	public void setPopulationAge0(String populationAge0) {
		this.populationAge0 = populationAge0;
	}

	public String getPopulationAge1() {
		return this.populationAge1;
	}

	public void setPopulationAge1(String populationAge1) {
		this.populationAge1 = populationAge1;
	}

	public String getPopulationAge10() {
		return this.populationAge10;
	}

	public void setPopulationAge10(String populationAge10) {
		this.populationAge10 = populationAge10;
	}

	public String getPopulationAge100() {
		return this.populationAge100;
	}

	public void setPopulationAge100(String populationAge100) {
		this.populationAge100 = populationAge100;
	}

	public String getPopulationAge11() {
		return this.populationAge11;
	}

	public void setPopulationAge11(String populationAge11) {
		this.populationAge11 = populationAge11;
	}

	public String getPopulationAge12() {
		return this.populationAge12;
	}

	public void setPopulationAge12(String populationAge12) {
		this.populationAge12 = populationAge12;
	}

	public String getPopulationAge13() {
		return this.populationAge13;
	}

	public void setPopulationAge13(String populationAge13) {
		this.populationAge13 = populationAge13;
	}

	public String getPopulationAge14() {
		return this.populationAge14;
	}

	public void setPopulationAge14(String populationAge14) {
		this.populationAge14 = populationAge14;
	}

	public String getPopulationAge15() {
		return this.populationAge15;
	}

	public void setPopulationAge15(String populationAge15) {
		this.populationAge15 = populationAge15;
	}

	public String getPopulationAge16() {
		return this.populationAge16;
	}

	public void setPopulationAge16(String populationAge16) {
		this.populationAge16 = populationAge16;
	}

	public String getPopulationAge17() {
		return this.populationAge17;
	}

	public void setPopulationAge17(String populationAge17) {
		this.populationAge17 = populationAge17;
	}

	public String getPopulationAge18() {
		return this.populationAge18;
	}

	public void setPopulationAge18(String populationAge18) {
		this.populationAge18 = populationAge18;
	}

	public String getPopulationAge19() {
		return this.populationAge19;
	}

	public void setPopulationAge19(String populationAge19) {
		this.populationAge19 = populationAge19;
	}

	public String getPopulationAge2() {
		return this.populationAge2;
	}

	public void setPopulationAge2(String populationAge2) {
		this.populationAge2 = populationAge2;
	}

	public String getPopulationAge20() {
		return this.populationAge20;
	}

	public void setPopulationAge20(String populationAge20) {
		this.populationAge20 = populationAge20;
	}

	public String getPopulationAge21() {
		return this.populationAge21;
	}

	public void setPopulationAge21(String populationAge21) {
		this.populationAge21 = populationAge21;
	}

	public String getPopulationAge22() {
		return this.populationAge22;
	}

	public void setPopulationAge22(String populationAge22) {
		this.populationAge22 = populationAge22;
	}

	public String getPopulationAge23() {
		return this.populationAge23;
	}

	public void setPopulationAge23(String populationAge23) {
		this.populationAge23 = populationAge23;
	}

	public String getPopulationAge24() {
		return this.populationAge24;
	}

	public void setPopulationAge24(String populationAge24) {
		this.populationAge24 = populationAge24;
	}

	public String getPopulationAge25() {
		return this.populationAge25;
	}

	public void setPopulationAge25(String populationAge25) {
		this.populationAge25 = populationAge25;
	}

	public String getPopulationAge26() {
		return this.populationAge26;
	}

	public void setPopulationAge26(String populationAge26) {
		this.populationAge26 = populationAge26;
	}

	public String getPopulationAge27() {
		return this.populationAge27;
	}

	public void setPopulationAge27(String populationAge27) {
		this.populationAge27 = populationAge27;
	}

	public String getPopulationAge28() {
		return this.populationAge28;
	}

	public void setPopulationAge28(String populationAge28) {
		this.populationAge28 = populationAge28;
	}

	public String getPopulationAge29() {
		return this.populationAge29;
	}

	public void setPopulationAge29(String populationAge29) {
		this.populationAge29 = populationAge29;
	}

	public String getPopulationAge3() {
		return this.populationAge3;
	}

	public void setPopulationAge3(String populationAge3) {
		this.populationAge3 = populationAge3;
	}

	public String getPopulationAge30() {
		return this.populationAge30;
	}

	public void setPopulationAge30(String populationAge30) {
		this.populationAge30 = populationAge30;
	}

	public String getPopulationAge31() {
		return this.populationAge31;
	}

	public void setPopulationAge31(String populationAge31) {
		this.populationAge31 = populationAge31;
	}

	public String getPopulationAge32() {
		return this.populationAge32;
	}

	public void setPopulationAge32(String populationAge32) {
		this.populationAge32 = populationAge32;
	}

	public String getPopulationAge33() {
		return this.populationAge33;
	}

	public void setPopulationAge33(String populationAge33) {
		this.populationAge33 = populationAge33;
	}

	public String getPopulationAge34() {
		return this.populationAge34;
	}

	public void setPopulationAge34(String populationAge34) {
		this.populationAge34 = populationAge34;
	}

	public String getPopulationAge35() {
		return this.populationAge35;
	}

	public void setPopulationAge35(String populationAge35) {
		this.populationAge35 = populationAge35;
	}

	public String getPopulationAge36() {
		return this.populationAge36;
	}

	public void setPopulationAge36(String populationAge36) {
		this.populationAge36 = populationAge36;
	}

	public String getPopulationAge37() {
		return this.populationAge37;
	}

	public void setPopulationAge37(String populationAge37) {
		this.populationAge37 = populationAge37;
	}

	public String getPopulationAge38() {
		return this.populationAge38;
	}

	public void setPopulationAge38(String populationAge38) {
		this.populationAge38 = populationAge38;
	}

	public String getPopulationAge39() {
		return this.populationAge39;
	}

	public void setPopulationAge39(String populationAge39) {
		this.populationAge39 = populationAge39;
	}

	public String getPopulationAge4() {
		return this.populationAge4;
	}

	public void setPopulationAge4(String populationAge4) {
		this.populationAge4 = populationAge4;
	}

	public String getPopulationAge40() {
		return this.populationAge40;
	}

	public void setPopulationAge40(String populationAge40) {
		this.populationAge40 = populationAge40;
	}

	public String getPopulationAge41() {
		return this.populationAge41;
	}

	public void setPopulationAge41(String populationAge41) {
		this.populationAge41 = populationAge41;
	}

	public String getPopulationAge42() {
		return this.populationAge42;
	}

	public void setPopulationAge42(String populationAge42) {
		this.populationAge42 = populationAge42;
	}

	public String getPopulationAge43() {
		return this.populationAge43;
	}

	public void setPopulationAge43(String populationAge43) {
		this.populationAge43 = populationAge43;
	}

	public String getPopulationAge44() {
		return this.populationAge44;
	}

	public void setPopulationAge44(String populationAge44) {
		this.populationAge44 = populationAge44;
	}

	public String getPopulationAge45() {
		return this.populationAge45;
	}

	public void setPopulationAge45(String populationAge45) {
		this.populationAge45 = populationAge45;
	}

	public String getPopulationAge46() {
		return this.populationAge46;
	}

	public void setPopulationAge46(String populationAge46) {
		this.populationAge46 = populationAge46;
	}

	public String getPopulationAge47() {
		return this.populationAge47;
	}

	public void setPopulationAge47(String populationAge47) {
		this.populationAge47 = populationAge47;
	}

	public String getPopulationAge48() {
		return this.populationAge48;
	}

	public void setPopulationAge48(String populationAge48) {
		this.populationAge48 = populationAge48;
	}

	public String getPopulationAge49() {
		return this.populationAge49;
	}

	public void setPopulationAge49(String populationAge49) {
		this.populationAge49 = populationAge49;
	}

	public String getPopulationAge5() {
		return this.populationAge5;
	}

	public void setPopulationAge5(String populationAge5) {
		this.populationAge5 = populationAge5;
	}

	public String getPopulationAge50() {
		return this.populationAge50;
	}

	public void setPopulationAge50(String populationAge50) {
		this.populationAge50 = populationAge50;
	}

	public String getPopulationAge51() {
		return this.populationAge51;
	}

	public void setPopulationAge51(String populationAge51) {
		this.populationAge51 = populationAge51;
	}

	public String getPopulationAge52() {
		return this.populationAge52;
	}

	public void setPopulationAge52(String populationAge52) {
		this.populationAge52 = populationAge52;
	}

	public String getPopulationAge53() {
		return this.populationAge53;
	}

	public void setPopulationAge53(String populationAge53) {
		this.populationAge53 = populationAge53;
	}

	public String getPopulationAge54() {
		return this.populationAge54;
	}

	public void setPopulationAge54(String populationAge54) {
		this.populationAge54 = populationAge54;
	}

	public String getPopulationAge55() {
		return this.populationAge55;
	}

	public void setPopulationAge55(String populationAge55) {
		this.populationAge55 = populationAge55;
	}

	public String getPopulationAge56() {
		return this.populationAge56;
	}

	public void setPopulationAge56(String populationAge56) {
		this.populationAge56 = populationAge56;
	}

	public String getPopulationAge57() {
		return this.populationAge57;
	}

	public void setPopulationAge57(String populationAge57) {
		this.populationAge57 = populationAge57;
	}

	public String getPopulationAge58() {
		return this.populationAge58;
	}

	public void setPopulationAge58(String populationAge58) {
		this.populationAge58 = populationAge58;
	}

	public String getPopulationAge59() {
		return this.populationAge59;
	}

	public void setPopulationAge59(String populationAge59) {
		this.populationAge59 = populationAge59;
	}

	public String getPopulationAge6() {
		return this.populationAge6;
	}

	public void setPopulationAge6(String populationAge6) {
		this.populationAge6 = populationAge6;
	}

	public String getPopulationAge60() {
		return this.populationAge60;
	}

	public void setPopulationAge60(String populationAge60) {
		this.populationAge60 = populationAge60;
	}

	public String getPopulationAge61() {
		return this.populationAge61;
	}

	public void setPopulationAge61(String populationAge61) {
		this.populationAge61 = populationAge61;
	}

	public String getPopulationAge62() {
		return this.populationAge62;
	}

	public void setPopulationAge62(String populationAge62) {
		this.populationAge62 = populationAge62;
	}

	public String getPopulationAge63() {
		return this.populationAge63;
	}

	public void setPopulationAge63(String populationAge63) {
		this.populationAge63 = populationAge63;
	}

	public String getPopulationAge64() {
		return this.populationAge64;
	}

	public void setPopulationAge64(String populationAge64) {
		this.populationAge64 = populationAge64;
	}

	public String getPopulationAge65() {
		return this.populationAge65;
	}

	public void setPopulationAge65(String populationAge65) {
		this.populationAge65 = populationAge65;
	}

	public String getPopulationAge66() {
		return this.populationAge66;
	}

	public void setPopulationAge66(String populationAge66) {
		this.populationAge66 = populationAge66;
	}

	public String getPopulationAge67() {
		return this.populationAge67;
	}

	public void setPopulationAge67(String populationAge67) {
		this.populationAge67 = populationAge67;
	}

	public String getPopulationAge68() {
		return this.populationAge68;
	}

	public void setPopulationAge68(String populationAge68) {
		this.populationAge68 = populationAge68;
	}

	public String getPopulationAge69() {
		return this.populationAge69;
	}

	public void setPopulationAge69(String populationAge69) {
		this.populationAge69 = populationAge69;
	}

	public String getPopulationAge7() {
		return this.populationAge7;
	}

	public void setPopulationAge7(String populationAge7) {
		this.populationAge7 = populationAge7;
	}

	public String getPopulationAge70() {
		return this.populationAge70;
	}

	public void setPopulationAge70(String populationAge70) {
		this.populationAge70 = populationAge70;
	}

	public String getPopulationAge71() {
		return this.populationAge71;
	}

	public void setPopulationAge71(String populationAge71) {
		this.populationAge71 = populationAge71;
	}

	public String getPopulationAge72() {
		return this.populationAge72;
	}

	public void setPopulationAge72(String populationAge72) {
		this.populationAge72 = populationAge72;
	}

	public String getPopulationAge73() {
		return this.populationAge73;
	}

	public void setPopulationAge73(String populationAge73) {
		this.populationAge73 = populationAge73;
	}

	public String getPopulationAge74() {
		return this.populationAge74;
	}

	public void setPopulationAge74(String populationAge74) {
		this.populationAge74 = populationAge74;
	}

	public String getPopulationAge75() {
		return this.populationAge75;
	}

	public void setPopulationAge75(String populationAge75) {
		this.populationAge75 = populationAge75;
	}

	public String getPopulationAge76() {
		return this.populationAge76;
	}

	public void setPopulationAge76(String populationAge76) {
		this.populationAge76 = populationAge76;
	}

	public String getPopulationAge77() {
		return this.populationAge77;
	}

	public void setPopulationAge77(String populationAge77) {
		this.populationAge77 = populationAge77;
	}

	public String getPopulationAge78() {
		return this.populationAge78;
	}

	public void setPopulationAge78(String populationAge78) {
		this.populationAge78 = populationAge78;
	}

	public String getPopulationAge79() {
		return this.populationAge79;
	}

	public void setPopulationAge79(String populationAge79) {
		this.populationAge79 = populationAge79;
	}

	public String getPopulationAge8() {
		return this.populationAge8;
	}

	public void setPopulationAge8(String populationAge8) {
		this.populationAge8 = populationAge8;
	}

	public String getPopulationAge80() {
		return this.populationAge80;
	}

	public void setPopulationAge80(String populationAge80) {
		this.populationAge80 = populationAge80;
	}

	public String getPopulationAge81() {
		return this.populationAge81;
	}

	public void setPopulationAge81(String populationAge81) {
		this.populationAge81 = populationAge81;
	}

	public String getPopulationAge82() {
		return this.populationAge82;
	}

	public void setPopulationAge82(String populationAge82) {
		this.populationAge82 = populationAge82;
	}

	public String getPopulationAge83() {
		return this.populationAge83;
	}

	public void setPopulationAge83(String populationAge83) {
		this.populationAge83 = populationAge83;
	}

	public String getPopulationAge84() {
		return this.populationAge84;
	}

	public void setPopulationAge84(String populationAge84) {
		this.populationAge84 = populationAge84;
	}

	public String getPopulationAge85() {
		return this.populationAge85;
	}

	public void setPopulationAge85(String populationAge85) {
		this.populationAge85 = populationAge85;
	}

	public String getPopulationAge86() {
		return this.populationAge86;
	}

	public void setPopulationAge86(String populationAge86) {
		this.populationAge86 = populationAge86;
	}

	public String getPopulationAge87() {
		return this.populationAge87;
	}

	public void setPopulationAge87(String populationAge87) {
		this.populationAge87 = populationAge87;
	}

	public String getPopulationAge88() {
		return this.populationAge88;
	}

	public void setPopulationAge88(String populationAge88) {
		this.populationAge88 = populationAge88;
	}

	public String getPopulationAge89() {
		return this.populationAge89;
	}

	public void setPopulationAge89(String populationAge89) {
		this.populationAge89 = populationAge89;
	}

	public String getPopulationAge9() {
		return this.populationAge9;
	}

	public void setPopulationAge9(String populationAge9) {
		this.populationAge9 = populationAge9;
	}

	public String getPopulationAge90() {
		return this.populationAge90;
	}

	public void setPopulationAge90(String populationAge90) {
		this.populationAge90 = populationAge90;
	}

	public String getPopulationAge91() {
		return this.populationAge91;
	}

	public void setPopulationAge91(String populationAge91) {
		this.populationAge91 = populationAge91;
	}

	public String getPopulationAge92() {
		return this.populationAge92;
	}

	public void setPopulationAge92(String populationAge92) {
		this.populationAge92 = populationAge92;
	}

	public String getPopulationAge93() {
		return this.populationAge93;
	}

	public void setPopulationAge93(String populationAge93) {
		this.populationAge93 = populationAge93;
	}

	public String getPopulationAge94() {
		return this.populationAge94;
	}

	public void setPopulationAge94(String populationAge94) {
		this.populationAge94 = populationAge94;
	}

	public String getPopulationAge95() {
		return this.populationAge95;
	}

	public void setPopulationAge95(String populationAge95) {
		this.populationAge95 = populationAge95;
	}

	public String getPopulationAge96() {
		return this.populationAge96;
	}

	public void setPopulationAge96(String populationAge96) {
		this.populationAge96 = populationAge96;
	}

	public String getPopulationAge97() {
		return this.populationAge97;
	}

	public void setPopulationAge97(String populationAge97) {
		this.populationAge97 = populationAge97;
	}

	public String getPopulationAge98() {
		return this.populationAge98;
	}

	public void setPopulationAge98(String populationAge98) {
		this.populationAge98 = populationAge98;
	}

	public String getPopulationAge99() {
		return this.populationAge99;
	}

	public void setPopulationAge99(String populationAge99) {
		this.populationAge99 = populationAge99;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public void setPermutationRole(String permutationRole) {
		this.permutationRole = permutationRole;
	}

	public String getPermutationRole() {
		return this.permutationRole;
	}

}