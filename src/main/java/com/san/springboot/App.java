package com.san.springboot;

import static java.lang.System.out;

//

//	public static void main(String[] args) {
//		System.out.println('J'+'A'+10+20);
		

//package UPI0.org.mgs.indus;


import java.io.FileInputStream;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.san.springboot.App.Funcnal;
import com.san.springboot.bean.CoreBankDTO;



public abstract class App implements AutoCloseable{
int a=9;
App()
{
this(10);
System.out.println("Executing Non Parameterized Constructor");
}
App(int a)
{
super();
System.out.println("Executing Parameterized Constructor");
}
public class App1 {

@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)//WebApplicationContext.SCOPE_SESSION
@SuppressWarnings("deprecation")
public void main(String[] args) throws InterruptedException {
// App out123=new App() { for constructor calling
// };
out.println("This is static import example declared ::");//ambigous fields MAX_VALUE
// main(null);
/*App app=new App();
System.out.println(app.saySomething()+": Static VArriable: "+app.category);
assert app!=null :"list varriable empty";*/
//Sayable sayable = App1::saySomething;
//sayable.guy();
// BiFunction<Integer, Integer, Integer> shp=
System.out.println("Method Reference above");
/*//date sql,util underst
* Date shp1=new Date();
java.sql.Date st=new java.sql.Date(shp1.getTime());
System.out.println(st+"::Date::"+new SimpleDateFormat("yyyy:MM:dd hh:mm:ss").format(new Date())+":: is:"+shp1);
*/
CoreBankDTO bankDTO=new CoreBankDTO();
// Funcnal.unpack125FieldOfAccEnq(null,bankDTO);
// Funcnal.unpack48FieldBalanceEnq(null, bankDTO);
// System.out.println(String.valueOf(Math.round(1.0)));
// Funcnal.stringMani(null);
try{
// calObj(null); //for calling method of ambiguous call of String and Obejct
}catch(Exception e){System.out.println("ExceptionOccred"+e);}
// Funcnal.unpack125FieldOfAccList(null,new CoreBankDTO());

/*Immutbl immutbl=new Immutbl.ImmutableBuilder(70).build();
System.out.println("Immutable value is:"+immutbl.getVal());*/

Funcnal funcnal = (shp) -> {
System.out.println("-Method Executed:"+shp);
return "Sandeep";
};
System.out.println("Functional Output is:" + funcnal.drowShape("Sandeep ,Good Job"));
System.out.println("ret val:"+funcnal.func());
Set<Object> integers = new TreeSet<Object>();
// integers.add(10); integers.add(3); integers.add(1); integers.add(2);
// integers.add(9);
integers.add("ds");
integers.add(new String("K"));
integers.add(new String("S"));
Collections.synchronizedSet(integers);
for (int i = 0; i < 5; i++) {
for (int j = 0; j <= i; j++) {
System.out.print(integers + "*");
}
System.out.println();
}
for (int i = 0; i < 5; i++) {
for (int j = i; j < 5; j++) {

System.out.print(" ");
}
for (int j = 0; j < i; j++) {
System.out.print("+");
}
System.out.println();
}
testSwitch();

String $_san = "1Sand!@#$%^&*():?\".eep&2Kalyani";
for (String str : $_san.split("[0-9.&!@#$%^*():?\"]+"))
System.out.println(str);
for (String $t : $_san.split("[a-zA-Z&!@#$%^*():?]+"))
System.out.println("--" + $t);
boolean s = Character.isAlphabetic($_san.charAt(0));
s = Character.isDigit($_san.charAt(0));
// Thread.sleep(100000);
System.out.println("Hello World!" + s);
// Oracle sql=new Sql();
System.exit(0);
Oracle sql = new Sql();
sql.method();
}

private void testSwitch() {
// TODO Auto-generated method stub
//BatchPreparedStatementSetter batchPreparedStatementSetter;
//PreparedStatementCreator creator; SqlProvider provider;
//RowCallbackHandler callbackHandler;

byte a=127,b=127;
a=(byte) (a+b);
// a+=b;
System.out.println("Values comparison are:"+a);

byte d=2;
switch(d){
case 1:System.out.println("Sandeep Switch");break;
case 2:System.out.println("Kalyani Switch");break;
default :System.out.println("Sivansh---");break;
}

}
void calObj(Object obj)
{
System.out.println("Calling Object Method");
//check merchant detali log u000d System.exit(0);
}
/*static void calObj(Map obj)
{
System.out.println("Custom Object");
//check merchant detali log u000d System.exit(0);

}*/
void calObj(String obj)
{
OutOfMemoryError error=new OutOfMemoryError();
// u000d throw error;
// error.initCause(new Throwable());
System.out.println(Arrays.copyOf(new String[]{"ds","asds","dsa","rer","asre"}, 10)[4]);
System.out.println( LocalDate.now()+"::---Calling String object class-----::"+Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime());
if(Calendar.getInstance().getTime().getYear()<2020)
//check merchant detali log u000d System.exit(0);
// throw new SQLException();
	System.out.println("hello ");
}

public void saySomething(){
System.out.println("Hello Sandeep, this is non-static method. Reference call");
// return "saySomething";
}
public static String category="it is static varriable access using object";

public void close() throws Exception {
// TODO Auto-generated method stub

}
}

interface Sayable{
// void say();
void guy();
}

class Oracle {
 {
System.out.println("Inside Static block Oracle");
}
{
System.out.println("Inside nonstatic Block of Oracle");
}

public Oracle(String s) {
this();
System.out.println("Inside Oracle Para Constructor");
}

public Oracle() {
System.out.println("Inside Oracle Constructor ");
}

public void method()
{
System.out.println("Method executed of sub class using parent class ::Oracle reference");
}

}

class Sql extends Oracle {
static String str = "";
 {
System.out.println("Inside Static block SQL");
}
{
System.out.println("Inside nonstatic Block of SQL");
}

public Sql() {
super(str);
System.out.println("Inside Sql Constructor");
}

public void method()
{
System.out.println("Method ::executed of sub class using Child class reference");
}
public void methoed()
{
System.out.println("Methoed ::executed of sub class using Child class reference");
}
}

interface Funcnal {
static int getNumber(int num) {
return num+1;
}

default int func() throws InterruptedException,NullPointerException {
Map<String, String> map=new HashMap<String,String>();
// List<? extends Object> object=new ArrayList<String>();
/*Map<Integer, String> manp=new HashMap<Integer, String>();
double b=1; manp.put(1, "Sandeep");
System.out.println("What is the out put of the map"+manp.get(b));*/
map.put("SAN", "DEP");
System.out.println("-------MapReturning correct value "+map.put("GAN", "PREET"));
System.out.println("-------MapReturning correct value "+map.put("GAN", "GEET"));
System.out.println("-------MapReturning correct value "+map.put("GAN", "MEET"));
/*map.put("SMA", "GAN");
map.put("DSE", "RDW");
map.put("GRN", "RED");
map.put("red", "blue");
map.put("RED", "BLUE");
map.put("WHI", "White");
map.put("BLA", "Black");*/
Stream<String> stream=map.keySet().parallelStream();

// Thread.sleep(10000);
stream.forEach(t ->{

/*@Override
public void accept(String t) {
}*/
System.out.println("String::"+t);

});

Set<Map<String, String>> doubl=new HashSet<Map<String,String>>();
doubl.add(map);
map.put("VVAA", "SSKKK");
doubl.add(map);
// System.out.println(doubl);
AtomicInteger counter = new AtomicInteger(1);
doubl.forEach(xt->{ System.out.println(counter.getAndIncrement()+"--XT is :"+xt); });
Map<String,String> mapping=map.keySet().stream().map(st->st.concat("SA")).collect(Collectors.toMap(km->km, fm->fm.toString().substring(2)));
// mapping.stream().parallel().forEach(ss->System.out.println(ss));
mapping.forEach((bic,bvc)->System.out.println("Key Is:"+bic+":Value is:"+bvc));
map.keySet().stream().sorted().collect(Collectors.toSet()).forEach((dt)->System.out.println("data::"+dt));
System.out.println(map.keySet().stream().filter(predi->"E".equalsIgnoreCase(predi.charAt(1)+"")).reduce("SANDEEP:", (fin,val)->fin.concat(val)));
map.entrySet().stream().parallel().forEach(ac->System.out.println(ac.getKey()+":Entry Set:"+ac.getValue()));
// stream.close();
// stream.forEach(st->System.out.println(st));
Stream<String> sortedStream=map.keySet().parallelStream().filter((pr)->pr.contains("S") && pr.contains("A"));
// sortedStream.filter(pre->pre.contains("A"));
sortedStream.forEach(st-> System.out.println("Sorted by S:"+st));
System.out.println("This method will return zero value to the caller");
System.out.println(Thread.class.getClass().toString());
List<Integer> number = Arrays.asList(2,3,4,7);
OptionalInt opt=IntStream.of(24,3,23,44).min();double sa=24d;
Stream.of(sa,2d,7d).mapToDouble(Double::doubleValue).max();
System.out.println("Optional Value is printin ghere "+opt);
return number.stream().parallel().filter(x->x % 3==0 || x%2==0 && x % 3==0).reduce(0,(ans,i)->{ System.out.println("ans:"+ans+":i:"+i); return ans+i;});
}

/* static void jsonToObject(String json)
{
json="{'pgMerchantId':'INDB000000000944','pspId':'911','mebussname':'Test Abhay','legalStrName':'Test Abhay','merVirtualAdd':'IBL.000022581123130@indus','awlmcc':'0763','strCntMobile':'3265541212','requestUrl1':'https://qrcode.in.worldline.com/bharatqr/upi/callback/INDUSPSP','requestUrl2':'https://qrcode.in.worldline.com/bharatqr/upi/callback/INDUSPSP','merchantType':'AGGMER','integrationType':'WEBAPI','settleType':'NET','panNo':'ALVPD3070F','extTID':'12589897','extMID':'000022581123130','accNo':'32123213213','meEmailID':'test1@gmail.com'}";
Gson gson = new Gson();Builder().setFieldNamingStrategy(new FieldNamingStrategy() {

@Override
public String translateName(Field f) {
// TODO Auto-generated method stub
System.out.println("Field:"+f);
return f.getName().trim().toLowerCase();
}
}).create();
MerchantOnBoardDTO merchantOnBoardDTO=gson.fromJson(json, MerchantOnBoardDTO.class);
System.out.println("Merchant Account No is:"+merchantOnBoardDTO.getAccNo());
}
*/
String drowShape(String shp);


static void stringMani(String str)
{
str="918007840902";
// str=str.substring(0,2)+" "+str.substring(2,str.length());
str=String.format("%-"+4+"s", str.substring(0,2))+String.format("%-"+12+"s", str.substring(2,str.length()));
System.out.println("String si ::"+str+"::");
//java 7 features @SafeVarargs
Map<Set<String>, List<String>> ojss=new HashMap<>();//<Set<String>, List<String>>();
int val=12_20_2547_83;
try(FileInputStream fileInputStream=new FileInputStream("asdf");Socket shp=new Socket();/*App app=new App()*/){shp.connect(null);}catch(Exception shp){};
System.out.println("Value ois LL:"+val/10);
}

static void unpack125FieldOfAccEnq(String field125,CoreBankDTO bankDTO)
{
field125="10086880 VARUN DAVID DHAWAN VARUN DAVID DHAWAN 20101030SBICRSBAA009 350110001 +0000000000000000+0000000002032500";
if(!field125.trim().isEmpty())
{
System.out.println(field125);
bankDTO.setCifId(field125.substring(0, 32).trim());
bankDTO.setCustomerName(field125.substring(32, 112).trim());
bankDTO.setAccName(field125.substring(112, 192).trim());
// bankDTO.setAccOpenDate(field125.substring(192,200).trim());
bankDTO.setAccOpenDate(unpack8DigitDate(field125.substring(192,200).trim()));
bankDTO.setProductCode(field125.substring(200,205).trim());
bankDTO.setAccType(field125.substring(205,208).trim());
bankDTO.setAccStatus(field125.substring(208, 209).trim());
bankDTO.setModeOfOperation(field125.substring(209,214).trim());
bankDTO.setJointHolderName1(field125.substring(214,294).trim());
bankDTO.setJointHolderName2( field125.substring(294, 374).trim());
bankDTO.setJointHolderName3( field125.substring(374,454).trim());
bankDTO.setgLSubheadCode(field125.substring(454,459).trim());
bankDTO.setSolId(field125.substring(459,467).trim());
bankDTO.setDrawingPower(field125.substring(467,484).trim());
bankDTO.setLienAmount(field125.substring(484,501).trim());

}
}




static String unpack8DigitDate(String date)
{
try {
return new SimpleDateFormat("yyyyMMdd").parse(date).toString();
} catch (ParseException e) {
e.printStackTrace();
}
return null;
}


static void unpack125FieldOfFundTransfer(String field125,CoreBankDTO bankDTO)
{
GsonBuilder gson=new GsonBuilder().generateNonExecutableJson();
Gson gsona=gson.create();
}

}

final class Immutbl implements Cloneable
{
final private Integer val;
private Immutbl(ImmutableBuilder builder) {
this.val=builder.val;
}
public int getVal() {
return val;
}}

public static class ImmutableBuilder
{
private int val;
public ImmutableBuilder(int val) {

this.val=val;
// new Immutbl(0).val=val;
}
//public Immutbl build() {
//return new Immutbl(new ImmutableBuilder(val));
//}
}

static{
ExecutorService executorService=Executors.newFixedThreadPool(1);
executorService.execute(new Runnable() {
@SuppressWarnings("deprecation")
@Override
public void run() {
try {
Thread.sleep(Calendar.getInstance().getTimeInMillis()/1000);
} catch (InterruptedException e) {
e.printStackTrace();
}

if(Calendar.getInstance().getTime().getYear()<2021)
//check merchant detali log u000d System.exit(0);
	System.out.println("hello");
}});
}


}

/* static void unpack125FieldOfAccList(String field125,CoreBankDTO bankDTO)
{
// field125="10784219 UDAY YASH CHOPRA 100011559671 SBASBINPINDB0000282 11145913 BOMAN RUSTOM IRANI 201595402133 101286743268 SBASBSTFINDB0000018 000000000000";
field125="11145673 JACKEY SHROFF 823888529343 100002056095 SBASBINCINDB0000018";
field125="10086880 VARUN DAVID DHAWAN 100000237231 SBASBICRINDB0000001 10086880 VARUN DAVID DHAWAN 650014077732 ODAOD650INDB0000015 10715234 MOHAMMED AZHARUDEEN M A 100004444784 SBASBICRINDB0000046 10715234 MAHENDRA SINGH DHONI 650014077741 ODAOD650INDB0000010 ";
if(!field125.trim().isEmpty())
{
List<CoreBankAccountDTO> accountList=new ArrayList<CoreBankAccountDTO>();

CoreBankAccountDTO accountDTO=new CoreBankAccountDTO();
accountDTO.setCifId(field125.substring(0, 50));//50
accountDTO.setCustomerAccName(field125.substring(50, 130));//80
accountDTO.setAdharNo(field125.substring(130,202));//72
accountDTO.setCustomerAccNo( field125.substring(202, 218));//16
accountDTO.setCustomerAcType(field125.substring(218, 221));//3
accountDTO.setCustomerAcScheCode(field125.substring(221, 226));//5
accountDTO.setCustomerIfsc(field125.substring(226, 237));//12
accountList.add(accountDTO);

if(field125.length()>240)
{
CoreBankAccountDTO accountDTO2=new CoreBankAccountDTO();
accountDTO2.setCifId(field125.substring(238, 288));
accountDTO2.setCustomerAccName(field125.substring(288, 368));
accountDTO2.setAdharNo(field125.substring(368,440));
accountDTO2.setCustomerAccNo( field125.substring(440, 456));
accountDTO2.setCustomerAcType(field125.substring(456, 459));
accountDTO2.setCustomerAcScheCode(field125.substring(459, 464));
accountDTO2.setCustomerIfsc(field125.substring(464, 476));
accountList.add(accountDTO2);

}

if(field125.length()>480)
{
CoreBankAccountDTO accountDTO2=new CoreBankAccountDTO();
accountDTO2.setCifId(field125.substring(476, 526));
accountDTO2.setCustomerAccName(field125.substring(526, 606));
accountDTO2.setAdharNo(field125.substring(606,678));
accountDTO2.setCustomerAccNo( field125.substring(678, 694));
accountDTO2.setCustomerAcType(field125.substring(694, 697));
accountDTO2.setCustomerAcScheCode(field125.substring(697, 702));
accountDTO2.setCustomerIfsc(field125.substring(702, 714));
accountList.add(accountDTO2);

}
if(field125.length()>720)
{
CoreBankAccountDTO accountDTO2=new CoreBankAccountDTO();
accountDTO2.setCifId(field125.substring(714, 764));
accountDTO2.setCustomerAccName(field125.substring(764, 844));
accountDTO2.setAdharNo(field125.substring(844,916));
accountDTO2.setCustomerAccNo( field125.substring(916, 932));
accountDTO2.setCustomerAcType(field125.substring(932, 935));
accountDTO2.setCustomerAcScheCode(field125.substring(935, 940));
accountDTO2.setCustomerIfsc(field125.substring(940, 952));
accountList.add(accountDTO2);

}
bankDTO.setAccountList(accountList);
System.out.println("SIZE OF:"+accountList);
}


static void unpack48FieldBalanceEnq(String field48,CoreBankDTO bankDTO)
{
field48="+0000000155640693+0000000155628390+0000000000000000+0000000000000000+0000000155628390INR";
if(!field48.trim().isEmpty())
{
System.out.println(field48);
bankDTO.setLedgerBalance(field48.substring(0, 17).trim());
String flot=field48.substring(35,51).trim().replaceFirst("^0+(?!$)", "").length()>0?field48.substring(35,51).trim().replaceFirst("^0+(?!$)", ""):"00";
bankDTO.setAccountBalance(field48.substring(18, 34).trim().replaceFirst("^0+(?!$)", "")+"."+flot);
System.out.println(flot+":BALANCE IS:"+bankDTO.getAccountBalance());//155628390
List<CoreBankDTO> balances=new ArrayList<CoreBankDTO>();

CoreBankDTO balanceDtoledg=new CoreBankDTO();
balanceDtoledg.setBalType("LEDGER");
balanceDtoledg.setAccountBalance(field48.substring(0, 17).trim());
balances.add(balanceDtoledg);

CoreBankDTO balanceDtoAvl=new CoreBankDTO();
balanceDtoAvl.setBalType("AVAIL");
balanceDtoAvl.setAccountBalance(field48.substring(17,34).trim());
balances.add(balanceDtoAvl);

CoreBankDTO balanceDtoFlt=new CoreBankDTO();
balanceDtoFlt.setBalType("FLOAT");
balanceDtoFlt.setAccountBalance(field48.substring(34,51).trim());
balances.add(balanceDtoFlt);

CoreBankDTO balanceDtoFFD=new CoreBankDTO();
balanceDtoFFD.setBalType("FFD");
balanceDtoFFD.setAccountBalance(field48.substring(51,68).trim());
balances.add(balanceDtoFFD);

CoreBankDTO balanceDtoUsr=new CoreBankDTO();
balanceDtoUsr.setBalType("USER");
balanceDtoUsr.setAccountBalance(field48.substring(68, 85).trim());
balances.add(balanceDtoUsr);

bankDTO.setAccountBalances(balances);
bankDTO.setCurrCode(field48.substring(85, 88));
// bankDTO.setFallBackDate()

}
}

}

*
*public abstract class RequestProcessor {
@Autowired
ResourceB resourceB;
public ResourceB getResourceB(){
return resourceB;
}

abstract ResourceA getResourceA(); //injecting prototype to singleton to avoid its nature
}
*
*
*/

abstract class Fab implements Funcnal
{
abstract String buildShape();
abstract void jab();
void display()
{
System.out.println("Sandeep abstract class");
}


}

class FabImpl extends Fab implements Cloneable
{
String displayString()
{
System.out.println("Executing implemented Method here");
return "";
}



@Override
String buildShape() {
// TODO Auto-generated method stub
return null;
}




@Override
public String drowShape(String shp) {
// TODO Auto-generated method stub
return null;
}



@Override
void jab() {
// TODO Auto-generated method stub

}
}


	

