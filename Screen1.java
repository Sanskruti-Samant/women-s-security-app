package appinventor.ai_prateekelectronmechanics.womenSafety;

import android.os.Bundle;
import com.google.appinventor.components.runtime.AccelerometerSensor;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ContactPicker;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.PhoneCall;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Texting;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

public class Screen1 extends Form implements Runnable {
  static final SimpleSymbol Lit0;
  
  static final SimpleSymbol Lit1;
  
  static final SimpleSymbol Lit10;
  
  static final SimpleSymbol Lit100;
  
  static final FString Lit101;
  
  static final FString Lit102;
  
  static final SimpleSymbol Lit103;
  
  static final IntNum Lit104;
  
  static final IntNum Lit105;
  
  static final FString Lit106;
  
  static final PairWithPosition Lit107;
  
  static final SimpleSymbol Lit108;
  
  static final FString Lit109;
  
  static final SimpleSymbol Lit11;
  
  static final IntNum Lit110;
  
  static final IntNum Lit111;
  
  static final FString Lit112;
  
  static final FString Lit113;
  
  static final IntNum Lit114;
  
  static final IntNum Lit115;
  
  static final FString Lit116;
  
  static final FString Lit117;
  
  static final SimpleSymbol Lit118;
  
  static final FString Lit119;
  
  static final SimpleSymbol Lit12;
  
  static final PairWithPosition Lit120;
  
  static final SimpleSymbol Lit121;
  
  static final SimpleSymbol Lit122;
  
  static final SimpleSymbol Lit123;
  
  static final SimpleSymbol Lit124;
  
  static final FString Lit125;
  
  static final SimpleSymbol Lit126;
  
  static final SimpleSymbol Lit127;
  
  static final IntNum Lit128;
  
  static final FString Lit129;
  
  static final SimpleSymbol Lit13;
  
  static final FString Lit130;
  
  static final FString Lit131;
  
  static final SimpleSymbol Lit132;
  
  static final PairWithPosition Lit133;
  
  static final PairWithPosition Lit134;
  
  static final SimpleSymbol Lit135;
  
  static final SimpleSymbol Lit136;
  
  static final SimpleSymbol Lit137;
  
  static final SimpleSymbol Lit138;
  
  static final PairWithPosition Lit139;
  
  static final SimpleSymbol Lit14;
  
  static final PairWithPosition Lit140;
  
  static final PairWithPosition Lit141;
  
  static final PairWithPosition Lit142;
  
  static final PairWithPosition Lit143;
  
  static final PairWithPosition Lit144;
  
  static final PairWithPosition Lit145;
  
  static final PairWithPosition Lit146;
  
  static final PairWithPosition Lit147;
  
  static final PairWithPosition Lit148;
  
  static final SimpleSymbol Lit149;
  
  static final SimpleSymbol Lit15;
  
  static final SimpleSymbol Lit150;
  
  static final SimpleSymbol Lit151;
  
  static final FString Lit152;
  
  static final FString Lit153;
  
  static final FString Lit154;
  
  static final FString Lit155;
  
  static final SimpleSymbol Lit156;
  
  static final FString Lit157;
  
  static final FString Lit158;
  
  static final FString Lit159;
  
  static final SimpleSymbol Lit16;
  
  static final FString Lit160;
  
  static final SimpleSymbol Lit161;
  
  static final SimpleSymbol Lit162;
  
  static final SimpleSymbol Lit163;
  
  static final SimpleSymbol Lit164;
  
  static final SimpleSymbol Lit165;
  
  static final SimpleSymbol Lit166;
  
  static final SimpleSymbol Lit167;
  
  static final SimpleSymbol Lit168;
  
  static final SimpleSymbol Lit169;
  
  static final SimpleSymbol Lit17;
  
  static final SimpleSymbol Lit170;
  
  static final SimpleSymbol Lit171;
  
  static final SimpleSymbol Lit172;
  
  static final SimpleSymbol Lit173;
  
  static final SimpleSymbol Lit174;
  
  static final SimpleSymbol Lit175 = (SimpleSymbol)(new SimpleSymbol("lookup-handler")).readResolve();
  
  static final SimpleSymbol Lit18;
  
  static final PairWithPosition Lit19;
  
  static final SimpleSymbol Lit2;
  
  static final SimpleSymbol Lit20;
  
  static final SimpleSymbol Lit21;
  
  static final PairWithPosition Lit22;
  
  static final SimpleSymbol Lit23;
  
  static final PairWithPosition Lit24;
  
  static final PairWithPosition Lit25;
  
  static final SimpleSymbol Lit26;
  
  static final SimpleSymbol Lit27;
  
  static final FString Lit28;
  
  static final SimpleSymbol Lit29;
  
  static final SimpleSymbol Lit3;
  
  static final SimpleSymbol Lit30;
  
  static final IntNum Lit31;
  
  static final SimpleSymbol Lit32;
  
  static final IntNum Lit33;
  
  static final IntNum Lit34;
  
  static final SimpleSymbol Lit35;
  
  static final IntNum Lit36;
  
  static final SimpleSymbol Lit37;
  
  static final IntNum Lit38;
  
  static final FString Lit39;
  
  static final SimpleSymbol Lit4;
  
  static final FString Lit40;
  
  static final SimpleSymbol Lit41;
  
  static final SimpleSymbol Lit42;
  
  static final SimpleSymbol Lit43;
  
  static final IntNum Lit44;
  
  static final SimpleSymbol Lit45;
  
  static final SimpleSymbol Lit46;
  
  static final SimpleSymbol Lit47;
  
  static final IntNum Lit48;
  
  static final FString Lit49;
  
  static final SimpleSymbol Lit5;
  
  static final FString Lit50;
  
  static final SimpleSymbol Lit51;
  
  static final IntNum Lit52;
  
  static final IntNum Lit53;
  
  static final FString Lit54;
  
  static final FString Lit55;
  
  static final SimpleSymbol Lit56;
  
  static final IntNum Lit57;
  
  static final SimpleSymbol Lit58;
  
  static final IntNum Lit59;
  
  static final SimpleSymbol Lit6;
  
  static final FString Lit60;
  
  static final PairWithPosition Lit61;
  
  static final SimpleSymbol Lit62;
  
  static final SimpleSymbol Lit63;
  
  static final FString Lit64;
  
  static final SimpleSymbol Lit65;
  
  static final IntNum Lit66;
  
  static final IntNum Lit67;
  
  static final FString Lit68;
  
  static final FString Lit69;
  
  static final IntNum Lit7;
  
  static final SimpleSymbol Lit70;
  
  static final IntNum Lit71;
  
  static final IntNum Lit72;
  
  static final FString Lit73;
  
  static final SimpleSymbol Lit74;
  
  static final SimpleSymbol Lit75;
  
  static final PairWithPosition Lit76;
  
  static final SimpleSymbol Lit77;
  
  static final SimpleSymbol Lit78;
  
  static final SimpleSymbol Lit79;
  
  static final SimpleSymbol Lit8;
  
  static final SimpleSymbol Lit80;
  
  static final PairWithPosition Lit81;
  
  static final SimpleSymbol Lit82;
  
  static final SimpleSymbol Lit83;
  
  static final SimpleSymbol Lit84;
  
  static final SimpleSymbol Lit85;
  
  static final FString Lit86;
  
  static final SimpleSymbol Lit87;
  
  static final IntNum Lit88;
  
  static final IntNum Lit89;
  
  static final SimpleSymbol Lit9;
  
  static final FString Lit90;
  
  static final SimpleSymbol Lit91;
  
  static final PairWithPosition Lit92;
  
  static final SimpleSymbol Lit93;
  
  static final SimpleSymbol Lit94;
  
  static final FString Lit95;
  
  static final IntNum Lit96;
  
  static final FString Lit97;
  
  static final FString Lit98;
  
  static final SimpleSymbol Lit99;
  
  public static Screen1 Screen1;
  
  static final ModuleMethod lambda$Fn1;
  
  static final ModuleMethod lambda$Fn10;
  
  static final ModuleMethod lambda$Fn11;
  
  static final ModuleMethod lambda$Fn12;
  
  static final ModuleMethod lambda$Fn13;
  
  static final ModuleMethod lambda$Fn14;
  
  static final ModuleMethod lambda$Fn15;
  
  static final ModuleMethod lambda$Fn16;
  
  static final ModuleMethod lambda$Fn17;
  
  static final ModuleMethod lambda$Fn18;
  
  static final ModuleMethod lambda$Fn19;
  
  static final ModuleMethod lambda$Fn2;
  
  static final ModuleMethod lambda$Fn20;
  
  static final ModuleMethod lambda$Fn21;
  
  static final ModuleMethod lambda$Fn22;
  
  static final ModuleMethod lambda$Fn23;
  
  static final ModuleMethod lambda$Fn24;
  
  static final ModuleMethod lambda$Fn25;
  
  static final ModuleMethod lambda$Fn26;
  
  static final ModuleMethod lambda$Fn27;
  
  static final ModuleMethod lambda$Fn28;
  
  static final ModuleMethod lambda$Fn29;
  
  static final ModuleMethod lambda$Fn3;
  
  static final ModuleMethod lambda$Fn4;
  
  static final ModuleMethod lambda$Fn5;
  
  static final ModuleMethod lambda$Fn6;
  
  static final ModuleMethod lambda$Fn7;
  
  static final ModuleMethod lambda$Fn8;
  
  static final ModuleMethod lambda$Fn9;
  
  public Boolean $Stdebug$Mnform$St;
  
  public final ModuleMethod $define;
  
  public AccelerometerSensor AccelerometerSensor1;
  
  public final ModuleMethod AccelerometerSensor1$Shaking;
  
  public Button Button1;
  
  public final ModuleMethod Button1$LongClick;
  
  public ContactPicker ContactPicker1;
  
  public final ModuleMethod ContactPicker1$AfterPicking;
  
  public final ModuleMethod ContactPicker1$TouchDown;
  
  public File File1;
  
  public final ModuleMethod File1$GotText;
  
  public File File2;
  
  public final ModuleMethod File2$GotText;
  
  public HorizontalArrangement HorizontalArrangement1;
  
  public LocationSensor LocationSensor1;
  
  public File MainText;
  
  public final ModuleMethod MainText$GotText;
  
  public PhoneCall PhoneCall1;
  
  public HorizontalArrangement PhoneNumbers;
  
  public final ModuleMethod Screen1$Initialize;
  
  public Texting Texting1;
  
  public final ModuleMethod add$Mnto$Mncomponents;
  
  public final ModuleMethod add$Mnto$Mnevents;
  
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  
  public final ModuleMethod android$Mnlog$Mnform;
  
  public Button check;
  
  public final ModuleMethod check$Click;
  
  public LList components$Mnto$Mncreate;
  
  public HorizontalArrangement contactSelect;
  
  public final ModuleMethod dispatchEvent;
  
  public final ModuleMethod dispatchGenericEvent;
  
  public Label displayNumbers;
  
  public LList events$Mnto$Mnregister;
  
  public LList form$Mndo$Mnafter$Mncreation;
  
  public Environment form$Mnenvironment;
  
  public Symbol form$Mnname$Mnsymbol;
  
  public final ModuleMethod get$Mnsimple$Mnname;
  
  public Environment global$Mnvar$Mnenvironment;
  
  public LList global$Mnvars$Mnto$Mncreate;
  
  public Button help;
  
  public final ModuleMethod help$Click;
  
  public HorizontalArrangement helpTab;
  
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  
  public final ModuleMethod lookup$Mnhandler;
  
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  
  public final ModuleMethod onCreate;
  
  public final ModuleMethod process$Mnexception;
  
  public final ModuleMethod send$Mnerror;
  
  public Label title;
  
  public HorizontalArrangement titleTab;
  
  public TextBox typeHere;
  
  static {
    Lit174 = (SimpleSymbol)(new SimpleSymbol("dispatchGenericEvent")).readResolve();
    Lit173 = (SimpleSymbol)(new SimpleSymbol("dispatchEvent")).readResolve();
    Lit172 = (SimpleSymbol)(new SimpleSymbol("send-error")).readResolve();
    Lit171 = (SimpleSymbol)(new SimpleSymbol("add-to-form-do-after-creation")).readResolve();
    Lit170 = (SimpleSymbol)(new SimpleSymbol("add-to-global-vars")).readResolve();
    Lit169 = (SimpleSymbol)(new SimpleSymbol("add-to-components")).readResolve();
    Lit168 = (SimpleSymbol)(new SimpleSymbol("add-to-events")).readResolve();
    Lit167 = (SimpleSymbol)(new SimpleSymbol("add-to-global-var-environment")).readResolve();
    Lit166 = (SimpleSymbol)(new SimpleSymbol("is-bound-in-form-environment")).readResolve();
    Lit165 = (SimpleSymbol)(new SimpleSymbol("lookup-in-form-environment")).readResolve();
    Lit164 = (SimpleSymbol)(new SimpleSymbol("add-to-form-environment")).readResolve();
    Lit163 = (SimpleSymbol)(new SimpleSymbol("android-log-form")).readResolve();
    Lit162 = (SimpleSymbol)(new SimpleSymbol("get-simple-name")).readResolve();
    Lit161 = (SimpleSymbol)(new SimpleSymbol("MainText$GotText")).readResolve();
    Lit160 = new FString("com.google.appinventor.components.runtime.File");
    Lit159 = new FString("com.google.appinventor.components.runtime.File");
    Lit158 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    Lit157 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    Lit156 = (SimpleSymbol)(new SimpleSymbol("File2$GotText")).readResolve();
    Lit155 = new FString("com.google.appinventor.components.runtime.File");
    Lit154 = new FString("com.google.appinventor.components.runtime.File");
    Lit153 = new FString("com.google.appinventor.components.runtime.PhoneCall");
    Lit152 = new FString("com.google.appinventor.components.runtime.PhoneCall");
    Lit151 = (SimpleSymbol)(new SimpleSymbol("GotText")).readResolve();
    Lit150 = (SimpleSymbol)(new SimpleSymbol("File1$GotText")).readResolve();
    Lit149 = (SimpleSymbol)(new SimpleSymbol("SendMessageDirect")).readResolve();
    SimpleSymbol simpleSymbol2 = (SimpleSymbol)(new SimpleSymbol("text")).readResolve();
    Lit5 = simpleSymbol2;
    Lit148 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820643), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820637);
    Lit147 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820619), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820613);
    Lit146 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820595), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820589);
    Lit145 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820571), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820565);
    Lit144 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820547), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820541);
    Lit143 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820052), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820046);
    Lit142 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820028), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820022);
    Lit141 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 820004), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819998);
    Lit140 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819980), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819974);
    Lit139 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819956), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819950);
    Lit138 = (SimpleSymbol)(new SimpleSymbol("Longitude")).readResolve();
    Lit137 = (SimpleSymbol)(new SimpleSymbol("Latitude")).readResolve();
    Lit136 = (SimpleSymbol)(new SimpleSymbol("LocationSensor1")).readResolve();
    Lit135 = (SimpleSymbol)(new SimpleSymbol("Message")).readResolve();
    Lit134 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819456), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819450);
    Lit133 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 819367);
    Lit132 = (SimpleSymbol)(new SimpleSymbol("$text")).readResolve();
    Lit131 = new FString("com.google.appinventor.components.runtime.File");
    Lit130 = new FString("com.google.appinventor.components.runtime.File");
    Lit129 = new FString("com.google.appinventor.components.runtime.Texting");
    Lit128 = IntNum.make(1);
    Lit127 = (SimpleSymbol)(new SimpleSymbol("ReceivingEnabled")).readResolve();
    Lit126 = (SimpleSymbol)(new SimpleSymbol("Texting1")).readResolve();
    Lit125 = new FString("com.google.appinventor.components.runtime.Texting");
    Lit124 = (SimpleSymbol)(new SimpleSymbol("Shaking")).readResolve();
    Lit123 = (SimpleSymbol)(new SimpleSymbol("AccelerometerSensor1$Shaking")).readResolve();
    Lit122 = (SimpleSymbol)(new SimpleSymbol("MakePhoneCallDirect")).readResolve();
    Lit121 = (SimpleSymbol)(new SimpleSymbol("PhoneCall1")).readResolve();
    Lit120 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 761943);
    Lit119 = new FString("com.google.appinventor.components.runtime.AccelerometerSensor");
    Lit118 = (SimpleSymbol)(new SimpleSymbol("AccelerometerSensor1")).readResolve();
    Lit117 = new FString("com.google.appinventor.components.runtime.AccelerometerSensor");
    Lit116 = new FString("com.google.appinventor.components.runtime.Label");
    int[] arrayOfInt2 = new int[2];
    arrayOfInt2[0] = -1;
    Lit115 = IntNum.make(arrayOfInt2);
    Lit114 = IntNum.make(15);
    Lit113 = new FString("com.google.appinventor.components.runtime.Label");
    Lit112 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit111 = IntNum.make(-1020);
    Lit110 = IntNum.make(16777215);
    Lit109 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit108 = (SimpleSymbol)(new SimpleSymbol("check$Click")).readResolve();
    Lit107 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 643200), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 643194);
    Lit106 = new FString("com.google.appinventor.components.runtime.Button");
    Lit105 = IntNum.make(-1010);
    Lit104 = IntNum.make(-1007);
    Lit103 = (SimpleSymbol)(new SimpleSymbol("check")).readResolve();
    Lit102 = new FString("com.google.appinventor.components.runtime.Button");
    Lit101 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit100 = (SimpleSymbol)(new SimpleSymbol("Hint")).readResolve();
    Lit99 = (SimpleSymbol)(new SimpleSymbol("typeHere")).readResolve();
    Lit98 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit97 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit96 = IntNum.make(16777215);
    Lit95 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit94 = (SimpleSymbol)(new SimpleSymbol("LongClick")).readResolve();
    Lit93 = (SimpleSymbol)(new SimpleSymbol("Button1$LongClick")).readResolve();
    SimpleSymbol simpleSymbol1 = (SimpleSymbol)(new SimpleSymbol("boolean")).readResolve();
    Lit12 = simpleSymbol1;
    Lit92 = PairWithPosition.make(simpleSymbol1, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 499876);
    Lit91 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement1")).readResolve();
    Lit90 = new FString("com.google.appinventor.components.runtime.Button");
    Lit89 = IntNum.make(-1010);
    Lit88 = IntNum.make(-1007);
    Lit87 = (SimpleSymbol)(new SimpleSymbol("Button1")).readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    Lit85 = (SimpleSymbol)(new SimpleSymbol("AfterPicking")).readResolve();
    Lit84 = (SimpleSymbol)(new SimpleSymbol("ContactPicker1$AfterPicking")).readResolve();
    Lit83 = (SimpleSymbol)(new SimpleSymbol("ContactName")).readResolve();
    Lit82 = (SimpleSymbol)(new SimpleSymbol("displayNumbers")).readResolve();
    Lit81 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 446602), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 446596);
    Lit80 = (SimpleSymbol)(new SimpleSymbol("PhoneNumber")).readResolve();
    Lit79 = (SimpleSymbol)(new SimpleSymbol("SaveFile")).readResolve();
    Lit78 = (SimpleSymbol)(new SimpleSymbol("TouchDown")).readResolve();
    Lit77 = (SimpleSymbol)(new SimpleSymbol("ContactPicker1$TouchDown")).readResolve();
    Lit76 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 438416);
    Lit75 = (SimpleSymbol)(new SimpleSymbol("Visible")).readResolve();
    Lit74 = (SimpleSymbol)(new SimpleSymbol("PhoneNumbers")).readResolve();
    Lit73 = new FString("com.google.appinventor.components.runtime.ContactPicker");
    Lit72 = IntNum.make(-1010);
    Lit71 = IntNum.make(-1007);
    Lit70 = (SimpleSymbol)(new SimpleSymbol("ContactPicker1")).readResolve();
    Lit69 = new FString("com.google.appinventor.components.runtime.ContactPicker");
    Lit68 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit67 = IntNum.make(-1015);
    Lit66 = IntNum.make(16777215);
    Lit65 = (SimpleSymbol)(new SimpleSymbol("contactSelect")).readResolve();
    Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit63 = (SimpleSymbol)(new SimpleSymbol("Click")).readResolve();
    Lit62 = (SimpleSymbol)(new SimpleSymbol("help$Click")).readResolve();
    Lit61 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 331863);
    Lit60 = new FString("com.google.appinventor.components.runtime.Button");
    Lit59 = IntNum.make(-1032);
    Lit58 = (SimpleSymbol)(new SimpleSymbol("Image")).readResolve();
    Lit57 = IntNum.make(-1025);
    Lit56 = (SimpleSymbol)(new SimpleSymbol("help")).readResolve();
    Lit55 = new FString("com.google.appinventor.components.runtime.Button");
    Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit53 = IntNum.make(-1040);
    Lit52 = IntNum.make(16777215);
    Lit51 = (SimpleSymbol)(new SimpleSymbol("helpTab")).readResolve();
    Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    int[] arrayOfInt1 = new int[2];
    arrayOfInt1[0] = -1;
    Lit48 = IntNum.make(arrayOfInt1);
    Lit47 = (SimpleSymbol)(new SimpleSymbol("TextColor")).readResolve();
    Lit46 = (SimpleSymbol)(new SimpleSymbol("Text")).readResolve();
    Lit45 = (SimpleSymbol)(new SimpleSymbol("FontTypeface")).readResolve();
    Lit44 = IntNum.make(20);
    Lit43 = (SimpleSymbol)(new SimpleSymbol("FontSize")).readResolve();
    Lit42 = (SimpleSymbol)(new SimpleSymbol("FontBold")).readResolve();
    Lit41 = (SimpleSymbol)(new SimpleSymbol("title")).readResolve();
    Lit40 = new FString("com.google.appinventor.components.runtime.Label");
    Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit38 = IntNum.make(-2);
    Lit37 = (SimpleSymbol)(new SimpleSymbol("Width")).readResolve();
    Lit36 = IntNum.make(-1015);
    Lit35 = (SimpleSymbol)(new SimpleSymbol("Height")).readResolve();
    Lit34 = IntNum.make(16777215);
    Lit33 = IntNum.make(2);
    Lit32 = (SimpleSymbol)(new SimpleSymbol("AlignVertical")).readResolve();
    Lit31 = IntNum.make(3);
    Lit30 = (SimpleSymbol)(new SimpleSymbol("AlignHorizontal")).readResolve();
    Lit29 = (SimpleSymbol)(new SimpleSymbol("titleTab")).readResolve();
    Lit28 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit27 = (SimpleSymbol)(new SimpleSymbol("Initialize")).readResolve();
    Lit26 = (SimpleSymbol)(new SimpleSymbol("Screen1$Initialize")).readResolve();
    Lit25 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94594);
    Lit24 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94503), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94497);
    Lit23 = (SimpleSymbol)(new SimpleSymbol("MainText")).readResolve();
    Lit22 = PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94397);
    Lit21 = (SimpleSymbol)(new SimpleSymbol("ReadFrom")).readResolve();
    Lit20 = (SimpleSymbol)(new SimpleSymbol("File2")).readResolve();
    Lit19 = PairWithPosition.make(Lit5, PairWithPosition.make(Lit5, LList.Empty, "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94309), "/tmp/1585436883906_0.5725027475507327-0/youngandroidproject/../src/appinventor/ai_prateekelectronmechanics/womenSafety/Screen1.yail", 94303);
    Lit18 = (SimpleSymbol)(new SimpleSymbol("AppendToFile")).readResolve();
    Lit17 = (SimpleSymbol)(new SimpleSymbol("File1")).readResolve();
    Lit16 = (SimpleSymbol)(new SimpleSymbol("TitleVisible")).readResolve();
    Lit15 = (SimpleSymbol)(new SimpleSymbol("Title")).readResolve();
    Lit14 = (SimpleSymbol)(new SimpleSymbol("Sizing")).readResolve();
    Lit13 = (SimpleSymbol)(new SimpleSymbol("ShowStatusBar")).readResolve();
    Lit11 = (SimpleSymbol)(new SimpleSymbol("ShowListsAsJson")).readResolve();
    Lit10 = (SimpleSymbol)(new SimpleSymbol("ScreenOrientation")).readResolve();
    Lit9 = (SimpleSymbol)(new SimpleSymbol("Icon")).readResolve();
    Lit8 = (SimpleSymbol)(new SimpleSymbol("number")).readResolve();
    arrayOfInt1 = new int[2];
    arrayOfInt1[0] = -11579569;
    Lit7 = IntNum.make(arrayOfInt1);
    Lit6 = (SimpleSymbol)(new SimpleSymbol("BackgroundColor")).readResolve();
    Lit4 = (SimpleSymbol)(new SimpleSymbol("AppName")).readResolve();
    Lit3 = (SimpleSymbol)(new SimpleSymbol("g$text")).readResolve();
    Lit2 = (SimpleSymbol)(new SimpleSymbol("*the-null-value*")).readResolve();
    Lit1 = (SimpleSymbol)(new SimpleSymbol("getMessage")).readResolve();
    Lit0 = (SimpleSymbol)(new SimpleSymbol("Screen1")).readResolve();
  }
  
  public Screen1() {
    ModuleInfo.register(this);
    Screen1$frame screen1$frame = new Screen1$frame();
    screen1$frame.$main = this;
    this.get$Mnsimple$Mnname = new ModuleMethod(screen1$frame, 1, Lit162, 4097);
    this.onCreate = new ModuleMethod(screen1$frame, 2, "onCreate", 4097);
    this.android$Mnlog$Mnform = new ModuleMethod(screen1$frame, 3, Lit163, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 4, Lit164, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 5, Lit165, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 7, Lit166, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(screen1$frame, 8, Lit167, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(screen1$frame, 9, Lit168, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(screen1$frame, 10, Lit169, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(screen1$frame, 11, Lit170, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(screen1$frame, 12, Lit171, 4097);
    this.send$Mnerror = new ModuleMethod(screen1$frame, 13, Lit172, 4097);
    this.process$Mnexception = new ModuleMethod(screen1$frame, 14, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(screen1$frame, 15, Lit173, 16388);
    this.dispatchGenericEvent = new ModuleMethod(screen1$frame, 16, Lit174, 16388);
    this.lookup$Mnhandler = new ModuleMethod(screen1$frame, 17, Lit175, 8194);
    ModuleMethod moduleMethod = new ModuleMethod(screen1$frame, 18, null, 0);
    moduleMethod.setProperty("source-location", "/tmp/runtime9130887760156434227.scm:622");
    lambda$Fn1 = moduleMethod;
    this.$define = new ModuleMethod(screen1$frame, 19, "$define", 0);
    lambda$Fn2 = new ModuleMethod(screen1$frame, 20, null, 0);
    lambda$Fn3 = new ModuleMethod(screen1$frame, 21, null, 0);
    this.Screen1$Initialize = new ModuleMethod(screen1$frame, 22, Lit26, 0);
    lambda$Fn4 = new ModuleMethod(screen1$frame, 23, null, 0);
    lambda$Fn5 = new ModuleMethod(screen1$frame, 24, null, 0);
    lambda$Fn6 = new ModuleMethod(screen1$frame, 25, null, 0);
    lambda$Fn7 = new ModuleMethod(screen1$frame, 26, null, 0);
    lambda$Fn8 = new ModuleMethod(screen1$frame, 27, null, 0);
    lambda$Fn9 = new ModuleMethod(screen1$frame, 28, null, 0);
    lambda$Fn10 = new ModuleMethod(screen1$frame, 29, null, 0);
    lambda$Fn11 = new ModuleMethod(screen1$frame, 30, null, 0);
    this.help$Click = new ModuleMethod(screen1$frame, 31, Lit62, 0);
    lambda$Fn12 = new ModuleMethod(screen1$frame, 32, null, 0);
    lambda$Fn13 = new ModuleMethod(screen1$frame, 33, null, 0);
    lambda$Fn14 = new ModuleMethod(screen1$frame, 34, null, 0);
    lambda$Fn15 = new ModuleMethod(screen1$frame, 35, null, 0);
    this.ContactPicker1$TouchDown = new ModuleMethod(screen1$frame, 36, Lit77, 0);
    this.ContactPicker1$AfterPicking = new ModuleMethod(screen1$frame, 37, Lit84, 0);
    lambda$Fn16 = new ModuleMethod(screen1$frame, 38, null, 0);
    lambda$Fn17 = new ModuleMethod(screen1$frame, 39, null, 0);
    this.Button1$LongClick = new ModuleMethod(screen1$frame, 40, Lit93, 0);
    lambda$Fn18 = new ModuleMethod(screen1$frame, 41, null, 0);
    lambda$Fn19 = new ModuleMethod(screen1$frame, 42, null, 0);
    lambda$Fn20 = new ModuleMethod(screen1$frame, 43, null, 0);
    lambda$Fn21 = new ModuleMethod(screen1$frame, 44, null, 0);
    lambda$Fn22 = new ModuleMethod(screen1$frame, 45, null, 0);
    lambda$Fn23 = new ModuleMethod(screen1$frame, 46, null, 0);
    this.check$Click = new ModuleMethod(screen1$frame, 47, Lit108, 0);
    lambda$Fn24 = new ModuleMethod(screen1$frame, 48, null, 0);
    lambda$Fn25 = new ModuleMethod(screen1$frame, 49, null, 0);
    lambda$Fn26 = new ModuleMethod(screen1$frame, 50, null, 0);
    lambda$Fn27 = new ModuleMethod(screen1$frame, 51, null, 0);
    this.AccelerometerSensor1$Shaking = new ModuleMethod(screen1$frame, 52, Lit123, 0);
    lambda$Fn28 = new ModuleMethod(screen1$frame, 53, null, 0);
    lambda$Fn29 = new ModuleMethod(screen1$frame, 54, null, 0);
    this.File1$GotText = new ModuleMethod(screen1$frame, 55, Lit150, 4097);
    this.File2$GotText = new ModuleMethod(screen1$frame, 56, Lit156, 4097);
    this.MainText$GotText = new ModuleMethod(screen1$frame, 57, Lit161, 4097);
  }
  
  static Object lambda10() {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit30, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit6, Lit52, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit35, Lit53, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit37, Lit38, Lit8);
  }
  
  static Object lambda11() {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit35, Lit57, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit58, "stop-512.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit37, Lit59, Lit8);
  }
  
  static Object lambda12() {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit35, Lit57, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit58, "stop-512.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit37, Lit59, Lit8);
  }
  
  static Object lambda13() {
    runtime.setAndCoerceProperty$Ex(Lit65, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit65, Lit6, Lit66, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit65, Lit35, Lit67, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit65, Lit37, Lit38, Lit8);
  }
  
  static Object lambda14() {
    runtime.setAndCoerceProperty$Ex(Lit65, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit65, Lit6, Lit66, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit65, Lit35, Lit67, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit65, Lit37, Lit38, Lit8);
  }
  
  static Object lambda15() {
    runtime.setAndCoerceProperty$Ex(Lit70, Lit35, Lit71, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit70, Lit58, "phone.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit70, Lit37, Lit72, Lit8);
  }
  
  static Object lambda16() {
    runtime.setAndCoerceProperty$Ex(Lit70, Lit35, Lit71, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit70, Lit58, "phone.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit70, Lit37, Lit72, Lit8);
  }
  
  static Object lambda17() {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit88, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit58, "messages.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit89, Lit8);
  }
  
  static Object lambda18() {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit35, Lit88, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit58, "messages.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit37, Lit89, Lit8);
  }
  
  static Object lambda19() {
    runtime.setAndCoerceProperty$Ex(Lit91, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit6, Lit96, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit35, Lit38, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit75, Boolean.FALSE, Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit91, Lit37, Lit38, Lit8);
  }
  
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject) {
    LList lList2 = LList.makeList(paramArrayOfObject, 0);
    Apply apply = Scheme.apply;
    ModuleMethod moduleMethod = strings.string$Mnappend;
    LList lList1 = LList.Empty;
    while (true) {
      Object object1;
      Object object2;
      if (lList2 == LList.Empty) {
        object1 = apply.apply2(moduleMethod, LList.reverseInPlace(lList1));
        try {
          CharSequence charSequence = (CharSequence)object1;
          return misc.string$To$Symbol(charSequence);
        } catch (ClassCastException null) {
          throw new WrongType(object2, "string->symbol", 1, object1);
        } 
      } 
      try {
        Pair pair = (Pair)object2;
        object2 = pair.getCdr();
        Object object = pair.getCar();
        try {
          Symbol symbol = (Symbol)object;
          object1 = Pair.make(misc.symbol$To$String(symbol), object1);
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "symbol->string", 1, object);
        } 
      } catch (ClassCastException classCastException) {
        throw new WrongType(classCastException, "arg0", -2, object2);
      } 
    } 
  }
  
  static Object lambda2() {
    return null;
  }
  
  static Object lambda20() {
    runtime.setAndCoerceProperty$Ex(Lit91, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit6, Lit96, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit35, Lit38, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit91, Lit75, Boolean.FALSE, Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit91, Lit37, Lit38, Lit8);
  }
  
  static Object lambda21() {
    return runtime.setAndCoerceProperty$Ex(Lit99, Lit100, "Hint for TextBox1", Lit5);
  }
  
  static Object lambda22() {
    return runtime.setAndCoerceProperty$Ex(Lit99, Lit100, "Hint for TextBox1", Lit5);
  }
  
  static Object lambda23() {
    runtime.setAndCoerceProperty$Ex(Lit103, Lit35, Lit104, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit103, Lit58, "check-1-icon.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit103, Lit37, Lit105, Lit8);
  }
  
  static Object lambda24() {
    runtime.setAndCoerceProperty$Ex(Lit103, Lit35, Lit104, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit103, Lit58, "check-1-icon.png", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit103, Lit37, Lit105, Lit8);
  }
  
  static Object lambda25() {
    runtime.setAndCoerceProperty$Ex(Lit74, Lit6, Lit110, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit35, Lit111, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Boolean.FALSE, Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit37, Lit38, Lit8);
  }
  
  static Object lambda26() {
    runtime.setAndCoerceProperty$Ex(Lit74, Lit6, Lit110, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit35, Lit111, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Boolean.FALSE, Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit37, Lit38, Lit8);
  }
  
  static Object lambda27() {
    runtime.setAndCoerceProperty$Ex(Lit82, Lit43, Lit114, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit82, Lit47, Lit115, Lit8);
  }
  
  static Object lambda28() {
    runtime.setAndCoerceProperty$Ex(Lit82, Lit43, Lit114, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit82, Lit47, Lit115, Lit8);
  }
  
  static Object lambda29() {
    return runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit8);
  }
  
  static String lambda3() {
    return "";
  }
  
  static Object lambda30() {
    return runtime.setAndCoerceProperty$Ex(Lit126, Lit127, Lit128, Lit8);
  }
  
  static Object lambda4() {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "A Women Safety", Lit5);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "female-icon.png", Lit5);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "portrait", Lit5);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit12);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit5);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Screen1", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit12);
  }
  
  static Object lambda5() {
    runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit6, Lit34, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit35, Lit36, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit8);
  }
  
  static Object lambda6() {
    runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit6, Lit34, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit29, Lit35, Lit36, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit29, Lit37, Lit38, Lit8);
  }
  
  static Object lambda7() {
    runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Boolean.TRUE, Lit12);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit43, Lit44, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit46, "Women Safety", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit48, Lit8);
  }
  
  static Object lambda8() {
    runtime.setAndCoerceProperty$Ex(Lit41, Lit42, Boolean.TRUE, Lit12);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit43, Lit44, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit45, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit41, Lit46, "Women Safety", Lit5);
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit47, Lit48, Lit8);
  }
  
  static Object lambda9() {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit30, Lit31, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit32, Lit33, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit6, Lit52, Lit8);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit35, Lit53, Lit8);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit37, Lit38, Lit8);
  }
  
  public void $define() {
    Language.setDefaults((Language)Scheme.getInstance());
    try {
      run();
    } catch (Exception exception) {
      androidLogForm(exception.getMessage());
      processException(exception);
    } 
    Screen1 = this;
    addToFormEnvironment((Symbol)Lit0, this);
    LList lList = this.events$Mnto$Mnregister;
    while (true) {
      if (lList == LList.Empty)
        try {
          lList = lists.reverse(this.components$Mnto$Mncreate);
          addToGlobalVars(Lit2, lambda$Fn1);
          LList lList1 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
          while (true) {
            Object object1;
            if (lList1 == LList.Empty) {
              lList1 = lList;
              while (true) {
                Object object2;
                if (lList1 == LList.Empty) {
                  lList1 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
                  while (true) {
                    if (lList1 == LList.Empty) {
                      lList1 = lList;
                      while (true) {
                        if (lList1 == LList.Empty)
                          while (true) {
                            lList1 = LList.Empty;
                            if (lList == lList1)
                              return; 
                            try {
                              Pair pair = (Pair)lList;
                              object = pair.getCar();
                              Object object3 = lists.caddr.apply1(object);
                              lists.cadddr.apply1(object);
                              callInitialize(SlotGet.field.apply2(this, object3));
                              object = pair.getCdr();
                            } catch (ClassCastException null) {
                              throw new WrongType(object1, "arg0", -2, object);
                            } 
                          }  
                        try {
                          Pair pair = (Pair)object1;
                          object1 = pair.getCar();
                          lists.caddr.apply1(object1);
                          object1 = lists.cadddr.apply1(object1);
                          if (object1 != Boolean.FALSE)
                            Scheme.applyToArgs.apply1(object1); 
                          object1 = pair.getCdr();
                        } catch (ClassCastException null) {
                          throw new WrongType(object, "arg0", -2, object1);
                        } 
                      } 
                      break;
                    } 
                    try {
                      Pair pair = (Pair)object1;
                      Object object3 = pair.getCar();
                      object1 = lists.car.apply1(object3);
                      object3 = lists.cadr.apply1(object3);
                      try {
                        object2 = object1;
                        addToGlobalVarEnvironment((Symbol)object2, Scheme.applyToArgs.apply1(object3));
                        object1 = pair.getCdr();
                      } catch (ClassCastException null) {}
                    } catch (ClassCastException null) {
                      throw new WrongType(object, "arg0", -2, object1);
                    } 
                    throw new WrongType(object, "add-to-global-var-environment", 0, object1);
                  } 
                  break;
                } 
                try {
                  Pair pair = (Pair)object1;
                  object2 = pair.getCar();
                  object1 = lists.caddr.apply1(object2);
                  lists.cadddr.apply1(object2);
                  Object object3 = lists.cadr.apply1(object2);
                  object2 = lists.car.apply1(object2);
                  try {
                    Symbol symbol = (Symbol)object2;
                    object2 = lookupInFormEnvironment(symbol);
                    object3 = Invoke.make.apply2(object3, object2);
                    SlotSet.set$Mnfield$Ex.apply3(this, object1, object3);
                    try {
                      object2 = object1;
                      addToFormEnvironment((Symbol)object2, object3);
                      object1 = pair.getCdr();
                    } catch (ClassCastException null) {}
                  } catch (ClassCastException null) {}
                } catch (ClassCastException null) {
                  throw new WrongType(object, "arg0", -2, object1);
                } 
                throw new WrongType(object, "lookup-in-form-environment", 0, object2);
              } 
              break;
            } 
            try {
              Pair pair = (Pair)object1;
              misc.force(pair.getCar());
              object1 = pair.getCdr();
            } catch (ClassCastException null) {
              throw new WrongType(object, "arg0", -2, object1);
            } 
          } 
          continue;
        } catch (YailRuntimeError object) {
          processException(object);
          return;
        }  
      try {
        Pair pair = (Pair)object;
        Object object1 = pair.getCar();
        object = lists.car.apply1(object1);
        if (object == null) {
          object = null;
        } else {
          object = object.toString();
        } 
        object1 = lists.cdr.apply1(object1);
        if (object1 == null) {
          object1 = null;
        } else {
          object1 = object1.toString();
        } 
        EventDispatcher.registerEventForDelegation((HandlesEventDispatching)this, (String)object, (String)object1);
        object = pair.getCdr();
      } catch (ClassCastException classCastException) {
        throw new WrongType(classCastException, "arg0", -2, object);
      } 
    } 
  }
  
  public Object AccelerometerSensor1$Shaking() {
    runtime.setThisForm();
    runtime.callComponentMethod(Lit17, Lit21, LList.list1("/SavedNumbers.txt"), Lit120);
    return runtime.callComponentMethod(Lit121, Lit122, LList.Empty, LList.Empty);
  }
  
  public Object Button1$LongClick() {
    runtime.setThisForm();
    return runtime.setAndCoerceProperty$Ex(Lit91, Lit75, runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit91, Lit75)), Lit92, "not"), Lit12);
  }
  
  public Object ContactPicker1$AfterPicking() {
    runtime.setThisForm();
    runtime.callComponentMethod(Lit17, Lit79, LList.list2(runtime.getProperty$1(Lit70, Lit80), "/SavedNumbers.txt"), Lit81);
    return runtime.setAndCoerceProperty$Ex(Lit82, Lit46, runtime.getProperty$1(Lit70, Lit83), Lit5);
  }
  
  public Object ContactPicker1$TouchDown() {
    runtime.setThisForm();
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit75, runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit74, Lit75)), Lit76, "not"), Lit12);
  }
  
  public Object File1$GotText(Object paramObject) {
    paramObject = runtime.sanitizeComponentData(paramObject);
    runtime.setThisForm();
    SimpleSymbol simpleSymbol1 = Lit126;
    SimpleSymbol simpleSymbol2 = Lit80;
    if (paramObject instanceof Package) {
      object = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable");
    } else {
      object = paramObject;
    } 
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, object, Lit5);
    runtime.callComponentMethod(Lit23, Lit21, LList.list1("/SavedMessage.txt"), Lit133);
    if (runtime.callYailPrimitive(strings.string$Eq$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment((Symbol)Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), ""), Lit134, "text=") != Boolean.FALSE) {
      runtime.setAndCoerceProperty$Ex(Lit126, Lit135, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("I'm in danger, please help ", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("my location ", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("lat: ", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit136, Lit137), runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("long: ", runtime.getProperty$1(Lit136, Lit138)), Lit139, "join")), Lit140, "join")), Lit141, "join")), Lit142, "join")), Lit143, "join"), Lit5);
    } else {
      runtime.setAndCoerceProperty$Ex(Lit126, Lit135, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment((Symbol)Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("my location ", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("lat: ", runtime.callYailPrimitive(strings.string$Mnappend, LList.list2(runtime.getProperty$1(Lit136, Lit137), runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("long: ", runtime.getProperty$1(Lit136, Lit138)), Lit144, "join")), Lit145, "join")), Lit146, "join")), Lit147, "join")), Lit148, "join"), Lit5);
    } 
    runtime.callComponentMethod(Lit126, Lit149, LList.Empty, LList.Empty);
    simpleSymbol1 = Lit82;
    simpleSymbol2 = Lit46;
    if (paramObject instanceof Package) {
      object = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable");
    } else {
      object = paramObject;
    } 
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, object, Lit5);
    simpleSymbol1 = Lit121;
    simpleSymbol2 = Lit80;
    Object object = paramObject;
    if (paramObject instanceof Package)
      object = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable"); 
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, object, Lit5);
  }
  
  public Object File2$GotText(Object paramObject) {
    Object object = runtime.sanitizeComponentData(paramObject);
    runtime.setThisForm();
    SimpleSymbol simpleSymbol1 = Lit82;
    SimpleSymbol simpleSymbol2 = Lit46;
    paramObject = object;
    if (object instanceof Package)
      paramObject = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable"); 
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, paramObject, Lit5);
  }
  
  public Object MainText$GotText(Object paramObject) {
    paramObject = runtime.sanitizeComponentData(paramObject);
    runtime.setThisForm();
    SimpleSymbol simpleSymbol1 = Lit3;
    if (paramObject instanceof Package) {
      object = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable");
    } else {
      object = paramObject;
    } 
    runtime.addGlobalVarToCurrentFormEnvironment((Symbol)simpleSymbol1, object);
    simpleSymbol1 = Lit99;
    SimpleSymbol simpleSymbol2 = Lit46;
    Object object = paramObject;
    if (paramObject instanceof Package)
      object = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit132), " is not bound in the current context" }, ), "Unbound Variable"); 
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, object, Lit5);
  }
  
  public Object Screen1$Initialize() {
    runtime.setThisForm();
    runtime.callComponentMethod(Lit17, Lit18, LList.list2("", "/SavedNumbers.txt"), Lit19);
    runtime.callComponentMethod(Lit20, Lit21, LList.list1("/SavedNumbers.txt"), Lit22);
    runtime.callComponentMethod(Lit23, Lit18, LList.list2("", "/SavedMessage.txt"), Lit24);
    return runtime.callComponentMethod(Lit23, Lit21, LList.list1("/SavedMessage.txt"), Lit25);
  }
  
  public void addToComponents(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    this.components$Mnto$Mncreate = (LList)lists.cons(LList.list4(paramObject1, paramObject2, paramObject3, paramObject4), this.components$Mnto$Mncreate);
  }
  
  public void addToEvents(Object paramObject1, Object paramObject2) {
    this.events$Mnto$Mnregister = (LList)lists.cons(lists.cons(paramObject1, paramObject2), this.events$Mnto$Mnregister);
  }
  
  public void addToFormDoAfterCreation(Object paramObject) {
    this.form$Mndo$Mnafter$Mncreation = (LList)lists.cons(paramObject, this.form$Mndo$Mnafter$Mncreation);
  }
  
  public void addToFormEnvironment(Symbol paramSymbol, Object paramObject) {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.form$Mnenvironment, paramObject }));
    this.form$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVarEnvironment(Symbol paramSymbol, Object paramObject) {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.global$Mnvar$Mnenvironment, paramObject }));
    this.global$Mnvar$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVars(Object paramObject1, Object paramObject2) {
    this.global$Mnvars$Mnto$Mncreate = (LList)lists.cons(LList.list2(paramObject1, paramObject2), this.global$Mnvars$Mnto$Mncreate);
  }
  
  public void androidLogForm(Object paramObject) {}
  
  public Object check$Click() {
    runtime.setThisForm();
    return runtime.callComponentMethod(Lit23, Lit79, LList.list2(runtime.getProperty$1(Lit99, Lit46), "/SavedMessage.txt"), Lit107);
  }
  
  public boolean dispatchEvent(Component paramComponent, String paramString1, String paramString2, Object[] paramArrayOfObject) {
    SimpleSymbol simpleSymbol = misc.string$To$Symbol(paramString1);
    if (isBoundInFormEnvironment((Symbol)simpleSymbol)) {
      if (lookupInFormEnvironment((Symbol)simpleSymbol) == paramComponent) {
        object = lookupHandler(paramString1, paramString2);
        try {
          Scheme.apply.apply2(object, LList.makeList(paramArrayOfObject, 0));
          return true;
        } catch (PermissionException object) {
          boolean bool;
          object.printStackTrace();
          if (this == paramComponent) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool ? IsEqual.apply(paramString2, "PermissionNeeded") : bool) {
            processException(object);
            return false;
          } 
          PermissionDenied(paramComponent, paramString2, object.getPermissionNeeded());
          return false;
        } catch (Throwable throwable) {
          androidLogForm(throwable.getMessage());
          throwable.printStackTrace();
          processException(throwable);
          return false;
        } 
      } 
      return false;
    } 
    EventDispatcher.unregisterEventForDelegation((HandlesEventDispatching)this, (String)object, paramString2);
    return false;
  }
  
  public void dispatchGenericEvent(Component paramComponent, String paramString, boolean paramBoolean, Object[] paramArrayOfObject) {
    boolean bool = true;
    Object object = lookupInFormEnvironment((Symbol)misc.string$To$Symbol((CharSequence)strings.stringAppend(new Object[] { "any$", getSimpleName(paramComponent), "$", paramString })));
    if (object != Boolean.FALSE)
      try {
        Boolean bool1;
        Apply apply = Scheme.apply;
        if (paramBoolean) {
          bool1 = Boolean.TRUE;
        } else {
          bool1 = Boolean.FALSE;
        } 
        apply.apply2(object, lists.cons(paramComponent, lists.cons(bool1, LList.makeList(paramArrayOfObject, 0))));
        return;
      } catch (PermissionException permissionException) {
        permissionException.printStackTrace();
        if (this != paramComponent)
          bool = false; 
        if (bool ? IsEqual.apply(paramString, "PermissionNeeded") : bool) {
          processException(permissionException);
          return;
        } 
        PermissionDenied(paramComponent, paramString, permissionException.getPermissionNeeded());
        return;
      } catch (Throwable throwable) {
        androidLogForm(throwable.getMessage());
        throwable.printStackTrace();
        processException(throwable);
      }  
  }
  
  public String getSimpleName(Object paramObject) {
    return paramObject.getClass().getSimpleName();
  }
  
  public Object help$Click() {
    runtime.setThisForm();
    return runtime.callComponentMethod(Lit17, Lit21, LList.list1("/SavedNumbers.txt"), Lit61);
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol) {
    return this.form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object lookupHandler(Object paramObject1, Object paramObject2) {
    Object object = null;
    if (paramObject1 == null) {
      paramObject1 = null;
    } else {
      paramObject1 = paramObject1.toString();
    } 
    if (paramObject2 == null) {
      paramObject2 = object;
      return lookupInFormEnvironment((Symbol)misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
    } 
    paramObject2 = paramObject2.toString();
    return lookupInFormEnvironment((Symbol)misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol) {
    return lookupInFormEnvironment(paramSymbol, Boolean.FALSE);
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol, Object paramObject) {
    if (this.form$Mnenvironment == null) {
      i = 1;
    } else {
      i = 0;
    } 
    int i = i + 1 & 0x1;
    if ((i != 0) ? this.form$Mnenvironment.isBound(paramSymbol) : (i != 0))
      paramObject = this.form$Mnenvironment.get(paramSymbol); 
    return paramObject;
  }
  
  public void onCreate(Bundle paramBundle) {
    AppInventorCompatActivity.setClassicModeFromYail(true);
    super.onCreate(paramBundle);
  }
  
  public void processException(Object paramObject) {
    Object object = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(paramObject, Lit1));
    if (object == null) {
      object = null;
    } else {
      object = object.toString();
    } 
    if (paramObject instanceof YailRuntimeError) {
      paramObject = ((YailRuntimeError)paramObject).getErrorType();
    } else {
      paramObject = "Runtime Error";
    } 
    RuntimeErrorAlert.alert(this, (String)object, (String)paramObject, "End Application");
  }
  
  public void run() {
    CallContext callContext = CallContext.getInstance();
    Consumer consumer = callContext.consumer;
    callContext.consumer = (Consumer)VoidConsumer.instance;
    try {
      run(callContext);
      throwable = null;
    } catch (Throwable throwable) {}
    ModuleBody.runCleanup(callContext, throwable, consumer);
  }
  
  public final void run(CallContext paramCallContext) {
    Consumer consumer = paramCallContext.consumer;
    Object object = require.find("com.google.youngandroid.runtime");
    try {
      Runnable runnable = (Runnable)object;
      runnable.run();
      this.$Stdebug$Mnform$St = Boolean.FALSE;
      this.form$Mnenvironment = (Environment)Environment.make(misc.symbol$To$String((Symbol)Lit0));
      object = strings.stringAppend(new Object[] { misc.symbol$To$String((Symbol)Lit0), "-global-vars" });
      if (object == null) {
        object = null;
      } else {
        object = object.toString();
      } 
      this.global$Mnvar$Mnenvironment = (Environment)Environment.make((String)object);
      Screen1 = null;
      this.form$Mnname$Mnsymbol = (Symbol)Lit0;
      this.events$Mnto$Mnregister = LList.Empty;
      this.components$Mnto$Mncreate = LList.Empty;
      this.global$Mnvars$Mnto$Mncreate = LList.Empty;
      this.form$Mndo$Mnafter$Mncreation = LList.Empty;
      object = require.find("com.google.youngandroid.runtime");
      try {
        runnable = (Runnable)object;
        runnable.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment((Symbol)Lit3, ""), consumer);
        } else {
          addToGlobalVars(Lit3, lambda$Fn2);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.setAndCoerceProperty$Ex(Lit0, Lit4, "A Women Safety", Lit5);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "female-icon.png", Lit5);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "portrait", Lit5);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.FALSE, Lit12);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit5);
          runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Screen1", Lit5);
          Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit12), consumer);
        } else {
          addToFormDoAfterCreation(new Promise((Procedure)lambda$Fn3));
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit26, this.Screen1$Initialize);
        } else {
          addToFormEnvironment((Symbol)Lit26, this.Screen1$Initialize);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
          addToEvents(Lit0, Lit27);
        } 
        this.titleTab = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit28, Lit29, lambda$Fn4), consumer);
        } else {
          addToComponents(Lit0, Lit39, Lit29, lambda$Fn5);
        } 
        this.title = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit29, Lit40, Lit41, lambda$Fn6), consumer);
        } else {
          addToComponents(Lit29, Lit49, Lit41, lambda$Fn7);
        } 
        this.helpTab = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit50, Lit51, lambda$Fn8), consumer);
        } else {
          addToComponents(Lit0, Lit54, Lit51, lambda$Fn9);
        } 
        this.help = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit51, Lit55, Lit56, lambda$Fn10), consumer);
        } else {
          addToComponents(Lit51, Lit60, Lit56, lambda$Fn11);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit62, this.help$Click);
        } else {
          addToFormEnvironment((Symbol)Lit62, this.help$Click);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "help", "Click");
        } else {
          addToEvents(Lit56, Lit63);
        } 
        this.contactSelect = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, lambda$Fn12), consumer);
        } else {
          addToComponents(Lit0, Lit68, Lit65, lambda$Fn13);
        } 
        this.ContactPicker1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit69, Lit70, lambda$Fn14), consumer);
        } else {
          addToComponents(Lit65, Lit73, Lit70, lambda$Fn15);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit77, this.ContactPicker1$TouchDown);
        } else {
          addToFormEnvironment((Symbol)Lit77, this.ContactPicker1$TouchDown);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "ContactPicker1", "TouchDown");
        } else {
          addToEvents(Lit70, Lit78);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit84, this.ContactPicker1$AfterPicking);
        } else {
          addToFormEnvironment((Symbol)Lit84, this.ContactPicker1$AfterPicking);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "ContactPicker1", "AfterPicking");
        } else {
          addToEvents(Lit70, Lit85);
        } 
        this.Button1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit86, Lit87, lambda$Fn16), consumer);
        } else {
          addToComponents(Lit65, Lit90, Lit87, lambda$Fn17);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit93, this.Button1$LongClick);
        } else {
          addToFormEnvironment((Symbol)Lit93, this.Button1$LongClick);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Button1", "LongClick");
        } else {
          addToEvents(Lit87, Lit94);
        } 
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit95, Lit91, lambda$Fn18), consumer);
        } else {
          addToComponents(Lit65, Lit97, Lit91, lambda$Fn19);
        } 
        this.typeHere = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit91, Lit98, Lit99, lambda$Fn20), consumer);
        } else {
          addToComponents(Lit91, Lit101, Lit99, lambda$Fn21);
        } 
        this.check = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit91, Lit102, Lit103, lambda$Fn22), consumer);
        } else {
          addToComponents(Lit91, Lit106, Lit103, lambda$Fn23);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit108, this.check$Click);
        } else {
          addToFormEnvironment((Symbol)Lit108, this.check$Click);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "check", "Click");
        } else {
          addToEvents(Lit103, Lit63);
        } 
        this.PhoneNumbers = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit109, Lit74, lambda$Fn24), consumer);
        } else {
          addToComponents(Lit0, Lit112, Lit74, lambda$Fn25);
        } 
        this.displayNumbers = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit113, Lit82, lambda$Fn26), consumer);
        } else {
          addToComponents(Lit74, Lit116, Lit82, lambda$Fn27);
        } 
        this.AccelerometerSensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit117, Lit118, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit119, Lit118, Boolean.FALSE);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit123, this.AccelerometerSensor1$Shaking);
        } else {
          addToFormEnvironment((Symbol)Lit123, this.AccelerometerSensor1$Shaking);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "AccelerometerSensor1", "Shaking");
        } else {
          addToEvents(Lit118, Lit124);
        } 
        this.Texting1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit125, Lit126, lambda$Fn28), consumer);
        } else {
          addToComponents(Lit0, Lit129, Lit126, lambda$Fn29);
        } 
        this.File1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit130, Lit17, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit131, Lit17, Boolean.FALSE);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit150, this.File1$GotText);
        } else {
          addToFormEnvironment((Symbol)Lit150, this.File1$GotText);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "File1", "GotText");
        } else {
          addToEvents(Lit17, Lit151);
        } 
        this.PhoneCall1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit152, Lit121, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit153, Lit121, Boolean.FALSE);
        } 
        this.File2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit20, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit155, Lit20, Boolean.FALSE);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit156, this.File2$GotText);
        } else {
          addToFormEnvironment((Symbol)Lit156, this.File2$GotText);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "File2", "GotText");
        } else {
          addToEvents(Lit20, Lit151);
        } 
        this.LocationSensor1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit157, Lit136, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit158, Lit136, Boolean.FALSE);
        } 
        this.MainText = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit159, Lit23, Boolean.FALSE), consumer);
        } else {
          addToComponents(Lit0, Lit160, Lit23, Boolean.FALSE);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit161, this.MainText$GotText);
        } else {
          addToFormEnvironment((Symbol)Lit161, this.MainText$GotText);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "MainText", "GotText");
        } else {
          addToEvents(Lit23, Lit151);
        } 
        runtime.initRuntime();
        return;
      } catch (ClassCastException classCastException) {
        throw new WrongType(classCastException, "java.lang.Runnable.run()", 1, object);
      } 
    } catch (ClassCastException classCastException) {
      throw new WrongType(classCastException, "java.lang.Runnable.run()", 1, object);
    } 
  }
  
  public void sendError(Object paramObject) {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = paramObject.toString();
    } 
    RetValManager.sendError((String)paramObject);
  }
}


/* Location:              C:\Users\Prateek_GIT\Documents\dex2jar-2.0\womenSafety-dex2jar.jar!\appinventor\ai_prateekelectronmechanics\womenSafety\Screen1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */